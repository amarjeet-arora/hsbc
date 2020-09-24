/**
 * 
 */
package com.exception;


public class DataAccessException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public DataAccessException() {
	super();
	
    }

    /**
     * @param arg0
     * @param arg1
     */
    public DataAccessException(String arg0, Throwable arg1) {
	super(arg0, arg1);
	
    }

    /**
     * @param arg0
     */
    public DataAccessException(String arg0) {
	super(arg0);
	
    }

    /**
     * @param arg0
     */
    public DataAccessException(Throwable arg0) {
	super(arg0);
	
    }
    

}
