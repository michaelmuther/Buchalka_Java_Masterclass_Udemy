package section_nine_interfaces;

public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();

    // private or public is useless in an interface
    // we are creating a contract

}
