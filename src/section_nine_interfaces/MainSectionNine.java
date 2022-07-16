package section_nine_interfaces;

public class MainSectionNine {

    public static void main(String[] args) {
        ITelephone timsPhone = new DeskPhone(1234567);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567);
        timsPhone.answer();

        System.out.println();

        timsPhone = new MobilePhone(2345);
//        timsPhone.powerOn();
        timsPhone.callPhone(2345);
        timsPhone.answer();
    }
}
