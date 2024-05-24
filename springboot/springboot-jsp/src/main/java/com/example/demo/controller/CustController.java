package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.CustDto;
import com.example.demo.service.CustService;

@Controller
public class CustController {
	@Autowired
	CustService custService;
	
	
	@GetMapping("/insertjsp")
	public String inserthtml() {
		return "insert.jsp";		
	}
	
	@PostMapping("/insert")
	@ResponseBody
	public String insert(@ModelAttribute CustDto custDto) {
		return custService.insert(custDto);		
	}
	
		@RequestMapping("/fid1")
	public ModelAndView fid(@RequestParam int id) {
		Optional<CustDto> custDto=custService.fid(id);	
		 ModelAndView modelAndView=new ModelAndView("fid.jsp");
		 modelAndView.addObject("data", custDto);
		return modelAndView;		
	}
		@RequestMapping("/fall")
		public ModelAndView fall() {
			List<CustDto> custDto=custService.fall();	
			 ModelAndView modelAndView=new ModelAndView("fall.jsp");
			 modelAndView.addObject("data", custDto);
			return modelAndView;		
		}		
	@GetMapping("/didjsp")
	public String didjsp() {
		return "did.jsp";
	}
	@RequestMapping("/did")
		@ResponseBody
		public String did(@RequestParam int id) {
		 return	custService.did(id);
		}
	@GetMapping("/deleteall")
	@ResponseBody
	public String dall() {
		return custService.dall();
	}
	

}
