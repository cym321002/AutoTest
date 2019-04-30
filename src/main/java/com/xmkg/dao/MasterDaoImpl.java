package com.xmkg.dao;

import java.util.List;
import java.util.Map;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.transaction.annotation.Transactional;

public class MasterDaoImpl implements MasterDao{
	@Autowired
	@Qualifier("entityManagerPrimary")
	private EntityManager em;

	@SuppressWarnings("deprecation")
	@Override
	public List<Map<String,Object>> sqlList(String sql) {
		// TODO Auto-generated method stub
		Query query = em.createNativeQuery(sql);
		query.unwrap(SQLQuery.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		@SuppressWarnings("unchecked")
		List<Map<String,Object>> resultList=query.getResultList();
		return resultList;
	}
	@Override
	@Transactional
	public int sqlUpdate (String sql) {
		// TODO Auto-generated method stub
		Query query = em.createNativeQuery(sql);
		em.getTransaction().begin();
		int i = query.executeUpdate();
		em.getTransaction().commit();
	    return i ;
	}

}
