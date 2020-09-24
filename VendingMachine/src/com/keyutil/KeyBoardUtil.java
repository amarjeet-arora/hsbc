package com.keyutil;

import java.util.Date;
import java.util.InputMismatchException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

//class to read all values from keyboard
public class KeyBoardUtil {
public static String getString(String msg){
	System.out.println(msg);
	Scanner s=new Scanner(System.in);
	return s.nextLine();
}
public static int getInt(String msg){
	while(true){
	    try{
		System.out.println(msg);
		Scanner s=new Scanner(System.in);
	    	return s.nextInt();
	    }catch(InputMismatchException e){
		System.out.println("enter again");
	    }
}
}
public static Date getDate(String msg) throws ParseException {
	while(true){
	    try{
	    Scanner s = new Scanner(System.in);
	    System.out.println(msg);
	    String str = s.nextLine();
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    return  sdf.parse(str);
	    }catch(ParseException e){
		System.out.println("Enter valid date");
	    }

}
}
}
