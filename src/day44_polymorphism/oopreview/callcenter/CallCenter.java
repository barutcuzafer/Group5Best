package day44_polymorphism.oopreview.callcenter;

public class CallCenter {
    public static void main(String[] args) {
        WhatsApp wa=new WhatsApp();
        wa.launch();
        wa.allOSCompatible=true;
        wa.isFree=true;
        wa.name="WhatsApp";
        wa.call("OZZY");
        wa.sendMessage("Thank you...");
        wa.videoCall();
        wa.accept();
        VoiceCallable.decline();
        System.out.println(VoiceCallable.CAN_CAL);
        VoiceCallable vb=new WhatsApp();
        vb.accept();





    }
}
