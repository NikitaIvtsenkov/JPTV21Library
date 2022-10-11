/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import Entity.Author;
import Entity.Book;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class BookManager {
    private Scanner scanner;
    
    public BookManager() {
        this.scanner = new Scanner(System.in);
    }
    
    public Book createBook(){
        Book book = new Book();
        System.out.print("Введите название книги: ");
        book.setTitle(scanner.nextLine());
        System.out.print("Введите число авторов книги: ");
        int countAuthorsinBook = scanner.nextInt();
        scanner.nextLine();
        book.setAuthors(createAuthors(countAuthorsinBook));
        return book;
    }
    
    private Author[] createAuthors(int countAuthorsinBook){
        Author[] authors = new Author[countAuthorsinBook];
        for (int i = 0; i < countAuthorsinBook; i++){
            Author author = new Author();
            if (countAuthorsinBook > 1){
                System.out.print("Имя автора "+(i+1)+": ");
                author.setFirstname(scanner.nextLine());
                System.out.print("Фамилия автора "+(i+1)+": ");
                author.setLastname(scanner.nextLine());
                authors[i] = author;
            }else{
                System.out.print("Имя автора: ");
                author.setFirstname(scanner.nextLine());
                System.out.print("Фамилия автора: ");
                author.setLastname(scanner.nextLine());
                authors[i] = author;
            }
        }
        return authors;
    }
    public void printListBooks(Book[] books){
        for (int i = 0; i < books.length; i++){
                       Book book = books[i];
                       System.out.printf(i +1 +". Book{title = %s%n\t", book.getTitle());
                       System.out.println("\tAuthors = [\n\t\t");
                       for (int j = 0; j < book.getAuthors().length; j++){
                           Author author = book.getAuthors()[j];
                           System.out.printf("\tAuthors = [%s %s%n"
                                ,author.getFirstname(), author.getLastname());                           
                       }
                       System.out.println("\t]");
                   }
                    System.out.println("   }");
    }
}

