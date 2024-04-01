package ComputadorasApp.Entity;

public class Keyboard extends InputDevice {

    private final int id;
    private static int countKeyboard;

    public Keyboard(String inputDevice, String brand){
        super(inputDevice,brand);
        id=++countKeyboard;

    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "id=" + id +
                '}'+ super.toString();
    }
}
