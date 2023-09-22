package osc.greenlive.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import osc.greenlive.model.Kit;

public interface KitServiceRepository extends JpaRepository<Kit, Long>{
	
	/*
	 * 
	 * SELECT k.*
FROM user u
JOIN cultures c ON u.culture_id = c.id
JOIN cultures_kits ck ON c.id = ck.culture_id
JOIN Kit k ON ck.kit_id = k.id
WHERE u.id = <id de l'utilisateur>


	@Query("select id_kit from kit where id_kit.cultures.user.id_user = :user_id")
	List<Kit> findKitByUserId(@Param(value = "user_id") Long user_id);
	*/
}