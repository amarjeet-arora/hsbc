/**
 * 
 */
package com.dao;

import java.util.ArrayList;

import com.entity.DrinkOrder;
import com.entity.DrinkType;
import com.entity.Drinks;
import com.exception.DataAccessException;
import com.valueobject.DrinkConsumptionSearchVO;
import com.valueobject.DrinkConsumptionVO;


public interface DrinkDao {
    ArrayList<DrinkType> getDrinkTypes() throws DataAccessException;
    ArrayList<Drinks> getDrinkOption(int drinkType) throws DataAccessException;
   void addDrinkConsumptionDetails(DrinkOrder drinkOrder) throws DataAccessException;
   ArrayList<DrinkConsumptionVO> getDrinkConsumptionDetails(DrinkConsumptionSearchVO drinkConsumptionSearch) throws DataAccessException;
}
