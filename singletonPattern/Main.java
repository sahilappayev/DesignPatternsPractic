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
public class Main {
    
    public static void main(String[] args) {
        User user = User.buildUser("Sahil");
    
        System.out.println(user);
        
        
    }
    
}
