package core.dao.impl;


import core.dao.BaseDao;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.ParameterizedType;
import java.util.List;

@Repository
@Transactional
public abstract class BaseDaoImpl<L> implements BaseDao<L> {

    @Autowired
    protected SessionFactory sessionFactory;

    private Class<L> type;

    protected BaseDaoImpl() {
        this.type =  (Class<L>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Override
    public List<L> findAll() {
        return sessionFactory.getCurrentSession().createCriteria(type).list();
    }

    @Override
    public void saveOrUpdate(L l) {
        sessionFactory.getCurrentSession().saveOrUpdate(l);
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}