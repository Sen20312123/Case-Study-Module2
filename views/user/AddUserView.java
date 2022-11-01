package views.user;

import service.UserService;
import model.User;
import views.ViewTemplate;

import java.util.Date;

public class AddUserView extends ViewTemplate {
    private UserService userService;

    public AddUserView(){
        userService = new UserService();
    }
    public void showBody() {
        System.out.println("--> ADD PRODUCT VIEW");
        Long idUser = System.currentTimeMillis()/1000;
        System.out.println("Input name:");
        String nameUser = scanner.nextLine();
        System.out.println("Input price:");
        String emailUser = scanner.nextLine();

        System.out.println("Input quantity:");
        String addressUser = scanner.nextLine();

        System.out.println("Input manufacturer:");
        String phoneUser = scanner.nextLine();

        System.out.println("Input role 1/ADMIN 2/USER");
        int idRole = Integer.parseInt(scanner.nextLine());
        Date creatAtUser = new Date();

        User user = new User(idUser, nameUser, emailUser,
                addressUser,phoneUser,  creatAtUser, idRole);

        userService.getUsers().add(user);


    }
}
