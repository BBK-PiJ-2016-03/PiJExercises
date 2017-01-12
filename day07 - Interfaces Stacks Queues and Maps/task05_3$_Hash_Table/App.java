package task05_3$_Hash_Table;

/**
 * Created by Alexander Worton on 12/01/2017.
 */
public class App {

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        SimpleMap sm = new SimpleMapImpl();

        System.out.println("Empty: " + sm.isEmpty());

        sm.put(0, "Value: 0");
        sm.put(3, "Value: 3");
        sm.put(6, "Value: 6");
        sm.put(9, "Value: 9");

        System.out.println("Empty: " + sm.isEmpty());

        System.out.println(sm.get(6));

        sm.remove(9, "Value: 9");
    }
}
