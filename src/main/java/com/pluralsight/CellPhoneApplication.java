package com.pluralsight;


import java.util.Scanner;

//main is supposed to assign things for the user
public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new CellPhone();

        System.out.println("What is the serial number?");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();


        myPhone.setSerialNumber(serialNumber);

        //model
        System.out.println("What is the model?:");
        String model = scanner.nextLine();
        myPhone.setModel(model);

        //carrier
        System.out.print("What is the carrier?:");
        String carrier = scanner.nextLine();
        myPhone.setCarrier(carrier);

        //phone number
        System.out.println("What is your phone #?:");
        String phoneNumber = scanner.nextLine();
        myPhone.setPhoneNumber(phoneNumber);

        //owner
        System.out.println("Who is the owner?:");
        String owner = scanner.nextLine();
        myPhone.setOwner(owner);


        myPhone.dial("555-555-5555");

        CellPhone yourPhone = new CellPhone(1221, "iphone", "att", "666-342-0000", "Dalis");
        myPhone.dial(yourPhone);
        yourPhone.dial(myPhone);

    }

    private static void display(CellPhone phone) {
        System.out.println("---------------------");
        System.out.println("CELL PHONE [SN:" + phone.getSerialNumber() + "]");
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Phone Number: " + phone.getPhoneNumber());

    }

}

