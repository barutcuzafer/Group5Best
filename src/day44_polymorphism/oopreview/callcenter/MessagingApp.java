package day44_polymorphism.oopreview.callcenter;

public abstract class MessagingApp {
    public String name;
    protected boolean isFree;
    boolean allOSCompatible;
    private static int count;
    public static final String APP_TYPE="Messaging";

    public MessagingApp() {
        System.out.println("Messaging app no arg");

    }

    public MessagingApp(String name,int count) {
        this.name = name;
        MessagingApp.count=count;
    }

    public abstract void sendMessage(String msg);
    public void launch(){
        System.out.println("Messaging ap is launching");

    }
    public static void close(){
        System.out.println("Messaging app is closing");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        MessagingApp.count = count;
    }
}
