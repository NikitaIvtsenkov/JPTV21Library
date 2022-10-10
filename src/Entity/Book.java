/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Book {
    String title;
    Author[]authors = new Author[0];

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title 
                + ", authors=" + Arrays.toString(authors) 
                + '}';
    }
    
}
