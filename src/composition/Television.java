package composition;

public class Television {
    private boolean isOn = false;

    private String channel = "Apple+";

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }

}
