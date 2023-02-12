package shine.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import shine.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
