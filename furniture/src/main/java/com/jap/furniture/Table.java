package com.jap.furniture;

public class Table extends Furniture implements IFurniture{
    // specify attributes for Table
    // define constructors, ensure the super keyword is used
        private String color;
        private double price;
        private double discountedPrice;
        private FurnitureType furnitureType;
        private final String furniture = "Table";
        
        public Table(String color, double price, FurnitureType furnitureType) {
            super(color,price,furnitureType);
            this.color = color;
            this.price = price;
            this.furnitureType = furnitureType;
            calculateDiscount();
        }
    
        @Override
        public double calculateDiscount() {
            double totalPrice = 0;
            switch(getFurnitureType()) {
                    case OFFICE:
                        totalPrice = getPrice() - (officeDiscount*getPrice())/100;
                        setDiscountedPrice(totalPrice);
                        break;
                    case HOME:
                        totalPrice = getPrice() - (homeDiscount*getPrice())/100;
                        setDiscountedPrice(totalPrice);
                        break;
                    case GARDEN:
                        totalPrice = getPrice() - (gardenDiscount*getPrice())/100;
                        setDiscountedPrice(totalPrice);
                        break;
            }
            return 0;
        }
    
        @Override
        public void displayDiscount() {
            System.out.println("Furniture: "+furniture);
            System.out.println("Color: "+getColor());
            System.out.println("Furniture Type: "+getFurnitureType());
            System.out.println("Price: "+getPrice());
            System.out.println("Discounted Price: "+getDiscountedPrice());
        }
}