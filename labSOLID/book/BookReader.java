package book;


import book.BRInterface;

import java.util.List;

public class BookReader {
    public static void main(String[] args) {
        BRInterface book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}