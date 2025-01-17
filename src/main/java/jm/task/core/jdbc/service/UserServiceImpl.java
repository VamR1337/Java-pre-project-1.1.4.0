package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDaoJDBCImpl = new UserDaoJDBCImpl();

    public UserDao getUserDaoJDBCImpl() {
        return userDaoJDBCImpl;
    }

    public void setUserDaoJDBCImpl(UserDao userDaoJDBCImpl) {
        this.userDaoJDBCImpl = userDaoJDBCImpl;
    }

    public void createUsersTable() {
        userDaoJDBCImpl.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoJDBCImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJDBCImpl.saveUser(name,lastName,age);
        System.out.println("User с именем — " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        userDaoJDBCImpl.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return userDaoJDBCImpl.getAllUsers();
    }

    public void cleanUsersTable() {
        userDaoJDBCImpl.cleanUsersTable();
    }
}
