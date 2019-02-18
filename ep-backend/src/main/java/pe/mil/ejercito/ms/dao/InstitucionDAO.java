package pe.mil.ejercito.ms.dao;

import org.springframework.stereotype.Repository;

import pe.mil.ejercito.ms.model.Institucion;

@Repository
public interface InstitucionDAO extends BaseDAO<Institucion>{  // extends-->heredando, llamando a la clase baseDAO

}
