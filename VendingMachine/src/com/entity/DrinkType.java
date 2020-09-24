/**
 * 
 */
package com.entity;


public class DrinkType {
    private int drinkId;
    private String drinkName;
   
    public DrinkType(int id, String name) {
	super();
	this.drinkId=id;
	this.drinkName=name;
    }
    /**
     * @param drinkName the drinkName to set
     */
    public void setDrinkName(String drinkName) {
	this.drinkName = drinkName;
    }
    /**
     * @return the drinkName
     */
    public String getDrinkName() {
	return drinkName;
    }
    /**
     * @param drinkId the drinkId to set
     */
    public void setDrinkId(int drinkId) {
	this.drinkId = drinkId;
    }
    /**
     * @return the drinkId
     */
    public int getDrinkId() {
	return drinkId;
    }

}
