public class Circle extends Shape {

    private double radius;

    public Circle(){
        super();

        radius= 10.0;

    }

    public Circle(double r, String c, boolean f){
        super(c,f);

        radius= r;


    }
    public double getArea(){
        return Math.PI + Math.pow(radius, 2);
        
    }
}
