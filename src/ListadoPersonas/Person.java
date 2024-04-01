package ListadoPersonas;

public class Person {

    private int id;
    private String name;
    private String phone;
    private String email;

    private static int numPeople= 0;

    public Person(String name, String phone, String email) {
        this();
       this.name = name;
        this.email = email;
        this.phone= phone;
    }
    public Person() {
        this.id= ++ Person.numPeople;

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

