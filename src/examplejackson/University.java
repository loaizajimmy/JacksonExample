/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplejackson;

import java.util.LinkedList;

/**
 *
 * @author Jimmy Alejandro
 */
public class University {
    
    private String name;
    private String country;
    private LinkedList<Student> students;

    public University() {
    }

    public University(String name, String country) {
        this.name = name;
        this.country = country;
        this.students = new LinkedList<>();
    }
    
    public boolean addStudent(Student student){
        return this.students.add(student);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return  String.format("%s de %s, Sus estudiantes son: \n %s", this.name, this.country, this.students);
    }
    
    
    
    
    
}
