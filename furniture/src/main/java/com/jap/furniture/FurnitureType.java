package com.jap.furniture;

public enum FurnitureType {
    OFFICE("Office"), HOME("Home"), GARDEN("Garden");
    
    private String furnitureType;
    
    FurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getCourierTypeActual() {
        return furnitureType;
    }
}