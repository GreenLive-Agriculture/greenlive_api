package osc.greenlive.service;

import java.util.List;

import osc.greenlive.model.Ressource;
import osc.greenlive.model.User;

public interface RessourceService {

	public Ressource saveRessource(Ressource ressource);
	public List<Ressource> findRessource();
	public Ressource deleteressource(Long id_ressource);
	public Ressource updateRessource(Long id_ressource , User ressource);
	
}
