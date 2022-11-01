package service;

import model.User;

import java.util.ArrayList;
import java.util.Date;

public class UserService {
    public static ArrayList<User> users;

    public void init() {
        users= new ArrayList<>();
        Date createAt = new Date();

        // public User(Long id, String name, String email, String address, String phone, Date createAt, int idRole) {
        users.add(new User(1667182235L, "Truong Van Phon", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182236L, "Tran Van Cu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182237L, "Le Anh Thu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182238L, "Phan Minh Tu", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));
        users.add(new User(1667182239L, "Nguyen Anh Khoa", "truongvanphon@gmail.com", "28 Nguyen Tri Phuong", "0399578134", createAt, 1));

    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

}
