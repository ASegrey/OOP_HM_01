package home_made_01;

public class Square extends Regtangle{
    public Square(int side){
        super(side, side);
    }
    @Override
    // Площадь квадрата.
    public int calculateArea(int side, int width){
        return side*side;
    }
    @Override 
    public int calculatePerimeter(int side, int width){
        return side*4;
    }  
    public int getSide(){
        return getLength();
    }

}
