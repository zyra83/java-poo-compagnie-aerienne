package model.facades;

import java.util.List;

import model.entities.Client;
import model.entities.Passager;
import model.entities.Reservation;
import model.entities.Vol;

public class FacadeReservation {

	public void creerReservation(Vol vol, Client client, List<Passager> listePassagers) {

	}

	public void annuler(Reservation reservation) {
		reservation.annuler();
	}

	public void confirmer(Reservation reservation) {
		reservation.confirmer();
	}

}
