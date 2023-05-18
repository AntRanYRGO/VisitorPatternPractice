package com.company;

public class TravelItem implements Visitable{
    public double price;

    public TravelItem(double price){
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
