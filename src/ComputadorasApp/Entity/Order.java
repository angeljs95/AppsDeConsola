package ComputadorasApp.Entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int id;
    private final List<Computer> computers;
    private static int countOrderes;

    public Order() {
        computers = new ArrayList<>();
        this.id = ++countOrderes;
    }
// Estos metodos deberian estar en un paquete de servicios, pero al ser pocos los metodos los dejo en el mismo pack
    // de entidades
    public void addComputers(Computer computer){
        computers.add(computer);
    }

    public void showOrder(){
        System.out.println("Order #: "+ id);
        System.out.println("total computers: "+ computers.size());
        System.out.println();
        computers.forEach(System.out::println);
    }
}
