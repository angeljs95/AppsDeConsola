package ComputadorasApp;

import ComputadorasApp.Entity.*;

public class ShopComputersApp {

    public static void main(String[] args) {
        // Creamos objetos de tipo teclado,mouse,monitor y computador
        //objetos1
        Mouse mouse = new Mouse("Usb", "Dell");
        Monitor monitor = new Monitor("Hp", 15.4);
        Keyboard keyboard = new Keyboard("Usb", "Hp");
        Computer computer1 = new Computer("Maquinon", monitor, keyboard, mouse);
        //objetos2

        Monitor monitorAsus= new Monitor("Asus", 21);
        Mouse mouseAsus= new Mouse("Bluetooh", "Asus");
        Keyboard keyboardHp= new Keyboard("Usb","Hp");
        Computer computer2= new Computer("Maquinita", monitorAsus,keyboardHp,mouseAsus);

        // Creamos el objeto orden
        Order newOrder = new Order();

        newOrder.addComputers(computer1);
        newOrder.addComputers(computer2);
        newOrder.showOrder();


    }
}
