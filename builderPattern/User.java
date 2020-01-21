/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderPattern;

/**
 *
 * @author Admin
 */
public class User {

    private String name;
    private String surname;
    private int age;

    private User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    /* Her hasni choxlu sayda parametrleri (states ve ya fields) olan clasin obyektini 
        immutable edib obyekti yaradanda onun bize lazim olan parametrlerine deyer set etmek isteyirikse, BUILDER PATTERN`den istifade edirik.
    */
    
    public static class UserBuilder {//nested class 

        private User user = null;

        public UserBuilder() {
            user = new User();
        }

        public UserBuilder setName(String name) { //her bir metod geriye UserBuilder clasinin obyektini qaytarir
            this.user.name = name;
            return this;
        }

        public UserBuilder setSurname(String surname) {
            this.user.surname = surname;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.user.age = age;
            return this;
        }
        
        public User build(){  // geriye yuxarida daxil edilen deyerlere malik YENI bir user obyekti qaytarir
            return new User(user.name, user.surname, user.age);
        }

    }
}
