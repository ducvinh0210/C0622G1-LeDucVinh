package repository;

import model.User;

import java.util.List;

public interface IUserRepository {

    void insertUser(User user);
    User selectUser(int id);
    List<User> selectAllUsers();
    boolean deleteUser(int id);
    boolean updateUser(int id);





}
