
public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		System.out.printf("double []pHab1={");
		for(int i=0;i<pHab1.length;i++) {
			System.out.printf("%.2f|",pHab1[i]);
		}
		System.out.println("};");
		
		System.out.printf("double []pHab2={");
		for(int i=0;i<pHab2.length;i++) {
			System.out.printf("%.2f|",pHab2[i]);
		}
		System.out.println("};");
		
		System.out.printf("double []pHab3={");
		for(int i=0;i<pHab3.length;i++) {
			System.out.printf("%.2f|",pHab3[i]);
		}
		System.out.println("};");
		
		System.out.printf("double []pHab4={");
		for(int i=0;i<pHab4.length;i++) {
			System.out.printf("%.2f|",pHab4[i]);
		}
		System.out.println("};");
		
		System.out.printf("double []pHab5={");
		for(int i=0;i<pHab5.length;i++) {
			System.out.printf("%.2f|",pHab5[i]);
		}
		System.out.println("};");
		
		System.out.printf("double []pHab6={");
		for(int i=0;i<pHab6.length;i++) {
			System.out.printf("%.2f|",pHab6[i]);
		}
		System.out.println("};");
		
		System.out.printf("double []pHab7={");
		for(int i=0;i<pHab7.length;i++) {
			System.out.printf("%.2f|",pHab7[i]);
		}
		System.out.println("};");
		
		System.out.printf("double []pHab8={");
		for(int i=0;i<pHab8.length;i++) {
			System.out.printf("%.2f|",pHab8[i]);
		}
		System.out.println("};");
		
		System.out.printf("double []pHab9={");
		for(int i=0;i<pHab9.length;i++) {
			System.out.printf("%.2f|",pHab9[i]);
		}
		System.out.println("};");
		
		System.out.printf("double []pHab10={");
		for(int i=0;i<pHab10.length;i++) {
			System.out.printf("%.2f|",pHab10[i]);
		}
		System.out.println("};");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		Departamento dep1=new Departamento(1,"DIRECCION",1);
		Departamento dep2=new Departamento(2,"RESTAURACION",1);
		Departamento dep3=new Departamento(3,"MANTENIMIENTO",1);
		Departamento dep4=new Departamento(4,"SERVICIO DE HABITACIONES",1);
		Departamento dep5=new Departamento(5,"INSTALACIONES DEPORTIVAS",1);
		
		Empleado emp1=new Empleado();
		Empleado emp2=new Empleado();
		Empleado emp3=new Empleado();
		Empleado emp4=new Empleado();
		Empleado emp5=new Empleado();
		Empleado emp6=new Empleado();
		Empleado emp7=new Empleado();
		Empleado emp8=new Empleado();
		Empleado emp9=new Empleado();
		Empleado emp10=new Empleado();
		Empleado emp11=new Empleado();
		Empleado emp12=new Empleado();
		Empleado emp13=new Empleado();
		Empleado emp14=new Empleado();
		Empleado emp15=new Empleado();
		
		
		
		
		
		
		
		
		
		

	}
	
//	public static String generarDNI() {
//		
//		
//		
//	}

}
