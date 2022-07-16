package linked.list.challenge.tim;

public class SongTim {
    private String title;
    private double duration;

    public SongTim(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
