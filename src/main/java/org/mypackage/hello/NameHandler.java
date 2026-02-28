/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.mypackage.hello;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author valen
 */
public class NameHandler {

    private String name;
    private String birthdate;
    private int age;

    public NameHandler() {
        name = null;
        birthdate = null;
        age = 0;
    }

    public int calcularEdad() {
        int day = Integer.parseInt(birthdate.substring(8));
        int currentDay = LocalDate.now().getDayOfMonth();
        int month = Integer.parseInt(birthdate.substring(5, 7));
        int currentMonth = LocalDate.now().getMonthValue();
        int year = Integer.parseInt(birthdate.substring(0, 4));
        age = 2026 - year;
        if (month > currentMonth) {
            age--;
        } else if (month == currentMonth) {
            if (day > currentDay) {
                age--;
            }
        }
        return age;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return calcularEdad();
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

}
