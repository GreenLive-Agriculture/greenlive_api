package osc.greenlive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import osc.greenlive.model.ModelIA;
import osc.greenlive.model.User;
import osc.greenlive.repository.ModelIAServiceRepository;

@Service
@Transactional
public class ModelIAServiceImpl implements ModelIAService {

	private ModelIAServiceRepository modelIARepo ;
	
	public ModelIAServiceImpl(ModelIAServiceRepository modelIARepo)
	{
		this.modelIARepo = modelIARepo ;
	}
	
	@Override
	public ModelIA saveModelIA(ModelIA modelIA) {
		// TODO Auto-generated method stub
		return this.modelIARepo.save(modelIA);
	}

	@Override
	public List<ModelIA> findModelIA() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ModelIA deleteModelIA(Long id_modelIA) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateModelIA(Long id_modelIA, ModelIA modelIA) {
		// TODO Auto-generated method stub
		return null;
	}

}
