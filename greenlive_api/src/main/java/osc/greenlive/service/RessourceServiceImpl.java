package osc.greenlive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import osc.greenlive.model.Ressource;
import osc.greenlive.model.User;
import osc.greenlive.repository.RessourceServiceRepository;

@Service
@Transactional
public class RessourceServiceImpl implements RessourceService {

	private RessourceServiceRepository ressourceRepo ;
	
	public RessourceServiceImpl (RessourceServiceRepository ressourceRepo)
	{
		this.ressourceRepo = ressourceRepo ;
	}
	
	@Override
	public Ressource saveRessource(Ressource ressource) {
		return this.ressourceRepo.save(ressource);
	}

	@Override
	public List<Ressource> findRessource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ressource deleteressource(Long id_ressource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ressource updateRessource(Long id_ressource, User ressource) {
		// TODO Auto-generated method stub
		return null;
	}

}
