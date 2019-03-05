package betterKitchen.web.control;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;

import betterKitchen.data.dao.impl.ClienteDAOImpl;
import betterKitchen.data.vo.Cliente;


@RequestScoped 
@ManagedBean (value="clienteBean")
public class ClienteBean {
	@EJB 
	//private ClienteService clienteService;
	private ClienteDAOImpl clienteDao; 
	//= new ClienteDAOImpl();
	List<Cliente> clientes;

	public ClienteBean() {

	}

	@PostConstruct
	public void init() {
		//clientes = clienteDao.getAllClientes();
		//System.out.println("Clientes: " + clientes);
	}

}
