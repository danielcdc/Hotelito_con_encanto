package naaa;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r = new Random();

		Double precio=0.00;

		LocalDate entrada = LocalDate.of(2020, Month.JANUARY, 1);

		
		
		double []pHab1=new double [120];
		double []pHab2=new double [120];
		double []pHab3=new double [120];
		double []pHab4=new double [120];
		double []pHab5=new double [120];
		double []pHab6=new double [120];
		double []pHab7=new double [120];
		double []pHab8=new double [120];
		double []pHab9=new double [120];
		double []pHab10=new double [120];
		
		Habitacion hab1=new Habitacion(1,1);
		Habitacion hab2=new Habitacion(2,2);
		Habitacion hab3=new Habitacion(3,2);
		Habitacion hab4=new Habitacion(4,2);
		Habitacion hab5=new Habitacion(5,3);
		Habitacion hab6=new Habitacion(6,3);
		Habitacion hab7=new Habitacion(7,3);
		Habitacion hab8=new Habitacion(8,4);
		Habitacion hab9=new Habitacion(9,4);
		Habitacion hab10=new Habitacion(10,4);
		
		for(int i=0;i<pHab1.length;i++) {
			pHab1[i]=hab1.calcularPrecio();
		}
		
		for(int i=0;i<pHab2.length;i++) {
			pHab2[i]=hab2.calcularPrecio();
		}
		
		for(int i=0;i<pHab3.length;i++) {
			pHab3[i]=hab3.calcularPrecio();
		}
		
		for(int i=0;i<pHab4.length;i++) {
			pHab4[i]=hab4.calcularPrecio();
		}
		
		for(int i=0;i<pHab5.length;i++) {
			pHab5[i]=hab5.calcularPrecio();
		}
		
		for(int i=0;i<pHab6.length;i++) {
			pHab6[i]=hab6.calcularPrecio();
		}
		
		for(int i=0;i<pHab7.length;i++) {
			pHab7[i]=hab7.calcularPrecio();
		}
		
		for(int i=0;i<pHab8.length;i++) {
			pHab8[i]=hab8.calcularPrecio();
		}
		
		for(int i=0;i<pHab9.length;i++) {
			pHab9[i]=hab9.calcularPrecio();
		}
		
		for(int i=0;i<pHab10.length;i++) {
			pHab10[i]=hab10.calcularPrecio();
		}
		
		int listaCliente[]=new int[1750];
		
		for(int i=0;i<1750;i++) {
			
			listaCliente[i]=i;
			
		}
		
		PackServicio pack = new PackServicio();
		
		for(int i=0; i < 80; i++) {
			
			
			int ale = r.nextInt(8-1)+1;
			int ale2 = r.nextInt(3-0)+0;
			int aleC = r.nextInt(1750-0)+0;
			int aleServ = r.nextInt(5-0)+0;
			
			LocalDate salida = entrada.plusDays(ale);
			
			

			precio=pack.generarServicios(aleServ, (i+1), precio);
			

			System.out.print("INSERT INTO HOT_RESERVA (ID_RESERVA| ID_CLIENTE| ID_HABITACION| CHECK_IN| CHECK_OUT| PRECIO_HAB_DIA| PRECIO_SERV_DIA| PRECIO_TOTAL) \r\n" + 
					"VALUES ( " + (i+1) + " | "+ listaCliente[aleC] +"| " + 2 +"| TO_DATE('"+ entrada 
					+" 15:00'| 'YYYY-MM-DD HH24:MI')| TO_DATE('"+ salida +" 12:00'| 'YYYY-MM-DD HH24:MI')| " + pHab2[i] + "| " + precio );
			System.out.printf("| %.2f);\n",((pHab2[i]+precio)*ale));
			
			
			
			entrada = salida.plusDays(ale2);
			
			
			
			
		}
		
		

		
		
	}

}
