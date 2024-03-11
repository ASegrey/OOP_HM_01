package home_made_01;
import  java.lang.Math;

public class Circle extends Figure{
     public Circle(int radius){
        super(0,0,radius);
     }
    // Площадь круга через радиус. S = π × r 2, где r — это радиус, π — это константа
    public double calculateArea(int radius){
        return radius*Math.PI;
    }
}
