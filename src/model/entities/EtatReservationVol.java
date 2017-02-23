package model.entities;

public enum EtatReservationVol {

	OUVERTE("OUVERTE"), FERME("FERME");

	private final String etat;

	EtatReservationVol(String etat) {
		this.etat = etat;
	}

	public String etat() {
		return etat;
	}

}
