
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
		
		dep1.generarInsertDepartamento();
		dep2.generarInsertDepartamento();
		dep3.generarInsertDepartamento();
		dep4.generarInsertDepartamento();
		dep5.generarInsertDepartamento();
		
		
		Empleado emp1=new Empleado(1,"80169812T","Pablo","Pérez Lozano",1,1,"Jefe",30000,0,"S");
		Empleado emp2=new Empleado(2,"31778301Y","Jose","García Torrente",1,1,"Jefe",30000,1,"S");
		Empleado emp3=new Empleado(3,"12195887E","Arturo","Mota Ruiz",2,2,"Camarero",14000,7,"S");
		Empleado emp4=new Empleado(4,"96189948S","Antonio","Torrecilla Palomo",2,2,"Cocinero",16000,7,"S");
		Empleado emp5=new Empleado(5,"15095736P","Miguel","Aillet Llorente",2,2,"Lavaplatos",11000,7,"S");
		Empleado emp6=new Empleado(6,"57380066B","Maria","Moreno Antunez",2,2,"Camarero",14000,7,"S");
		Empleado emp7=new Empleado(7,"45046334Y","Ana","Martinez Montaño",2,2,"JefeRestauracion",18000,1,"S");
		Empleado emp8=new Empleado(8,"27446847G","Manuel","Ordoñez Matito",3,3,"Tecnico reparaciones",15000,1,"S");
		Empleado emp9=new Empleado(9,"16300766E","Rafael","Ayuso Martin",4,4,"Limpiador",11000,12,"S");
		Empleado emp10=new Empleado(10,"84882363N","Manuela","Rodriguez Sanchez",4,4,"Limpiador",11000,12,"S");
		Empleado emp11=new Empleado(11,"47437366G","Roberto","Abigail Hernandez",4,4,"Asistente de lavanderia",11500,12,"S");
		Empleado emp12=new Empleado(12,"33869097X","Isabel","Jimenez Castro",4,4,"Jefa de Limpieza",14000,2,"S");
		Empleado emp13=new Empleado(13,"40773609Z","Carlos","Romero Navarro",4,4,"Costura",12000,12,"S");
		Empleado emp14=new Empleado(14,"95207603T","Mario","Torres Iglesias",5,5,"Entrenador personal",16000,2,"S");
		Empleado emp15=new Empleado(15,"36003404D","Alfonso","Garrido Morales",5,5,"Socorrista",12000,14,"S");
		Empleado emp16=new Empleado(16,"12006027G","Pepe","De la rosa muñoz",5,5,"Servicio de spa",13000,14,"S");
		Empleado emp17=new Empleado(17,"81450263H","Laura","Ortiz Perez",4,4,"Servicio de guarderia",13000,12,"S");
		
		emp1.generarInsertEmpleado();
		emp2.generarInsertEmpleado();
		emp3.generarInsertEmpleado();
		emp4.generarInsertEmpleado();
		emp5.generarInsertEmpleado();
		emp6.generarInsertEmpleado();
		emp7.generarInsertEmpleado();
		emp8.generarInsertEmpleado();
		emp9.generarInsertEmpleado();
		emp10.generarInsertEmpleado();
		emp11.generarInsertEmpleado();
		emp12.generarInsertEmpleado();
		emp13.generarInsertEmpleado();
		emp14.generarInsertEmpleado();
		emp15.generarInsertEmpleado();
		
		
		
		
		
		
		
		
		

	}
	
//	public static String generarDNI() {
//		
//		
//		
//	}

}
