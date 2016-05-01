/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techm.cadt.foodpanda.db;

import java.util.ArrayList;

import com.techm.cadt.foodpanda.model.CustomerOrder;
import com.techm.cadt.foodpanda.model.Menu;
import com.techm.cadt.foodpanda.model.MenuItem;
/**
 *
 * @author SK69016
 */
public class PizzaDAO {
    
    static Menu menu = new Menu();
    static CustomerOrder order = new CustomerOrder();
    
    public static Menu loadMenu(){
        
        if(menu.getItems() == null || menu.getItems().length == 0){
            ArrayList<MenuItem> list = new ArrayList<MenuItem>();
            list.add(new MenuItem("Chicken Supreme", "Large", false, 500, false, new String[]{"chicken","onions","alapeno"}));
            list.add(new MenuItem("Chicken Supreme", "Medium", false, 300, false, new String[]{"chicken","onions","alapeno"}));
            list.add(new MenuItem("Veg Supreme", "Large", false, 400, true, new String[]{"Paneer","onions","alapeno"}));
            list.add(new MenuItem("Veg Supreme", "Medium", false, 200, true, new String[]{"Paneer","onions","alapeno"}));
            menu.setItems(list.toArray(new MenuItem[0]));
        }
        
        return menu;
    }
    
    public static Menu filterMenu(String size, String isVeg, String cost){
      
        Menu newMenu = new Menu();
        ArrayList<MenuItem> list = new ArrayList<MenuItem>();
              
        for(MenuItem itm : loadMenu().getItems()){  
            if((size==null || size.equalsIgnoreCase(itm.getSize()))
                    && (isVeg ==null || Boolean.parseBoolean(isVeg) == itm.isIsVeg())
                    && (cost == null || Integer.parseInt(cost) >= itm.getCost())){
                list.add(itm);
            }            
        }
        newMenu.setItems(list.toArray(new MenuItem[0]));        
        return newMenu;
    }
    
    public static CustomerOrder saveOrder(MenuItem item){
        if(order.getOrderItems() == null || order.getOrderItems().length ==0 ){
            order.setOrderItems(new MenuItem[]{item});
        }
        return order;
    }
}
