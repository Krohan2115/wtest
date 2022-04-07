package com.niit.courier;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Courier {
   //Declare appropriate variables
	
	private int courierOrderId;
	private CourierType courierType;
	private Address sender;
	private Address receiver;
	private float shipmentWeight;
    private String shipmentDimensions;
    private PaymentMode paymentMode;
	private Date courierReceiptDateTime;
	
    // Provide appropriate getters and setters
	public int getCourierOrderId() {
		return courierOrderId;
	}
	public void setCourierOrderId(int courierOrderId) {
		this.courierOrderId = courierOrderId;
	}
	public CourierType getCourierType() {
		return courierType;
	}
	public void setCourierType(CourierType courierType) {
		this.courierType = courierType;
	}
	public Address getSender() {
		return sender;
	}
	public void setSender(Address sender) {
		this.sender = sender;
	}
	public Address getReceiver() {
		return receiver;
	}
	public void setReceiver(Address receiver) {
		this.receiver = receiver;
	}
	public float getShipmentWeight() {
		return shipmentWeight;
	}
	public void setShipmentWeight(float shipmentWeight) {
		this.shipmentWeight = shipmentWeight;
	}
	public String getShipmentDimensions() {
		return shipmentDimensions;
	}
	public void setShipmentDimensions(String shipmentDimensions) {
		this.shipmentDimensions = shipmentDimensions;
	}
	public PaymentMode getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(PaymentMode paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Date getCourierReceiptDateTime() {
		return courierReceiptDateTime;
	}
	public void setCourierReceiptDateTime(Date courierReceiptDateTime) {
		this.courierReceiptDateTime = courierReceiptDateTime;
	}
	public String[] getCharges() {
		return charges;
	}

    // Parameterized constructor
    public Courier(int courierOrderId, CourierType courierType, Address sender, Address receiver, float shipmentWeight,
                   String shipmentDimensions, PaymentMode paymentMode, Date courierReceiptDateTime) {
        //Initialize values
    	this.courierOrderId = courierOrderId;
    	this.courierType = courierType;
    	this.sender = sender;
    	this.receiver = receiver;
    	this.shipmentWeight = shipmentWeight;
    	this.shipmentDimensions = shipmentDimensions;
    	this.paymentMode = paymentMode;
    	this.courierReceiptDateTime = courierReceiptDateTime;

    }
    //  final String to hold the courier charges from source city to destination city
    // do not change the values
    private final String charges[] = { "Chennai,Coimbatore,50", "Chennai,Trichy,50", "Chennai,Bangalore,100" };

    // calculate the cost of the courier depending on the weight and extract the cost from charges array
    // the calculateCost() method cannot be accessed outside the class, provide appropriate access specifiers
    private double calculateCost() {
    	double costOfCourier = 0;
    	for(String items: charges) {
    		
    		String splitItems[] = items.split(",");
    		
    		if(getSender().getCity().equals(splitItems[0]) && getReceiver().getCity().equals(splitItems[1])) {
    			costOfCourier = Double.parseDouble(splitItems[2]);
    		}
    		
    	}
        return getShipmentWeight()*costOfCourier;
    }
    // generate a random number between 100000 and 900000 to be sent back as acknowledgement,
    // provide appropriate access specifiers since this method will not be used outside this class
    private int generateAcknowledgementNumber()
    {
    	int randomAckNumber = (int)Math.random()*(900000-100000+1)+100000;
        return randomAckNumber;
    }

    // return the acknowledgement number, if cost is = 0, then return a message 'no services to the area'
    public String acknowledgementGenerator() {
       if(calculateCost()==0)
    	   return "no services to the area";
       
       String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       StringBuilder randomStringBuilder = new StringBuilder();
       Random random = new Random();
       int length = 3;

       for(int i = 0; i < length; i++) {
         int index = random.nextInt(alphabet.length());
         char randomChar = alphabet.charAt(index);
         randomStringBuilder.append(randomChar);
       }
       String randomString = randomStringBuilder.toString();
       
       return randomString+generateAcknowledgementNumber();
    }

    // Display the details of the courier, cost of dispatch and acknowledgement number
    //
    public void displayCourierDetails() {
       String msg = null;
 	   for(String items: charges) {
    		
    		String splitItems[] = items.split(",");
    		if(getSender().getCity().equals(splitItems[0]) && getReceiver().getCity().equals(splitItems[1])) {
    			msg = "Courier [charges="+splitItems[2]+", cost="+calculateCost()+", courierOrderId="+getCourierOrderId()+", courierReceiptDateTime="+getCourierReceiptDateTime()+", courierType="+getCourierType().getCourierTypeActual()+""
    		       		+ ", paymentMode="+getPaymentMode()+", receiver="+getReceiver()+", sender="+getSender()+","
    		       		+ "shipmentDimensions="+getShipmentDimensions()+", shipmentWeight="+getShipmentWeight()+"]";
    		}
    		
    	}
 	   	if(msg==null)
 	   		System.out.println("No services to the area");
 	   	else
 	   		System.out.println(msg);
    }

    // Display courier details in desired format as below
//    Courier [charges=xxx, cost=xxx, courierOrderId=xxx, courierReceiptDateTime=xxx, courierType=xxx
//                ,paymentMode=xxx, receiver=xxx, sender=xxx,
//               shipmentDimensions=xxxx, shipmentWeight=xxx]

   @Override
    public String toString() {
	   String msg = null;
	   for(String items: charges) {
   		
   		String splitItems[] = items.split(",");
   		if(getSender().getCity().equals(splitItems[0]) && getReceiver().getCity().equals(splitItems[1])) {
   			msg = "Courier [charges="+splitItems[2]+", cost="+calculateCost()+", courierOrderId="+getCourierOrderId()+", courierReceiptDateTime="+getCourierReceiptDateTime()+", courierType="+getCourierType().getCourierTypeActual()+""
   		       		+ ",paymentMode="+getPaymentMode()+", receiver="+getReceiver()+", sender="+getSender()+","
   		       		+ "shipmentDimensions="+getShipmentDimensions()+", shipmentWeight="+getShipmentWeight()+"]";
   		}
   		
   	}
       return msg;
    }
}