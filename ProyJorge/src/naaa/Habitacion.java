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
			precioI=rn.nextInt(300-200)+200;
			precio=precioI;
		}else if(idTipo==2) {
			precioI=rn.nextInt(180-140)+140;
			precio=precioI;			
		}else if(idTipo==3) {
			precioI=rn.nextInt(150-120)+120;
			precio=precioI;
		}else if(idTipo==4) {
			precioI=rn.nextInt(130-80)+80;
			precio=precioI;
		}
		return precio;
		
	}
	
	
	
	

}