package cn.kgc.dao.impl;

import cn.kgc.dao.UserDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author 曹译
 * 日期：2020-03-12
 * desc：
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
    @Override
    public List userList() {
        return super.getHibernateTemplate().find("from Users");
    }
}
