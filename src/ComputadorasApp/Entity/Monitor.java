package ComputadorasApp.Entity;

public class Monitor {

    private final int id;
    private String brand;
    private double size;
    private static int countMonitor;

    private Monitor (){
        id= ++ countMonitor;
  }

    public Monitor(String brand, double size) {
        this();
        this.brand = brand;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public static int getCountMonitor() {
        return countMonitor;
    }

    public static void setCountMonitor(int countMonitor) {
        Monitor.countMonitor = countMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
