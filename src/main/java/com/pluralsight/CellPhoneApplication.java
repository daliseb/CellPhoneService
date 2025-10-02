package com.pluralsight;
//main is supposed to assign things for the user
public class CellPhoneApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CellPhone myPhone = new cellPhone ();

        System.out.println("What is the serial number?");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        

        //myPhone.setSerialNumber(serialNumber);

    }
}
