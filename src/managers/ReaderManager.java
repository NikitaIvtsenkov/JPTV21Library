/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import Entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ReaderManager {
    private Scanner scanner;

    public ReaderManager() {
        this.scanner = new Scanner(System.in);
    }
    
    public Reader createReader(){
        Reader reader = new Reader();
        System.out.print("Введите имя читателя: ");
        reader.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию читателя: ");
        reader.setLastname(scanner.nextLine());
        System.out.print("Введите номер телефона читателя: ");
        reader.setTelephone(scanner.nextLine());
        return reader;
    }
    
    public void printListReaders(Reader[] readers){
        for (int i = 0; i < readers.length; i++) {
                        Reader reader = readers[i];
                        System.out.printf(i+1+". Reader{title = %s %s%n",reader.getFirstname(), reader.getLastname());
                        System.out.printf("Info = Phone number: %s%n", reader.getTelephone());
                    }
    }
}
