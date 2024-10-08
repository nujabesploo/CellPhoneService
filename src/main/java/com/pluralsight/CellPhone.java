package com.pluralsight;
import java.util.Scanner;

public class CellPhone {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    CellPhoneApplication c1 = new CellPhoneApplication();


    System.out.print("What is the serial number? ");
    int serial_number = in.nextInt();
    in.nextLine();
    c1.setSerial_number(serial_number);

    System.out.print("What model is the phone? ");
    String phone_model = in.nextLine();
    c1.setModel(phone_model);

    System.out.print("Who is the carrier? ");
    String carrier = in.nextLine();
    c1.setCarrier(carrier);

    System.out.print("What is the phone number: ");
    String phone_number = in.nextLine();
    c1.setPhoneNumber(phone_number);

    System.out.print("Who is the owner of the phone?: ");
    String owner = in.nextLine();
    c1.setOwner(owner);

    System.out.println("\n-----Welcome to Revive & Thrive Tech Shop!-----\n");

    System.out.println("----Carefully Make Sure Your information is Correct----");

    c1.printCell_Specs();



    }
}
