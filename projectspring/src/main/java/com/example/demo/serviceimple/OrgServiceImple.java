package com.example.demo.serviceimple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Org;
import com.example.demo.repository.OrgRespository;
import com.example.demo.service.OrgService;

@Service
public class OrgServiceImple implements OrgService {
	@Autowired
	private OrgRespository orgRespository;

	@Override
	public Org updateOrg(Org org,int id) {
		Org o=orgRespository.findById(id).get();
		o.setLoc(org.getLoc());
		o.setName(org.getName());
		return orgRespository.save(o);
	}

	@Override
	public Org addOrg(Org org) {
		Org o = orgRespository.save(org);
		return o;
	}

	@Override
	public List<Org> fetchOrg() {
		List<Org> l1=orgRespository.findAll();
		return l1;
	}

	@Override
	public Org fetchOrg(int id) {
		Org o1=orgRespository.findById(id).get();
		return o1;
	}

	@Override
	public void deleteOrg(Integer id) {
		orgRespository.deleteById(id);

	}

}
