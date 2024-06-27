public class DemoShape {
  public static void main(String[] args) {
    Shape rectangle = new Rectangle();
    Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
    Shape blueSquare = new BlueShapeDecorator(new Square());

    System.out.println("rectangle without border");
    rectangle.draw();

    System.out.println("======================================");

    System.out.println("rectangle decorated with  Blue border");
    blueRectangle.draw();

    System.out.println("======================================");
    System.out.println("Square decorated with  Blue border ");
    blueSquare.draw();
  }
}
