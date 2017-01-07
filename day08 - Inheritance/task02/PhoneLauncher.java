public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
    public void launch() {
        SmartPhone phone = new SmartPhone();

        phone.printLastNumbers();
        phone.call("00123456789");
        phone.printLastNumbers();
        phone.call("223456789");
        phone.call("323456789");
        phone.call("423456789");
        phone.call("523456789");
        phone.call("00623456789");
        phone.call("723456789");
        phone.printLastNumbers();
        phone.call("823456789");
        phone.call("923456789");
        phone.call("993456789");
        phone.call("00999456789");
        phone.call("999956789");
        phone.call("999996789");
        phone.call("999999789");
        phone.call("999999989");
        phone.printLastNumbers();

        phone.ringAlarm("Wake up!");
        phone.playGame("Snake");


        System.out.println(phone.findPosition());
        phone.browseWeb("http://google.co.uk");
    }
}
