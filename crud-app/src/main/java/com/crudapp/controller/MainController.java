package com.crudapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.crudapp.dao.ProductDao;
import com.crudapp.entities.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping(path = "/")
	public String home(Model model) {
		model.addAttribute("title", "Home - Product Crud App");
		System.out.println(productDao.getAllProducts());
		model.addAttribute("products", productDao.getAllProducts());
		return "index";
	}
	
	@RequestMapping(path = "/add")
	public String addProduct(Model model) {
		model.addAttribute("title", "Add Product");
		return "add-product";
	}
	
	@RequestMapping(path = "/create-product", method = RequestMethod.POST)
	public RedirectView createProduct(@ModelAttribute("product") Product product, HttpServletRequest request) {
		System.out.println(product);
		productDao.add(product);
		return new RedirectView(request.getContextPath()+"/");
	}
	
	@RequestMapping(path = "/delete/{id}")
	public RedirectView delete(@PathVariable("id") Integer id, HttpServletRequest request) {
		productDao.delete(id);
		return new RedirectView(request.getContextPath()+"/");
	}
	
	@RequestMapping(path = "/update/{id}")
	public String update(@PathVariable("id") Integer id, HttpServletRequest request, Model model) {
		Product product = productDao.getProductById(id);
		System.out.println(product);
		
		model.addAttribute("title", product.getName());
		model.addAttribute("product", product);
		return "update-product";
	}
	
	
}
