package cn.itcast.core.dao;

import java.util.List;

import cn.itcast.core.bean.BaseDict;

public interface BaseDictDao {

	//���������ֵ��������ѯ
    List<BaseDict> selectByTypecode(String typecode);
    //���������ֵ�ID��ѯ
    BaseDict selectByPrimaryKey(String dictId);

}