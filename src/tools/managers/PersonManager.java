/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.managers;

import java.util.Scanner;


/**
 *
 * @author user
 */
import entity.Person;
public class PersonManager {
     public Person createBook() {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Добавить ученика ---");
        System.out.print("Его имя: ");
        person.setfirstName(scanner.nextLine());
        System.out.print("Его фамилия: ");
        person.setlastname(scanner.nextLine());
        System.out.print("Его номер телефона: ");
        person.setphone(scanner.nextLine());       
        return person;
    }
    public void addPersonToArray(Person person, Person[] students){
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null){
                students[i]=person;
                break;
            }
        }
    }

    public void createPerson() {
    }
}
