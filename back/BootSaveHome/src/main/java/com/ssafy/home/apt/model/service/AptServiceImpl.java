package com.ssafy.home.apt.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.apt.dto.Apt;
import com.ssafy.home.apt.dto.AptData;
import com.ssafy.home.apt.dto.AptInfo;
import com.ssafy.home.apt.model.mapper.AptMapper;
import com.ssafy.home.board.dto.Search;

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


	// added 11/19
	@Override
	public List<AptData> getAptListByFullCode(int pageNum, int pageSize, String fullCode) throws Exception {		
		return aptMapper.selectAptListByFullCode(pageNum, pageSize, fullCode);
	}

	// added 11/19
	@Override
	public List<AptData> getAptListByDong(int pageNum, int pageSize, String dongName) throws Exception {		
		return aptMapper. selectAptListByDong(pageNum,pageSize,dongName);
	}

	// added 11/20
	@Override
	public List<AptData> getAptListByAptName(int pageNum, int pageSize, String aptName) throws Exception {
		return aptMapper.selectAptListByAptName(pageNum, pageSize, aptName);
	}



}
