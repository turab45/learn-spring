package com.springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
@Controller
public class FileUploadController {
	
	@RequestMapping(path = "/upload", method = RequestMethod.GET)
	public String showForm() {
		return "upload-form";
	}
	
	@RequestMapping(path = "/uploadfile", method = RequestMethod.POST)
	public String uploadImage(@RequestParam("image") CommonsMultipartFile file, HttpSession s, Model model) {
		String path = s.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+file.getOriginalFilename();
		
		byte[] data = file.getBytes();
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			
			model.addAttribute("filename", file.getOriginalFilename());
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return "filesuccess";
	}
	
}
