package cn.itcast.core.service;

import java.util.List;

import cn.itcast.core.bean.BaseDict;


public interface SystemService {

	//�������Ͳ�ѯ�����ֵ�
	public List<BaseDict> findBaseDictListByType(String typecode);
	
}
