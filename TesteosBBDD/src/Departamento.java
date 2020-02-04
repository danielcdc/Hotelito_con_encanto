
public class Departamento {
	
//    ID_DEPARTAMENTO     NUMBER(2),
//    NOMBRE              VARCHAR(100),
//    ID_JEFE             NUMBER(4),
	
	private int idDepartamento;
	private String  nombre;
	private int idJefe;
	
	public Departamento() {
		super();
	}

	public Departamento(int idDepartamento, String nombre, int idJefe) {
		super();
		this.idDepartamento = idDepartamento;
		this.nombre = nombre;
		this.idJefe = idJefe;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdJefe() {
		return idJefe;
	}

	public void setIdJefe(int idJefe) {
		this.idJefe = idJefe;
	}

	@Override
	public String toString() {
		return "Departemento [idDepartamento=" + idDepartamento + ", nombre=" + nombre + ", idJefe=" + idJefe + "]";
	}
	
	
	public void generarInsertDepartamento() {
		
		System.out.printf("INSERT INTO HOT_DEPARTAMENTO VALUES (%d,'%s',%d);\n",idDepartamento,nombre,idJefe);
		
	}
	
	
	
	
	

}
