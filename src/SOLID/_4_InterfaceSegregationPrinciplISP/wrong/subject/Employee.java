package SOLID._4_InterfaceSegregationPrinciplISP.wrong.subject;

public class Employee {
    private int ID;
    private String Name;

    public Employee(int ID, String name) {
        this.ID = ID;
        Name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
