public class App{
    public static void main(String[] args){
        MobilePhone phone = new MobilePhone();

        phone.printLastNumbers();
        phone.call("123456789");
        phone.printLastNumbers();
        phone.call("223456789");
        phone.call("323456789");
        phone.call("423456789");
        phone.call("523456789");
        phone.call("623456789");
        phone.call("723456789");
        phone.printLastNumbers();
        phone.call("823456789");
        phone.call("923456789");
        phone.call("993456789");
        phone.call("999456789");
        phone.call("999956789");
        phone.call("999996789");
        phone.call("999999789");
        phone.call("999999989");
        phone.printLastNumbers();
    }
}