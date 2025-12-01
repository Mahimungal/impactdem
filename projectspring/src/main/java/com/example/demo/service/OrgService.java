package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Org;




public interface OrgService {
	Org updateOrg(Org  org,int id);
	Org addOrg(Org org);
	List<Org> fetchOrg();
	Org fetchOrg(int id);
	void deleteOrg( Integer id);
}
