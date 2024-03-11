package home_made_01;
import  java.lang.Math;

public class Circle extends Figure{
     public Circle(int radius){
        super(0,0,radius);
     }
    // Площадь круга через радиус. S = π × r 2, где r — это радиус, π — это константа
    public int calculateArea(int radius){
        return (int)(radius*Math.PI);
    }
    public int calculatePerimeter(int radius){
        return (int)(radius*2*Math.PI);
    }
}
