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
	 * @return the vol
	 */
	public Vol getVol() {
		return vol;
	}

	/**
	 * @param vol
	 *            the vol to set
	 */
	public void setVol(Vol vol) {
		this.vol = vol;
	}

	/**
	 * @return the etatReservation
	 */
	public EtatReservation getEtatReservation() {
		return etatReservation;
	}

	/**
	 * @param etatReservation
	 *            the etatReservation to set
	 */
	public void setEtatReservation(EtatReservation etatReservation) {
		this.etatReservation = etatReservation;
	}

	/**
	 * @return the passager
	 */
	public Passager getPassager() {
		return passager;
	}

	/**
	 * @param passager
	 *            the passager to set
	 */
	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	/**
	 * Permet de passer une réservation à l'état confirmé.
	 */
	public void confirmer() {
		this.etatReservation = EtatReservation.CONFIRMEE;
	}
}
