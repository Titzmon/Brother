/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Person {

    private String name; //Để cho tất cả các thuộc tính chỉ truy cập trong class person
    private int age;
    private String phone;
    
    public Person() {
    }
    

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Your age must be over 18!");
        } else {
            this.age = age;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() != 10) {
            System.out.println("Your phone number must be a 10-digit number!");
            this.phone = "";
        }
        else {this.phone = phone; }
    }

    
    
}

