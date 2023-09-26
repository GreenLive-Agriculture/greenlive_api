package osc.greenlive.service;

import java.util.List;

import osc.greenlive.model.Kit;

public interface KitService {
	public Kit saveKit(Kit user);
	public List<Kit> findKit();
	public void deleteKit(Long id_kit);
	public Kit updateKit(Long id_kit , Kit kit);
	public List<Kit> findKitByUser(Long user_id);
}
