package com.example.teachereval.dao;

import com.example.teachereval.pojo.TblUserInfo;
import com.example.teachereval.pojo.TblUserInfoExample;
import java.util.List;

public interface TblUserInfoMapper {
    int countByExample(TblUserInfoExample example);

    int insert(TblUserInfo record);

    int insertSelective(TblUserInfo record);

    List<TblUserInfo> selectByExample(TblUserInfoExample example);
}