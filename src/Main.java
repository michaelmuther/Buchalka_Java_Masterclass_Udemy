import arrayList_challenge.MobilePhone;

import java.util.Scanner;

public class Main {

    static final Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone();
        boolean menuFlag = true;
        do {
            System.out.println("Mobile phone 3000!");
            System.out.println("1. Quit");
            System.out.println("2. Print all contacts");
            System.out.println("3. Add new contact");
            System.out.println("4. Update existing contact");
            System.out.println("5. Remove contact");
            System.out.println("6. Search/find contact\r");

            int input = s.nextInt();

            switch (input) {
                case 1:
                    System.out.println("1. Quit");
                    menuFlag = false;
                    break;
                case 2:
                    System.out.println("2. Print all contacts");
                    s.nextLine();
                    mobile.printContacts();
                    break;
                case 3:
                    System.out.println("3. Add new contact");
                    s.nextLine();
                    System.out.println("Enter the name:");
                    String nameInput = s.nextLine();
                    if (!mobile.queryContact(nameInput)) {
                        System.out.println("Enter the number:");
                        String numberInput = s.nextLine();
                        mobile.addContact(nameInput, numberInput);
                    } else {
                        System.out.println("Name already exists!");
                    }
                    break;
                case 4:
                    System.out.println("4. Update existing contact");
                    s.nextLine();
                    System.out.println("Enter the name:");
                    String nameInputTwo = s.nextLine();
                    System.out.println("Enter the new name:");
                    String newNameInput = s.nextLine();
                    mobile.modifyName(nameInputTwo, newNameInput);
                    break;
                case 5:
                    System.out.println("5. Remove contact");
                    s.nextLine();
                    System.out.println("Enter the name:");
                    String nameInputRemove = s.nextLine();
                    mobile.removeContact(nameInputRemove);
                    break;
                case 6:
                    System.out.println("6. Search/find contact");
                    s.nextLine();
                    System.out.println("Enter the name:");
                    String nameInputFind = s.nextLine();
                    if(mobile.queryContact(nameInputFind)) {
                        System.out.println("Name found!");
                    } else {
                        System.out.println("Name not found!");
                    }
                    break;
            }
            System.out.println();
        } while (menuFlag);
    }
}

/* Composition:
        Studio studio = new Studio(new Desk(), new Balcony(), new Television());
        studio.study("Java programming");
        studio.relax(15);
        studio.watchStreaming("Obi-Wan");
        studio.getDesk().cleanDesk();
 */

/* Encapsulation:
        Printer printer = new Printer(80, 0, true);
        printer.printPage(5);

 */

/* OOP:
        Hamburger burger = new Hamburger("Hamburger", "Sesame", "beef", 4.99);
        burger.add("cheese");
        burger.add("pickles");
        burger.add("ketchup");
        burger.burgerDescriptionAndPrice();

        Hamburger healthy = new HealthyBurger("beef");
        healthy.add("mayo");
        healthy.add("cheese");
        healthy.add("pickles");
        healthy.add("ketchup");
        healthy.add("sprouts");
        healthy.add("onions");
        healthy.burgerDescriptionAndPrice();

        Hamburger deluxe = new DeluxeBurger("sesame", "beef");
        deluxe.add("mayo");
        deluxe.add("cheese");
        deluxe.add("pickles");
        deluxe.add("ketchup");
        deluxe.add("sprouts");
        deluxe.add("onions");
        deluxe.burgerDescriptionAndPrice();

 */
