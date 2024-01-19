package jm.task.core.jdbc.service;

import java.util.List;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;


public class UserServiceImpl extends UserDaoJDBCImpl implements UserService {
    public UserServiceImpl() {
        super();
    }

    @Override
    public void createUsersTable() {
        super.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        super.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        super.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        super.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return super.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        super.cleanUsersTable();
    }
}
