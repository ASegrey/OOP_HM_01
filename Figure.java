package home_made_01;

public class Figure {
    private int length;
    private int width;
    private int radius;

    public Figure(int length, int width, int radius){
        this.length = length;
        this.width = width;
        this.radius = radius;
    }

    public int getLength(){
        return length;
    }
    public int getWidth(){
        return width;
    }
    public int getRadius(){
        return radius;
    }

    public setLen(int length){
        this.length = length;
    }
    public setWidth(int width){
        this.width = width;
    }
    public setRadius(int radius){
        this.radius = radius;
    }

}
