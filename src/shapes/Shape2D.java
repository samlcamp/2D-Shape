/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Shape2D is an Abstract Class and acts as a base class for all the 2D shapes
 * which includes Equilateral Triangle, Circle, Rectangle amd Square.
 * Shape2D is a shared common ancestor between the shape classes as each of these classes subclass
 * Shape2D
 */
public abstract class Shape2D {
    // Fields
    protected Point centre;

    // Constructor for 2D shape
    public Shape2D(Point centre){
       this.centre = centre;
    }

    //Method for translating the centre
    public void translate(double dx, double dy){
        centre.translatePoint(dx,dy);
    }

    //Abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract boolean containsPoint(Point point);
    public abstract Point[] getVertices();

}
