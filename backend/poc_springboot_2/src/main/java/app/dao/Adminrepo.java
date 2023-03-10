package app.dao;

import app.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Adminrepo extends JpaRepository<Admin, Integer> {
	@Query("from Admin where name =:abc and password =:def")
	public Admin admin(@Param("abc") String name,@Param("def") String password);
	

}
