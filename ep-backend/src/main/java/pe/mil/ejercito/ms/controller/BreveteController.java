package pe.mil.ejercito.ms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import pe.mil.ejercito.ms.commons.SwaggerApiMessages;
import pe.mil.ejercito.ms.model.Institucion;
import pe.mil.ejercito.ms.model.TipoBrevete;
import pe.mil.ejercito.ms.services.InstitucionService;
import pe.mil.ejercito.ms.services.TipoBreveteService;

@RestController(value = "brevete")
@Api(value = "brevete")
public class BreveteController {
	
	@Autowired
	private TipoBreveteService tipoBreveteService;
	
	@Autowired
	private InstitucionService institucionService;
	
	@ApiOperation(value = "Lista todos los Tipo de Brevete - OLIVER", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/listTipoBrevete/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<TipoBrevete> listTipoBrevete(HttpServletResponse response, HttpServletRequest request) {

		return tipoBreveteService.listarTipoBrevete();

	}
	
	@ApiOperation(value = "Lista todos las instituciones de las Tablas Maestra - SULLCARAYME", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/listInstituciones/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Institucion> listInstituciones(HttpServletResponse response, HttpServletRequest request) {

		return institucionService.ListaInstitucion();
	
	}

	
}
