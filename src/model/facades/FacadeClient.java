package model.facades;

import model.entities.Client;

public class FacadeClient {

	private FabriqueClient fabrique = new FabriqueClient();
	
	public Client creerClient(String nom, String prenom) {
		
		return fabrique.creerClient(nom, prenom);

	}
}
