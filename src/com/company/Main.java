package com.company;
//import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<Book>();
        Scanner keyboard = new Scanner(System.in);

        String answer = "y";

        //add a book
        while(answer.equalsIgnoreCase("y")){


            if(answer.equalsIgnoreCase("y")){
                Book book = new Book();
                System.out.print("enter the author: ");
                book.setAuthor(keyboard.nextLine());
                System.out.print("Enter the title: ");
                book.setTitle(keyboard.nextLine());
                books.add(book);
            }
            System.out.println("Do you want to enter a book? ");
            answer = keyboard.nextLine();
        }

        //print all the books in the array list

        System.out.println("All the books: ");

        //enhanced for loops
        for(Book book: books){
            System.out.print(book.getAuthor());
            System.out.println(" ");
            System.out.print(book.getTitle());
            System.out.println();
        }
    }
}
