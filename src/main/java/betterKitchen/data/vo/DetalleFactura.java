package betterKitchen.data.vo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the detalleFactura database table.
 * 
 */
@Entity
@NamedQuery(name="DetalleFactura.findAll", query="SELECT d FROM DetalleFactura d")
public class DetalleFactura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDetalleFactura;

	private float importe;

	private String plato;

	//bi-directional many-to-one association to Cocinero
	@ManyToOne
	@JoinColumn(name="idCocinero")
	private Cocinero cocinero;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="idFactura")
	private Factura factura;

	public DetalleFactura() {
	}

	public int getIdDetalleFactura() {
		return this.idDetalleFactura;
	}

	public void setIdDetalleFactura(int idDetalleFactura) {
		this.idDetalleFactura = idDetalleFactura;
	}

	public float getImporte() {
		return this.importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getPlato() {
		return this.plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}

	public Cocinero getCocinero() {
		return this.cocinero;
	}

	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}