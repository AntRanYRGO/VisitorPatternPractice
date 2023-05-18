package com.company;

public class ExpensiveVisitor implements Visitor{

    public final double groceryItemMoms = 0.5;
    public final double travelItemMoms = 0.3;
    public final double beerMoms = -0.25;


    @Override
    public double visit(GroceryItem groceryItem) {
        System.out.println("Vanlig vara: Pris med moms");
        return (groceryItem.getPrice() * groceryItemMoms) + groceryItem.getPrice();
    }

    @Override
    public double visit(TravelItem travelItem) {
        System.out.println("Resa: Pris med moms");
        return (travelItem.getPrice() * travelItemMoms) + travelItem.getPrice();
    }

    @Override
    public double visit(Beer beerItem) {
        System.out.println("ÖL!!!!!");
        return (beerItem.getPrice() * beerMoms) + beerItem.getPrice();
    }
}
