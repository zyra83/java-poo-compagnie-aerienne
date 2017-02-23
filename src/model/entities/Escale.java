package model.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Escale {

	/**
	 * Aéroport d'arrivé.
	 */
	private LocalDateTime dateArrivee;
	
	/**
	 * Aéroport de départ.
	 */
	private LocalDateTime dateDepart;
	
	/**
	 * Aéroport d'escale.
	 */
	private Aeroport aeroport;
	
	/**
	 * Vols passant par cette escale.
	 */
	private List<Vol> vols;

	/**
	 * @return the dateArrivee
	 */
	LocalDateTime getDateArrivee() {
		return dateArrivee;
	}

	/**
	 * @param dateArrivee the dateArrivee to set
	 */
	void setDateArrivee(LocalDateTime dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	/**
	 * @return the dateDepart
	 */
	LocalDateTime getDateDepart() {
		return dateDepart;
	}

	/**
	 * @param dateDepart the dateDepart to set
	 */
	void setDateDepart(LocalDateTime dateDepart) {
		this.dateDepart = dateDepart;
	}

	/**
	 * @return the aeroport
	 */
	Aeroport getAeroport() {
		return aeroport;
	}

	/**
	 * @param aeroport the aeroport to set
	 */
	void setAeroport(Aeroport aeroport) {
		this.aeroport = aeroport;
	}

	/**
	 * @return the vols
	 */
	List<Vol> getVols() {
		return vols;
	}

	/**
	 * @param vols the vols to set
	 */
	void setVols(List<Vol> vols) {
		this.vols = vols;
	}
	
	
	
}
