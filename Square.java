package home_made_01;

public class Square extends Regtangle{
    public Square(int side){
        super(side, side);
    }
    @Override
    // Площадь квадрата.
    public double calculateArea(int side, int width){
        return side*side;
    }
    public int getSide(){
        return getLength();
    }

}
