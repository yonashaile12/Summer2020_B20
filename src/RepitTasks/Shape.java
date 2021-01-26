package RepitTasks;
class Rectangle extends Shape{

    @Override
    public void Area() {
        length = 15;
        width = 12;
        Area();
    }

    @Override
    public void Perimeter() {

    }
}

class Circle extends Shape{

    @Override
    public void Area() {

    }

    @Override
    public void Perimeter() {

    }
}

class Square extends Shape{

    @Override
    public void Area() {

    }

    @Override
    public void Perimeter() {

    }
}

interface volume{
    void calcVolume();
}
class Cube extends Shape implements volume{

    @Override
    public void Area() {

    }

    @Override
    public void Perimeter() {

    }

    @Override
    public void calcVolume() {

    }
}
public  class Shape {
    int length;
    int width;
    int radius;

    public void Area(){
        System.out.println(length* width);
    }
    public void Perimeter(){
        System.out.println(length* width * 2);
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.Area();
    }
}
