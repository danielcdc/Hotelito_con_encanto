package naaa;

import java.util.Arrays;
import java.util.Random;

public class PackServicio {

	// Atributos
		private Servicio[] listaServicios;
		private Servicio[] packServicios;
		private int idReserva;
		private int idLineaServicio;

		// Constructores
		public PackServicio() {
			this.idReserva = 0;
			this.listaServicios = rellenarListaServicios();
		}

		// Auto-generated
		public Servicio[] getListaServicios() {
			return listaServicios;
		}

		public void setListaServicios(Servicio[] listaServicios) {
			this.listaServicios = listaServicios;
		}

		public int getIdReserva() {
			return idReserva;
		}

		public void setIdReserva(int idReserva) {
			this.idReserva = idReserva;
		}

		public Servicio[] getPackServicios() {
			return packServicios;
		}

		public void setPackServicios(Servicio[] packServicios) {
			this.packServicios = packServicios;
		}

		@Override
		public String toString() {
			return "PackServicio [listaServicios=" + Arrays.toString(listaServicios) + ", packServicio="
					+ Arrays.toString(packServicios) + ", idReserva=" + idReserva + "]";
		}

		// Métodos

		// Rellena la lista de servicios disponibles que oferta el hotelito.
		public Servicio[] rellenarListaServicios() {
			int cero = 0, uno = 1, dos = 2, tres = 3, cuatro = 4, cinco = 5, seis = 6, siete = 7, ocho = 8, nueve = 9;
			listaServicios = new Servicio[nueve];
			listaServicios[cero] = new Servicio(1, "Desayuno", "Servicio de Catering. Incluye buffet libre.", 15);
			listaServicios[uno] = new Servicio(2, "Almuerzo",
					"Servicio de Catering. Incluye primer, segundo plato y postre", 20);
			listaServicios[dos] = new Servicio(3, "Cena", "Servicio de Catering. Incluye primer, segundo plato y postre",
					25);
			listaServicios[tres] = new Servicio(4, "Completo", "Servicio de Catering. Incluye desayuno, almuerzo y cena",
					45);
			listaServicios[cuatro] = new Servicio(5, "Gym", "Servicio de Gimnasio y Entrenamiento Personal. Día completo.",
					15);
			listaServicios[cinco] = new Servicio(6, "Piscina", "Servicio de Piscina. Día completo.", 20);
			listaServicios[seis] = new Servicio(7, "Spa", "Servicio de Spa y relajación. Una sesión.", 20);
			listaServicios[siete] = new Servicio(8, "Mueble-Bar", "Surtido de bebidas alcohólicas y refrigerios.", 30);
			listaServicios[ocho] = new Servicio(9, "Guardería", "Servicio de guardería. De 9:00 a 20:00 horas.", 50);
			return listaServicios;
		}
		
		
		
		
		public Double generarServicios(int numAleat, int num, double precio) {
			Random r = new Random();
			int aleat, aleat2, aleat3, aleat4;
			boolean fin=false;
			
			if(numAleat==0) {
				precio = 0.00;
			}else if(numAleat==1) {
				aleat = r.nextInt(10-1)+1;
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES ( " + num + " | "+ aleat +");\n" );
				precio=listaServicios[(aleat-1)].getPrecioDia();
				
			}else if(numAleat==2) {
				aleat = r.nextInt(10-1)+1;
				aleat2 = r.nextInt(10-1)+1;
				do {	
					if(aleat == aleat2) {
						aleat2 = r.nextInt(10-1)+1;
					}
				}while(aleat == aleat2);
				
				if(aleat == 4) {
					aleat2 = r.nextInt(10-5)+5;
				}
				
				if(aleat2 == 4) {
					aleat = r.nextInt(10-5)+5;
				} 
				
				
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES ( " + num + " | "+ aleat +");\n" );
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES ( " + num + " | "+ aleat2 +");\n" );
				precio=listaServicios[(aleat-1)].getPrecioDia() + listaServicios[(aleat2-1)].getPrecioDia();
			}else if(numAleat==3) {
				aleat = r.nextInt(10-1)+1;
				aleat2 = r.nextInt(10-1)+1;
				aleat3 = r.nextInt(10-1)+1;
				
				do {	
					
					if(aleat2 == aleat3) {
						aleat3 = r.nextInt(10-1)+1;
					}
					
					if(aleat2 == aleat) {
						aleat = r.nextInt(10-1)+1;
					}
					
					if(aleat == aleat3) {
						aleat3 = r.nextInt(10-1)+1;
					}
				}while(aleat2 == aleat3 || aleat == aleat3 || aleat2 == aleat );	
				
				
				if(aleat == 4) {
					aleat2 = r.nextInt(10-5)+5;
					aleat3 = r.nextInt(10-5)+5;
					do {	
						if(aleat3 == aleat2) {
							aleat2 = r.nextInt(10-5)+5;
						}
					}while(aleat3 == aleat2);
				}
				
				if(aleat2 == 4) {
					aleat = r.nextInt(10-5)+5;
					aleat3 = r.nextInt(10-5)+5;
					do {	
						if(aleat3 == aleat) {
							aleat = r.nextInt(10-5)+5;
						}
					}while(aleat3 == aleat);
				}
				
				
				if(aleat3 == 4) {
					aleat2 = r.nextInt(10-5)+5;
					aleat = r.nextInt(10-5)+5;
					do {	
						if(aleat == aleat2) {
							aleat2 = r.nextInt(10-5)+5;
						}
					}while(aleat == aleat2);
				}
				
				
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES ( " + num + " | "+ aleat +");\n" );
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES ( " + num + " | "+ aleat2 +");\n" );
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES ( " + num + " | "+ aleat3 +");\n" );
				precio=listaServicios[(aleat-1)].getPrecioDia() + listaServicios[(aleat2-1)].getPrecioDia() + listaServicios[(aleat3-1)].getPrecioDia();
				
			}else if(numAleat==4) {
				aleat = r.nextInt(10-1)+1;
				aleat2 = r.nextInt(10-1)+1;
				aleat3 = r.nextInt(10-1)+1;
				aleat4 = r.nextInt(10-1)+1;
				
				do {	
					
					if(aleat2 == aleat3) {
						aleat3 = r.nextInt(10-1)+1;
					}
					
					if(aleat2 == aleat) {
						aleat = r.nextInt(10-1)+1;
					}
					
					if(aleat == aleat3) {
						aleat3 = r.nextInt(10-1)+1;
					}
					
					if(aleat4 == aleat3) {
						aleat3 = r.nextInt(10-1)+1;
					}
					
					if(aleat4 == aleat) {
						aleat = r.nextInt(10-1)+1;
					}
					
					if(aleat4 == aleat2) {
						aleat2 = r.nextInt(10-1)+1;
					}
				}while(aleat2 == aleat3 || aleat == aleat3 || aleat2 == aleat || aleat2 == aleat4 || aleat4 == aleat || aleat3 == aleat4);
				
				if(aleat == 4) {
					aleat2 = r.nextInt(10-5)+5;
					aleat3 = r.nextInt(10-5)+5;
					aleat4 = r.nextInt(10-5)+5;
					
					do {	
						if(aleat3 == aleat2) {
							aleat2 = r.nextInt(10-5)+5;
						}
						
						if(aleat3 == aleat4) {
							aleat4 = r.nextInt(10-5)+5;
						}
						
						if(aleat4 == aleat2) {
							aleat2 = r.nextInt(10-5)+5;
						}
					}while(aleat3 == aleat2 || aleat4 == aleat2 || aleat3 == aleat4);
				}
				
				if(aleat2 == 4) {
					aleat = r.nextInt(10-5)+5;
					aleat3 = r.nextInt(10-5)+5;
					aleat4 = r.nextInt(10-5)+5;
					
					do {	
						if(aleat3 == aleat) {
							aleat = r.nextInt(10-5)+5;
						}
						
						if(aleat == aleat4) {
							aleat4 = r.nextInt(10-5)+5;
						}
						
						if(aleat4 == aleat3) {
							aleat3 = r.nextInt(10-5)+5;
						}
					}while(aleat3 == aleat || aleat == aleat4 || aleat3 == aleat4);
				}
				
				
				if(aleat3 == 4) {
					aleat2 = r.nextInt(10-5)+5;
					aleat = r.nextInt(10-5)+5;
					aleat4 = r.nextInt(10-5)+5;
					
					do {	
						if(aleat2 == aleat) {
							aleat = r.nextInt(10-5)+5;
						}
						
						if(aleat == aleat4) {
							aleat4 = r.nextInt(10-5)+5;
						}
						
						if(aleat4 == aleat2) {
							aleat2 = r.nextInt(10-5)+5;
						}
					}while(aleat2 == aleat || aleat == aleat4 || aleat2 == aleat4);
				}
				
				
				if(aleat4 == 4) {
					
					aleat2 = r.nextInt(10-5)+5;
					aleat = r.nextInt(10-5)+5;
					aleat3 = r.nextInt(10-5)+5;
					
					
					do {	
						if(aleat3 == aleat) {
							aleat = r.nextInt(10-5)+5;
						}
						
						if(aleat == aleat2) {
							aleat2 = r.nextInt(10-5)+5;
						}
						
						if(aleat2 == aleat3) {
							aleat3 = r.nextInt(10-5)+5;
						}
					}while(aleat3 == aleat || aleat == aleat2 || aleat3 == aleat2);
				}
				
				
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES ( " + num + " | "+ aleat +");\n" );
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES ( " + num + " | "+ aleat2 +");\n" );
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES ( " + num + " | "+ aleat3 +");\n" );
				System.out.print("INSERT INTO HOT_LINEA (ID_RESERVA| ID_SERVICIO) \r\n" + 
						"VALUES (  " + num + " | "+ aleat4 +");\n" );
				precio=listaServicios[(aleat-1)].getPrecioDia() + listaServicios[(aleat2-1)].getPrecioDia() 
						+ listaServicios[(aleat3-1)].getPrecioDia() + listaServicios[(aleat4-1)].getPrecioDia();
			}
			
			return precio;
			
		}
		
	
}
