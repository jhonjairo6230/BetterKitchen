package betterKitchen.data.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cocinero database table.
 * 
 */
@Entity
@NamedQuery(name="Cocinero.findAll", query="SELECT c FROM Cocinero c")
public class Cocinero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCocinero;

	private String apellido1;

	private String apellido2;

	private String nombre;

	//bi-directional many-to-one association to DetalleFactura
	@OneToMany(mappedBy="cocinero")
	private List<DetalleFactura> detalleFacturas;

	public Cocinero() {
	}

	public int getIdCocinero() {
		return this.idCocinero;
	}

	public void setIdCocinero(int idCocinero) {
		this.idCocinero = idCocinero;
	}

	public String getApellido1() {
		return this.apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return this.apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DetalleFactura> getDetalleFacturas() {
		return this.detalleFacturas;
	}

	public void setDetalleFacturas(List<DetalleFactura> detalleFacturas) {
		this.detalleFacturas = detalleFacturas;
	}

	public DetalleFactura addDetalleFactura(DetalleFactura detalleFactura) {
		getDetalleFacturas().add(detalleFactura);
		detalleFactura.setCocinero(this);

		return detalleFactura;
	}

	public DetalleFactura removeDetalleFactura(DetalleFactura detalleFactura) {
		getDetalleFacturas().remove(detalleFactura);
		detalleFactura.setCocinero(null);

		return detalleFactura;
	}

}