/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattternsbook.beans;

import designpattternsbook.inter.RemoteControlnterface;

/**
 *
 * @author Admin
 */
public class CDPlayer implements RemoteControlnterface{

    @Override
    public void on() {
        System.out.println("CD Player is on");
    }

    @Override
    public void off() {
        System.out.println("CD Player is off");
    }
    
}
