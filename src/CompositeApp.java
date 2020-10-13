import java.util.ArrayList;
import java.util.List;

public class CompositeApp {

    public static void main(String[] args) {
   Composite composite = new Composite();
   Composite composite2 = new Composite();
   Composite composite3 = new Composite();

   Circle circle = new Circle();
   Circle circle2 = new Circle();
   Circle circle3 = new Circle();
   Circle circle4 = new Circle();


   composite2.add(circle);
   composite2.add(circle2);
   composite2.add(circle3);
   composite2.add(circle4);




   Square square = new Square();
   Square square2 = new Square();
   Square square3 = new Square();
   Square square4 = new Square();

   composite3.add(square);
   composite3.add(square2);
   composite3.add(square3);
   composite3.add(square4);

   composite.add(composite2);
   composite.add(composite3);


    }
}
interface  Shape {
    void draw();
}


class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println(" Я круг");
    }
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println(" Я квадрат");
    }
}

class  Composite implements  Shape{
List<Shape> composits =  new ArrayList();
void add(Shape shape){
    composits.add(shape);

}
void remove(Shape shape){
    composits.remove(shape);
}


    @Override
    public void draw() {
      for (Shape shape: composits){
          shape.draw();

      }
    }
}

