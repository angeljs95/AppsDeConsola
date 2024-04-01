package ComputadorasApp.Entity;

public class Computer {

    private final int id;
    private String name;
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;
    private static int countComputer;

    public Computer() {
        id = ++countComputer;
 }

    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this();
        this.name= name;
        this.monitor= monitor;
        this.keyboard= keyboard;
        this.mouse= mouse;
    }

    @Override
    public String toString() {
        return "Computer{\n" +
                "     id=" + id +
                ",    name='" + name + '\'' +
                ",\n     monitor=" + monitor +
                ",\n     mouse=" + mouse +
                ",\n     keyboard=" + keyboard +
                '}';
    }
}
