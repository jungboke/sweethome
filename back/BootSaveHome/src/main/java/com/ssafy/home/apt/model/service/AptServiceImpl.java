package com.ssafy.home.apt.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.apt.dto.Apt;
import com.ssafy.home.apt.dto.AptInfo;
import com.ssafy.home.apt.model.mapper.AptMapper;

@Service
public class AptServiceImpl implements AptService {
	
	
	private AptMapper aptMapper;
	
	@Autowired
	public AptServiceImpl(AptMapper aptMapper) {
		this.aptMapper = aptMapper;		
	}

	
	@Override
	public List<Apt> getList(String type, String code) throws Exception {
		switch (type) {
		case "sido":
			return aptMapper.selectSido();
		case "gugun":
			return aptMapper.selectGugun(code);
		case "dong":
			return aptMapper.selectDong(code);
		case "pos":
			return aptMapper.selectDongGetPos(code);
		}
		return null;
	}
	@Override
	public List<AptInfo> getAptList(String fullcode) throws Exception {
		
		return aptMapper.selectAptList(fullcode);
	}


	@Override
	public List<AptInfo> getAptListByLatLng(String lat, String lng) throws Exception {
		return aptMapper.selectAptListByLatLng(lat, lng);
	}


	@Override
	public List<AptInfo> getAptListByDongName(String dong) throws Exception {
		return aptMapper.selectAptListByDongName(dong);
	}
}
