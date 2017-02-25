package model.entities;

import java.util.List;

/**
 * 
 * @author Mickaël Benoit
 *
 */
public class Aeroport {

	/**
	 * Le nom commun de l'aéroport.
	 */
	private String nom;
	
	/**
	 * Liste des villes que déssert l'aéroport.
	 */
	private List<Ville> villesDesservies;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the villesDesservies
	 */
	public List<Ville> getVillesDesservies() {
		return villesDesservies;
	}

	/**
	 * @param villesDesservies the villesDesservies to set
	 */
	public void setVillesDesservies(List<Ville> villesDesservies) {
		this.villesDesservies = villesDesservies;
	}
}
