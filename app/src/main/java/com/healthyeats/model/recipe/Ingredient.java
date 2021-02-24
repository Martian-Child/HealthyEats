package com.healthyeats.model.recipe;

import com.healthyeats.model.grocery.GroceryItem;

public class Ingredient {

    private String name;
    private String measurement;
    private String amount;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMeasurement() { return measurement; }
    public void setMeasurement(String measurement) { this.measurement = measurement; }

    public String getAmount() { return amount; }
    public void setAmount(String amount) { this.amount = amount; }

    public GroceryItem toGroceryItem() {
        GroceryItem item = new GroceryItem();
        item.setName(name);
        //ToDo: Finish conversion between ingredients to groceryItems.

        return item;
    }

    public String toString() {
        String ingredientString =
                name + ", " + measurement + ", " + amount;
        return ingredientString;
    }
}