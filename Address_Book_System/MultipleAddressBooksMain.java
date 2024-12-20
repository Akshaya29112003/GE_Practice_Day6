package Address_Book_System;

import java.util.*;

public class MultipleAddressBooksMain {
    private static Map<String, Add_Contact_UC2> addressBooks = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Multiple Address Books System!");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create New Address Book");
            System.out.println("2. Add Contacts to an Address Book");
            System.out.println("3. Display Contacts in an Address Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the new Address Book: ");
                    String bookName = sc.nextLine();
                    if (addressBooks.containsKey(bookName)) {
                        System.out.println("An Address Book with this name already exists.");
                    } else {
                        addressBooks.put(bookName, new Add_Contact_UC2());
                        System.out.println("Address Book '" + bookName + "' created successfully.");
                    }
                    break;

                case 2:
                    System.out.print("Enter the name of the Address Book to add contacts: ");
                    String targetBook = sc.nextLine();
                    Add_Contact_UC2 addressBook = addressBooks.get(targetBook);
                    if (addressBook != null) {
                        addressBook.addMultipleContacts();
                    } else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the name of the Address Book to display contacts: ");
                    String displayBookName = sc.nextLine();
                    Add_Contact_UC2 displayBook = addressBooks.get(displayBookName);
                    if (displayBook != null) {
                        ArrayList<Create_Contact_UC1> contacts = displayBook.getContactList();
                        if (contacts.isEmpty()) {
                            System.out.println("No contacts found in the Address Book.");
                        } else {
                            System.out.println("Contacts in Address Book '" + displayBookName + "':");
                            for (Create_Contact_UC1 contact : contacts) {
                                System.out.println(contact);
                            }
                        }
                    } else {
                        System.out.println("Address Book not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
