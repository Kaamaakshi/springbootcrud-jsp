package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.CustDto;
import com.example.demo.repository.CustRepository;

@Repository
public class CustDao {
	@Autowired
	CustRepository  custRepository;
	public String insert(CustDto custDto) {
		custRepository.save(custDto);
		return "data inserted";
		
	}
	public Optional<CustDto> fid(int id) {
		Optional<CustDto> op=custRepository.findById(id);
		if(op.isPresent()) {
			return op;
		}else {
			return null;
		}
	}
	public List<CustDto> fall() {
		return custRepository.findAll();
	}
	public String did(int id) {
		Optional<CustDto> op=custRepository.findById(id);
		if(op.isPresent()) {
		 	custRepository.deleteById(id);
		 	return "data deleted";
		}else {
			return "no data found";
		}
		}
	public String dall() {
		List<CustDto> l=custRepository.findAll();
		if(l.isEmpty()) {
			return "data not found";
		}else {
		custRepository.deleteAll();
		return "data deleted";
	}
	}


}
