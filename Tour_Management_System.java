package tour;

import java.util.*;
//importing the Scanner class of the java.util package
import java.io.*;
//importing the java.io package
import java.lang.*;
//importing the java.lang package
import java.time.LocalDate;
//importing the LocalDate class of the java.time package
import java.time.format.DateTimeFormatter;
//importing the DateTimeFormatter from the format class of the java.time package
import java.util.Date;

public class Main
{
    public static void main(String[] args)
     {

        Main obj1 = new Main();
        obj1.call();
    }

    public void call()
     {
        System.out.print("\u000c");// clearing screen
        // Creating object of class TourPackage
        TourPackage obj = new TourPackage();// constructor called
        obj.Introduction();// calling static method
        System.out.println(
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(
                "\u000c\t \t \t \t \t *** VOYAGE VENTURES TOURS AND TRAVELS ***\n \t \t \t\t \t EXPLORE THE MAGNIFICENT INDIA ");
        System.out.println(
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("India is a land of glorious past and an extraordinary future. ");
        System.out.println("It is a country of unity in diversity.");
        System.out.println("We’re here to help you look for the best tourist destinations in India.");
        obj.chk_direct(); // Calling instance method with help of object
        obj.chk_package(); // Calling instance method with help of object
        obj.departure(); // Calling instance method with help of object

        obj.customer_details(); // Calling instance method with help of object
        obj.hotel(); // Calling instance method with help of object
        obj.food(); // Calling instance method with help of object
        obj.password(); // Calling instance method with help of object
        obj.payment_date(); // Calling instance method with help of object
        obj.precautions(); // calling static method
    }
}

abstract class abstraction {
    abstract void bill();
}

class TourPackage extends abstraction
// Class with name TourPackage
{
    // Declaring global variables - class members
    String direction;// The variable to store the direction in which user wants to travel
    String email;// Stores the email address of the user
    String name[];// Stores users' names [String array]
    ArrayList<String> Name = new ArrayList<String>();
    // ArrayList<String> emphno=new ArrayList<String>();
    // ArrayList<String> email=new ArrayList<String>();
    int age[];// Stores users' age [Integer array]
    String blgrp[];// Stores the users's blood group [String array]
    int packnum;// The variable to store the package number
    double ppp;// Stores the price per person according to the package chosen by the user
    String phno1, phno2, emphno;// Stores user’s phone numbers
    String month;// Stores the name of the month in which user wishes to travel
    int passno;// Stores the number of passengers who wish to travel
    int date;// Stores the date of the user’s journey
    int year;// Stores the year in which the user wishes to travel
    double disc;// Stores the discount on the total bill of the user
    double tot_cost;// Stores the amount user has to pay after giving appropriate discounts
    String hotel_type;// Stores the type of hotel in which the user wishes to stay
    String veg_non;// stores the choice of the user – whether he wants to eat veg or non-veg food
    String paswd;// To store the password created by the user to secure his/her account
    // String hotel_names_3[];//Stores the names of 3 star hotels according to the
    // tour destination
    // String hotel_names_3[];//Stores the names of 3 star hotels according to the
    // tour
    // destination
    ArrayList<String> h3 = new ArrayList<String>();
    ArrayList<String> h4 = new ArrayList<String>();// Stores the names of 4 star hotels according to the
    // tour destination
    ArrayList<String> h5 = new ArrayList<String>();// Stores the names of 5 star hotels according to the
    // tour destination
    ArrayList<String> h7 = new ArrayList<String>();// Stores the names of 7 star hotels according to the
    // tour destination
    String d_and_n;// To store the duration of the desired package.
    String pack_name;
    //String pack_name d_and_n; // To store the name of the package user wishes to travel
    // Non parameterized (default) constructor to initialise global variables to
    // their default values

    public TourPackage() {
        packnum = 0;
        ppp = 0.00;
        direction = "";
        email = "";
        phno1 = "";
        phno2 = "";
        emphno = "";
        passno = 0;
        disc = 0.00;
        tot_cost = 0.00;
        month = "";
        date = 0;
        year = 0;
        hotel_type = "";
        veg_non = "";
        paswd = "";
        d_and_n = "";
        pack_name = "";
    }

    public void Introduction() {
       
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println( "____________________________________________________________________________________ ______\n\n\t\t\t\t\t********Welcome to VOYAGE VENTURES Tours and Travels*********\n ____________________________________________________________________________________ ____\n\n\t\t\t\t'INDIA'LAND OF GREAT HISTORY,MAGNIFICENT LANDSCAPES AND INCREDIBLE DIVERSITY\n\t\t\t\t Aiming to make your trip to this heaven on earth safer and most memorable!");
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print( "India’s diverse topography, history and culture offers enough experiences tofulfil any type of wanderlust.");

        System.out.println ("Our India tour packages cover the \nlength and breadth of the land.");
        System.out.print("\n\nThe Himalayas are one of the few sights capable of literally taking yourbreath away.They range across the");
        System.out.print(" states of Jammu & Kashmir,\nHimachal Pradesh, Uttarakhand, Sikkim,Arunachal Pradesh and West Bengal.");
        System.out.println(" It gives mountain lover so many opportunities for their tour and \ntravelplans.");
        System.out.print("\n \nThe other great thing about the country’s location is its proximity to thesea.With ten states along its");
        System.out.print("coastline, you can take your pick \nfrom any of them. ");
        System.out.print("There is the Arabian Sea whose waves crash against the states ofMaharashtra,Kerala and Goa.");
        System.out.print( "The entire Konkan belt is \nknown for its beautiful beaches, and a stunningcoastline with a gorgeous");
        System.out.print("combination of hills and beaches making it one of the best tour and \ntravelbelts in the country.");
        System.out.println("Odisha, Tamil Nadu and Andhra Pradesh are greeted by the waters of theBay of Bengal.");
        System.out.print("\n \nGo through more of our holiday packages in India to find your next besttour and");
        System.out.println("travel across the country with the leading tour and travel\nagency - VOYAGEVENTURES");
        System.out.println( "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // Creating object of the Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n\nPRESS THE 1 TO MOVE TO NEXT PAGE AND EXPLORE THEVARIOUS TOUR OPTIONS");
        boolean isValid = false;
        int i = sc.nextInt();
        while (!isValid) {
            if (i == 1) {
                isValid = true;
            } else {
                System.out.println("Enter appropriate choice");
                i = sc.nextInt();
            } // else
        } // while
    }// introduction

public void chk_direct()//To accept from the user the direction he would like to travel and display
//the tour options accordingly
{
System.out.println("Where would you like to travel in India: \n North \n South \n East \n West");

//Creating object of the Scanner Class
Scanner sc = new Scanner(System.in);//Prompting the user to enter the direction in which he/she
//would like to travel
direction = sc.nextLine();
North N=new North();
South S=new South();
West W=new West();
East E=new East();
if (direction.equalsIgnoreCase("North"))
{
N.packages();//calling method to display packages of North India
}
else if (direction.equalsIgnoreCase("South"))
{
S.packages();//calling method to display packages of South India
}
else if (direction.equalsIgnoreCase("East"))
{
E.packages();//calling method to display packages of East India
}
else if (direction.equalsIgnoreCase("West"))
{
W.packages();//calling method to display packages of West India
}
else
{
System.out.println("We request you to enter appropriate choice.");
chk_direct();//calling chk_direct method again if user has entered incorrect option
}
System.out.println("\n \nPlease enter the number of the package you would like to choose.");
packnum = sc.nextInt();//accepting the number of the package the user would like to choose
}

    public void chk_package()// Assigning hotel names in which the user would reside according to
    // the star rating
    {
        // Creating object of the Scanner Class
        Scanner sc = new Scanner(System.in);
        if (direction.equalsIgnoreCase("North") && packnum == 1) {
            ppp = 18000.00;
            pack_name = "CAPTIVATING NAINITAL PACKAGE";// storing name of package in pack_name
            d_and_n = "4 NIGHTS 5 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Hotel Hill View Point");
            h3.add("Oceanic Crust Resort");
            h3.add("Coast Hotels");
            h3.add("Kings Inn");
            // adding names of 4 star hotels to array list
            h4.add("Holiday Thrills Hotel");

            h4.add("Astro Resort");
            h4.add("Bourbon Bliss");
            h4.add("Candlewood Suites");
            // adding names of 5 star hotels to array list
            h5.add("Bluebird Guesthouse");
            h5.add("Club Quarters");
            h5.add("Vision Resort");
            h5.add("Wonder Hill Inn");
            // adding names of 7 star hotels to array list
            h7.add("Blooming Resort");
            h7.add("The River Front Resort");
            h7.add("Jade Mountain Hotel");
            h7.add("Mandarin Oriental");
        } else if (direction.equalsIgnoreCase("North") && packnum == 2) {
            ppp = 13000.00;
            pack_name = "UTTARAKHAND TOUR PACKAGE";// storing name of package in pack_name
            d_and_n = "4 NIGHTS 5 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to the array list
            h3.add("Snowy Peaks Inn");
            h3.add("Mountain View Hotel");
            h3.add("Omni Hotels");
            h3.add("Paramount Hotels");
            // adding names of 4 star hotels to the array list
            h4.add("Crescent Resort");
            h4.add("Dream Connect Hotel");
            h4.add("Enchanted Garden Resort");
            h4.add("Green Acres Inn");
            // adding names of 5 star hotels to the array list
            h5.add("Invitation Inn");
            h5.add("Roadside Motel");
            h5.add("Knights Inn");
            h5.add("The White Rock Hotel");
            // adding names of 7 star hotels to array list
            h7.add("Spring Brook Resort");
            h7.add("Lilac Resort");
            h7.add("Spring Bay Resort");
            h7.add("Quaint Motel");
        }
        else if (direction.equalsIgnoreCase("North") && packnum == 3) {
            ppp = 10000.00;
            pack_name = "DELHI PUNJAB PACKAGE";// storing name of package in pack_name
            d_and_n = "2 NIGHTS 3 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to the array list
            h3.add("Hotels Roadside");
            h3.add("Happy Mornings Hotel");
            // adding names of 4 star hotels to the array list

            h4.add("Hotel Emblem");
            h4.add("Hotel Decent");
            // adding names of 5 star hotels to the array list
            h5.add("The Greet Team Inn");
            h5.add("Lime Wood Inn");
            // adding names of 7 star hotels to array list
            h7.add("Tranquil Oasis Resort");
            h7.add("Whispering Pines Retreat");
        } else if (direction.equalsIgnoreCase("North") && packnum == 4) {
            ppp = 11000.00;
            pack_name = "MESMERISING KASHMIR PACKAGE";// storing name of package in pack_name
            d_and_n = "2 NIGHTS 3 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to the array list
            h3.add("Hillside Hotel");
            h3.add("Quality Hotels");
            // adding names of 4 star hotels to the array list
            h4.add("Hotel Novotel");
            h4.add("Jade Mountain Inn");
            // adding names of 5 star hotels to the array list
            h5.add("Ice FlakesHotel");
            h5.add("Sunny Canopy");
            // adding names of 7 star hotels to array list
            h7.add("Serene Haven Resort");
            h7.add("Azure Retreat");
        } else if (direction.equalsIgnoreCase("North") && packnum == 5) {
            ppp = 20000.00;
            pack_name = "EXOTIC HIMACHAL PACKAGE";// storing name of package in pack_name
            d_and_n = "4 NIGHTS 5 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Hotel Breeze Blows");
            h3.add("La Parisienne Inn");
            h3.add("The Worldly Traveller");
            h3.add("Quick Stoop Hotel");
            // adding names of 4 star hotels to array list
            h4.add("Millennium Times Square Inn");
            h4.add("Hotel Obsidian Sky");
            h4.add("Hotel Parallel Tower");
            h4.add("Prestige Proga Inn");
            // adding names of 5 star hotels to array list
            h5.add("Embassy Suites");
            h5.add("Cute Mountains Inn");
            h5.add("Royal Place Resort");
            h5.add("Royal Galaxy Hotel");
            // adding names of 7 star hotels to array list
            h7.add("Mystic Meadows Resort");

            h7.add("Harmony Cove");
            h7.add("Zenith Haven Resort");
            h7.add("Celestial Spa Retreat");
        } else if (direction.equalsIgnoreCase("South") && packnum == 1) {
            ppp = 30000.00;
            pack_name = "DAZZLING ANDAMAN AND NICOBAR PACKAGE";// storing name of package in
           d_and_n = "4 NIGHTS 5 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Four Seasons Hotel");
            h3.add("Knights Inn");
            h3.add("Radisson Hotel");
            h3.add("Classio Hotel");
            // adding names of 4 star hotels to array list
            h4.add("Red Lion Hotel");
            h4.add("Sea Horizon Resort");
            h4.add("Rooftop Resort");
            h4.add("Sizzling Inn");
            // adding names of 5 star hotels to array list
            h5.add("Southern Ocean Resort");
            h5.add("The Harbor Hotel");
            h5.add("Southern Hospitality");
            h5.add("The Sebastian Hotel");
            // adding names of 7 star hotels to array list
            h7.add("Blissful Bay Resort");
            h7.add("Lush Lagoon Retreat");
            h7.add("Radiant Sunset Resort");
            h7.add("Etheral Escape");
        } else if (direction.equalsIgnoreCase("South") && packnum == 2) {
            ppp = 15000.00;
            pack_name = "ENGROSSING OOTY MYSORE PACKAGE";// storing name of package in
            d_and_n = "3 NIGHTS 4 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Travelodge");
            h3.add("Hotel Pearl");
            h3.add("Hotel Rosewood");
            // adding names of 4 star hotels to array list
            h4.add("The Welcome Inn");
            h4.add("Row Hotel");
            h4.add("Soft Petal Inn");
            // adding names of 5 star hotels to array list
            h5.add("The Langham Resort");
            h5.add("Happy Stay Inn");
            h5.add("Canopy Suites");

