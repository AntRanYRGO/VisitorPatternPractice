package com.company;

public class MomsVisitor implements Visitor{
    public final double groceryItemMoms = 0.25;
    public final double travelItemMoms = 0.125;
    public final double beerMoms = -0.5;

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
