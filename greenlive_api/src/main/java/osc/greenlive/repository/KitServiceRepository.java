package osc.greenlive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import osc.greenlive.model.Kit;

public interface KitServiceRepository extends JpaRepository<Kit, Long>{
	
	@Query("select k from kit where k.cultures.user.id_user = :user_id")
	List<Kit> findKitByUserId(@Param(value = "user_id") Long user_id);
}