package SSH.service;

import SSH.dao.UserDao;
import SSH.domain.User;

/**
 * Create by Air on 2017/5/25 at 21:13
 */
public class UserServiceImpl implements UserService{

    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public User findById(Integer id) {
        return null;
    }
}
