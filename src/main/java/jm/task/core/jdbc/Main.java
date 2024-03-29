package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();

        User user1 = new User("Иван","Василич", (byte) 33);
        userDao.saveUser("Иван","Василич", (byte) 33);
        System.out.println("User с именем " + user1.getName() + " добавлен в базу данных");

        User user2 = new User("Иван","Василич", (byte) 33);
        userDao.saveUser("Иван","Василич", (byte) 33);
        System.out.println("User с именем " + user2.getName() + " добавлен в базу данных");

        User user3 = new User("Иван","Василич", (byte) 33);
        userDao.saveUser("Иван","Василич", (byte) 33);
        System.out.println("User с именем " + user3.getName() + " добавлен в базу данных");

        User user4 = new User("Иван","Василич", (byte) 33);
        userDao.saveUser("Иван","Василич", (byte) 33);
        System.out.println("User с именем " + user4.getName() + " добавлен в базу данных");

        List<User> userList = userDao.getAllUsers();
        for (User user : userList) {
            System.out.println(user);
        }
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}