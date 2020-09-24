/**
 * 
 */
package com.dao.jdbc;

import java.security.Timestamp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.dao.DrinkDao;
import com.entity.DrinkOrder;
import com.entity.DrinkType;
import com.entity.Drinks;
import com.exception.DataAccessException;
import com.valueobject.DrinkConsumptionSearchVO;
import com.valueobject.DrinkConsumptionVO;


public class DrinkDaoImpl extends BaseDAO implements DrinkDao {
    Connection con=null;
    PreparedStatement ps=null;
    private static final String GET_DRINK_TYPE="select * from drinktype";
    private static final String GET_DRINK_OPTION="select drinkid,name,descp from drinks where drinkTypeId=?";
    private static final String ADD_DRINK_DETAILS="insert into drinkorder(drinkid,qty,odate) values(?,?,?)";
    private static final String GET_CONSUMPTION_DETAILS="select do.name,sum(dr.qty) from drinks do,drinkorder dr "+
    							"where do.drinkid=dr.drinkid "+
    							"and do.drinkTypeId=? "+
    							"and dr.odate between ? and ? "+
    							"group by do.name "+
    							"order by sum(qty)";

    @SuppressWarnings("finally")
    public ArrayList<DrinkType> getDrinkTypes() throws DataAccessException {
	ArrayList<DrinkType> drinkType=new ArrayList<DrinkType>();
	try{
	    con=getConnection();
	    ps=con.prepareStatement(GET_DRINK_TYPE);
	    ResultSet result=ps.executeQuery();
	    while(result.next()){
		int id = result.getInt(1);
		String name = result.getString(2);
		drinkType.add(new DrinkType(id,name));
	    }
	}catch(SQLException e){
	    throw new DataAccessException("cannot be load..");
	}finally{
	    releaseResources(con, ps); 	
	    return drinkType;
	}
    }

    @SuppressWarnings("finally")
    @Override
    public ArrayList<Drinks> getDrinkOption(int drinkType)throws DataAccessException {
	ArrayList<Drinks> drinks = new ArrayList<Drinks>();
	
	try{
	    con=getConnection();
	    ps=con.prepareStatement(GET_DRINK_OPTION);
	    ps.setInt(1, drinkType);
	    ResultSet result=ps.executeQuery();
	    while(result.next()){
		int id=result.getInt(1);
		String name=result.getString(2);
		String descp=result.getString(3);
		drinks.add(new Drinks(id,name,descp));
	    }
	}catch(SQLException e){
	    throw new DataAccessException("Cannot load the values");
	}finally{
	    releaseResources(con, ps);
	    return drinks;
	}
    }

    @Override
    public void addDrinkConsumptionDetails(DrinkOrder drinkOrder)
	    throws DataAccessException {
	try{
	    con=getConnection();
	    ps=con.prepareStatement(ADD_DRINK_DETAILS);
	    ps.setInt(1, drinkOrder.getDrinkConsumptionId());
	    ps.setInt(2, drinkOrder.getDrinkQuantity());
	    java.sql.Timestamp timeStamp = new java.sql.Timestamp(drinkOrder.getDeliveryDate().getTime());
	    ps.setTimestamp(3, timeStamp);
	    ps.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	    System.out.println("unable to load");
	}finally{
	    releaseResources(con, ps);
	}
	    
	
	
	
    }

    @SuppressWarnings("finally")
    @Override
    public ArrayList<DrinkConsumptionVO> getDrinkConsumptionDetails(DrinkConsumptionSearchVO search)throws DataAccessException {
	ArrayList<DrinkConsumptionVO> cons = new ArrayList<DrinkConsumptionVO>();
    
	try{
	    con=getConnection();
	    ps=con.prepareStatement(GET_CONSUMPTION_DETAILS);
	    ps.setInt(1, search.getDrinkTypeId());
	    java.sql.Timestamp fromTime = new java.sql.Timestamp(search.getFromDate().getTime());
	    ps.setTimestamp(2, fromTime);
	    java.sql.Timestamp toTime =new java.sql.Timestamp(search.getToDate().getTime());
	    ps.setTimestamp(3, toTime);
	    ResultSet result = ps.executeQuery();
	    while(result.next()){
		String id=result.getString(1);
		int total=result.getInt(2);
		cons.add(new DrinkConsumptionVO(id, total));
	    }
	    }catch(SQLException e2){
		e2.printStackTrace();
		System.out.println("unable to display");
	    }finally{
		releaseResources(con, ps);
		return cons;
	    
	
	}

    
    
    }
}
