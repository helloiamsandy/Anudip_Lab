/*
 A phone directory holds a list of names with a phone number for each name. It is possible to find the number associated with a given name, and to specify the phone number for a given name. 

 [Hint:use a HashMap to store names as keys and phone numbers as values. The user can choose to find a number by providing a name or add a new name with a phone number. The program runs in a loop until the user chooses to exit.]
 */
package Demo;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

/**
 * A simple phone directory application that stores names and phone numbers.
 */
public class PhoneDirectory {

    public static void main(String[] args) {
        // Use a HashMap to store names as keys and phone numbers as values.
        HashMap<String, String> directory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // The program runs in a loop until the user chooses to exit.
        while (true) {
            System.out.println("\n--- ☎️ Phone Directory Menu ---");
            System.out.println("1. Add / Update a Contact");
            System.out.println("2. Find a Phone Number");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice (1-3): ");

            int choice;
            try {
                // Read the user's menu choice.
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Invalid input. Please enter a number.");
                continue; // Skip the rest of the loop and try again.
            }

            switch (choice) {
                case 1:
                    // Specify the phone number for a given name.
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    // The put() method adds a new entry or updates the value if the key already exists.
                    directory.put(name, phoneNumber);
                    System.out.println("✅ Contact for '" + name + "' was added/updated successfully!");
                    break;

                case 2:
                    // Find the number associated with a given name.
                    System.out.print("Enter the name to find: ");
                    String searchName = scanner.nextLine();
                    
                    // The get() method retrieves the value for a given key.
                    String foundNumber = directory.get(searchName);

                    if (foundNumber != null) {
                        System.out.println("📞 Phone number for '" + searchName + "': " + foundNumber);
                    } else {
                        System.out.println("❓ Sorry, the contact '" + searchName + "' was not found.");
                    }
                    break;

                case 3:
                    // Exit the program.
                    System.out.println("Exiting Phone Directory. Goodbye! 👋");
                    scanner.close(); // Good practice to close the scanner.
                    return; // Exits the main method, terminating the program.

                default:
                    System.out.println("❌ Invalid choice. Please select an option from 1 to 3.");
            }
        }
    }
}

/*
Output:
--- ☎️ Phone Directory Menu ---
1. Add / Update a Contact
2. Find a Phone Number
3. Exit
Please enter your choice (1-3): 1
Enter name: Sandy
Enter phone number: 9307195211
✅ Contact for 'Sandy' was added/updated successfully!

--- ☎️ Phone Directory Menu ---
1. Add / Update a Contact
2. Find a Phone Number
3. Exit
Please enter your choice (1-3): 2
Enter the name to find: Sandy
📞 Phone number for 'Sandy': 9307195211

--- ☎️ Phone Directory Menu ---
1. Add / Update a Contact
2. Find a Phone Number
3. Exit
Please enter your choice (1-3): 3
Exiting Phone Directory. Goodbye! 👋

 */
*/