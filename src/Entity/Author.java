/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author pupil
 */
public class Author {
    private String firstname;
    private String Lastname;

    public Author() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }


    @Override
    public String toString() {
        return "Author{" + "firstname=" + firstname 
                + ", Lastname=" + Lastname 
                + '}';
    }
    
}
