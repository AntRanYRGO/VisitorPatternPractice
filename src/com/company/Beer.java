package com.company;

public class Beer implements Visitable{
    public double price;

    public Beer(double price){
        this.price = price;
        System.out.println("Beer is good! Beer is good! Beer is good! and stuff");
    }

    public double getPrice() {
        return price;
    }
    @Override
    public double accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
