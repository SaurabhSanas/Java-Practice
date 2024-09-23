public class Square extends Rectangle{

    Square(double length){
        super(length, length);
    }
    public void perimeter() {
        System.out.println("Perimeter of Square is: " + ( (2* getWidth()) +
                (2* getHeight()) ) ) ;
    }
}
