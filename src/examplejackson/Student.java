/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplejackson;

/**
 *
 * @author Jimmy Alejandro
 */
public class Student {

    private String name;
    private String lastName;
    private String code;

    public Student() {
    }

    public Student(String name, String lastName, String code) {
        this.name = name;
        this.lastName = lastName;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return String.format("[%s %s : %s]", this.name, this.lastName, this.code);
    }

}
