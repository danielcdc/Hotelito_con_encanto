
public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TipoHabitacion tipHab1=new TipoHabitacion(1,"Suite",
				"Perfecta para personas solventes, incluye chimenea para quemar billetes.");
		
		TipoHabitacion tipHab2=new TipoHabitacion(2,"Matrimonio",
				"Cama doble, y un bombon de regalo(para compartir).");
		
		TipoHabitacion tipHab3=new TipoHabitacion(3,"Doble",
				"Perfecta para futuros divorciados, con dos camas separadas por 4m, incluye revestimiento "
				+ "aislante en las paredes para potenciar sus silencios incómodos.");
		
		TipoHabitacion tipHab4=new TipoHabitacion(4,"Simple",
				"¿Recuerdas cuando necesitabas una de matrimonio?No desesperes, llegó el ahorro a tus manos,"
				+ "cama para uno, toallas para uno, soga para uno. Todo ventajas.");
		
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
		
		tipHab1.generadorInsertTipoHabitacion();
		tipHab2.generadorInsertTipoHabitacion();
		tipHab3.generadorInsertTipoHabitacion();
		tipHab4.generadorInsertTipoHabitacion();
		System.out.println();
		hab1.generadorInsertHabitacion();
		hab2.generadorInsertHabitacion();
		hab3.generadorInsertHabitacion();
		hab4.generadorInsertHabitacion();
		hab5.generadorInsertHabitacion();
		hab6.generadorInsertHabitacion();
		hab7.generadorInsertHabitacion();
		hab8.generadorInsertHabitacion();
		hab9.generadorInsertHabitacion();
		hab10.generadorInsertHabitacion();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
