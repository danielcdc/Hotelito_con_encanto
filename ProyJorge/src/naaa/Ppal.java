package naaa;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r = new Random();
//		int valorDado	=	r.nextInt(Max-min)+min;		
		
//		String listaDNI[] = new String [3000];
		
		String listaDNI[] = {"111A","222B"};
		
		// un array de cada habitacion del precio --> reserv 1 => precio 1
		int precioH[] = {45,105};
		//Habit hab1 = new Habit(1, 52.64);
		//Habit hab2 = new Habit(2, 105.17);
		Servic s1 = new Servic(55);
		Servic s2 = new Servic(105);
		Double precioS[] = {(65.36),(105.12)};
//		LocalDate entrada = LocalDate.of(2020, Month.JANUARY, 1);
//		LocalDate salida = entrada.plusDays(2);
//		System.out.println(entrada);
//		System.out.println(salida);
//		
//		entrada = salida.plusDays(2);
//		
//		System.out.println(entrada);
//		
//		salida = entrada.plusDays(2);
//		System.out.println(salida);
//		int ale = r.nextInt(7-1)+1;
		LocalDate entrada = LocalDate.of(2020, Month.JANUARY, 1);
//		LocalDate salida = entrada.plusDays(ale);
//		INSERT INTO TEA_EXHIBE VALUES (1, TO_DATE('2020-01-29', 'YYYY-MM-DD'), 2);
		/*
		 * INSERT INTO HOT_RESERVA (ID_RESERVA, DNI_CLIENTE, ID_HABITACION, CHECK_IN, CHECK_OUT, PRECIO_HAB_DIA, PRECIO_SERV_DIA, PRECIO_TOTAL) 
		 * VALUES ();
		 * 
		 * */
		 
//		System.out.print("INSERT INTO HOT_RESERVA (ID_RESERVA, DNI_CLIENTE, ID_HABITACION, CHECK_IN, CHECK_OUT, PRECIO_HAB_DIA, PRECIO_SERV_DIA, PRECIO_TOTAL) \r\n" + 
//				"VALUES ("+ 1 +",'"+ listaDNI[0] +"'," + 1 +",TO_DATE('"+ entrada 
//				+"', 'YYYY-MM-DD'),TO_DATE('"+ salida +"', 'YYYY-MM-DD')," + precioH[0] + "," + precioS[0] + "," + ((precioH[0]+precioS[0])*ale) +");");
		
		
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
		
		int listaCliente[]=new int[3001];
		
		for(int i=0;i<3001;i++) {
			
			listaCliente[i]=i;
			
		}
		
		for(int i=0; i < 120; i++) {
			
			
			int ale = r.nextInt(8-1)+1;
			int ale2 = r.nextInt(3-0)+0;
			int aleC = r.nextInt(3000-0)+0;
			
			LocalDate salida = entrada.plusDays(ale);
			
			System.out.print("INSERT INTO HOT_RESERVA (ID_RESERVA, DNI_CLIENTE, ID_HABITACION, CHECK_IN, CHECK_OUT, PRECIO_HAB_DIA, PRECIO_SERV_DIA, PRECIO_TOTAL) \r\n" + 
					"VALUES ("+ listaCliente[aleC] +", '"+ listaDNI[1] +"', " + 10 +", TO_DATE('"+ entrada 
					+" 15:00', 'YYYY-MM-DD HH24:MI'), TO_DATE('"+ salida +" 12:00', 'YYYY-MM-DD HH24:MI'), " + pHab10[i] + ", " + precioS[1] );
			System.out.printf(", %.2f);\n",((pHab1[i]+precioS[1])*ale));
			entrada = salida.plusDays(ale2);
		}
		
		
	}

}
