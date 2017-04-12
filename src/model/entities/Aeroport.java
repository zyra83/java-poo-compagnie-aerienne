package model.entities;

import java.util.List;

/**
 * Objet représentant un Aéroport. Les aéroport sont désservis par des vols ou
 * des escales. Ils désservent eux mêmes des villes.
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

	public Aeroport(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	public List<Ville> getVillesDesservies() {
		return villesDesservies;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setVillesDesservies(List<Ville> villesDesservies) {
		this.villesDesservies = villesDesservies;
	}

	// Equals / HashCode sur nom et vilesl
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aeroport other = (Aeroport) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (villesDesservies == null) {
			if (other.villesDesservies != null)
				return false;
		} else if (!villesDesservies.equals(other.villesDesservies))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((villesDesservies == null) ? 0 : villesDesservies.hashCode());
		return result;
	}

	// toString
	
	@Override
	public String toString() {
		return String.format("aéroport de %s", this.getNom());
	}
}
