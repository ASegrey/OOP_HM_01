/* 
Создайте иерархию классов для представления различных геометрических фигур. 
Каждая фигура должна иметь 
    метод для вычисления площади (calculateArea) и 
    метод для вычисления периметра (calculatePerimeter). 
Реализуйте следующие фигуры:

Круг (Circle):
Свойства: радиус (radius).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно.

Прямоугольник (Rectangle):
Свойства: длина (length) и ширина (width).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно.

Квадрат (Square), который является подклассом прямоугольника:
Свойства: сторона (side).
Методы: calculateArea и calculatePerimeter для вычисления площади и периметра соответственно. 

И переопределите методы родительского класса, чтобы они соответствовали квадрату.
Формат сдачи:
Ссылка на гитхаб проект
Подписать фамилию 
*/
/*
Автономов Сергей Дмитриевич
*/

package home_made_01;

public class Main {
    public static void main(String[] args) {
        Regtangle rectangle = new Regtangle(4, 5);
        System.out.println(rectangle.calculateArea(rectangle.getLength(),rectangle.getWidth()));
        Circle circle = new Circle(5);
        System.out.println(circle.calculateArea(circle.getRadius()));
        Square square = new Square(10);
        System.out.println(square.calculateArea(square.getSide(), square.getSide()));
    }
}
