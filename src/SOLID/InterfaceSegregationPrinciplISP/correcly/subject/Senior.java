package SOLID.InterfaceSegregationPrinciplISP.correcly.subject;

public class Senior extends Employee implements IOpirationAdd, IOpirationGet{
    public Senior(int ID, String name) {
        super(ID, name);
    }

    @Override
    public boolean addDetails() {
        return false;
    }

    @Override
    public boolean showDetals() {
        return false;
    }
}
