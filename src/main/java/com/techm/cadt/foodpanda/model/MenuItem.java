/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techm.cadt.foodpanda.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SK69016
 */
@XmlRootElement
public class MenuItem {
    
    public String itemName;
    public String size;
    public String[] topings;
    public boolean isVeg;
    
    public boolean isThinCrest;
    public int cost;
    
    
    public MenuItem(){
        
    }

    public MenuItem(String itemName, String size, boolean isThinCrest,
             int cost, boolean isVeg, String[] topings) {
        this.itemName = itemName;
        this.size = size;
        this.topings = topings;
        this.isThinCrest = isThinCrest;
        this.isVeg = isVeg;
        this.cost = cost;
    }

    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getSize() {
        return size;
    }

    
    public void setSize(String size) {
        this.size = size;
    }

    public String[] getTopings() {
        return topings;
    }

    
    public void setTopings(String[] topings) {
        this.topings = topings;
    }

    public boolean isIsThinCrest() {
        return isThinCrest;
    }

    
    public void setIsThinCrest(boolean isThinCrest) {
        this.isThinCrest = isThinCrest;
    }

    public boolean isIsVeg() {
        return isVeg;
    }

    
    public void setIsVeg(boolean isVeg) {
        this.isVeg = isVeg;
    }
    
    public int getCost() {
        return cost;
    }

    
    public void setCost(int cost) {
        this.cost = cost;
    }
    
}
