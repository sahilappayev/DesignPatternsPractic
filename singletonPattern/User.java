/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonPattern;

/**
 *
 * @author Admin
 */
public class User {
    
    private String name;

    private static User user = null;
    
    private User() {
    }
    
    public String getName() {
        return name;
    }

    public static void setName(String name) {
        if(user.name == null){
            user.name = name;
        }
    }
    
    public static User createUser(String name){
        if(user == null){
            user = new User();
            user.name = name;
        }
        return user;
    }
    
}
