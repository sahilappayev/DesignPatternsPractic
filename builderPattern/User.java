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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public static class UserBuilder {//inner class

        private User user = null;

        public UserBuilder() {
            user = new User();
        }

        public UserBuilder setName(String name) {
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
        
        public User build(){  // geriye bir user obyekti qaytarir
            return this.user;
        }

    }
}
