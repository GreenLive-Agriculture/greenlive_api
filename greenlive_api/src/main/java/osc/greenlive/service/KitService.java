package osc.greenlive.service;

import java.util.List;

import osc.greenlive.model.Kit;

public interface KitService {
	public Kit saveKit(Kit user);
	public List<Kit> findKit();
	public Kit deleteUser(Long id_kit);
	public Kit updateUser(Long id_kit , Kit kit);
}
