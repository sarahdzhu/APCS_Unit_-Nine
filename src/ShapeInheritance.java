import java.util.ArrayList;

public class ShapeInheritance {
    public static void main(String[] args) {
         Shape c= new Circle();
        Shape r= new Rectangle();
        Shape t= new Triangle();

   ArrayList<Shape> list= new ArrayList<>();
   list.add(c);
   list.add(r);
   list.add(t);

   for(Shape i: list){
       System.out.println(i.getArea());






    }
}}
