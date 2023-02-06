package inheritance.shapes;

public class Square extends Shape{
    int height;
    int width;

    public Square(int height, int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateArea(){
        System.out.println("The area is 54");
    }

    @Override
    public void calculatePeremiter() {
        System.out.println((2 * height) + (2 * width));
    }
}
