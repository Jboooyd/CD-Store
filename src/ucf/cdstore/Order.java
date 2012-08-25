/*
 * Author: David Rivera
 * Course: CNT 4714 – Fall 2012
 * Assignment title: Program 1 – Event-driven Programming
 * Date: September 9, 2012
 */

package ucf.cdstore;

/**
 * Defines the object Order which describes how many of a given CD a customer wants.
 */

public class Order {
    
    private CD mCD;
    
    private int mQuantityForItem;
    
    private float mDiscount;
    private float mSubtotal;

    /**
     * Getters and setters for Order attributes.
     * @param mQuantityForItem,mCD,mDiscount,mSubtotal
     */
    public void setQuantityForItem(int mQuantityForItem){
    	this.mQuantityForItem = mQuantityForItem;
    }
    public void setCD(CD mCD){
    	this.mCD = mCD;
    }
    public void setDiscount(float mDiscount){
    	this.mDiscount = mDiscount;
    }
    public void setSubtotal(float mSubtotal){
    	this.mSubtotal = mSubtotal;
    }
    public CD getCDItems(){
    	return this.mCD;
    }
    public int getQuantityForItem(){
    	return this.mQuantityForItem;
    }
    public float getDiscount(){
    	return this.mDiscount;
    }
    public float getSubtotal(){
    	return this.mSubtotal;
    }
    
}
