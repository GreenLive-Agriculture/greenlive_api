package osc.greenlive.service;

import java.util.List;

import osc.greenlive.model.Data;


public interface DataService {
	public Data saveData(Data Data);
	public List<Data> findData();
	public Data deleteData(Long id_Data);
	public Data updateData(Long id_Data , Data Data);
}
