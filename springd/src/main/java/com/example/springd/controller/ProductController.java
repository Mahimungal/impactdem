package com.example.springd.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springd.entity.Product;
import com.example.springd.respository.ProductRespostory;
@RestController
@RequestMapping("/Product")
public class ProductController {
	@Autowired
	ProductRespostory productRespostory;

	public ProductController(ProductRespostory productRespostory) {
		super();
		this.productRespostory = productRespostory;
	}
	@GetMapping("/data")
	public List<Product> getData()
	{
		List<Product> l1=productRespostory.findAll();
		return l1;
	}
	@PostMapping("/mahajan")
	public Product addData(@RequestBody Product product)
	{

		Product p1=productRespostory.save(product);
		return p1;
	}
	@PutMapping("/{id}")
	public Product updateData(@PathVariable Integer id,@RequestBody Product product)
	{
		Product p=productRespostory.findById(id).get();
		p.setName(product.getName());
		p.setPrice(product.getPrice());

		return productRespostory.save(p);
	}


	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id)
	{

		productRespostory.deleteById(id);
	}


}
