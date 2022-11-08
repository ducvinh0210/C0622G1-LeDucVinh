package service;

import model.User;
import repository.IUserRepository;
import repository.UserRepository;

import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {
private IUserRepository userRepository= new UserRepository();


    @Override
    public void insertUser(User user) {
        userRepository.insertUser(user);


    }

    @Override
    public User selectUser(int id) {
        return userRepository.selectUser(id);
    }

    @Override
    public List<User> selectAllUsers() {
        return userRepository.selectAllUsers();
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return userRepository.updateUser(user);
    }

    @Override
    public List<User> selectUserByCountry(String country) {
        return userRepository.selectUserByCountry(country);
    }


//    ss13 Gọi MySql Stored Procedures từ JDBC
@Override
public User getUserById(int id) {
    return userRepository.getUserById(id);
}

    @Override
    public void insertUserStore(User user) throws SQLException {
        userRepository.insertUserStore(user);
    }

    @Override
    public List<User> selectAllUsersBySP() {
        return userRepository.selectAllUsersBySP();
    }

    @Override
    public boolean updateUserBySP(User user) throws SQLException {
        return userRepository.updateUserBySP(user);
    }

    @Override
    public boolean deleteUserById(int id) throws SQLException {
        return userRepository.deleteUser(id);
    }




}
