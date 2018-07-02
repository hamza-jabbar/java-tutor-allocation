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
public class Student {
    
    // String declarations
    String uobnumber, firstname, surname, email, course, courseType, courseDuration, startDate, endDate;
    
    // construtor
    public Student(String uobnumber, String firstname, String surname, String email, String course, String courseType, String courseDuration, String startDate, String endDate) {
        this.uobnumber = uobnumber;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.course = course;
        this.courseType = courseType;
        this.courseDuration = courseDuration;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /* setters and getters for each string  */
    
    public String getUobnumber() {
        return uobnumber;
    }

    public void setUobnumber(String uobnumber) {
        this.uobnumber = uobnumber;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }
    
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}