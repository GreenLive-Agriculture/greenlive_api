package osc.greenlive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import osc.greenlive.model.ModelIA;

@Repository
public interface ModelIAServiceRepository extends JpaRepository<ModelIA, Long>{

}
