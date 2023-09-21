package osc.greenlive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import osc.greenlive.model.Kit;
import osc.greenlive.repository.KitServiceRepository;

@Service
@Transactional
public class KitServiceImpl implements KitService {

	private KitServiceRepository kitRepo ;
	
	public KitServiceImpl(KitServiceRepository kitrepo) {
		this.kitRepo = kitrepo;
	}
	
	@Override
	public Kit saveKit(Kit kit) {		
		return this.kitRepo.save(kit);
	}

	@Override
	public List<Kit> findKit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kit deleteUser(Long id_kit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Kit updateUser(Long id_kit, Kit kit) {
		// TODO Auto-generated method stub
		return null;
	}

}
