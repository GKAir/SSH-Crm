package SSH.action;

import SSH.domain.User;
import SSH.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Create by Air on 2017/5/25 at 21:12
 */
public class UserAction extends ActionSupport implements ModelDriven<User>{
    private UserService service;

    private User user = new User();

    public void setUser(User user) {
        this.user = user;
    }

    public void setService(UserService service) {
        this.service = service;
    }


    public String save() {
        service.save(user);
        return SUCCESS;
    }
    public String login() {


        return SUCCESS;
    }


    @Override
    public User getModel() {
        return null;
    }
}
