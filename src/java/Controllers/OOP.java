/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Coder;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class OOP {
    
    public static String Chuan_Hoa_Ten(String s) {
        final char space = ' ';
        char last = space;
        StringBuilder fin = new StringBuilder(); // Sử dụng StringBuilder để tạo chuỗi mới
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (last == space) {
                if (c == space) continue;
                if (c >= 'a' && c <= 'z') {
                    c = (char)(c - ('a' - 'A'));  // Chuyển ký tự thành chữ hoa
                }
            }
            
            else if (c >= 'A' && c <= 'Z') {
                c = (char) (c + ('a' - 'A')); // Chuyển ký tự thành chữ thường
            }
            
            fin.append(c);
            last = c;
        }
        
        return fin.toString();
    }
    
    public static void main(String[] args) {
        Coder coder = new Coder ();
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Name: ");
        String Name = sc.nextLine();
        String name = Chuan_Hoa_Ten(Name);
        coder.setName(name);
        
        
        int age;
        System.out.print("Age: ");
        age = sc.nextInt();
        coder.setAge(age);
        while (coder.getAge() == 0) {
            System.out.print("Age: ");
            age = sc.nextInt();
            coder.setAge(age);
        }
        
        
        
        System.out.print("Phone number: ");
        String phone = sc.next();
        coder.setPhone(phone); 
        while (coder.getPhone().isEmpty()) {
            System.out.print("Invalid phone number! Please enter a valid 10-digit phone number: ");
            phone = sc.next();
            coder.setPhone(phone);
        }
        
        String[] Programming_language = {"C#", "C", "Java", "Python"};
        
        System.out.println("Choose your language: ");
        for (int i = 0; i < Programming_language.length; i++) {
            System.out.println((i + 1) + ". " + Programming_language[i]);
        }
        System.out.print("Your choice is (choose from 1 - 4): ");
        int options = sc.nextInt();
        String prog_lang = "";
        switch (options) {
            case 1: prog_lang = "C#"; break;
            case 2: prog_lang = "C"; break;
            case 3: prog_lang = "Java"; break;
            case 4: prog_lang = "Python"; break;
        }
        coder.setProgramming_Language(prog_lang);
        
        
        
        System.out.println("---------------------------------------");
        System.out.println("Ngon ngu: " + coder.getProgramming_Language());
        System.out.println("Ten: " + coder.getName());
        System.out.println("Tuoi: " + coder.getAge());
        System.out.println("SDT: " + coder.getPhone());
        
        
        System.exit(0);
    }
}
