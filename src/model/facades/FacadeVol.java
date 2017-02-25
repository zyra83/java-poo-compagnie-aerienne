package model.facades;

import java.time.LocalDate;

import model.entities.CompagnieAerienne;
import model.entities.Ville;

public class FacadeVol {
	
	public void rechercherUnVol(Ville villeDepart, Ville villeArrivee, LocalDate dateDepart) {
		// TODO Auto-generated method stub

	}

	/**
	 * Cette méthode va récuper les données de vol pour la compagnie. Vu que
	 * l'appli ne sert que pour une compagnie aérienne on ne devrait pas avoir à
	 * passer la compagnier en paramètre. En fait la classe
	 * {@link CompagnieAerienne} ne devrait pas servir mais l'analyse a été
	 * faite comme ça.
	 */
	public void synchroniserVol() {
		// TODO Auto-generated method stub
	}
}
