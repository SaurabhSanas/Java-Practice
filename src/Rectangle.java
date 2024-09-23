public class Rectangle {
    private double width;
    private double height;

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
        System.out.println(getClass().getName());
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void area() {
        System.out.println("Area of " + getClass().getName() + " is: " +  (getWidth() * getWidth())) ;
    }

    public void perimeter() {
        System.out.println("Perimeter of " + getClass().getName() + " is: " + ( (2* getWidth()) +
                (2* getWidth()) ) );
    }
}