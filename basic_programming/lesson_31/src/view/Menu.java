package view;
/*
@date 27.02.2024
@author Sergey Bugaienko
*/

import model.User;
import service.UserService;
import util.MyList;

import java.util.Scanner;

public class Menu {

    private final UserService service;
    private final Scanner scanner = new Scanner(System.in);

    public Menu(UserService service) {
        this.service = service;
    }


    public void run() {
        showMenu();
    }

    private void showMenu() {
        while (true) {
            System.out.println("Добро пожаловать в интернет-магазин Мега");
            System.out.println("1 -> Меню пользователей");
            System.out.println("2 -> Меню заказов");
            System.out.println("3 -> Меню администратора");
            System.out.println("0 -> Выход");
            System.out.println("\nСделайте выбор пункта:");
            int input = scanner.nextInt();
            scanner.nextLine();

            //проверка не выбран ли пункт выход
            if (input == 0) {
                System.out.println("До свидания");
                System.exit(0); // завершение работа приложения
                // break;
            }

            //обрабатываем пользовательский ввод
            showSubMenu(input);
        }
    }

    private void showSubMenu(int input) {
        switch (input) {
            case 1:
                showUserMenu();
                break;
            case 2:
                showOrderMenu();
                break;
            case 3:
                showAdminMenu();
                break;
            default:
                System.out.println("Ваш выбор не корректен");
                waitRead();

        }
    }

    private void showAdminMenu() {
        System.out.println("Меню администратора");
        //Todo
    }

    private void showOrderMenu() {
        System.out.println("Меню заказов");
        //Todo написать меню
    }

    private void showUserMenu() {
        while (true) {
            System.out.println("Меню пользователей");
            System.out.println("1 -> Авторизация в системе");
            System.out.println("2 -> Регистрация нового пользователя");
            System.out.println("3 -> Logout");
            System.out.println("4 -> Список всех пользователей");
            System.out.println("0 -> Возврат в предыдущее меню");

            //запрашиваем выбор пользователя
            System.out.println("\nСделайте выбор пункта:");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 0) break;
            handleUserMenuChoice(input);
        }
    }

    private void handleUserMenuChoice(int input) {
        switch (input) {
            case 1:
                // В методе СОЛЯНКА! Код сырой. Править
                //Todo править код метода

                User user1 = service.autorise();

                if (user1 == null) {
                    System.out.println("Не верный email или password");
                } else {
                    System.out.println("Вы успешно авторизовались в системе!");
                }
                waitRead();

                if (service.getActiveUser() == null) {
                    System.out.println("В системе никто не авторизирован");
                    waitRead();
                } else {
                    System.out.println("В системе есть авторизованный пользователь");
                }

                break;
            case 2:
                //Регистрация
                System.out.println("Введите ваш email:");
                String email = scanner.nextLine();

                System.out.println("Введи Ваш пароль:");
                String password = scanner.nextLine();

                User registerUser = service.registerUser(email, password);
                if (registerUser == null) {
                    System.out.println("Вы ввели некорректный email или password");
                } else {
                    System.out.println("Вы успешно зарегистрировались в системе");
                    System.out.println("Для начала работу пройдите авторизацию");
                }
                waitRead();

                break;
            case 3:
                break;
            case 4:
                // Вывести список всех пользователей
                MyList<User> userList = service.getAllUsers();
                for (User user : userList.toArray()) {
                    System.out.println(user);
                }
                waitRead();
                break;
            default:
                System.out.println("\nНе верный ввод");
                waitRead();
        }
    }


    private void waitRead() {
        System.out.println("\nДля продолжения нажмите Enter ...");
        scanner.nextLine();
    }


} // end Class
