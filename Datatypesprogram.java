/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatypesprogram;

import java.util.Scanner;

public class Datatypesprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //program1();
        //program2();
        //program3();
        program4();

    }

    private static void program1() {
        Scanner input = new Scanner(System.in);

        double pi = 3.142;
        double radius;

        do {
            System.out.println("Enter the radius: ");
            radius = input.nextDouble();
            input.close();

            if (radius <= 0) {
                System.out.println("Above 0");
            }
        } while (radius < 0);

        double diameter = radius * 2;
        double circumference = diameter * pi;
        double area = pi * (radius * radius);

        System.out.println("Radius: " + radius);
        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

    }

    private static void program2() {
        Scanner input = new Scanner(System.in);
        double muffins = 0;
        double people = 0;

        do {
            System.out.println("Enter number of muffins: ");
            muffins = input.nextDouble();
            input.close();

            if (muffins < 0) {
                System.out.println("Above 0");
            }
            System.out.println("Enter number of people: ");
            people = input.nextDouble();
            if (people < 0) {
                System.out.println("Above 0");
            }

        } while (muffins <= 0 && people < 0);
        Double shared = muffins / people;
        System.out.println(shared);
    }

    private static void program3() {
        Scanner input = new Scanner(System.in);

        String firstname;
        String lastname;

        do {

            System.out.println("Enter first name: ");
            firstname = input.nextLine();
            System.out.println("Enter last name: ");
            lastname = input.nextLine();
            input.close();

            if (firstname.isEmpty()) {
                System.out.println("Invalid input");
            }
        } while (firstname.isEmpty());

        char firstletter = firstname.charAt(0);
        String firstinitials = "" + firstletter;
        String firstinitial = firstinitials.toUpperCase();
        char lastletter = lastname.charAt(0);
        String lastinitials = "" + lastletter;
        String lastinitial = lastinitials.toUpperCase();
        System.out.println(firstinitial + " " + lastinitial);
    }

    private static void program4() {
        Scanner input = new Scanner(System.in);

        Double speed;
        String speed1;
        String seatbelt;
        String lowerseatbelt;

        do {
            System.out.println("Enter the speed: ");
            speed = input.nextDouble();
            speed1 = speed.toString();
            System.out.println("Enter if seatbelt is on or off [Y/n]");
            seatbelt = input.nextLine();
            lowerseatbelt = seatbelt.toLowerCase();
            input.close();;

            if (speed1.isEmpty()) {
                System.out.println("Invalid Input");
            }
            if (lowerseatbelt.isEmpty()) {
                System.out.println("Invalid input");
            }

        } while (!(speed1.isEmpty() && seatbelt.isEmpty()));

        if (speed >= 5 && lowerseatbelt.contains("n")) {
            System.out.println("alarm will sound");
        } else if(speed<5) {
            System.out.println("Continue");
        }

    }

}
