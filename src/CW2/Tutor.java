/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW2;

/**
 *
 * @author hjabbar1
 */
public class Tutor {
    String id, title, firstname, surname, email;

    public Tutor(String id) {
        this.id = id;
    }
    
    public Tutor(String id, String title, String firstname, String surname, String email) {
        this.id = id;
        this.title = title;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