            // adding names of 7 star hotels to array list
            h7.add("Dreamy Dunes Resort");
            h7.add("Secret Garden Retreat");
            h7.add("Petal Pink Resort");
        } else if (direction.equalsIgnoreCase("South") && packnum == 3) {
            ppp = 22000.00;
            pack_name = "RIVETING KERALA KANNIYAKUMARI PACKAGE";// storing name of package in
            d_and_n = "3 NIGHTS 4 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Hotel Crossroads");
            h3.add("Hotel Agoura");
            h3.add("Twice Happy Resorts");
            // adding names of 4 star hotels to array list
            h4.add("Sunny Canopy Inn");
            h4.add("The Clift Royal Hotel");
            h4.add("Harbor Court Hotel");
            // adding names of 5 star hotels to array list
            h5.add("Coastal Bay Hotel");
            h5.add("The Peninsula Resort");
            h5.add("Acqualina Resort");
            // adding names of 7 star hotels to array list
            h7.add("Bunny Meadows");
            h7.add("Starry Sky Retreat");
            h7.add("Honey Bee Haven");
        } else if (direction.equalsIgnoreCase("South") && packnum == 4) {
            ppp = 10000.00;
            pack_name = "TIRUPATI RAMESHWARAM TOUR PACKAGE";// storing name of package in
         d_and_n = "3 NIGHTS 4 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Grand Hotel");
            h3.add("The Bristol Hotel");
            h3.add("Hollywood Sands");
            // adding names of 4 star hotels to array list
            h4.add("Tiny Digs Hotel");
            h4.add("Urban Boutique Hotel");
            h4.add("Woodlark Inn");
            // adding names of 5 star hotels to array list
            h5.add("The Royal Sea Resort");
            h5.add("Grand Beach Hotel");
            h5.add("Land’s End Resort");
            // adding names of 7 star hotels to array list
            h7.add("Puffin Paradise");
            h7.add("Dainty Daisy Resort");

            h7.add("Whimsical Woods");
        } else if (direction.equalsIgnoreCase("South") && packnum == 5) {
            ppp = 25000.00;
            pack_name = "DAZZLING HYDERABAD PACKAGE";// storing name of package in pack_name
            d_and_n = "7 NIGHTS 6 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("The Gourmet Resorts");
            h3.add("Cotton House Hotel");
            h3.add("Radisson Hotel");
            h3.add("The Watson Hotel");
            h3.add("Pacifica Hotel");
            // adding names of 4 star hotels to array list
            h4.add("Hyatt Hotel");
            h4.add("Etiquette Suites");
            h4.add("Radisson Hotel");
            h4.add("Farmhouse Inn");
            h4.add("Southern Grace Resort");
            h4.add("Green Lush Resorts");
            // adding names of 5 star hotels to array list
            h5.add("Comfort Inn");
            h5.add("Grand Hyatt Inn");
            h5.add("The Redbury Resort");
            h5.add("Fortune House Hotel");
            h5.add("Hotel Vitale");
            h5.add("Paradise Point Resort");
            // adding names of 7 star hotels to array list
            h7.add("Moonlit Mews Resort");
            h7.add("Cuddly Cove");
            h7.add("Flutterby Fields Resort");
            h7.add("Sweet Pea Sanctuary");
            h7.add("Teddy Bear Terrace");
            h7.add("Fairy Fern Resort");
        } else if (direction.equalsIgnoreCase("East") && packnum == 1) {
            ppp = 15000.00;
            pack_name = "HEAVENLY SIKKIM PACKAGE";// storing name of package in pack_name
            d_and_n = "3 NIGHTS 4 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Cosmopolitan Hotel");
            h3.add("Reefs Resort & Club");
            h3.add("White Dove Hotels");
            // adding names of 4 star hotels to array list
            h4.add("The New View Inn");
            h4.add("Hotel Agoura");
            h4.add("The Maxwell Hotel");
            // adding names of 5 star hotels to array list

            h5.add("Pearl Hotel");
            h5.add("Hotel Riu Plaza");
            h5.add("Silver Cloud Inn");
            // adding names of 7 star hotels to array list
            h7.add("Bunny Hop Hideaway");
            h7.add("Dewdrop Delight Resort");
            h7.add("Fairytale Forest Resort");
        } else if (direction.equalsIgnoreCase("East") && packnum == 2) {
            ppp = 19000.00;
            pack_name = "WINSOME ASSAM MEGHALAYA PACKAGE";// storing name of package in
           d_and_n = "4 NIGHTS 5 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Fountain Fun Inn");
            h3.add("Hotel Vitale");
            h3.add("Radisson Hotel");
            h3.add("Cable Car Hotel");
            // adding names of 4 star hotels to array list
            h4.add("Candlewood Suites");
            h4.add("Eagles Watch Resort");
            h4.add("Blooming Resort");
            h4.add("Hilltop Heaven Resort");
            // adding names of 5 star hotels to array list
            h5.add("Embassy Suites");
            h5.add("Music City Hotel");
            h5.add("Royal Place Resort");
            h5.add("The Quest Suites");
            // adding names of 7 star hotels to array list
            h7.add("Starlight Sanctuary");
            h7.add("Petal Path Retreat");
            h7.add("Puffin Pines Retreat");
            h7.add("Honeybee Haven");
        } else if (direction.equalsIgnoreCase("East") && packnum == 3) {
            ppp = 22000.00;
            pack_name = "RAVISHING NORTH EAST PACKAGE";// storing name of package in pack_name
            d_and_n = "5 NIGHTS 6 DAYS";
            // adding names of 3 star hotels to array list
            h3.add("Marriott");
            h3.add("Cotton House Hotel");
            h3.add("Land's End Resort");
            h3.add("The Watson Hotel");
            h3.add("Ritz-Carlton Hotel");
            // adding names of 4 star hotels to array list
            h4.add("Hill Top Inn");

            h4.add("Eagles Watch Resort");
            h4.add("The Paradise Inn");
            h4.add("Farmhouse Inn");
            h4.add("Welcome Stay Resort");
            // adding names of 5 star hotels to array list
            h5.add("The Langham Resort");
            h5.add("Music City Hotel");
            h5.add("Canopy Suites");
            h5.add("The Lakefront");
            h5.add("Gaslamp Quarter Hotel");
            // adding names of 7 star hotels to array list
            h7.add("Buttercup Bliss Resort");
            h7.add("Moonbeam Meadows");
            h7.add("Whispering Willow Retreat");
            h7.add("Squirrel's Nest Resort");
            h7.add("Rainbow Ridge Resort");
        } else if (direction.equalsIgnoreCase("East") && packnum == 4) {
            ppp = 25000.00;
            pack_name = "ODISHA TOUR PACKAGE";// storing name of package in pack_name
            d_and_n = "4 NIGHTS 5 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Waldorf Astoria");
            h3.add("Aman Resorts");
            h3.add("Mandarin Oriental");
            h3.add("The Luxury Inn");
            // adding names of 4 star hotels to array list
            h4.add("Red Lion Hotel");
            h4.add("Hilltop Heaven Resort");
            h4.add("Rooftop Resort");
            h4.add("Four Seasons Resort");
            // adding names of 5 star hotels to array list
            h5.add("Hotel Deluxe");
            h5.add("Sunrise Cave Inn");
            h5.add("Grant Plaza Hotel");
            h5.add("Fortune House Hotel");
            // adding names of 7 star hotels to array list
            h7.add("Ladybug Lane Resort");
            h7.add("Grandeur Gardens Resort");
            h7.add("Opulent Oasis Retreat");
            h7.add("Majestic Manor Resort");
        } else if (direction.equalsIgnoreCase("East") && packnum == 5) {
            ppp = 20000.00;
            pack_name = "EXHILARATING KOLKATA PACKAGE";// storing name of package in pack_name
            d_and_n = "2 NIGHTS 3 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list

            h3.add("Belmond Inn");
            h3.add("St Regis Hotels");
            // adding names of 4 star hotels to array list
            h4.add("Able Day Hotel");
            h4.add("Astro Resort");
            // adding names of 5 star hotels to array list
            h5.add("Pearl Hotel");
            h5.add("Sleep Inn");
            // adding names of 7 star hotels to array list
            h7.add("Regal Riviera Retreat");
            h7.add("Luxe Lagoon Resort");
        } else if (direction.equalsIgnoreCase("West") && packnum == 1) {
            ppp = 18000.00;
            pack_name = "ENCHANTING GUJARAT PACKAGE";// storing name of package in pack_name
            d_and_n = "3 NIGHTS 4 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Residence Inn by Marriott");
            h3.add("The Bristol Hotel");
            h3.add("Rosewood Hotels and Resorts");
            // adding names of 4 star hotels to array list
            h4.add("Paradise Point Resort");
            h4.add("Urban Boutique Hotel");
            h4.add("Country Charm Inn");
            // adding names of 5 star hotels to array list
            h5.add("The Talbott Hotel");
            h5.add("The Tower Hotel");
            h5.add("Crossroads Resort");
            // adding names of 7 star hotels to array list
            h7.add("Royal Ridge Retreat");
            h7.add("Elegant Eden Resort");
            h7.add(" Prestige Pinnacle Retreat");
        } else if (direction.equalsIgnoreCase("West") && packnum == 2) {
            ppp = 12000.00;
            pack_name = "GANDHINAGAR DWARKA TOUR PACKAGE";// storing name of package in
             d_and_n = "4 NIGHTS 5 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Heaven Lands");
            h3.add("Hotel Majestics");
            h3.add("Wedgewood Resorts");
            h3.add("The Horizon Inn");
            // adding names of 4 star hotels to array list
            h4.add("Millenium Times Square Inn");
            h4.add("Hotel Lemonade");
            h4.add("Hotel Parallel Towers");

            h4.add("The Savory Hotel");
            // adding names of 5 star hotels to array list
            h5.add("Premiere Travel Inn");
            h5.add("The Earth Pure Inn");
            h5.add("The Herbert Hotel");
            h5.add("The Quest Suites");
            // adding names of 7 star hotels to array list
            h7.add("Aristocratic Acres Resort");
            h7.add("Sovereign Sands Retreat");
            h7.add("Grandiose Grove Resort");
            h7.add("Exquisite Estates Retreat");
        } else if (direction.equalsIgnoreCase("West") && packnum == 3) {
            ppp = 25000.00;
            pack_name = "ROYAL RAJASTHAN TOUR PACKAGE";// storing name of package in pack_name
            d_and_n = "4 NIGHTS 5 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Paradise Point Resort");
            h3.add("Knights Inn");
            h3.add("Giggle Resorts");
            h3.add("The River Front");
            // adding names of 4 star hotels to array list
            h4.add("Candlewood Suites");
            h4.add("Feel At Home Resort");
            h4.add("Blooming Inn");
            h4.add("Hotel Mastic Marvel");
            // adding names of 5 star hotels to array list
            h5.add("Redstone Resort");
            h5.add("Sandy Bloom Inn");
            h5.add("The Lustrous Inn");
            h5.add("Hotel Sunset View");
            // adding names of 7 star hotels to array list
            h7.add("Noble Nook Resort");
            h7.add("Palatial Peaks Retreat");
            h7.add("Lavish Lakeside Resort");
            h7.add("Sweet Serenity Spa");
        } else if (direction.equalsIgnoreCase("West") && packnum == 4) {
            ppp = 8000.00;
            pack_name = "SPELLBINDING MUMBAI LONAVALA PUNE PACKAGE";// storing name of
            // package in pack_name
            d_and_n = "3 NIGHTS 4 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Four Seasons Hotel");
            h3.add("Historic Meadows Hotel");
            h3.add("The Queens");
            // adding names of 4 star hotels to array list

            h4.add("The New View Inn");
            h4.add("Priority Hospitality Inn");
            h4.add("Blossomwood Resort");
            // adding names of 5 star hotels to array list
            h5.add("Hilton Garden Resort");
            h5.add("Hotel Triton");
            h5.add("Paramount Hotel");
            // adding names of 7 star hotels to array list
            h7.add("Pixie Hollow Resort");
            h7.add("Honeydew Hideaway");
            h7.add("Cuddle Cove Retreat");
        } else if (direction.equalsIgnoreCase("West") && packnum == 5) {
            ppp = 15000.00;
            pack_name = "FUN 'N' FROLIC GOA PACKAGE";// storing name of package in pack_name
            d_and_n = "2 NIGHTS 3 DAYS";// Storing the duration of the package in d_and_n
            // adding names of 3 star hotels to array list
            h3.add("Sunset Plains");
            h3.add("Secluded Hill");
            // adding names of 4 star hotels to array list
            h4.add("Spotlight Hotel");
            h4.add("Newhouse Hotel");
            // adding names of 3 star hotels to array list
            h5.add("Hotel Vertigo");
            h5.add("Hotel Lucia");
            // adding names of 7 star hotels to array list
            h7.add("Sugar Plum Spa");
            h7.add("Cotton Candy Cove");
        } else {
            System.out.println("Please enter an appropriate choice");// Prompting user to enter an appropriate
            // input
            packnum = sc.nextInt();
            chk_package();// calling chk_package method again if user has entered incorrect option
        }
    }

 
   
   
        public void departure() {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("The dates of departures available in Voyage Ventures are:");
            System.out.println(" January 5\n January 10\n April 20\n April 25\n May 10\n May 15\n October 12\n October 20\n December 13\n December 20");
            System.out.println();
   
            System.out.print("Enter the month: ");
            String month = sc.nextLine().trim();
   
            boolean isValid = false;
            while (!isValid) {
                if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("December")) {
                    isValid = true;
                } else {
                    System.out.print("Please enter a valid month: ");
                    month = sc.nextLine().trim();
                }
            }
   
            System.out.print("Enter the date: ");
            int date = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()
   
            while (!isValidDate(date, month)) {
                System.out.print("Please enter a valid date for " + month + ": ");
                date = sc.nextInt();
                sc.nextLine(); // Consume the newline character left by nextInt()
            }
   
            int year = 0;
            try {
                System.out.print("Enter the year: ");
                year = sc.nextInt();
                sc.nextLine(); // Consume the newline character left by nextInt()
   
                isValid = false;
                while (!isValid) {
                    if (isWithinOneYear(date, month, year)) {
                        isValid = true;
                    } else {
                        System.out.print("Please enter a valid year (within one year of the current date): ");
                        year = sc.nextInt();
                        sc.nextLine(); // Consume the newline character left by nextInt()
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid year format. Please enter a valid year.");
                sc.nextLine(); // Consume the newline character left by nextInt()
            }
   
            sc.close();
        }
   
        private boolean isValidDate(int date, String month) {
            if ((month.equalsIgnoreCase("January") && (date == 5 || date == 10))
                    || (month.equalsIgnoreCase("April") && (date == 20 || date == 25))
                    || (month.equalsIgnoreCase("May") && (date == 10 || date == 15))
                    || (month.equalsIgnoreCase("October") && (date == 12 || date == 20))
                    || (month.equalsIgnoreCase("December") && (date == 13 || date == 20))) {
                return true;
            }
            return false;
        }
   
        private boolean isWithinOneYear(int date, String month, int year) {
            String full_d = month + " " + date + ", " + year;
            LocalDate givenDate = LocalDate.parse(full_d, DateTimeFormatter.ofPattern("MMMM d, yyyy"));
            LocalDate now = LocalDate.now();
            int diff = givenDate.getYear() - now.getYear();
            if (now.getDayOfYear() > givenDate.getDayOfYear()) {
                diff--;
            }
            return diff == 0;
        }
   
        public static void main(String[] args) {
            TourPackage o = new TourPackage();
            o.departure();
        }
   
   
   
   
        public void customer_details()
        {
            System.out.println();
            System.out.println("PRICE PER PERSON = RS." + ppp);
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter the number of travellers:");
            passno = sc.nextInt();
            System.out.println();
            int cpass = passno - 1;
            System.out.println("Enter the names of all the travellers .");
            name = new String[passno];
            sc.nextLine();
            System.out.println();
            char ch;
            int ch_ascii;
            int count = 0;
            boolean isValid = false;
            for (int i = 0; i <= cpass; i++) {
                System.out.print("Name " + (i + 1) + ": ");
                name[i] = sc.nextLine();
                Name.add(name[i]);
                System.out.println();
                isValid = false;
                while (!isValid) {
                    isValid = false;
                    count = 0;
                    for (int j = 0; j < name[i].length(); j++) {
                        ch = name[i].charAt(j);
                        ch_ascii = (int) ch;
                        if ((ch_ascii >= 65 && ch_ascii <= 90) || (ch_ascii >= 97 && ch_ascii <= 122) || ch_ascii == 32
                                || ch_ascii == 39 || ch_ascii == 46) {
                            count++;
                        }
                    }
                    if (count < name[i].length()) {
                        isValid = false;
                        System.out.println("Enter the name correctly");
                        System.out.print("Name " + (i + 1) + ": ");
                        name[i] = sc.nextLine();
                        System.out.println();
                    } else {
                        isValid = true;
                    }
                }
            }
            System.out.println();
            System.out.print("Kindly enter the age of all the travellers as discount will be applicable");
            System.out.println(" for children and senior citizens");
            System.out.println();
            age = new int[passno];
            for (int i = 0; i <= cpass; i++) {
                System.out.print("Age of " + name[i] + ": ");
                age[i] = sc.nextInt();
                System.out.println();
            }
            sc.nextLine();
            System.out.println();
            System.out.print("Enter any two of your mobile numbers so that our travel agency can ");
            System.out.println("contact you directly for further details.");
            System.out.println();
            System.out.print("Mobile number 1 :");
            phno1 = sc.nextLine();
            phno1 = phno1.trim();
            isValid = false;
            while (!isValid) {
                if (phno1.length() != 10) {
                    System.out.println("Please enter the mobile number correctly");
                    System.out.print("Mobile number 1 :");
                    phno1 = sc.nextLine();
                    phno1 = phno1.trim();
                } else {
                    isValid = true;
                }
            }
            System.out.println();
            System.out.print("Mobile number 2 :");
            phno2 = sc.nextLine();
            phno2 = phno2.trim();
            isValid = false;
            while (!isValid) {
                if (phno2.length() != 10) {
                    System.out.println("Please enter the mobile number correctly");
                    System.out.print("Mobile number 2 :");
                    phno2 = sc.nextLine();
                    phno2 = phno2.trim();
                } else if (phno2.equals(phno1)) {
                    System.out.println("Mobile number 2 is same as mobile number 1");
                    System.out.println("Please re-enter the mobile number");
                    System.out.print("Mobile number 2 :");
                    phno2 = sc.nextLine();
                    phno2 = phno2.trim();
                } else {
                    isValid = true;
                }
            }
            System.out.println();
            System.out.print("Please enter your email id to receive all the tour related details:");
            email = sc.nextLine();
            email = email.trim();
            char c;
            int index_diff;
            isValid = false;
            while (!isValid) {
                count = 0;
                for (int i = 0; i < email.length(); i++) {
                    c = email.charAt(i);
                    if (c == '@')
                    {
                        count++;
                    }
                }
                index_diff = email.lastIndexOf('.') - email.indexOf('@');
                if (count == 1 && (email.endsWith(".com") || email.endsWith(".co.in")) && index_diff > 1)
                 {
                    isValid = true;
                }
                else
                {
                    System.out.println("Please enter your correct email id :");
                    email = sc.nextLine();
                    email = email.trim();
                }
            }
            System.out.println();
            System.out.print("Enter the city of your residence: ");
            String city = sc.nextLine();
            System.out.println();
            System.out.println("Enter the State of your residence: ");
            String state = sc.nextLine();
            System.out.println();
            System.out.print("Any particular medical problem / information that the travel agency should be aware of ");
            System.out.println("(eg. diabetes, blood pressure, etc)");
            System.out.print("PLEASE ANSWER IN YES OR NO :");
            System.out.println();
            String medical = sc.nextLine();
            String prb;
            isValid = false;
            while (!isValid) {
                if (medical.equalsIgnoreCase("yes"))
                 {
                    System.out.println("Please enter the problem which our travel agency should be aware about.");
                    prb = sc.nextLine();
                    isValid = true;
                }
                else if (medical.equalsIgnoreCase("no")) {
                    System.out.println("That's Great");
                    isValid = true;
                }
                 else
                 {
                    isValid = false;
                    System.out.println("PLEASE ANSWER IN YES OR NO");
                    System.out.println();
                    medical = sc.nextLine();
                }
            }
            System.out.println();
            System.out.print("As a precautionary measure please enter the blood groups of all ");
            System.out.println("the people travelling in this adventurous trip.");
            System.out.println("PLEASE ENTER THE BLOOD GROUP IN THE FORMAT - A+ / AB- / O+etc.");
            System.out.println();
            isValid = false;
            blgrp = new String[passno];
            for (int i = 0; i <= cpass; i++) {
                System.out.print("Blood Group of " + name[i] + ": ");
                blgrp[i] = sc.nextLine();
                isValid = false;
                while (!isValid) {
                    if (blgrp[i].matches("A\\+|A-|AB\\+|AB-|B\\+|B-|O\\+|O-")) {
                        isValid = true;
                    }
                    else
                    {
                        System.out.println("Enter the Blood Group of " + name[i] + " correctly");
                        System.out.println("PLEASE ENTER THE BLOOD GROUP IN THE FORMAT - A+ / AB- / O+etc.");
                        System.out.print("Blood Group of " + name[i] + ": ");
                        blgrp[i] = sc.nextLine();
                    }
                }
                System.out.println();
            }
            String st;
            for (int i = 0; i < blgrp.length; i++) {
                st = blgrp[i];
            }
            System.out.println();
            System.out.print("Please enter your emergency mobile number: ");
            emphno = sc.nextLine();
            emphno = emphno.trim();
            System.out.println();
            isValid = false;
            while (!isValid) {
                if (emphno.length() != 10) {
                    System.out.print("Please enter the emergency mobile number correctly:");
                    emphno = sc.nextLine();
                    emphno = emphno.trim();
                }
                else
                {
                    isValid = true;
                }
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            sc.close();
        }
   
   
    public void grp_discount()// to calculate group discount according to the number of travellers if the
    // user is eligible for that
    {
        tot_cost = ppp * passno;// calculating total cost to be paid by the customer
        System.out.print("We are delighted to announce that you have ");
        System.out.print("received an exclusive discount from VOYAGE VENTURES tours and travels of");
        if (passno >= 8 && passno <= 10) {
            disc = 0.025 * tot_cost;
            System.out.print(" 2.5%.");
        } else if (passno >= 11 && passno <= 15) {
            disc = 0.050 * tot_cost;
            System.out.print(" 5.0%.");
        } else if (passno >= 16 && passno <= 20) {
            disc = 0.075 * tot_cost;
            System.out.print(" 7.5%.");
        } else {
            disc = 0.100 * tot_cost;
            System.out.print(" 10.0%.");
        }
        tot_cost = tot_cost - disc;// Calculating total cost
    }

    public void nongrp_discount()

    {
        int count = 0, cage = 0;
        tot_cost = ppp * passno;// Calculating total cost
        for (int i = 0; i < passno; i++) {
            if (age[i] <= 5 || age[i] >= 60) {
                count++;
                System.out.println("");
            }
        }
        disc = count * ppp * 0.05;// Calculating
                                  // discount
        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("December")) {
            if (direction.equalsIgnoreCase("North")) {
                disc = disc + (ppp * 0.05);
            }
        } else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
            if (direction.equalsIgnoreCase("South")) {
                disc = disc + (ppp * 0.05);
            }
        }
        tot_cost = tot_cost - disc;// Modifying
                                   // total
                                   // cost
        if (disc != 0) {
            System.out.print("We are delighted to announce that you have ");
            System.out
                    .print("received an exclusive group discount from voyage ventures tours and travels ofRs." + disc);
        }
    }

    public void hotel()// to display the various hotels in which the user would reside during his
                       // journey
    {
        // Creating object of the Scanner Class
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println();
        System.out.println(
                "________________________________________________________________________________________________________________________________________________________ _______________________________");
        System.out.println("\nPlease enter the type of hotel you would like to stay in:");
        System.out.println("3 STAR");
        System.out.println("4 STAR");
        System.out.println("5 STAR");
        System.out.println("7 STAR");

        hotel_type = sc.nextLine();
        hotel_type = hotel_type.trim();// removing spaces before and after first character if any
        ch = hotel_type.charAt(0);
        boolean isValid = false;
        String hotel;
        while (!isValid) {
            switch (ch)// To display the hotels in
                       // which the user will be
                       // residing during the
                       // journey
            {
                case '3':
                    ppp += 0;
                    System.out.println("You will be residing in these hotels:");
                    for (int i = 0; i < h3.size(); i++) {
                        hotel = h3.get(i);
                        i++;
                        System.out.println("Day " + i + ": " + hotel);
                        i--;
                    }
                    isValid = true;
                    break;
                case '4':
                    ppp += 3000;
                    System.out.println("You will be residing in these hotels:");
                    for (int i = 0; i < h4.size(); i++) {
                        hotel = h4.get(i);
                        i++;
                        System.out.println("Day " + i + ": " + hotel);
                        i--;
                    }
                    isValid = true;
                    break;
                case '5':
                    ppp += 5000;
                    System.out.println("You will be residing in these hotels:");
                    for (int i = 0; i < h5.size(); i++) {
                        hotel = h5.get(i);
                        i++;
                        System.out.println("Day " + i + ": " + hotel);
                        i--;
                    }
                    isValid = true;
                    break;
                case '7':
                    ppp += 7000;
                    System.out.println("You will be residing in these hotels:");
                    for (int i = 0; i < h7.size(); i++) {
                        hotel = h7.get(i);
                        i++;
                        System.out.println("Day " + i + ": " + hotel);

                        i--;
                    }
                    isValid = true;
                    break;
                default:
                    System.out.println("Please enter appropriate choice");
                    hotel_type = sc.nextLine();
                    hotel_type = hotel_type.trim();// removing
                                                   // spaces
                                                   // before
                                                   // and
                                                   // after
                                                   // first
                                                   // character
                                                   // if
                                                   // any
                    ch = hotel_type.charAt(0);
            }
        }
        System.out.println();
    }

