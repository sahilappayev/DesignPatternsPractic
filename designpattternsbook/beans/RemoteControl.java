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
public class RemoteControl {
    private RemoteControlnterface remote;
    
    public RemoteControl(RemoteControlnterface remote){ // remotecontrol sinifi interfeysi taniyir ve ancaq interfeysi implement etmish siniflerin obyektlerini qebul edir
        this.remote = remote;
    }
    
    public void on(){
        remote.on();
    }
    
    public void off(){
        remote.off();
    }
}
