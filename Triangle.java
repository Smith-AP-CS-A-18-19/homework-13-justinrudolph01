import java.awt.geom.Rectangle2D;
public class Triangle implements SmithShape{
	private int x;
	private int y;
	private int width;
	private int height;
	private double angle;
  private Rectangle2D rect;

  public Triangle(int x, int y, int width, int height, double angle){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.angle = angle;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y;
  }

  public int getWidth(){
    return width;
  }

  public int getHeight(){
    return height;
  }

  public double getArea(){
    double area = (width * height / 2);
    return area;
  }

  public double getAngle(){
    return angle;
  }

  public Rectangle2D toSquare(){
    rect = new Rectangle2D.Double(x, y, width, height);
    return rect;
  }

  @Override
  public String toString(){
    String result = "Width: " + width;
    result += "\n" + "Height: " + height + "\n" + "Angle: " + angle;
    return result;
  }

}








/* All SmithShape triangles have one edge that is on
 * the horizontal and are defined by the angle (in degrees)
 * of the lower left corner.
 */

/* The constructor for the Triangle object should be as below.
 * You may change the names of the parameters, but their order
 * must remain the same for the assignment to be scored
 * correctly
 */
// public Triangle(int x, int y, int width, int height, double angle)

/* You will need to add a getAngle() method that returns
 * the angle of the triangle
 */

/* Add the method toSquare() to the Triangle class. This creates
 * and returns a new Rectangle2D object. The x and y of the new
 * Rectangle should be the same as the Triangle. The width and
 * height of the Rectangle2D should be the same (it is a square)
 * and the area should be equal to the area of the Triangle
 */

/* Override the method toString(). It should return
 * the String:
 * Width: width
 * Height: height
 * Angle: angle
 * Remember that to insert a new line into a String,
 * use \n
 */
