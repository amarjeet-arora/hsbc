/**
 * 
 */
package com.valueobject;

import java.util.Date;


public class DrinkConsumptionSearchVO {
    private java.util.Date fromDate;
    private Date toDate;
    private int drinkTypeId;
    /**
     * @return the fromDate
     */
    public Date getFromDate() {
        return fromDate;
    }
    /**
     * @param date the fromDate to set
     */
    public void setFromDate(java.util.Date date) {
        this.fromDate = date;
    }
    /**
     * @return the toDate
     */
    public Date getToDate() {
        return toDate;
    }
    /**
     * @param toDate the toDate to set
     */
    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    /**
     * @return the drinkTypeId
     */
    public int getDrinkTypeId() {
        return drinkTypeId;
    }
    /**
     * @param drinkTypeId the drinkTypeId to set
     */
    public void setDrinkTypeId(int drinkTypeId) {
        this.drinkTypeId = drinkTypeId;
    }
    
	
    

}
