package SOLID._3_LiskovSubstitutionPrincipleLSP.correcly;

import SOLID._3_LiskovSubstitutionPrincipleLSP.correcly.figures.Rectangle;
import SOLID._3_LiskovSubstitutionPrincipleLSP.correcly.figures.Square;

public class Main {

    public static void main(String[] args) {
        //создание объекта класса Rectangle и вывод его площади
        Rectangle rect = new Rectangle();
        rect.setWidth(10);
        rect.setHeigth(5);
        System.out.println(rect.getArea());

        //создание объекта класса Square и вывод его площади
        Square rect2 = new Square();
        rect2.setWidth(10);
        System.out.println(rect2.getArea());

    }

}
