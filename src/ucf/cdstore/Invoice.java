/*
 * Author: David Rivera
 * Course: CNT 4714 – Fall 2012
 * Assignment title: Program 1 – Event-driven Programming
 * Date: September 9, 2012
 */
package ucf.cdstore;

/**
 * Describes the object Invoice which defines how many orders, or different CD's a customer wants to buy.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Invoice {
	
	private ArrayList<Order> mOrder;
	
	private int mNumItemsInOrder = 0;
    private float mSubtotal = 0;
    private float mGrandtotal = 0;
    
    private String mTimeStamp;
    private String mTransactionStamp;
    
    /**
     * Constructor initializes the Orders ArrayList. 
     */
    public Invoice(){
    	this.mOrder = new ArrayList<Order>();
    }
    
    /**
     * Getters and setters for Invoice attributes.
     * @param mNumItemsInOrder,mSubtotal,mGrandtotal,mOrder
     */
    public void setNumItemsInOrder(int mNumItemsInOrder){
    	this.mNumItemsInOrder = mNumItemsInOrder;
    }
    public void setSubtotal(float mSubtotal){
    	this.mSubtotal += mSubtotal;
    }
    public void setGrandtotal(float mGrandtotal){
    	this.mGrandtotal = mGrandtotal;
    }
    public void setDate(){
    	Date mDate = new Date();
    	DateFormat mDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss a z");
    	this.mTimeStamp = mDateFormat.format(mDate);
    	mDateFormat = new SimpleDateFormat("yyMMddHHmmss");
    	this.mTransactionStamp = mDateFormat.format(mDate);
    }
    public void addOrder(Order mOrder){
    	this.mOrder.add(mOrder);
    }
    public int getNumItemsInOrder(){
    	return this.mNumItemsInOrder;
    }
    public float getSubtotal(){
    	return this.mSubtotal;
    }
    public float getGrandtotal(){
    	return this.mGrandtotal;
    }
    public ArrayList<Order> getOrders(){
    	return this.mOrder;
    }
    public String getTimeStamp(){
    	return this.mTimeStamp;
    }
    public String getTransactionStamp(){
    	return this.mTransactionStamp;
    }
}
