package osc.greenlive.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import osc.greenlive.model.Data;

public interface DataServiceRepository extends JpaRepository<Data, Long>{

}
