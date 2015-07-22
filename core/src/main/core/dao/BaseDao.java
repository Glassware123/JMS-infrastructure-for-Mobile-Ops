package core.dao;

import java.util.List;

public interface BaseDao<L> {

    List<L> findAll();

    void saveOrUpdate(L l);
}
