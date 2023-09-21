package osc.greenlive.service;

import java.util.List;

import osc.greenlive.model.ModelIA;
import osc.greenlive.model.User;

public interface ModelIAService {
	public ModelIA saveModelIA(ModelIA modelIA);
	public List<ModelIA> findModelIA();
	public ModelIA deleteModelIA(Long id_modelIA);
	public User updateModelIA(Long id_modelIA , ModelIA modelIA);
}
