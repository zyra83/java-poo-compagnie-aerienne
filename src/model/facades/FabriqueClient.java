package model.facades;

import model.entities.Client;

public class FabriqueClient {
	public Client creerClient(String nom, String prenom) {
		// TODO compléter la méthode
		Client c = new Client();
		c.setNom(nom + " " + prenom) ;
		return new Client();

	}

}
