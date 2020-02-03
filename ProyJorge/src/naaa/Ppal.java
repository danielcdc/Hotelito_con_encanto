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
		Double precioH[] = {45.21,105.12};
		//Habit hab1 = new Habit(1, 52.64);
		//Habit hab2 = new Habit(2, 105.17);
		Servic s1 = new Servic(55);
		Servic s2 = new Servic(105);
		
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
		
		LocalDate entrada = LocalDate.of(2020, Month.JANUARY, 1);
		LocalDate salida = entrada.plusDays(2);
//		INSERT INTO TEA_EXHIBE VALUES (1, TO_DATE('2020-01-29', 'YYYY-MM-DD'), 2);
		/*
		 * INSERT INTO HOT_RESERVA (ID_RESERVA, DNI_CLIENTE, ID_HABITACION, CHECK_IN, CHECK_OUT, PRECIO_HAB_DIA, PRECIO_SERV_DIA, PRECIO_TOTAL) 
		 * VALUES ();
		 * 
		 * */
		 
		System.out.println("INSERT INTO HOT_RESERVA (ID_RESERVA, DNI_CLIENTE, ID_HABITACION, CHECK_IN, CHECK_OUT, PRECIO_HAB_DIA, PRECIO_SERV_DIA, PRECIO_TOTAL) \r\n" + 
				"VALUES ("+ 1 +",'"+ listaDNI[0] +"'," + 1 +","+ entrada +","+ salida +"," + precioH[0] + "," + s1.getPrecio() + "," + (precioH[0]+s1.getPrecio()) +");");
		
		
		
		
		
	}

}
