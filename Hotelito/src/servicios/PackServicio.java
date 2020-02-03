package servicios;

import java.util.Arrays;
	
/*
 * Esta clase conforma el conjunto de servicios que compra el cliente al realizar una reserva.
 */
public class PackServicio {
	// Atributos
	private Servicio [] listaServicios;
	private int idReserva;
	
	// Constructores
	public PackServicio() {
		
	}
	
	// Auto-generated
	public PackServicio(Servicio[] listaServicios, int idReserva) {
		super();
		this.listaServicios = listaServicios;
		this.idReserva = idReserva;
	}
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
	@Override
	public String toString() {
		return "PackServicio [listaServicios=" + Arrays.toString(listaServicios) + ", idReserva=" + idReserva + "]";
	}
	
	// Métodos
	public void rellenarListaServicios() {
		listaServicios = {(0001,"Desayuno","Servicio de Desayuno. Incluye buffet libre.",25)};
	}
	
	
	
	
}
