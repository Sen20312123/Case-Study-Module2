package views.user;

import service.UserService;
import model.User;
import views.ViewTemplate;

public class UserView extends ViewTemplate {
    private UserService userService;

    public UserView() {//singleton
        userService = new UserService();
    }

    @Override
    public void showBody() {
        for (User user : userService.getUsers()) {
            System.out.println(user);
        }
    }
}
