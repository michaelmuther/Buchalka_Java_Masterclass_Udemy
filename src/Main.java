import encapsulation.*;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(80, 0, true);
        printer.printPage(5);
    }
}

/* Composition:
        Studio studio = new Studio(new Desk(), new Balcony(), new Television());
        studio.study("Java programming");
        studio.relax(15);
        studio.watchStreaming("Obi-Wan");
        studio.getDesk().cleanDesk();
 */
