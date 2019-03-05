package betterKitchen.vo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the camarero database table.
 * 
 */
@Entity
@NamedQuery(name="Camarero.findAll", query="SELECT c FROM Camarero c")
public class Camarero implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCamarero;

	private String apellido1;

	private String apellido2;

	private String nombre;

	//bi-directional many-to-one association to Factura
	@OneToMany(mappedBy="camarero")
	private List<Factura> facturas;

	public Camarero() {
	}

	public int getIdCamarero() {
		return this.idCamarero;
	}

	public void setIdCamarero(int idCamarero) {
		this.idCamarero = idCamarero;
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

	public List<Factura> getFacturas() {
		return this.facturas;
	}

	public void setFacturas(List<Factura> facturas) {
		this.facturas = facturas;
	}

	public Factura addFactura(Factura factura) {
		getFacturas().add(factura);
		factura.setCamarero(this);

		return factura;
	}

	public Factura removeFactura(Factura factura) {
		getFacturas().remove(factura);
		factura.setCamarero(null);

		return factura;
	}

}