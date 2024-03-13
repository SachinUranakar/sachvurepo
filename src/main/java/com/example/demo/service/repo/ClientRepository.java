package com.example.demo.service.repo;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Client;
@Repository
@ComponentScan
public interface ClientRepository extends MongoRepository<Client, String> {

	public  List<Client> findByName(String name);
	
	public List<Client>  findByNameAndEmail(String name,String email); 
	
	public  List<Client> findByEmail(String email);
	
	public List<Client> findByNameOrEmail(String name,String email);
	
	public List<Client> findByProductProductname(String productName);
	
	public List<Client> findByLocationLocationmark(String locationMark); 

	public List<Client> findByEmailIsLike(String email);
	
	public List<Client> findByNameStartsWith(String name);

	@Query("{\"name\":\"?0\"}")
	public  List<Client> getByName(String name);
	
//	public List<Client> getByNameEmail(String name,String mail);
@Query("{\r\n"
		+ "    $or : [\r\n"
		+ "        {\"name\":\"?0\"} ,{\"mail\" :\"?1\"}\r\n"
		+ "    ]\r\n"
		+ "}")
	public List<Client> getByNameEmailor(String name,String mail);
@Query("{\r\n"
		+ "    $and : [\r\n"
		+ "        {\"name\":\"?0\"} ,{\"mail\" :\"?1\"}\r\n"
		+ "    ]\r\n"
		+ "}")
	public List<Client> getByNameEmail(String name,String mail);
		
	

}
