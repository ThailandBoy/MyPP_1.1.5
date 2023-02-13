package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        String name;
        String lastName;
        byte age;

        // создание таблицы 'User'
        // добавление 4 'user'ов в таблицу 'User', после каждого добавления должен быть вывод в консоль
        // show all users
        // clear table
        // drop table

        // comment for commit

        // создание таблицы 'User'
        userService.createUsersTable();

        // добавление 4 'user'ов в таблицу 'User', после каждого добавления должен быть вывод в консоль
        userService.saveUser("User1","lastNameUser1", (byte) 28);
        userService.saveUser("User2","lastNameUser2", (byte) 38);
        userService.saveUser("User3","lastNameUser3", (byte) 48);
        userService.saveUser("User4","lastNameUser4", (byte) 58);

        // show all users and output through console
        userService.getAllUsers();

        // clear table
        userService.cleanUsersTable();

        // drop table
        userService.dropUsersTable();


    }
}
