package com.ry.serviceImpl;

import java.util.List;

import com.ry.service.StudentService;

public class StudentServiceImpl implements StudentService{
	// 事务：完成多个操作，只要一个中断或退出，其他操作的结果就不会被确认。即：一个整体性的操作
	//为了测试事务  在这里抛出异常，阻止事务的继续进行
	
	public void addStu() {
		throw new NullPointerException();
	}

	public void updateStu() {
		throw new NullPointerException();
	}

	public List selectStu() {
		throw new NullPointerException();
		//这里 抛出异常后  不要再加return了，不然会报错，不能通过编译
	}

	public int deleteStu() {
		throw new NullPointerException();
	}	
}
