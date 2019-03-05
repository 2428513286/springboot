package com.lon.springboot.dao.impl;

import org.springframework.stereotype.Repository;

import com.lon.springboot.dao.ClassesDao;
import com.lon.springboot.entity.Classes;


@Repository("classesDao")
public class ClassesDaoImpl extends BaseDaoImpl<Classes> implements ClassesDao{

}
