package com.nerevin.library;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author(37, "Александр", "Пушкин", "Алые паруса\n Евгений Онегин");
        Author gogol = new Author(42, "Николай", "Гоголь", "Мертвые души\n Вий");
        Author eckel = new Author(60, "Bruce", "Eckel", "Философия Java\n Философия C++");
        Author gates = new Author(61, "Bill", "Gates", "Бизнес со скоростью мысли\n Дорога в будущее");
        Author pupkin = new Author(25, "Вася", "Пупкин", "Вести Бугуруслана\n Гуляева стрит");
        Author lupkin = new Author(12, "Армен", "Ванбюрен", "Мои любимые юморески\n Почему я не меняю фамилию");

        IArt alieparusa = new Book(150, "Алые Паруса", "333", "Александр Пушкин");
        IArt onegin = new Book(180, "Евгений Онегин", "180", "Александр Пушкин");
        IArt soul = new Book(120, "Мертвые души", "345", "Николай Гоголь");
        IArt vii = new Book(250, "Вий", "300", "Николай Гоголь");

        IArt java = new SchoolBook(350, "Философия Джава", "500", "Bruce Eckel");
        IArt c = new SchoolBook(200, "Философия C++", "500", "Bruce Eckel");
        IArt road = new SchoolBook(400, "Дорога в будущее", "600", "Bill Gates");
        IArt businmanass = new SchoolBook(450, "Бизнес со скоростью мысли", "400", "Bill Gates");

        IArt vesti = new Journal(228, "Вести бугуруслана", "1488", "Вася Пупкин");
        IArt strit = new Journal(228, "Гуляева стрит", "1488", "Вася Пупкин");
        IArt jumor = new Journal(228, "Мои любимые юморески", "1488", "Армен Ванбюрен");
        IArt ulica = new Journal(228, "Почему я не меняю фамилию", "1488", "Армен Ванбюрен");

        Scanner in = new Scanner(System.in);
        System.out.println("Выберите автора:\n 1.Александр Пушкин\n 2.Николай Гоголь\n 3.Брюс Эккель\n 4.Билл Гейтьс\n 5.Вася Пупкин\n 6.Армен Ванбюррен");
        switch (in.nextLine()) {
            case "1" :
                System.out.println(pushkin.getAuthorBook());
                break;

            case "2" :
                System.out.println(gogol.getAuthorBook());
                break;

            case "3" :
                System.out.println(eckel.getAuthorBook());
                break;

            case "4" :
                System.out.println(gates.getAuthorBook());
                break;

            case "5" :
                System.out.println(pupkin.getAuthorBook());
                break;

            case "6" :
                System.out.println(lupkin.getAuthorBook());
                break;

            default :
                System.out.println("Некорректный выбор");
                break;


        }
    }
}
