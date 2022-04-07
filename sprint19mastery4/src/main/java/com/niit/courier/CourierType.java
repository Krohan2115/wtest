package com.niit.courier;

public enum CourierType {
    // Declare enum values

    DOMESTIC("Domestic"),INTERNATIONAL("International"),OVERNIGHT("Overnight"),PALLET("Pallet"),SAMEDAYEXPRESS("SameDayExpress");
	
	
    // provide appropriate getters and setters
	
	private String courierType;
	
	CourierType(String courierType) {
		this.courierType = courierType;
	}

	public String getCourierTypeActual() {
		return courierType;
	}
   
    
}
