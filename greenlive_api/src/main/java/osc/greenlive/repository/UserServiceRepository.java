package osc.greenlive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import osc.greenlive.model.User;

@Repository
public interface UserServiceRepository extends JpaRepository<User, Long>{

}
