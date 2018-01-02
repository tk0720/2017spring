package com.hb.ex04.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hb.ex04.model.entity.GuestVo;

public class GuestDaoImplTest {
	GuestDao guestDao;

	@Before
	public void setUp() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config-context.xml");
		guestDao = (GuestDao) ac.getBean("guestDao");
	}

	@Test
	public void testSelectAll() throws Exception {
		assertNotNull("dao가 null임", guestDao);
//		List<GuestVo> list = guestDao.selectAll();
		assertNotNull("db 수행결과 못받음", guestDao.selectAll());
		assertTrue("리턴 결과가 List 타입이 아님", guestDao.selectAll() instanceof List);
	}

}