public void food()//to display some special dishes the user would be able to enjoy according to the
//package chosen by him
{
//Creating object of the Scanner Class
Scanner sc = new Scanner(System.in);
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
System.out.println("Would you prefer the 'Exotic Veg Food' meal package or the 'DeliciousNon-veg Food' meal package during your adventurous tour");
veg_non = sc.nextLine();
veg_non = veg_non.trim();//removing spaces before and after first character if any
String st = veg_non.toLowerCase();
int v = 0 , n = 0, g = 0;
v = st.indexOf('v');//Finding the index of v
n = st.indexOf('n');//Finding the index of n
g = st.indexOf('g');//Finding the index of g
if(n<v && (g-n == 6||g-n == 5))
{
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
System.out.println("You have opted for non-veg food");
System.out.println("You will be able to enjoy the following delicacies during the tour:");
//Displaying non - veg food items the user will have according to the package
if(direction.equalsIgnoreCase("North"))
{
System.out.println(" Tandoori Lamb Chops\n Malabar Fish Biryani\n Paneer Tikka With PutterKulcha");
System.out.println(" Grilled Chicken Escalope with Fresh Salsa\n Pina Colada Pork Ribs");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
}
if(direction.equalsIgnoreCase("South"))
{
System.out.println(" Prawn Curry\n Spice Chicken 65\n Andhra Chilli Chicken Recipie\n ApploFish Fry");
System.out.println(" Upma\n Idli Sambhar\n Paper Dosa\n Mysore Dosa\n Egg Curry"); ;
System.out.println(" Rasam Rice\n Veg Hyderabadi Biryani\n Dum Biryani\n Awadhi ChickenBiryani");
System.out.println(" Chicken Mix Mutton Prawn Butter Masala\n Chicken Chettinand\n MuttonKabab");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
}
if(direction.equalsIgnoreCase("East"))
{
System.out.println(" Smoked Pork\n Bamboo Steamed Fish\n Nga Atoiba Thongba\n FishTenga");
System.out.println(" Khar\n Kumurat diya Hanhor Mangxo\n Pitha\n Iromba\n Vawksa Rep\nSanpiau");
System.out.println(" Jadoh\n Tungtap\n Gyathuk\n Chikhvi\n Zan");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
}
if(direction.equalsIgnoreCase("West"))
{
System.out.println(" Undhiyu puri\n undhiyu puri\n Malvani Masala\n Malvani Biryani withPrawns");
System.out.println(" Muthiya\n Patra\n Jalebi Fafda\n Khichadi Curry\n Misal Pav\n Pav Bhaji\nVada Pav");
System.out.println(" Pitla Bhakri\n Dal Dhokli\n Agri Cuisine\n Bebinca\n Methi Thepla\nShrikhand");
System.out.println(" Kolhapuri Chicken/Mutton with Bhakri\n Mutton Lonche\n Kombdi Vada\nKhaman Dhokla");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
}
}
else if(g-v == 2 && n == -1)
{
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
System.out.println("You have opted for veg food");
System.out.println("You will be able to enjoy the following delicacies during the tour:");
//Displaying non - veg food items the user will have according to the package
if(direction.equalsIgnoreCase("North"))
{
System.out.println(" Paneer Tikka With Putter Kulcha\n Chlole Bhature\n Gobi Paratha\n PaneerParatha");
System.out.println(" Momos\n Kathi Roll\n Punjabi Chaat");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
}
if(direction.equalsIgnoreCase("South"))
{
System.out.println(" Upma\n Idli Sambar\n Paper Dosa\n Mysore Dosa\n Capsicum Chinese VegDosa");
System.out.println(" Onion Butter Uttapam\nAppe with Chatni\n Cheese Tomato Dosa with Redchutney");
System.out.println(" Rasam Rice\n Veg Hyderabadi Biryani\n Dum Biryani");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
}
if(direction.equalsIgnoreCase("East"))
{
System.out.println(" Khar\n Kumurat diya Hanhor Mangxo\n Pitha\n Iromba\n Vawksa Rep\nSanpiau");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
}
if(direction.equalsIgnoreCase("West"))
{
System.out.println(" Undhiyu puri\n undhiyu puri\n Kathiawadi Mirchi Besan With Rotla\n KhamanDhokla");
System.out.println(" Muthiya\n Patra\n Jalebi Fafda\n Khichadi Curry\n Misal Pav\n Pav Bhaji\nVada Pav");
System.out.println(" Pitla Bhakri\n Dal Dhokli\n Bombay Duct\n Bebinca\n Methi Thepla\nShrikhand");
System.out.println(" Gatte Ki Sabzi\n Ghewar");
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");

}
}
else
{
System.out.println("Please enter appropriate choice");
food();//Calling food method again
}
System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________");
System.out.println("\n \nPRESS 1 TO MOVE FORWARD TO MAKE YOUR BILL");
//Declaring and initialising local variables
int i = sc.nextInt();
boolean isValid = false;
while(!isValid)
{
if(i == 1)
{
isValid = true;
System.out.println("\u000c");//Clearing the screen
check();
}
else
{
System.out.println("PRESS 1 TO MOVE FORWARD TO MAKE YOUR BILL");
i = sc.nextInt();
}
}
}

   
   public void password() {
    Scanner sc = new Scanner(System.in);
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("To pay the bill, please create a unique Voyage Ventures account.");
    System.out.println("We assure you that our website is certified and your account is for security purposes only.");
    System.out.println("Please enter the name of the account holder:");
    String name = sc.nextLine();
    System.out.println("Please enter a password:");
    String paswd = sc.nextLine().trim();

    boolean isValid = false;
    char ch;
    int count_char = 0;
    int ch_ascii;
    int count_num = 0;
    int count_sp = 0;
    int count_alpha_small = 0;
    int count_alpha_big = 0;

    while (!isValid) {
        count_char = 0;
        count_alpha_small = 0;
        count_num = 0;
        count_sp = 0;
        count_alpha_big = 0;

        for (int i = 0; i < paswd.length(); i++) {
            ch = paswd.charAt(i);
            ch_ascii = (int) ch;

            if ((ch_ascii >= 33 && ch_ascii <= 47) || (ch_ascii >= 58 && ch_ascii <= 64) || (ch_ascii >= 91 && ch_ascii <= 95) || (ch_ascii >= 123 && ch_ascii <= 126)) {
                count_char++;
            } else if (ch_ascii >= 48 && ch_ascii <= 57) {
                count_num++;
            } else if (ch_ascii >= 97 && ch_ascii <= 122) {
                count_alpha_small++;
            } else if (ch_ascii >= 65 && ch_ascii <= 90) {
                count_alpha_big++;
            } else if (ch_ascii == 32) {
                count_sp++;
            }
        }

        if (paswd.length() < 8) {
            System.out.println("Please re-enter your password with at least eight characters:");
            paswd = sc.nextLine().trim();
        } else if (count_sp >= 1) {
            System.out.println("Please re-enter your password with no spaces:");
            paswd = sc.nextLine().trim();
        } else if (count_char < 1) {
            System.out.println("Please re-enter your password with at least one special character:");
            paswd = sc.nextLine().trim();
        } else if (count_num < 1) {
            System.out.println("Please re-enter your password with at least one number:");
            paswd = sc.nextLine().trim();
        } else if (count_alpha_small < 1) {
            System.out.println("Please re-enter your password with at least one lowercase alphabet:");
            paswd = sc.nextLine().trim();
        } else if (count_alpha_big < 1) {
            System.out.println("Please re-enter your password with at least one uppercase alphabet:");
            paswd = sc.nextLine().trim();
        } else {
            isValid = true;
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\u000c");
    }
}

    public void bill()// to display the user's bill
    {
        System.out.print("\u000c"); // clearing the screen
        int i=0;do
        {
            i++;
        }while(i>10);
        System.out.println("________________________________________________________________________________________________________________________________________________________ _______________________________");
        System.out.println("\t \t \t \t \t ***BOOKING RECEIPT***");
        System.out.println("________________________________________________________________________________________________________________________________________________________ _______________________________");System.out.println("MOBILE NUMBERS :\n \t"+phno1+"\n \t"+phno2);System.out.println("EMAIL ID : "+email);System.out.println("-------------------------------------------------------------------------------------------");System.out.println("Names of Travellers\t \t \t \t |\t \t \t Age of Travellers");for(i=0;i<passno;i++){System.out.println(i+1+") "+name[i]+"\t \t \t \t |\t \t \t"+age[i]);}System.out.println("TOTAL COST = RS."+ppp*passno);System.out.println("PACKAGE YOU HAVE CHOSEN : "+pack_name+" "+d_and_n);if(passno<8){nongrp_discount();System.out.println("-------------------------------------------------------------------------------------------");System.out.println("TOTAL BILL AMOUNT AFTER DISCOUNT = RS."+tot_cost);}else{grp_discount();System.out.println("");System.out.println("TOTAL BILL AMOUNT AFTER DISCOUNT = RS."+tot_cost);}tot_cost=tot_cost+0.18*tot_cost;System.out.println("Final Amount including GST(18%):-"+tot_cost);
        System.out.println("________________________________________________________________________________________________________________________________________________________ _______________________________");try{Thread.sleep(5000);// for
                                                                                                                                                      // wait
                                                                                                                                                      // effect
        }
        catch(InterruptedException e)
    {
    }System.out.println("\u000c");// clearing the screen
    }

    public void payment_date()// To display the date of payment
    {
        System.out.println("If you want to pay now enter \'now\' ");
        System.out.println("If you want to pay before 30 days of departure enter \'later\'");
        System.out.println(
                "If you want to pay the bill in instalments enter \'instalments\'(ONLYAPPLICABLE IF PRE-BOOKING IS DONE MINIMUM 3 MONTHS PRIOR)");
        // Creating object of the Scanner Class
        Scanner sc = new Scanner(System.in);
        String pay_date = sc.nextLine();
        boolean isValid = false;
        while (!isValid) {
            if (pay_date.trim().equalsIgnoreCase("now")) {
                tot_cost = tot_cost - tot_cost * 0.02;
                isValid = true;
                bill();// Calling
                       // bill
                       // method
                System.out.println("Congratulations! You have gotten an instant payment discount of 2%");
                payment();// calling
                          // payment
                          // method
            } else if (pay_date.trim().equalsIgnoreCase("later")) {
                isValid = true;
                bill();// calling bill method
                System.out.println("YOU WILL HAVE TO PAY AN ADVANCE OF Rs." + tot_cost / 2 + " NOW");
                System.out.print("YOU WILL HAVE TO PAY THE OTHER HALF OF Rs.:" + tot_cost / 2);
                if (month.equalsIgnoreCase("January")) {
                    if (date == 5) {
                        System.out.println(" ON 6TH DECEMBER " + --year);
                        year++;// to
                               // nullify
                               // the
                               // --year
                               // done
                               // in
                               // previous
                               // statement
                    } else if (date == 10) {
                        System.out.println(" ON 11TH DECEMBER " + --year);

                        year++;// to nullify the --year done in previous statement
                    }
                } else if (month.equalsIgnoreCase("April")) {
                    if (date == 20) {
                        System.out.println(" ON 21ST MARCH " + year);
                    } else if (date == 25) {
                        System.out.println(" ON 26TH MARCH " + year);
                    }
                } else if (month.equalsIgnoreCase("May")) {
                    if (date == 10) {
                        System.out.println(" ON 10TH APRIL " + year);
                    } else if (date == 15) {
                        System.out.println(" ON 15TH APRIL " + year);
                    }
                } else if (month.equalsIgnoreCase("October")) {
                    if (date == 12) {
                        System.out.println(" ON 12TH SEPTEMBER " + year);
                    } else if (date == 20) {
                        System.out.println(" ON 20TH SEPTEMBER " + year);
                    }
                } else if (month.equalsIgnoreCase("December")) {
                    if (date == 13) {
                        System.out.println(" ON 13TH NOVEMBER " + year);
                    } else if (date == 20) {
                        System.out.println(" ON 20TH NOVEMBER " + year);
                    }
                }
                payment();// calling
                          // payment
                          // method
            }

            else if (pay_date.trim().equalsIgnoreCase("installments")) {
                isValid = true;
                bill();// calling bill method
                System.out.println("YOU WILL HAVE TO PAY AN ADVANCE OF Rs." + tot_cost / 2 + " NOW");
                System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                if (month.equalsIgnoreCase("January")) {
                    if (date == 5) {
                        System.out.println(" ON 6TH NOVEMBER " + --year);
                        year++;// to
                               // nullify
                               // the
                               // --year
                               // done
                               // in
                               // previous
                               // statement
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 6TH DECEMBER " + --year);
                        year++;// to
                               // nullify
                               // the
                               // --year
                               // done
                               // in
                               // previous
                               // statement
                    } else if (date == 10) {
                        System.out.println(" ON 11TH NOVEMBER " + --year);
                        year++;// to nullify the --year done in
                               // previous statement
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 11TH DECEMBER " + --year);
                        year++;// to
                               // nullify
                               // the
                               // --year
                               // done
                               // in
                               // previous
                               // statement
                    }
                } else if (month.equalsIgnoreCase("April")) {
                    if (date == 20) {
                        System.out.println(" ON 21ST FEBRUARY " + year);
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 21ST MARCH " + year);
                    } else if (date == 25) {
                        System.out.println(" ON 26TH FEBRUARY " + year);
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 26TH MARCH " + year);
                    }
                } else if (month.equalsIgnoreCase("May")) {
                    if (date == 10) {
                        System.out.println(" ON 10TH MARCH " + year);
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 10TH APRIL " + year);
                    }

                    else if (date == 15) {
                        System.out.println(" ON 15TH MARCH " + year);
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 15TH APRIL " + year);
                    }
                } else if (month.equalsIgnoreCase("October")) {
                    if (date == 12) {
                        System.out.println(" ON 12TH AUGUST " + year);
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 12TH SEPTEMBER " + year);
                    } else if (date == 20) {
                        System.out.println(" ON 20TH AUGUST " + year);
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 20TH SEPTEMBER " + year);
                    }
                } else if (month.equalsIgnoreCase("December")) {
                    if (date == 13) {
                        System.out.println(" ON 13TH OCTOBER " + year);
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 13TH NOVEMBER " + year);
                    } else if (date == 20) {
                        System.out.println(" ON 20TH OCTOBER " + year);
                        System.out.print("YOU WILL HAVE TO PAY THE OTHER ONE FOURTH OF Rs.:" + tot_cost / 4);
                        System.out.println(" ON 20TH NOVEMBER " + year);
                    }
                }
                payment();
            } else {
                System.out.println("Please enter appropriate choice");
                pay_date = sc.nextLine();
                isValid = false;
            }
        }
        System.out.println("Your transaction is being processed.Please wait");
        long i = 0;
        try

        {
            Thread.sleep(5000);// for wait effect
        } catch (InterruptedException e) {
        }
        System.out.println(
                "________________________________________________________________________________________________________________________________________________________ _______________________________");
        System.out.println("AMOUNT RECEIVED.THANK YOU.");
        System.out.println(
                "________________________________________________________________________________________________________________________________________________________ _______________________________");
        try {
            Thread.sleep(5000);// for
                               // wait
                               // effect
        } catch (InterruptedException e) {
        }
    }

    public void payment()// to ask the user how would he like to make the payment
    {
        String pay_method, upi_method, emoney_method, net_method;
        // Creating object of the Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the online payment options from the following:");
        System.out.println(" 1] UPI");
        System.out.println(" 2] NET BANKING");
        System.out.println(" 3] EMONEY TRANSACTION");
        System.out.println(" PLEASE ENTER ONLY THE NAME OF THE OPTION YOU CHOOSE");
        // declaring and initialising local variables
        pay_method = sc.nextLine();
        boolean isValid = false;
        String otp_st = "";
        int otp_int = 0;
        if (pay_method.equalsIgnoreCase("UPI")) {
            System.out.println(" Choose the UPI payment options from the following:");
            System.out.println("\t 1] GPAY");
            System.out.println("\t 2] AMAZON PAY");
            System.out.println("\t 3] PAYTM");
            System.out.println("\t 4] PHONE PE");
            System.out.println("\t 5] BHIM PAY");
            System.out.println("\t 6] MOBIKWIK");
            System.out.println("PLEASE ENTER ONLY THE NAME OF THE OPTION YOU CHOOSE");
            upi_method = sc.nextLine();

            upi_method = upi_method.trim();// removing spaces before and after first character if any
            isValid = false;
            while (!isValid) {
                if (upi_method.equalsIgnoreCase("GPAY") || upi_method.equalsIgnoreCase("AMAZON PAY")
                        || upi_method.equalsIgnoreCase("PAYTM") || upi_method.equalsIgnoreCase("PHONE PE")
                        || upi_method.equalsIgnoreCase("BHIM PAY") || upi_method.equalsIgnoreCase("MOBIKWIK")) {
                    System.out.println("Your otp is being generated. Please Wait.");
                    try {
                        Thread.sleep(5000);// for
                                           // wait
                                           // effect
                    } catch (InterruptedException e) {
                    }
                    isValid = true;
                } else {
                    System.out.println("Please enter appropriate choice");
                    upi_method = sc.nextLine();
                    upi_method = upi_method.trim();// removing
                                                   // spaces
                                                   // before
                                                   // and
                                                   // after
                                                   // first
                                                   // character
                                                   // if
                                                   // any
                    isValid = false;
                }
            }
            otp_st = emphno.substring(1, 3).concat(phno2.substring(8, 10));
            otp_int = Integer.valueOf(otp_st);
        } else if (pay_method.equalsIgnoreCase("NET BANKING")) {
            System.out.println(" Choose the E MONEY TRANSACTION payment options from thefollowing:");
            System.out.println("\t 1] NEFT - National Electronic Fund Transfer");
            System.out.println("\t 2] RTGS - Real Time Gross Settlement");
            System.out.println("\t 3] ECS - Electronic Clearing System");
            System.out.println("\t 4] IMPS - Immediate Payment Service");
            System.out.println("PLEASE ENTER ONLY THE NAME OF THE OPTION YOU CHOOSE");
            net_method = sc.nextLine();
            net_method = net_method.trim();// removing
                                           // spaces
                                           // before
                                           // and
                                           // after
                                           // first
                                           // character
                                           // if
                                           // any
            net_method = net_method.toUpperCase();
            isValid = false;
            while (!isValid) {
                if (net_method.startsWith("NEFT") || net_method.startsWith("RTGS") || net_method.startsWith("ECS")
                        || net_method.startsWith("IMPS")) {
                    System.out.println("Your otp is being generated. Please Wait.");

                    isValid = true;
                } else {
                    System.out.println("Please enter appropriate choice");
                    net_method = sc.nextLine();
                    net_method = net_method.trim();// removing
                                                   // spaces
                                                   // before
                                                   // and
                                                   // after
                                                   // first
                                                   // character
                                                   // if
                                                   // any
                    net_method = net_method.toUpperCase();
                    isValid = false;
                }
            }
            otp_st = phno1.substring(3, 5).concat(emphno.substring(7, 9));
            otp_int = Integer.valueOf(otp_st);
        } else if (pay_method.equalsIgnoreCase("EMONEY TRANSACTION")) {
            System.out.println(" Choose the payment options from the following:");
            System.out.println("\t 1] CREDIT CARD");
            System.out.println("\t 2] DEBIT CARD");
            System.out.println("\t 3] SMART CARD");
            emoney_method = sc.nextLine();
            isValid = false;
            while (!isValid) {
                if (emoney_method.equalsIgnoreCase("credit card") || emoney_method.equalsIgnoreCase("debitcard")|| emoney_method.equalsIgnoreCase("smart card"))
                {
                    System.out.println("Your otp is being generated. Please Wait.");
                    isValid = true;
                }
                 else
                  {
                    System.out.println("Please enter appropriate choice");
                    emoney_method = sc.nextLine();
                    isValid = false;
                }
            }
            otp_st = phno2.substring(7, 9).concat(phno1.substring(2, 4));
            otp_int = Integer.valueOf(otp_st);
        } else {
            System.out.println("Please enter the appropriate choice");
            payment();// calling
                      // payment
                      // method
        }
        int i = 0;
        do {

            i++;
        } while (i > 10);
        try {
            Thread.sleep(5000);// for wait effect
        } catch (InterruptedException e) {
        }
        System.out.println("YOUR OTP IS:" + otp_int);
        System.out.println("Please enter the otp:");
        int otp_verify = sc.nextInt();
        isValid = false;
        while (!isValid) {
            if (otp_verify == otp_int) {
                isValid = true;
                System.out.println("Your Bill is being generated.Please wait.");
            } else {
                isValid = false;
                System.out.println("Please enter the correct OTP");
                if (pay_method.equalsIgnoreCase("UPI")) {
                    otp_st = emphno.substring(3, 5).concat(phno1.substring(6, 8));
                } else if (pay_method.equalsIgnoreCase("NET BANKING")) {
                    otp_st = phno1.substring(8, 10).concat(phno2.substring(2, 4));
                } else if (pay_method.equalsIgnoreCase("EMONEY TRANSACTION")) {
                    otp_st = phno2.substring(4, 6).concat(emphno.substring(1, 3));
                }
                otp_int = Integer.valueOf(otp_st);
                System.out.println("YOUR NEW OTP IS : " + otp_int);
                otp_verify = sc.nextInt();
            }
        }
    }

   
   public void check() {
    Scanner sc = new Scanner(System.in);
    System.out.println("____________________________________________________________________");
    System.out.println("Names of Travellers\t \t \t \t \tAge of Travellers");
    System.out.println("-------------------------------------------------------------------------------------------");
    for (int i = 0; i < passno; i++) {
        System.out.println(i + 1 + ") " + name[i] + "\t \t \t \t| \t \t \t" + age[i]);
    }
    System.out.println("-------------------------------------------------------------------------------------------");
    System.out.println("\nIf you think you have entered the name or age of any traveller wrong, please enter YES else enter NO");
    String chk_detail = sc.nextLine();
    boolean isValid = false;
    String correction;
    while (!isValid) {
        if (chk_detail.equalsIgnoreCase("Yes")) {
            isValid = true;
            System.out.print("Please enter 'name' if you have entered the name wrongly, 'age' if age is wrong, or 'name and age' if both are wrong: ");
            correction = sc.nextLine();
            boolean correct = false;
            while (!correct) {
                if (correction.equalsIgnoreCase("name")) {
                    correction_name();
                    correct = true;
                } else if (correction.equalsIgnoreCase("age")) {
                    correction_age();
                    correct = true;
                } else if (correction.equalsIgnoreCase("name and age")) {
                    correction_name();
                    correction_age();
                    correct = true;
                } else {
                    System.out.println("Please enter the appropriate choice");
                    correction = sc.nextLine();
                    correct = false;
                }
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
            System.out.println("\u000c");
            System.out.println("CORRECTED DETAILS");
            System.out.println("-------------------------------------------------------------------------------------------");
            System.out.println("Names of Travellers\t \t \t \t|\t \t \tAge of Travellers");
            for (int i = 0; i < passno; i++) {
                System.out.println(i + 1 + ") " + name[i] + "\t \t \t \t |\t \t \t" + age[i]);
            }
            System.out.println("-------------------------------------------------------------------------------------------");
        } else if (chk_detail.equalsIgnoreCase("No")) {
            isValid = true;
            System.out.println("That's Fantastic. Let's proceed to create a VOYAGE VENTURES account and make the payment...");
        } else {
            isValid = false;
            System.out.println("Please enter appropriate choice: YES or NO");
            chk_detail = sc.nextLine();
        }
    }
}

public void correction_name() {
    Scanner sc = new Scanner(System.in);
    String correction;
    int num;
    int mistake;
    System.out.println("Please enter the number of names that are wrong:");
    mistake = sc.nextInt();
    boolean isValid = false;
    while (!isValid) {
        if (mistake <= passno) {
            isValid = true;
        } else {
            System.out.println("Please enter an appropriate number");
            mistake = sc.nextInt();
        }
    }
    for (int i = 1; i <= mistake; i++) {
        System.out.println("Please enter the number of the traveller whose name has been wrongly entered:");
        num = sc.nextInt();
        isValid = false;
        while (!isValid) {
            if (num <= passno) {
                isValid = true;
            } else {
                System.out.println("Please enter an appropriate number.");
                num = sc.nextInt();
            }
        }
        sc.nextLine();
        System.out.println("Enter the correct name:");
        name[num - 1] = sc.nextLine();
    }
}

public void correction_age() {
    Scanner sc = new Scanner(System.in);
    String correction;
    int num;
    int mistake;
    System.out.println("Please enter the number of ages that are wrong:");
    mistake = sc.nextInt();
    boolean isValid = false;
    while (!isValid) {
        if (mistake <= passno) {
            isValid = true;
        } else {
            System.out.println("Please enter an appropriate number");
            mistake = sc.nextInt();
        }
    }
    for (int i = 1; i <= mistake; i++) {
        System.out.println("Please enter the number of the traveller whose age has been wrongly entered:");
        num = sc.nextInt();
        isValid = false;
        while (!isValid) {
            if (num <= passno) {
                isValid = true;
            } else {
                System.out.println("Please enter an appropriate number.");
                num = sc.nextInt();
            }
        }
        sc.nextLine();
        System.out.println("Enter the correct age:");
        age[num - 1] = sc.nextInt();
    }
}
    public void precautions() {
        int i = 0;
        do {
            i++;
        } while (i > 1000);// for wait effect
        System.out.println("\u000c");// clearing screen
        System.out.println(
                "________________________________________________________________________________________________________________________________________________________ _______________________________");
        System.out.println("Thank you for showing trust in voyage ventures tours and travels.");
        System.out.println(
                "We will try our best to make the journey luxurious, fascinating, adventurousand a memorable one.");
        System.out.println("\n \n \t \t \t*PRECAUTIONS TO BE TAKEN THROUGHOUT THE TRIP*");
        System.out.println("1. Clean your hands often. Use soap and water, or an alcohol-based handrub.");
        System.out.println("2. Maintain a safe distance from anyone who is coughing or sneezing.");
        System.out.println("3. Wear a mask when physical distancing is not possible.");
        System.out.println("4. Don’t touch your eyes, nose or mouth.");
        System.out.println("5. Cover your nose and mouth with your bent elbow or a tissue when youcough or sneeze.");
        System.out.println("5. Stay at home if you feel unwell.");
        System.out.println("6. If you have a fever, cough and difficulty breathing, seek medicalattention.");

        System.out.println(
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("\n \n~WE WISH YOU A VERY HAPPY AND SAFE JOURNEY.");
        System.out.println("WE HOPE THAT THIS JOURNEY REFRESHES AND ENLIGHTENSYOURS AND YOUR LOVED ONES MIND.");
        System.out.println(
                "~PLEASE FEEL FREE AND DROP YOUR COMPLAINTS ANDSUGGESTIONS IN THE OFFICIAL PAGE OF THE WEBSITE.");

        System.out.println(
                "~YOUR SUGGESTIONS ARE VERY VALUABLE AND IT WILL HELP US TOIMPROVISE OR ALTER OUR PLANS ACCORDINGLY.");
        System.out.println("\n \n THANKYOU \n \n REGARDS\n VOYAGE VENTURES TOURS ANDTRAVELS");
        System.out.println(
                "________________________________________________________________________________________________________________________________________________________ _______________________________");
    }
}// closing class

class North extends TourPackage {
    public void packages()// To display packages of north India
    {
        System.out.println("North India is a destination pulsating with extraordinary attractions.");
        System.out
                .println("North India tours present fascinating attractions like adventure,scenic beautyand wildlife.");
        System.out.println(
                "________________________________________________________________________________________________________________________________________________________ _______________________________");
        System.out.println("\n \n1. CAPTIVATING NAINITAL PACKAGE - 5 Days 4 Nights");
        System.out.println(" Day 1: Kathgodam - Haldwani ");
        System.out.println(" Day 2: Nainital and Bhimtal - Boating and Water Sports ");
        System.out.println(" Day 3: Naina Devi Temple, Tiffin Top and Himalayan View Point");
        System.out.println(" Day 4: Ranikhet and Jim Corbett National Park ");
        System.out.println(" Day 5: Shopping - Mall Road and Tibetan Market");
        System.out.println("\n \n2. UTTARAKHAND TOUR PACKAGE - 5 Days 4 Nights");
        System.out.println(" Day 1: Rishikesh, Lakshman Jhula and Bhoothnath Temple");
        System.out.println(" Day 2: Haridwar and Ganga Darshan");
        System.out.println(" Day 3: Mussoorie - Kempty Falls");
        System.out.println(" Day 4: Mussoorie - Dhanaulti and Company Garden");
        System.out.println(" Day 5: Shri Mata Mansa Devi Temple and Chandi Devi Temple andshopping");
        System.out.println("\n \n3. DELHI PUNJAB PACKAGE - 3 Days 2 Nights");
        System.out.println(" Day 1: Chandigarh - Rock Garden and Sukhna Lake");
        System.out.println(" Day 2: Amritsar - Golden Temple, Jallianwala Bagh and Wagah Border");
        System.out.println(" Day 3: Partition Museum, Akal Takht and Moti Bagh");
        System.out.println("\n \n4. MESMERISING KASHMIR PACKAGE - 3 Days 2 Nights");
        System.out.println(" Day 1: Srinagar Gardens and Gulmarg");
        System.out.println(" Day 2: Amarnath Temple ");
        System.out.println(" Day 3: Kupwara, Rafting and Skiing and Shalimar Gardens ");
        System.out.println("\n \n5. EXOTIC HIMACHAL PACKAGE - 5 Days 4 Nights");
        System.out.println(" Day 1: Kufri Hill Station and Ridge Maidan ");
        System.out.println(" Day 2: Rohtang Pass, Kothi George and Gulaba");
        System.out.println(" Day 3: Chamunda Devi Temple and Buddhist Monastery Temple");
        System.out.println(" Day 4: Dharmashala and Khajjiar");
        System.out.println(" Day 5: Rose Garden, Rock Garden and Shopping at Gandhi Chowk");

        System.out.println(
                "________________________________________________________________________________________________________________________________________________________ _______________________________");
    }
}

class South extends TourPackage {
    public void packages()// To display packages of south India
    {
        System.out.println("South India is the custodian of an astonishing fragment of the country.");
        System.out
                .println("South India tours present fascinating attractions like adventure,scenic beautyand wildlife.");
        System.out.println(
                "________________________________________________________________________________________________________________________________________________________ _______________________________");
        System.out.println("\n \n1. DAZZLING ANDAMAN AND NICOBAR PACKAGE - 5 Days 4Nights");
        System.out.println(" Day 1: Cellular Jail, Light and Sound Show and Havelock Island");
        System.out.println(" Day 2: Elephant Beach, Neil Island and Port Blair");
        System.out.println(" Day 3: Ross Island, Baratang Island Day Trip and National Park Mt.Harriet");
        System.out.println(" Day 4: Scuba Diving at Radhanagar Beach");
        System.out.println(" Day 5: Rajiv Gandhi water sports and Rutland Island");
        System.out.println("\n \n2. ENGROSSING OOTY MYSORE PACKAGE - 4 Days 3 Nights");
        System.out.println(" Day 1: Rose garden and Doddabetta Peak");
        System.out.println(" Day 2: Boating - Ooty Lake and Emerald Lake");
        System.out.println(" Day 3: Deer Park and Mysore Palace");
        System.out.println(" Day 4: Mysore Zoo and Brindavan Gardens");
        System.out.println("\n \n3. RIVETING KERALA KANYAKUMARI PACKAGE - 4 Days 3 Nights");
        System.out.println(" Day 1: Eravikulam National Park and Varkala Beach");
        System.out.println(" Day 2: Cherai Beach and Athirappilly Water Falls");
        System.out.println(" Day 3: Mattupetty Dam and Atukkad Waterfalls ");
        System.out.println(" Day 4: Kanyakumari Beach, Swami vivekananda rock memorial andThiruvalluvar Statue");
        System.out.println("\n \n4. TIRUPATI RAMESHWARAM TOUR PACKAGE - 4 Days 3 Nights ");
        System.out.println(" Day 1: Pamban Bridge and Sri Venkateswara National Park");
        System.out.println(" Day 2: Chandragiri Fort and Sri Venkateswara Swamy Vaari Temple");
        System.out.println(" Day 3: Arulmigu Ramanathaswamy Temple and Rameswaram Ariya VysyaNagaraja Temple");
        System.out.println(" Day 4: Dr. A.P.J. Abdul Kalam Memorial and Rameshwaram temple");
        System.out.println("\n \n5. DAZZLING HYDERABAD PACKAGE - 7 Days 6 Nights ");
        System.out.println(" Day 1: Charminar, Golconda Fort and Ramoji Film City");
        System.out.println(" Day 2: Hussain Sagar Lake and Jala Vihar");
        System.out.println(" Day 3: Chowmahalla Palace and Lumbini Park");
        System.out.println(" Day 4: Tank Bund and Adventures At Snow World");
        System.out.println(" Day 5: Durgam Cheruvu, Shilparamam and Shopping At Laad Bazaar");
        System.out.println(" Day 6: Chilkur Balaji Temple and Taj Falaknuma Palace");

        System.out.println(" Day 7: Gandipet Lake and Mecca Masjid");
        System.out.println(
                "________________________________________________________________________________________________________________________________________________________ _______________________________");
    }
}

class East extends TourPackage {
    public void packages()// To display packages of east India
    {
        System.out.println("East India is blessed with natural beauty, lush greenery, majestic sights and aunique culture.");
        System.out.println("East India tours present fascinating attractions like adventure,scenic beautyand wildlife.");
        System.out.println("________________________________________________________________________________________________________________________________________________________ _______________________________");
        System.out.println("\n \n1. HEAVENLY SIKKIM PACKAGE - 4 Days 3 Nights");
        System.out.println(" Day 1: Tsomgo Lake and Nathula Pass");
        System.out.println(" Day 2: Gangtok Ropeway and Zuluk");
        System.out.println(" Day 3: Yumthang Valley and Ravangla");
        System.out.println(" Day 4: Namchi and Pelling");
        System.out.println("\n \n2. WINSOME ASSAM MEGHALAYA PACKAGE - 5 Days 4 Nights");
        System.out.println(" Day 1: Shillong - Cherrapunji and Mawsynram");
        System.out.println(" Day 2: Elephant Falls and Umiam lake");
        System.out.println(" Day 3: East Khasi Hills and Living Root Bridges");
        System.out.println(" Day 4: Mawlynnong and Dwaki");
        System.out.println(" Day 5: Krang Suri Falls");
        System.out.println("\n \n3. RAVISHING NORTH EAST PACKAGE - 6 Days 5 Nights");
        System.out.println(" Day 1: Kohima War Cemetery and Dimapur");
        System.out.println(" Day 2: Mokokchung and Mon");
        System.out.println(" Day 3: Loktak Lake and Kangla Fort");
        System.out.println(" Day 4: Shri Govindjee Temple and INA Museum");
        System.out.println(" Day 5: Kailashahar Temple and Ujjayanta Palace ");
        System.out.println(" Day 6: Umamaheshwar Temple and Jagannath Temple");
        System.out.println("\n \n4. ODISHA TOUR PACKAGE - 5 Days 4 Nights");
        System.out.println(" Day 1: Architecture at Bhubaneswar and Puri's Sand Art");
        System.out.println(" Day 2: Ancient Temples at Konark and The Vintage City- Cuttack ");
        System.out.println(" Day 3: Mythological Treasures Bargarh and Jeypore Waterfall");
        System.out.println(" Day 4: Barbil Waterfall, Paradip Sea Port and Rourkela");
        System.out.println(" Day 5: Sambalpur, Chilika Lake and Chandipur");
        System.out.println("\n \n5. EXHILARATING KOLKATA PACKAGE - 3 Days 2 Nights");
        System.out.println(" Day 1: Victoria Memorial, Fort William and Belur Math");
        System.out.println(" Day 2: Howrah Bridge, Birla Planetarium and Marble Palace Museum");
        System.out.println(" Day 3: St. Paul's Cathedral, Eden Gardens and Rabindra Sarovar");
        System.out.println("________________________________________________________________________________________________________________________________________________________ _______________________________");
    }
}

class West extends TourPackage {
    public void packages()// To display packages of west India
    {
        System.out.println("West India is blessed with amazing sandy beaches, majestic sights and richculture.");
        System.out.println("West India tours present fascinating attractions like adventure,scenic beautyand wildlife.");
        System.out.println("________________________________________________________________________________________________________________________________________________________ _______________________________");
        System.out.println("\n \n1. ENCHANTING GUJARAT PACKAGE - 4 Days 3 Nights");
        System.out.println(" Day 1: Akshardham Temple and Sarita Uddyan");
        System.out.println(" Day 2: Dandi Kutir and Indroda Nature Park");
        System.out.println(" Day 3: Sabarmati Ashram, Kankaria Lake and Science City");
        System.out.println(" Day 4: Gir National Park and Nalsarovar Bird Sanctuary");
        System.out.println("\n \n2. GANDHINAGAR DWARKA TOUR PACKAGE - 5 Days 4 Nights");
        System.out.println(" Day 1: Dwarkadhish Temple and Chaukalya Style of Architecture");
        System.out.println(" Day 2: Nageshwar Temple and Dwarka Beach");
        System.out.println(" Day 3: Bet Dwarka, Hanuman Dandi and Dwarka Lighthouse");
        System.out.println(" Day 4: Rukmani Devi Temple and Gopi Talav");
        System.out.println(" Day 5: Gomti Ghat and Sudama Setu");
        System.out.println("\n \n3. ROYAL RAJASTHAN TOUR PACKAGE - 5 Days 4 Nights ");
        System.out.println(" Day 1: Amer Fort, Jal Mahal and Hawa Mahal");
        System.out.println(" Day 2: Nahargarh Fort and Jaisalmer Fort");
        System.out.println(" Day 3: Sam Sand Dunes and Desert Camping");
        System.out.println(" Day 4: Patwon - Ki - Haveli and Gadisar lake");
        System.out.println(" Day 5: Mount Abu and City Palace");
        System.out.println("\n \n4. SPELLBINDING MUMBAI LONAVALA PUNE PACKAGE - 4 Days 3Nights");
        System.out.println(" Day 1: Gateway of India and Elephanta Caves");
        System.out.println(" Day 2: National Park and Juhu Beach");
        System.out.println(" Day 3: Bhushi Dam and Lion point");
        System.out.println(" Day 4: Shaniwar Wada, Aga Khan palace and Parvati Hills");
        System.out.println("\n \n5. FUN 'N' FROLIC GOA PACKAGE -3 Days 2 Nights");
        System.out.println(" Day 1: Basilica of Bom Jesus and Fort Aguada");
        System.out.println(" Day 2: Dudhsagar Waterfalls and Spice plantations");
        System.out.println(" Day 3: Calangute Beach and Water Adventures");
        System.out.println("________________________________________________________________________________________________________________________________________________________ _______________________________");
    }

}