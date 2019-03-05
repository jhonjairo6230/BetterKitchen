package betterKitchen.data.dao.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import betterKitchen.data.dao.ClienteDAO;
import betterKitchen.data.vo.Cliente;

@Stateless
public class ClienteDAOImpl implements ClienteDAO{

    @PersistenceContext(unitName = "betterKitchenPU")
    EntityManager em;
	
	@Override
	public Cliente getClienteByID(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteCliente(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer createCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> getAllClientes() {
		List<Cliente> resultList = em.createNamedQuery("Cliente.findAll").getResultList();
		return resultList;
	}

}
