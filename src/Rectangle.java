public class Rectangle extends Shape {
    private double width, height;

public Rectangle(){
    super();
    height=0.0;
    width= 0.0;

}
public Rectangle(double w, double h, String c, boolean f){
    super(c,f);
    height=h;
    width= w;
    setColor(c);
    setFilled(f);
}

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
    return height*width;

    }
    public double getPerimeter(){
    return 2*height+ 2*width;
    }

    public String toString(){
    return "The Rectangle has a width of "+ width+ "and a height of "+ height+ super.toString();
    }
}
