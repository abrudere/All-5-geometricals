package com.company;

public class Main {

    public static void main(String[] args) {
	//Program that performs all arithmetical operations and prints the result to the console
        int val1 = 12;
        int val2 = 5;

        System.out.println("val1 + val2 = " + (val1 + val2) );

        System.out.println("val1 - val2 = " + (val1 - val2));

        System.out.println("val1 * val2 = " + (val1 * val2));

        System.out.println("val1 / val2 = " + (val1 / val2));

        System.out.println("val1 % val2 = " + (val1 % val2));

        rationalOperators();
    }

    static void rationalOperators() {
        int blueTeam = 20;
        int redTeam = 25;

        System.out.println(blueTeam == redTeam);

        System.out.println(blueTeam != redTeam);

        System.out.println(blueTeam > redTeam);

        System.out.println(blueTeam < redTeam);

        System.out.println(blueTeam >= 20);

        System.out.println(redTeam <= blueTeam);

    }
    static void logicalOperators() {
        System.out.println("\nLogical Operators:");

        System.out.println(12 > 6 && 5 <= 10);

        System.out.println(12 > 6 && 5 >= 10);

        System.out.println(12 < 6 && 5 >= 10);

        System.out.println(12 > 6 || 5 <= 10);

        System.out.println(12 > 6 || 5 >= 10);

        System.out.println(12 < 6 || 5 >= 10);

        System.out.println(!(12 < 6));

        System.out.println(12 > 6 || 5 >= 10);
    }
}
