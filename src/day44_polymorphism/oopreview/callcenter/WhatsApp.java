package day44_polymorphism.oopreview.callcenter;

public class WhatsApp extends MessagingApp implements VideoCallable,VoiceCallable {
    @Override
    public void sendMessage(String msg) {
        System.out.println("Messaging "+ msg);

    }

    @Override
    public void videoCall() {
        System.out.println("Video Call ");

    }

    @Override
    public void call(String contact) {
        System.out.println("Calling "+ contact);

    }
}
