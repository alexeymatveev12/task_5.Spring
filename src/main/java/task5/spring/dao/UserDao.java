package task5.spring.dao;

import task5.spring.model.User;


import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    //1-й получить список всех пользователей
    List<User> getAllUsers();
}