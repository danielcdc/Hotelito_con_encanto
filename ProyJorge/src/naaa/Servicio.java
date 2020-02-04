package naaa;

public class Servicio {
	// Atributos
	private int idServicio;
	private String nombre;
	private String descripcion;
	private double precioDia;

	// Constructores
	public Servicio() {

	}

	public Servicio(int idServicio, String nombre, String descripcion, double precioDia) {
		super();
		this.idServicio = idServicio;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioDia = precioDia;
	}

	// Auto-generated
	public int getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(int idServicio) {
		this.idServicio = idServicio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}

	@Override
	public String toString() {
		return "Servicio [idServicio=" + idServicio + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precioDia=" + precioDia + "]";
	}

}
