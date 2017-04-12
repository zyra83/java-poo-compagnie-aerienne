package model.entities;

public enum EtatReservation {

	CONFIRMEE("confirmée"), ANNULEE("annulée");

	private final String etat;

	EtatReservation(String etat) {
		this.etat = etat;
	}

	public String etat() {
		return etat;
	}

}
