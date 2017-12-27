package SOLID.InterfaceSegregationPrinciplISP.wrong.subject;

public class Junior extends Employee implements IEmployee{
    public Junior(int ID, String name) {
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
