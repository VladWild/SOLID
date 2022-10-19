package SOLID._3_LiskovSubstitutionPrincipleLSP.correcly.figures;

public class Square implements Shape {
    int width;

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int getArea() {
        return width * width;
    }
}
