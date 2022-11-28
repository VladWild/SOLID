package SOLID._4_InterfaceSegregationPrinciplISP.wrong.subject;

public class Senior extends Employee implements IEmployee {

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
