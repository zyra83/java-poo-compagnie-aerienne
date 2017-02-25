package model.entities;

import java.util.List;

public class CompagnieAerienne {

	/**
	 * Nom de la compagnie.
	 */
	private String nom;

	/**
	 * Liste des vols proposés par la compagnie.
	 */
	private List<Vol> vols;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the vols
	 */
	public List<Vol> getVols() {
		return vols;
	}

	/**
	 * @param vols
	 *            the vols to set
	 */
	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}

}
