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
    private String Lasttname;

    public Author() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return Lasttname;
    }

    public void setLasttname(String Lasttname) {
        this.Lasttname = Lasttname;
    }

    @Override
    public String toString() {
        return "Author{" + "firstname=" + firstname 
                + ", Lasttname=" + Lasttname 
                + '}';
    }
    
}
