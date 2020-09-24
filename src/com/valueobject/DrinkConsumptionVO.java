/**
 * 
 */
package com.valueobject;


public class DrinkConsumptionVO {
    private String drinkOption;
    private int totalConsumption;
    public DrinkConsumptionVO(String id, int total) {
	drinkOption = id;
	totalConsumption = total;
    }
    /**
     * @return the drinkOption
     */
    public String getDrinkOption() {
        return drinkOption;
    }
    /**
     * @param i the drinkOption to set
     */
    public void setDrinkOption(String id) {
        this.drinkOption = id;
    }
    /**
     * @return the totalConsumption
     */
    public int getTotalConsumption() {
        return totalConsumption;
    }
    /**
     * @param totalConsumption the totalConsumption to set
     */
    public void setTotalConsumption(int totalConsumption) {
        this.totalConsumption = totalConsumption;
    }

}
