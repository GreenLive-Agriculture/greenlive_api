package osc.greenlive.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import osc.greenlive.service.CultureService;

@Service
public class CulturesServiceRepo extends JpaRepository<Cultures, Long>{
	
}
