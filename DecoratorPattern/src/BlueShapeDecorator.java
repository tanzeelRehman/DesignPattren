public class BlueShapeDecorator extends ShapeDecorator {
  public BlueShapeDecorator(Shape shape) {
    super(shape);
  }

  @Override
  public void draw() {
    shape.draw();
    setBlueBorderLine();
  }

  private void setBlueBorderLine() {
    System.out.println("Border Color: Blue");
  }
}
