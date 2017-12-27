package SOLID.LiskovSubstitutionPrincipleLSP.wrong.figures;

public class Rectangle {
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

    public int getArea(){
        return width * heigth;
    }

}
