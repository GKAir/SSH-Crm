package SSH.service;

import SSH.domain.User;

/**
 * Create by Air on 2017/5/25 at 21:13
 */
public interface UserService {

    void save(User user);

    void delete(Integer id);

    void update(User user);

    User findById(Integer id);
}
