package com.example.demo.controller;

import java.util.List;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Org;
import com.example.demo.service.OrgService;

import jakarta.websocket.server.PathParam;
@RestController
@RequestMapping("/Org")
public class OrgController {
	@Autowired

	private	OrgService serOrgService;
	@PostMapping("/add")
	public Org addData(@RequestBody Org org)
	{
		Org o= serOrgService.addOrg(org);
		return o;
	}
	@PutMapping("/update/{id}")
	public Org updateData(@RequestBody Org org,@PathVariable Integer id)
	{
		Org o= serOrgService.updateOrg(org,id);
		return o;
	}
	@DeleteMapping("/{id}")
	public void deleteData( @PathVariable Integer id) 
	{ 
		serOrgService.deleteOrg(id);

	}
	@GetMapping("/data/{id}")
	public Org fetchDataById(@PathVariable Integer Id){
		Org l1=serOrgService.fetchOrg(Id);
		return l1;
	}

	@GetMapping("/data")
	public List<Org> fetchData(){
		List<Org> l1=serOrgService.fetchOrg();
		return l1;
	}
}
