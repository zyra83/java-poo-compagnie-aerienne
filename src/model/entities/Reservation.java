package model.entities;

public class Reservation {
	
	
	private Vol vol;
	private EtatReservation etatReservation;
	private Passager passager;
	
	
	/**
	 * Permet de passer une réservation à l'état annulée.
	 */
	public void annuler() {
		this.etatReservation = EtatReservation.ANNULEE;
	}

	/**
	 * Permet de passer une réservation à l'état confirmé.
	 */
	public void confirmer() {
		this.etatReservation = EtatReservation.CONFIRMEE;
	}
}
