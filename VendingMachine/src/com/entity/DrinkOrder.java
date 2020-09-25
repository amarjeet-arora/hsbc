/**
 * 
 */
package com.entity;

import java.util.Date;


public class DrinkOrder {
    private int drinkConsumptionId;
    private Date deliveryDate;
    private int drinkQuantity;
    private Drinks drinks;
    /**
     * @return the drinkConsumptionId
     */
    public int getDrinkConsumptionId() {
        return drinkConsumptionId;
    }
    /**
     * @param drinkConsumptionId the drinkConsumptionId to set
     */
    public void setDrinkConsumptionId(int drinkConsumptionId) {
        this.drinkConsumptionId = drinkConsumptionId;
    }
    /**
     * @return the deliveryDate
     */
    public Date getDeliveryDate() {
        return deliveryDate;
    }
   
   
    /**
     * @return the drinkQuantity
     */
    public int getDrinkQuantity() {
        return drinkQuantity;
    }
    /**
     * @param drinkQuantity the drinkQuantity to set
     */
    public void setDrinkQuantity(int drinkQuantity) {
        this.drinkQuantity = drinkQuantity;
    }
    /**
     * @return the drinks
     */
    public Drinks getDrinks() {
        return drinks;
    }
    /**
     * @param drinks the drinks to set
     */
    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }
    public void setDeliveryDate(Date date) {
	this.deliveryDate=date;
	
    }
    

}
