package pe.mil.ejercito.ms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.mil.ejercito.ms.dao.RolPvuDAO;
import pe.mil.ejercito.ms.model.RolPvu;
import pe.mil.ejercito.ms.services.RolPvuService;
@Service
public class RolPvuServiceImpl implements RolPvuService{

	@Autowired
	private RolPvuDAO rolPvuDAO;
	
	@Override
	public List<RolPvu> listarRol() {
		// TODO Auto-generated method stub
		return rolPvuDAO.listarTodos();
	}

}
