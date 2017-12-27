package SOLID.LiskovSubstitutionPrincipleLSP.wrong.figures;

public class Square extends Rectangle {

    @Override
    public void setWidth(int width) {
        this.width = width;
        heigth = width;
    }

    @Override
    public void setHeigth(int heigth) {
        this.heigth = heigth;
        width = heigth;
    }

}
