package repository;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {

    void insertUser(User user);
    User selectUser(int id);
    List<User> selectAllUsers();
    boolean deleteUser(int id) throws SQLException;
    boolean updateUser(User user) throws SQLException;
    List<User> selectUserByCountry(String country);


//    ss13 Gọi MySql Stored Procedures từ JDBC
User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    List<User> selectAllUsersBySP();

    boolean updateUserBySP(User user) throws SQLException;

    boolean deleteUserById(int id) throws SQLException;








}
