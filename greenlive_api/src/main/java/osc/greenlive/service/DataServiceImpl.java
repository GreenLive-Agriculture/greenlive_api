package osc.greenlive.service;

import java.util.List;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import osc.greenlive.model.Data;
import osc.greenlive.repository.DataServiceRepository;

@Service
@Transactional
public class DataServiceImpl implements DataService{

	private DataServiceRepository dataRepo;
	
	public DataServiceImpl (DataServiceRepository dataRepo)
	{
		this.dataRepo = dataRepo ;
	}
	@Override
	public Data saveData(Data data) {
		// TODO Auto-generated method stub
		return this.dataRepo.save(data);
	}

	@Override
	public List<Data> findData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Data deleteData(Long id_Data) {
		// TODO Auto-generated method stub
		this.dataRepo.deleteById(id_Data);
		return null;
	}

	@Override
	public Data updateData(Long id_Data, Data data) {
		// TODO Auto-generated method stub
		Data getData = this.dataRepo.findById(id_Data).orElse(null);
		this.dataRepo.delete(getData);
		this.dataRepo.save(data) ;
		
		return null;
	}

}
