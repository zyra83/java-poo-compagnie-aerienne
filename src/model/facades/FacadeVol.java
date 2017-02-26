package model.facades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import model.entities.Aeroport;
import model.entities.CompagnieAerienne;
import model.entities.Escale;
import model.entities.EtatReservationVol;
import model.entities.Ville;
import model.entities.Vol;

public class FacadeVol {

	private List<Vol> vols;

	public Vol rechercherUnVol(Ville villeDepart, Ville villeArrivee, LocalDate dateDepart) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Rechercher un vol par ville de départ et d'arriver ainsi qu'à partir de
	 * quand vous le cherchez.
	 * 
	 * @param villeDepart
	 * @param villeArrivee
	 * @param dateDepart
	 * @return
	 */
	private Vol rechercherUnVol(String villeDepart, String villeArrivee, LocalDate dateDepart) {
		for (Iterator<Vol> iterator = vols.iterator(); iterator.hasNext();) {
			Vol vol = (Vol) iterator.next();
			return vol;
		}
		return null;
	}

	/**
	 * Cette méthode va récuper les données de vol pour la compagnie. Vu que
	 * l'appli ne sert que pour une compagnie aérienne on ne devrait pas avoir à
	 * passer la compagnier en paramètre. En fait la classe
	 * {@link CompagnieAerienne} ne devrait pas servir mais l'analyse a été
	 * faite comme ça.
	 */
	public void synchroniserVol() {
		Aeroport paris = new Aeroport("Paris");
		Aeroport marseille = new Aeroport("Marseille");
		CompagnieAerienne af = new CompagnieAerienne("Air France");

		// Ajout d'un Marseille Paris.
		Vol v = new Vol();
		v.setAeroportDepart(paris);
		v.setAeroportArrive(marseille);
		v.setAffreteur(af);
		v.setDateDebut(LocalDateTime.of(2017, 11, 11, 12, 30));
		v.setDateFin(LocalDateTime.of(2017, 11, 11, 13, 30));
		v.setEscales(new Stack<Escale>());
		v.setEtatReservationVol(EtatReservationVol.OUVERTE);

		if (this.vols == null) {
			this.vols = new ArrayList<Vol>();
		} else {
			this.vols.clear();
		}
		this.vols.add(v);

	}

	public static void main(String args[]) {
		FacadeVol facadeVols = new FacadeVol();
		facadeVols.synchroniserVol();
		Vol v = facadeVols.rechercherUnVol("Paris", "Marseille", LocalDate.now());
		System.out.println(v.toString());

	}

}
