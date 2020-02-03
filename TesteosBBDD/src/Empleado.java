
public class Empleado {
	
//    ID_EMPLEADO     NUMBER(4),
//    DNI_EMPLEADO    VARCHAR2(9),
//    NOMBRE          VARCHAR2(100),
//    APELLIDOS       VARCHAR2(100),
//    DEPARTAMENTO    NUMBER(2),
//    SERVICIO        NUMBER(2),
//    FUNCION         VARCHAR2(150),
//    SUELDO_ANUAL    NUMBER(8,2),
//    ID_JEFE        NUMBER(4),
//    ACTIVO          CHAR(1),
	
	private int  idEmpleado;
	private String dni;
	private String nombre;
	private String apellidos;
	private int dep;
	private int servicio;
	private String funcion;
	private double sueldoAnual;
	private int idJefe;
	private String activo;
	
	public Empleado() {
		super();
	}

	public Empleado(int idEmpleado, String dni, String nombre, String apellidos, int dep, int servicio, String funcion,
			double sueldoAnual, int idJefe, String activo) {
		super();
		this.idEmpleado = idEmpleado;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dep = dep;
		this.servicio = servicio;
		this.funcion = funcion;
		this.sueldoAnual = sueldoAnual;
		this.idJefe = idJefe;
		this.activo = activo;
	}

	public int getDiEmpleado() {
		return idEmpleado;
	}

	public void setDiEmpleado(int diEmpleado) {
		this.idEmpleado = diEmpleado;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getDep() {
		return dep;
	}

	public void setDep(int dep) {
		this.dep = dep;
	}

	public int getServicio() {
		return servicio;
	}

	public void setServicio(int servicio) {
		this.servicio = servicio;
	}

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public double getSueldoAnual() {
		return sueldoAnual;
	}

	public void setSueldoAnual(double sueldoAnual) {
		this.sueldoAnual = sueldoAnual;
	}

	public int getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Empleado [diEmpleado=" + idEmpleado + ", dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", dep=" + dep + ", servicio=" + servicio + ", funcion=" + funcion + ", sueldoAnual=" + sueldoAnual
				+ ", idJefe=" + idJefe + ", activo=" + activo + "]";
	}
	
	
	
	
	
	

}
