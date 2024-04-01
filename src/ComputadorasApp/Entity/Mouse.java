package ComputadorasApp.Entity;

public class Mouse extends InputDevice{

    private final int id;
    private static int countMouse= 0;

    //Enviamos parametros
    public Mouse( String inputDevice, String brand) {
        super(inputDevice,brand);
         id = ++ countMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "id=" + id +
                '}' + super.toString();
    }
}
