package ru.micron.task3.book;

import ru.micron.task3.book.Book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("ololo", "haha", 2020, 1337);
        System.out.printf("%s\t%s\t%s\t%s", book.getAuthor(), book.getName(),
                                            book.getPages(), book.getYear());
    }
}
