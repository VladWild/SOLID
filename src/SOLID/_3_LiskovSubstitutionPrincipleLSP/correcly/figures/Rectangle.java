package SOLID._3_LiskovSubstitutionPrincipleLSP.correcly.figures;

public class Rectangle implements Shape {
    int width;
    int heigth;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public int getArea() {
        return width * heigth;
    }
}
