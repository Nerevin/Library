package com.nerevin.library;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author(37, "Александр", "Пушкин", "Алые паруса\n" +
                "Евгений Онегин");
        Author Gogol = new Author(42, "Николай", "Гоголь", "Мертвые души\n Вий");
        Author Eckel = new Author(60, "Bruce", "Eckel", "Философия Java\n Философия C++");
        Author Gates = new Author(61, "Bill", "Gates", "Бизнес со скоростью мысли\n Дорога в будущее");
        Author Pupkin = new Author(25, "Вася", "Пупкин", "Вести Бугуруслана\n Гуляева стрит");
        Author Lupkin = new Author(12, "Армен", "Ванбюрен", "Мои любимые юморески\n Почему я не меняю фамилию");

        IArt Onegin = new Book(180, "Евгений Онегин", "180", "Александр Пушкин");
        IArt Soul = new Book(120, "Мертвые души", "345", "Николай Гоголь");
        IArt Vii = new Book(250, "Вий", "300", "Николай Гоголь");

        IArt Java = new SchoolBook(350, "Философия Джава", "500", "Bruce Eckel");
        ((SchoolBook)Java).setAuthorName("trangender");
        IArt C = new SchoolBook(200, "Философия C++", "500", "Bruce Eckel");
        IArt Road = new SchoolBook(400, "Дорога в будущее", "600", "Bill Gates");
        IArt Businmanass = new SchoolBook(450, "Бизнес со скоростью мысли", "400", "Bill Gates");

        IArt Vesti = new Journal(228, "Вести бугуруслана", "1488", "Вася Пупкин");
        IArt Strit = new Journal(228, "Гуляева стрит", "1488", "Вася Пупкин");
        IArt Jumor = new Journal(228, "Мои любимые юморески", "1488", "Армен Ванбюрен");
        IArt Ulica = new Journal(228, "Почему я не меняю фамилию", "1488", "Армен Ванбюрен");

        List<Book> artList = new ArrayList<>();
        artList.add( new Book(150, "Алые Паруса", "333", "Александр Пушкин") );
        artList.add();
        artList.add();
        artList.add();
        artList.add();
        artList.add();
        artList.add();
        artList.add();
        artList.add();
        artList.add();
        artList.add();

        case( if )

        for ( IArt art : artList ) {
            if ( art.getAuthorName().equalsIgnoreCase("Вася Пупкин") ) {
                System.out.println(art.toString());
            }
        }

        Clazzz.start();

        Thread1
                THrea2 `
    }
}
