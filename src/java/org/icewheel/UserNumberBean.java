/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.icewheel;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author icewheel
 */
@Named
@SessionScoped
public class UserNumberBean implements Serializable{
    
    private static final long serialVersionUID = 5443351151396868724L;
    private Integer userNumber = null;
    private int maximum = 2;
    private int minimum = 1;

    public Integer getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    public int getMaximum() {
        return maximum;
    }

    public int getMinimum() {
        return minimum;
    }
    
    public UserNumberBean() {
    }
    
    public String submit(){
        return userNumber.toString();
    }
    
}
