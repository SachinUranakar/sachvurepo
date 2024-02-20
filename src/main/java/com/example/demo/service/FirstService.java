package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Client;
import com.example.demo.service.repo.ClientRepository;

@Service
@ComponentScan("com.example.demo.repository.ClientRepository")
public class FirstService {

@Autowired		
ClientRepository clientrepo;	
	
public Client createClient(Client client) {
	
	return clientrepo.save(client);
	
}
public Client getClient(String id) {
	return clientrepo.findById(id).get();
}
public List<Client> getAllClient() {
	return clientrepo.findAll();
}
public List<Client> getByName(String name) {
	
	//return clientrepo.findByName(name);
	return clientrepo.getByName(name);
} 
public Client updateClient(Client client) {
	return clientrepo.save(client);
}
public void deleteClient(String id) {
	 clientrepo.deleteById(id);;
} 

public List<Client> getClientAnd(String name,String email){
	//return clientrepo.findByNameAndEmail(name, email);
	return clientrepo.getByNameEmail(name, email);
}
public List<Client> getClientOr(String name,String email){
	//return clientrepo.findByNameOrEmail(name, email);
	return clientrepo.getByNameEmailor(name, email);
}
public List<Client> getClientPagination(int pageno,int pagesize){
	Pageable page = PageRequest.of(pageno, pagesize);
	return  clientrepo.findAll(page).getContent();
}
public List<Client> getClientSort(String field) {
	Sort sort = Sort.by(Sort.Direction.DESC, field,"email");
	Pageable p = PageRequest.of(0, 5, sort);
	return clientrepo.findAll(p).getContent();
}

public List<Client> getByProductName(String pname){
	return clientrepo.findByProductProductname(pname);
}
public List<Client> findByLocationLocationmark(String lmark){
	return clientrepo.findByLocationLocationmark(lmark);
}
public List<Client> isLikeOperation(String parameter){
	return clientrepo.findByEmailIsLike(parameter);
}
public List<Client> nameStartWith(String name){
	return clientrepo.findByNameStartsWith(name);
}
}
