package pe.mil.ejercito.ms.services;

import java.util.List;

import org.springframework.stereotype.Service;

import pe.mil.ejercito.ms.model.Institucion;

@Service
public interface InstitucionService {
	
	public List<Institucion>ListaInstitucion();
}

