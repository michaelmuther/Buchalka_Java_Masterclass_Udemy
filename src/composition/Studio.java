package composition;

public class Studio {

    private Desk desk = new Desk();
    private Balcony balcony = new Balcony();
    private Television television = new Television();

    public Studio(Desk desk, Balcony balcony, Television television) {
        this.desk = desk;
        this.balcony = balcony;
        this.television = television;
    }

    public void study(String subject) {
        desk.cleanDesk();
        System.out.println("Begin studying: " + subject + ".");
    }

    public void relax(int minutes) {
        balcony.doorIsOpen = true;
        System.out.println("Sit out on the balcony for " + minutes + " minutes.");
    }

    public void watchStreaming(String seriesTitle) {
        System.out.println("Watch " + seriesTitle + " on channel " + television.getChannel() + " and chill.");
    }

    public Desk getDesk() {
        return desk;
    }

    public Balcony getBalcony() {
        return balcony;
    }

    public Television getTelevision() {
        return television;
    }
}
