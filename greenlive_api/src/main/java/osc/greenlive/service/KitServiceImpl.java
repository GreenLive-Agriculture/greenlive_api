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
	public void deleteKit(Long id_kit) {
		// TODO Auto-generated method stub
		
		this.kitRepo.deleteById(id_kit);
	}

	@Override
	public Kit updateKit(Long id_kit, Kit kit) {
		// TODO Auto-generated method stub
		Kit get = this.kitRepo.findById(id_kit).orElse(null);
		
		this.kitRepo.save(kit);
		this.kitRepo.delete(get);
		
		return kit ;
	}

	@Override
	public List<Kit> findKitByUser(Long user_id) {
		// TODO Auto-generated method stub
		return this.kitRepo.findKitByUserId(user_id);
	}

	@Override
	public List<Kit> findKit() {
		// TODO Auto-generated method stub
		return null;
	}
}
