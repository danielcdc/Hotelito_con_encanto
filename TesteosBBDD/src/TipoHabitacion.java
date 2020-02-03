
public class TipoHabitacion {
	
//    ID_TIPO         NUMBER(1),
//    NOMBRE          VARCHAR2(50),
//    PRECIO          NUMBER(6,2),
//    DESCRIPCION     VARCHAR2(2000),
	
	private int idHab;
	private String nombre;
	private String descripcion;
	
	public TipoHabitacion() {
		super();
	}

	public TipoHabitacion(int idHab, String nombre, String descripcion) {
		super();
		this.idHab = idHab;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getIdHab() {
		return idHab;
	}

	public void setIdHab(int idHab) {
		this.idHab = idHab;
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

	@Override
	public String toString() {
		return "TipoHabitacion [idHab=" + idHab + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	public void generadorInsertTipoHabitacion() {
		System.out.printf("INSERT INTO HOT_HABITACION VALUES(%d,%s,%s);\n",idHab,nombre,descripcion);
	}

}
