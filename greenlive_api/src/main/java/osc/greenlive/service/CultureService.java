package osc.greenlive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import osc.greenlive.model.Cultures;
import osc.greenlive.repository.CulturesServiceRepo;
import osc.greenlive.model.Cultures;

@Service
public class CultureService {

	@Autowired
    private CulturesServiceRepo cultureRepository;

    @Override
    public void enregistrerCulture(Cultures culture) {
        cultureRepository.save(culture);
    }

    @Override
    public List<Cultures> listerCultures() {
        return cultureRepository.findAll();
    }
    
    
    
}
