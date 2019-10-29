package task5.spring.service;


import task5.spring.model.User;

import java.util.List;


public interface UserService {

    //1-й получить список всех пользователей
    List<User> getAllUsers();
}