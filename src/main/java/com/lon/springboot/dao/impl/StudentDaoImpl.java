package com.lon.springboot.dao.impl;



import org.springframework.stereotype.Repository;

import com.lon.springboot.dao.StudentDao;
import com.lon.springboot.entity.Student;


@Repository("studentDao")
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao{

	

	
}
