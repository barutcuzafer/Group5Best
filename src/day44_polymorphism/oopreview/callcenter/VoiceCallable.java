package day44_polymorphism.oopreview.callcenter;

public interface VoiceCallable {
    boolean CAN_CAL=true;
    void call(String contact);
    public static void decline(){
        System.out.println("Declined the call");

    }
    public default void accept(){
        System.out.println("Accepted the call");

    }
}
