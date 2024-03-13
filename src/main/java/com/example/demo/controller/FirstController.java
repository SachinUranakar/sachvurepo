package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Client;
import com.example.demo.service.FirstService;

@Controller
public class FirstController {
	@Autowired
	FirstService fstservice;

	@PostMapping("/create")
	@ResponseBody
	public Client createClient(@RequestBody Client client) {
		System.out.println("Dev_1.0");
		return fstservice.createClient(client);
	}

	@GetMapping("/getClient/{id}")
	@ResponseBody
	public Client getClientById(@PathVariable String id) {
		return fstservice.getClient(id);

	}

	@GetMapping("/getAllClient")
	@ResponseBody
	public List<Client> getClients() {
		return fstservice.getAllClient();
	}

	@GetMapping("/getClientName/{ss}")
	@ResponseBody
	public List<Client> getClientByName(@PathVariable String ss) {
		return fstservice.getByName(ss);
	}
	@PutMapping("/updateClient")
	@ResponseBody 
	public Client updateByName(@RequestBody Client client) {	
		return fstservice.updateClient(client);
	}
   
	@DeleteMapping("/deleteClient/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public void deleteClient(@PathVariable String id) {
		 fstservice.deleteClient(id);
		
	}
	@GetMapping("/getClientAnd")
	@ResponseBody
	public List<Client> getClientAnd(@RequestParam String name,@RequestParam String email){
		System.out.print("name"+name +"email "+email);
		return fstservice.getClientAnd(name, email);
		
	}
	@GetMapping("/getClientOr")
	@ResponseBody
	public List<Client> getClientOr(@RequestParam String name,@RequestParam String email){
		System.out.print("name"+name +"email "+email);
		return fstservice.getClientOr(name, email);
		
	}
	@GetMapping("/getclientpagination")
	@ResponseBody
	public List<Client> getClientsPagination(@RequestParam int pageno,int pageSize){
		return fstservice.getClientPagination(pageno,pageSize);
	}
	@GetMapping("/getclientsort")
	@ResponseBody
	public List<Client> getClientsSort(@RequestParam String field){
		return fstservice.getClientSort(field);
	}
	@GetMapping("/byproductname")
	@ResponseBody
	public List<Client> getByProductName(@RequestParam String pname){
		return fstservice.getByProductName(pname);
		
	}
	@GetMapping("/bylocationmark")
	@ResponseBody
	public List<Client> getByLocationMark(@RequestParam String lmark){
		return fstservice.findByLocationLocationmark(lmark);
		
	}
	@GetMapping("/likeoperation")
	@ResponseBody
	public List<Client> isLikeOpeartion(@RequestParam String likep){
		return fstservice.isLikeOperation(likep);
		
	}
//	@GetMapping("/startwith/{name}")
//	@ResponseBody
//	public List<Client> nameStartWith(@PathVariable String name){
//		System.out.println("name--"+name);
//		return fstservice.nameStartWith(name);
//		
//	}
	@GetMapping("/startwith")
	@ResponseBody
	public List<Client> nameStartWith(@RequestParam String name){
		System.out.println("name--"+name);
		return fstservice.nameStartWith(name);
		
	}
}
