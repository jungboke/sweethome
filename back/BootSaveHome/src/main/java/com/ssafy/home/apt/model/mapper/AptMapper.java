package com.ssafy.home.apt.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.apt.dto.Apt;
import com.ssafy.home.apt.dto.AptData;
import com.ssafy.home.apt.dto.AptInfo;
import com.ssafy.home.board.dto.Search;


@Mapper
public interface AptMapper {
	public List<Apt> selectSido() throws Exception;
	public List<Apt> selectGugun(String sidoCode) throws Exception;
	public List<Apt> selectDong(String gugunCode) throws Exception;
	public List<Apt> selectDongGetPos(String code) throws Exception;
	public List<AptInfo> selectAptList(String fullcode) throws Exception;
	public List<AptInfo> selectAptListByLatLng(String lat, String lng) throws Exception;
	public List<AptInfo> selectAptListByDongName(String dong) throws Exception;
	public List<AptData> selectAptListByFullCode(int pageNum, int pageSize, String fullCode) throws Exception; // added 11/19
	public List<AptData> selectAptListByDong(int pageNum, int pageSize, String dongName) throws Exception; // added 11/19
	public List<AptData> selectAptListByAptName(int pageNum, int pageSize, String aptName) throws Exception; // added 11/20

}
