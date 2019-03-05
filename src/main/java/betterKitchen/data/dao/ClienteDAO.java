package betterKitchen.data.dao;

import java.util.List;

import javax.ejb.Stateless;

import betterKitchen.data.vo.Cliente;
@Stateless
public interface ClienteDAO {

	public Cliente getClienteByID(Integer id);

	public Integer deleteCliente(Integer id);

	public Integer createCliente(Cliente cliente);

	public void updateCliente(Cliente cliente);

	public List<Cliente> getAllClientes();

}
