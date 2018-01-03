package com.hb.ex05.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hb.ex05.model.entity.GuestVo;

public class GuestDaoImpl implements GuestDao {
	
	SqlSession session;
	public void setSession(SqlSession session) {
		this.session = session;
	}

	@Override
	public List<GuestVo> selectAll() {
		return session.selectList("com.hb.ex05.model.GuestDao.selectAll");
	}

	@Override
	public void insertOne(GuestVo bean) {
		session.insert("com.hb.ex05.model.GuestDao.insertOne", bean);
	}

	@Override
	public GuestVo selectOne(int sabun) {
		return session.selectOne("com.hb.ex05.model.GuestDao.selectOne", sabun);
	}

	@Override
	public int updateOne(GuestVo bean) {
		return session.update("updateOne", bean);
	}

	@Override
	public int deleteOne(int sabun) {
		return session.delete("deleteOne", sabun);
	}

}
