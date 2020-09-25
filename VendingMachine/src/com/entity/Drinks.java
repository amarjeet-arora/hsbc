package com.entity;


public class Drinks {
    private int drinkId;
    private String name;
    private String desc;
    public Drinks(int id, String name2, String descp) {
	super();
	drinkId=id;
	this.name=name2;
	desc=descp;
	
    }
    /**
     * @return the drinkId
     */
    public int getDrinkId() {
        return drinkId;
    }
    /**
     * @param drinkId the drinkId to set
     */
    public void setDrinkId(int drinkId) {
        this.drinkId = drinkId;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }
    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    /**
     * @return the drinkType
     */
    public DrinkType getDrinkType() {
        return drinkType;
    }
    /**
     * @param drinkType the drinkType to set
     */
    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }
    private DrinkType drinkType;

}
