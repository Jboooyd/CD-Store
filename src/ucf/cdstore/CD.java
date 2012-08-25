/*
 * Author: David Rivera
 * Course: CNT 4714 – Fall 2012
 * Assignment title: Program 1 – Event-driven Programming
 * Date: September 9, 2012
 */

package ucf.cdstore;

/**
 * Defines the object CD
 */

public class CD {
    
	private int mID;
	
    private float mPrice;
    
    private String mName;
    private String mInfo;
    
    /**
     * Constructor defaults with the info message 
     * "No CD found..." to be set later
     */
    public CD(){
    	setInfo("No CD found with that ID!");
    }
    
    /**
     * Getters and setters for CD attributes
     * @param mID,mName,mPrice,mInfo
     */
    public void setID(int mID){
    	this.mID = mID;
    }
    public void setName(String mName){
    	this.mName = mName;
    }
    public void setPrice(float mPrice){
    	this.mPrice = mPrice;
    }
    public void setInfo(String Info){
    	this.mInfo = Info;
    }
    public int getID(){
    	return this.mID;
    }
    public String getName(){
    	return this.mName;
    }
    public float getPrice(){
    	return this.mPrice;
    }
    public String getInfo(){
    	return this.mInfo;
    }
}
