package cn.itcast.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.core.bean.BaseDict;
import cn.itcast.core.dao.BaseDictDao;
import cn.itcast.core.service.SystemService;
/**
 * ������Ϣ�����ֵ�
 * @author lx
 *
 */

@Service("systemService")
public class SystemServiceImpl implements SystemService{
	
	@Autowired
	private BaseDictDao baseDictDao;
	//�������ͱ�Ų�ѯ�����ֵ�
	public List<BaseDict> findBaseDictListByType(String typecode) {
		return baseDictDao.selectByTypecode(typecode);
	}

}
