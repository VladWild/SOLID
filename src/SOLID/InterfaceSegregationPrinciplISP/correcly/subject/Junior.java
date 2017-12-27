package SOLID.InterfaceSegregationPrinciplISP.correcly.subject;

public class Junior extends Employee implements IOpirationAdd{
    public Junior(int ID, String name) {
        super(ID, name);
    }

    @Override
    public boolean addDetails() {
        return false;
    }
}
