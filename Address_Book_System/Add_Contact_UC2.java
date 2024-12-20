package Address_Book_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Add_Contact_UC2 {
    public ArrayList<Create_Contact_UC1> contact_list;

    public Add_Contact_UC2() {
        this.contact_list = new ArrayList<>();
    }

    // Getter to return the contact_list
    public ArrayList<Create_Contact_UC1> getContactList() {
        return contact_list;
    }

    public void addContact(Create_Contact_UC1 new_contact){
        contact_list.add(new_contact);
        System.out.println("Contact Added Successfully");
    }

    public void addMultipleContacts() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Do you want to add a contact? (yes/no): ");
            String response = sc.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println("Enter Contact Details:");
            System.out.print("First Name: ");
            String firstName = sc.nextLine();
            System.out.print("Last Name: ");
            String lastName = sc.nextLine();
            System.out.print("Address: ");
            String address = sc.nextLine();
            System.out.print("City: ");
            String city = sc.nextLine();
            System.out.print("State: ");
            String state = sc.nextLine();
            System.out.print("Zip: ");
            String zip = sc.nextLine();
            System.out.print("Phone Number: ");
            String phoneNumber = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();

            Create_Contact_UC1 contact = new Create_Contact_UC1(firstName, lastName, address, city, state, zip, phoneNumber, email);
            addContact(contact);
        }
    }

}
