package com.company;

public class GroceryItem implements Visitable{
    public double price;

    public GroceryItem(double price){
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
