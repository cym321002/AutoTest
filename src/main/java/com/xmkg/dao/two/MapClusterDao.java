package com.xmkg.dao.two;

import java.util.List;
import java.util.Map;
public interface MapClusterDao{
	//sql语句查的，返回的是hashmap，用于联表查询
	List<Map<String,Object>> sqlList(String sql);
}
