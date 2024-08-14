package com.example.apidemo;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloRepository {

  String hello();

}

