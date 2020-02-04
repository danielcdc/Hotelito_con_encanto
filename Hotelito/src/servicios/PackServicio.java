package servicios;

import java.util.Arrays;
import java.util.Random;

/*
 * Esta clase conforma el conjunto de servicios que compra el cliente al realizar una reserva.
 */
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
		this.packServicios = generarPack();
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

	public Servicio[] generarPack() {
		// Variables locales
		int cero = 0, uno = 1, cuatro = 4, cinco = 5, ocho = 8, nueve = 9;
		boolean out = false;
		Random r = new Random();

		// Genera el número de servicios que contratará el cliente.
		int cantidadServicios = r.nextInt(cinco);
		do {
			// El cliente no contrata ningún servicio.
			if (cantidadServicios == cero) {
				out = true;
			} else if (cantidadServicios == uno) {
				// El cliente contrata un único servicio al azar.
				packServicios = new Servicio[cantidadServicios];
				packServicios[cero] = listaServicios[r.nextInt(nueve)];
				out = true;
			} else {
				// Selecciona al azar un servicio de Catering.
				packServicios = new Servicio[cantidadServicios];
				packServicios[cero] = listaServicios[r.nextInt(cinco)];
				int contador = uno, control = cero;
				// Array que guarda las opciones elegidas, a fin de evitar su repetición.
				int noRepes[] = new int[cantidadServicios - uno];
				while (contador < cantidadServicios) {
					// Se selecciona al azar tantos servicios, exceptuados los de Catering, según el
					// valor de cantidadServicios (hasta llenar el array).
					int seleccionarServicio = r.nextInt(ocho - cuatro + uno) + cuatro;
					if (noRepetir(noRepes, seleccionarServicio)) {
						packServicios[contador] = listaServicios[seleccionarServicio];
						// Se añade al array de control la posición del array listaServicios que ha sido
						// elegida.
						noRepes[control] = seleccionarServicio;
						control++;
						contador++;
					}

				}
				out = true;
			}
		} while (!out);
		return packServicios;
	}

	// Comprueba que un número dado no coincide con ningún otro contenido en un
	// array de números. Devuelve falso si coincide.
	public boolean noRepetir(int[] lista, int num) {
		boolean noRepetido = true;
		for (int i = 0; i < lista.length; i++) {
			if (num == lista[i]) {
				noRepetido = false;
			}
		}
		return noRepetido;
	}

	public void imprimirInsertInto() {
		System.out.println("INSERT INTO LINEA_SERVICIO\n" + "VALUES " + "(" + idReserva + ", " + idLineaServicio + ", "
				+ imprimirIdServicio(0) + ", " + imprimirIdServicio(1) + ", "
				+ imprimirIdServicio(2) + ", " +imprimirIdServicio(3) + ");");
	}

	public String imprimirIdServicio(int num) {
		if (packServicios[num] == null) {
			return "null";
		} else {
			int id = packServicios[num].getIdServicio();
			return Integer.toString(id);
		}
	}

}
