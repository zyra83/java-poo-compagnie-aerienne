package model.entities;

import java.util.List;

/**
 * Objet représentant un Aéroport.
 * Les aéroport sont désservis par des vols ou des escales.
 * Ils désservent eux mêmes des villes.
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

	public Aeroport(String nom) {
		super();
		this.nom = nom;
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
	
	@Override
	public String toString() {
		return String.format("aéroport de %s", this.getNom());
	}
}
