package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) throws Exception {
       //UserDaoJDBCImpl testJdbc = new UserDaoJDBCImpl();
       UserDao userDao = new UserDaoJDBCImpl();
       userDao.createUsersTable();
       userDao.saveUser("Vasya","Putin",(byte)30);
       userDao.saveUser("Petya","Putin",(byte)12);
       userDao.saveUser("Oleg","Putin",(byte)15);
       userDao.saveUser("Kirill","Putin",(byte)56);
       userDao.getAllUsers();
       //userDao.removeUserById(1L);
       //userDao.cleanUsersTable();
       //userDao.dropUsersTable();


// реализуйте алгоритм здесь
    }
}
