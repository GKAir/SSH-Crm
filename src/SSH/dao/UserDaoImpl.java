package SSH.dao;

import SSH.domain.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

/**
 * Create by Air on 2017/5/25 at 21:13
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{


    @Override
    public void save(User user) {
        getHibernateTemplate().save(user);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(User user) {

    }
}
