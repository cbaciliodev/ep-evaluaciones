package pe.mil.ejercito.ms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import pe.mil.ejercito.ms.commons.SwaggerApiMessages;
import pe.mil.ejercito.ms.dto.MenuPvuListRestOUT;
import pe.mil.ejercito.ms.dto.MenuPvuRestOUT;
import pe.mil.ejercito.ms.dto.UsuarioListRestOUT;
import pe.mil.ejercito.ms.dto.UsuarioRestIN;
import pe.mil.ejercito.ms.dto.UsuarioRestOUT;

import pe.mil.ejercito.ms.model.MenuPvo;
import pe.mil.ejercito.ms.model.RolPvu;
import pe.mil.ejercito.ms.model.TipoBrevete;
import pe.mil.ejercito.ms.model.Usuario;

import pe.mil.ejercito.ms.services.MenuPvoService;
import pe.mil.ejercito.ms.services.RolPvuService;
import pe.mil.ejercito.ms.services.UsuarioPortalService;
import pe.mil.ejercito.ms.services.UsuarioService;

import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

import org.springframework.http.MediaType;

@RestController(value = "usuario")
@Api(value = "usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private UsuarioPortalService usuarioPortalService;

	@Autowired
	private MenuPvoService menuPvoSevice;

	@Autowired
	private RolPvuService rolPvuSevice;

	@ApiOperation(value = "Retorna solo un usuario de una lista completa", response = Usuario.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/list/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Usuario getUsuario(HttpServletResponse response, HttpServletRequest request) {
		return usuarioService.findAll().get(0);
	}

	@ApiOperation(value = "Retorna solo un usuario de una lista completa", response = UsuarioRestOUT.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/listDTO/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UsuarioRestOUT getUsuarioRest(HttpServletResponse response, HttpServletRequest request) {
		return usuarioService.findAllDTO().get(0);
	}

	@ApiOperation(value = "Retorna solo un usuario de una lista completa", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/listUsuarioDTO/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<UsuarioRestOUT> getUsuarioListRest(HttpServletResponse response, HttpServletRequest request) {
		return usuarioService.findAllDTO();
	}

	@ApiOperation(value = "Retorna solo un usuario de una lista completa", response = UsuarioListRestOUT.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/listUsuarioDTO2/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UsuarioListRestOUT getUsuarioListRest2(HttpServletResponse response, HttpServletRequest request) {
		UsuarioListRestOUT u = new UsuarioListRestOUT();
		u.setUsuarios(usuarioService.findAllDTO());
		return u;
	}

	@ApiOperation(value = "Retorna un usuario por su nickname", response = Usuario.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/byNickname/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Usuario getUsuarioByNickname(@RequestBody String nickname, HttpServletResponse response,
			HttpServletRequest request) {
		return usuarioService.obtenerUsuarioByNickname(nickname);
	}

	@ApiOperation(value = "Valida si un usuario esta registrado en el sistema", response = Boolean.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/isUsuario/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Boolean isUsuario(@RequestBody Usuario usuario, HttpServletResponse response, HttpServletRequest request) {
		try {
			return usuarioService.validarUsuario(usuario.getNickname(), usuario.getPassword());
		} catch (Exception e) {
			return false;
		}

	}

	@ApiOperation(value = "Ingresa un usuario al sistema.", response = UsuarioRestOUT.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Usuario guardado con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/insert/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public UsuarioRestOUT insertUsuario(@RequestBody UsuarioRestIN usuarioRestIn, HttpServletResponse response,
			HttpServletRequest request) {
		return usuarioService.guardarUsuario(usuarioRestIn);
	}

	@ApiOperation(value = "Lista todos los usuario del portal", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/listUsuarioPortal/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Usuario> listUsuarioPortal(HttpServletResponse response, HttpServletRequest request) {
		return usuarioPortalService.listarTodos();
	}
	
	@ApiOperation(value = "Lista todos los Menu", response = MenuPvuListRestOUT.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/listMenu/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public MenuPvuListRestOUT listMenu(HttpServletResponse response, HttpServletRequest request) {
		return menuPvoSevice.listarMenu();
	}
	
	@ApiOperation(value = "Lista todos los Roles", response = List.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Información obtenida con éxito"),
			@ApiResponse(code = 400, message = SwaggerApiMessages.MESSAGE_400),
			@ApiResponse(code = 401, message = SwaggerApiMessages.MESSAGE_401),
			@ApiResponse(code = 404, message = SwaggerApiMessages.MESSAGE_404) })
	@RequestMapping(value = "/listRol/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<RolPvu> listRol(HttpServletResponse response, HttpServletRequest request) {
		return rolPvuSevice.listarRol();
	}
	
}
	