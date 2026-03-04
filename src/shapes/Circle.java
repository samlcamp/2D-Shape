/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Class to represent a circle shape - as this is a circle it does not
 * contain any vertices
 */

public class Circle  {

    //Fields
    private double radius;
    private double perimeter;
    private double area;



    /**
     * Constructor for Circle shape object
     * @param centre The centre of the circle represented as a Point object
     * @param radius The radius of the circle created
     */
    public Circle(Point centre, double radius) {
        this.Circle = centre, radius;;
    }

    //Getters & Setters
    public double getRadius(){
        return radius;
    }

    private double setRadius(){
        return radius;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public double getArea(){
        return area;
    }

    public Point[] Circle;
    public boolean containsPoint;
    public Point[] getVertices;

}
