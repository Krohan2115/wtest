package com.jap.furniture;

public interface IFurniture {
    // define the discount percentage for various furniture types
    final double officeDiscount = 10;
    final double homeDiscount = 5;
    final double gardenDiscount = 2.5;
    public double calculateDiscount();
    public void displayDiscount();
    // define common methods like calculateDiscountedPrice and display furniture details

}