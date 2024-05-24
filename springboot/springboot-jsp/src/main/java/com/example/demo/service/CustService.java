package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.CustDao;
import com.example.demo.dto.CustDto;

@Service
public class CustService {

	
	@Autowired
	CustDao custDao;
	public String insert(CustDto custDto) {
		// TODO Auto-generated method stub
		return custDao.insert(custDto);
	}
	public Optional<CustDto> fid(int id) {
		return custDao.fid(id);
	}
	public List<CustDto> fall() {
		return custDao.fall();
	}
	public String did(int id) {
		 return	custDao.did(id);
		}
	public String dall() {
		return custDao.dall();
	}



}
