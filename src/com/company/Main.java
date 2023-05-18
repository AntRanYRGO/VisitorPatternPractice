package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MomsVisitor momsVisitor = new MomsVisitor();
        ExpensiveVisitor inflationVisitor = new ExpensiveVisitor();

        GroceryItem ost = new GroceryItem(100);
        TravelItem trainTicket = new TravelItem(500);
        Beer beer = new Beer(50);

        System.out.println(ost.accept(momsVisitor));
        System.out.println(trainTicket.accept(momsVisitor));
        System.out.println(beer.accept(momsVisitor));

        System.out.println("INFLATION HIT SHITS EXPENSIVE NOW");
        System.out.println(ost.accept(inflationVisitor));
        System.out.println(trainTicket.accept(inflationVisitor));
        System.out.println(beer.accept(inflationVisitor));

    }
}
