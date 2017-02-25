package model.entities;

import java.util.Date;
import java.util.List;

public class Vol {

	/**
	 * Date/heure de début de vol.
	 */
	private Date dateDebut;

	/**
	 * Date/heure de fin du vol.
	 */
	private Date dateFin;

	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut
	 *            the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin
	 *            the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the compagnie
	 */
	public CompagnieAerienne getAffreteur() {
		return affreteur;
	}

	/**
	 * @param affreteur
	 *            the compagnie to set
	 */
	public void setAffreteur(CompagnieAerienne affreteur) {
		this.affreteur = affreteur;
	}

	/**
	 * @return the etatReservationVol
	 */
	public EtatReservationVol getEtatReservationVol() {
		return etatReservationVol;
	}

	/**
	 * @param etatReservationVol
	 *            the etatReservationVol to set
	 */
	public void setEtatReservationVol(EtatReservationVol etatReservationVol) {
		this.etatReservationVol = etatReservationVol;
	}

	/**
	 * @return the aeroportDepart
	 */
	public Aeroport getAeroportDepart() {
		return aeroportDepart;
	}

	/**
	 * @param aeroportDepart
	 *            the aeroportDepart to set
	 */
	public void setAeroportDepart(Aeroport aeroportDepart) {
		this.aeroportDepart = aeroportDepart;
	}

	/**
	 * @return the aeroportArrive
	 */
	public Aeroport getAeroportArrive() {
		return aeroportArrive;
	}

	/**
	 * @param aeroportArrive
	 *            the aeroportArrive to set
	 */
	public void setAeroportArrive(Aeroport aeroportArrive) {
		this.aeroportArrive = aeroportArrive;
	}

	/**
	 * @return the escales
	 */
	public List<Escale> getEscales() {
		return escales;
	}

	/**
	 * @param escales
	 *            the escales to set
	 */
	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}

	/**
	 * {@link CompagnieAerienne} qui propose le vol.
	 */
	private CompagnieAerienne affreteur;

	/**
	 * Etat de réservabilité du vol.
	 */
	private EtatReservationVol etatReservationVol;

	/**
	 * Aéroprot de départ.
	 */
	private Aeroport aeroportDepart;

	/**
	 * Aéroport d'arrivé.
	 */
	private Aeroport aeroportArrive;

	/**
	 * Liste des escales du vol (0..*).
	 */
	private List<Escale> escales;

	/**
	 * Ouvre le vol à la réservation.
	 */
	public void ouvrirReservation() {
		this.etatReservationVol = EtatReservationVol.OUVERTE;
	}

	/**
	 * Ferme le vol à la réservation.
	 */
	public void fermerReservation() {
		this.etatReservationVol = EtatReservationVol.FERME;
	}
}
