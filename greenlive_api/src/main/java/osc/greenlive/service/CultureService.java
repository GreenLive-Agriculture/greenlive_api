package osc.greenlive.service;

import java.util.List;


import osc.greenlive.model.Cultures;
import osc.greenlive.model.Kit;


public interface CultureService {
	public Cultures saveCulture(Cultures culture);
	public List<Cultures> findCultures();
	public void deleteCulture(Long id_culture);
	public Cultures updateCulture(Long id_culture , Cultures culture);
	public List<Kit> listKitCultures (Long id_culture);
}
