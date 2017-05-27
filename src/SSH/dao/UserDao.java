package SSH.dao;

import SSH.domain.User;

/**
 * Create by Air on 2017/5/25 at 21:12
 */
public interface UserDao {
    void save(User user);

    void delete(Integer id);

    void update(User user);

}
