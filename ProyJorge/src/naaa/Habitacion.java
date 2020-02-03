package naaa;
import java.util.Random;

public class Habitacion {
	
	private int idHab;
	private int idTipo;
	
	public Habitacion() {
		super();
	}

	public Habitacion(int idHab, int idTipo) {
		super();
		this.idHab = idHab;
		this.idTipo = idTipo;
	}

	public int getIdHab() {
		return idHab;
	}

	public void setIdHab(int idHab) {
		this.idHab = idHab;
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	@Override
	public String toString() {
		return "INSERT INTO HOT_HABITACION VALUES ();";
		
	}
	
	public void generadorInsertHabitacion() {
		System.out.printf("INSERT INTO HOT_HABITACION VALUES(%d,%d);\n",idHab,idTipo);
	}
	//120 precios por habitacion /1 array por habitacion
	public double calcularPrecio() {
		double precio=0;
		int precioI=0;
		Random rn=new Random (System.nanoTime());
		if(idTipo==1) {
			precioI=rn.nextInt(30000-20000+1)+20000;
			precio=precioI/100.0;
		}else if(idTipo==2) {
			precioI=rn.nextInt(18000-14000+1)+14000;
			precio=precioI/100.0;			
		}else if(idTipo==3) {
			precioI=rn.nextInt(15000-12000+1)+12000;
			precio=precioI/100.0;
		}else if(idTipo==4) {
			precioI=rn.nextInt(13000-8000+1)+20000;
			precio=precioI/100.0;
		}
		return precio;
		
	}
	
	
	
	

}