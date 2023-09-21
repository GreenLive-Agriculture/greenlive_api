package osc.greenlive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import osc.greenlive.model.Cultures;
import osc.greenlive.repository.CulturesServiceRepository;

@Service
@Transactional
public class CultureServiceImpl implements CultureService{

	private CulturesServiceRepository culturesRepo ;
	
	public CultureServiceImpl(CulturesServiceRepository culturesRepo) {
		this.culturesRepo = culturesRepo;
	}
	
		
	@Override
	public Cultures saveCulture(Cultures culture) {
		// TODO Auto-generated method stub
		
		return  this.culturesRepo.save(culture);
	}

	@Override
	public List<Cultures> findCultures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cultures deleteCulture(Long id_culture) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cultures updateCulture(Long id_culture, Cultures culture) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
