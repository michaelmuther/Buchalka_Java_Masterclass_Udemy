package section_nine_interfaces;

import java.util.Scanner;

public class MainSectionNine {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//
//        btnPrint.setOnClickListener(new ClickListener());
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {

            }
        });
        listen();


//        Tree favoriteTree = new Tree(45, "Pear");
//        Tree.Branch climbingBranch = favoriteTree.new Branch(1000, 10); // you have to have an instance from which to create the inner class.
    }

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0: {
                    quit = true;
                    break;
                }
                case 1: {
                    btnPrint.onClick();
                }

            }
        }
    }
}

/*
        ITelephone timsPhone = new DeskPhone(1234567);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567);
        timsPhone.answer();

        System.out.println();

        timsPhone = new MobilePhone(2345);
//        timsPhone.powerOn();
        timsPhone.callPhone(2345);
        timsPhone.answer();
 */
