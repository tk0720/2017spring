package com.hb.ex05.model;

import java.util.List;

import com.hb.ex05.model.entity.GuestVo;

public interface GuestDao {
	
	List<GuestVo> selectAll();
	void insertOne(GuestVo bean);
	GuestVo selectOne(int sabun);
	int updateOne(GuestVo bean);
	int deleteOne(int sabun);

}
