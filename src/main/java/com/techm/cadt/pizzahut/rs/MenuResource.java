package com.techm.cadt.foodpanda.rs;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

import com.techm.cadt.foodpanda.db.PizzaDAO;
import com.techm.cadt.foodpanda.model.Menu;
import com.techm.cadt.foodpanda.model.MenuItem;

import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author SK69016
 */
@Path("menu")
public class MenuResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MenuResource
     */
    public MenuResource() {
    }

    /**
     * Retrieves representation of an instance of com.techm.cadt.pizzahut.rs.MenuResource
     * @return com.techm.cadt.pizzahut.model.Menu
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Menu getMenu() {
        Menu menu = PizzaDAO.loadMenu();
        try{
        	System.out.println("...About to sleep");
        	System.out.println("...Ready");
        }catch(Exception ex){

        }
        return menu;
    }


    /**
     * Retrieves representation of an instance of com.techm.cadt.pizzahut.rs.MenuResource
     * @param size String as size
     * @param isVeg True or false
     * @param cost String as cost
     * @return com.techm.cadt.pizzahut.model.Menu
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("query")
    public Menu queryMenu(
            @QueryParam("size")String size,
            @QueryParam("isVeg")String isVeg,
            @QueryParam("cost")String cost) {
        Menu menu = PizzaDAO.filterMenu(size,isVeg,cost);
        return menu;
    }

    /**
     * PUT method for updating or creating an instance of MenuResource
     * @param item MenuItem
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void orderItem(MenuItem item) {
        System.out.println(item.getItemName());
        PizzaDAO.saveOrder(item);
    }
}
