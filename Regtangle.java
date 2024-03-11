package home_made_01;

public class Regtangle extends Figure{
    public Regtangle(int length, int width){
        super(length,width,0);
    }

    // Площадь прямоугольника S = a ∙ b. S – площадь a – длина b – ширина.
    public int calculateArea(int length, int width){
        return length*width;
    }
    public int calculatePerimeter(int length, int width){
        return (length+width)*2;
    }
}
