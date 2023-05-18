package com.company;

public interface Visitor {

    double visit(GroceryItem groceryItem);
    double visit(TravelItem travelItem);
    double visit(Beer beerItem);
}
