package encapsulation;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner(int addedToner) {
        tonerLevel += addedToner;
        tonerLevel = Math.min(tonerLevel, 100);
        System.out.println("Toner filled; now at " + tonerLevel + "%.");
    }

    public void printPage(int numberOfPagesToPrint) {
        tonerLevel -= numberOfPagesToPrint;
        numberOfPagesPrinted += numberOfPagesToPrint;
        System.out.println(numberOfPagesToPrint + " pages printed.");
        System.out.println(numberOfPagesPrinted + " pages printed in total.");
        System.out.println("Toner now at " + tonerLevel + "%.");
        if (isDuplex) {
            System.out.println("Duplex printer!");
        } else {
            System.out.println("Not a duplex printer!");
        }
    }
}
