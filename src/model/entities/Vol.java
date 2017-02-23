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
	 * {@link CompagnieAerienne} qui propose le vol.
	 */
	private CompagnieAerienne compagnie;

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
	private void ouvrirReservation() {
		this.etatReservationVol = EtatReservationVol.OUVERTE;
	}

	/**
	 * Ferme le vol à la réservation.
	 */
	private void fermerReservation() {
		this.etatReservationVol = EtatReservationVol.FERME;
	}
}
