/**
 * This work is marked with CC0 1.0 Universal
 */
package shapes;

/**
 * Class to represent a circle shape - as this is a circle it does not
 * contain any vertices
 */

public abstact class Circle {

    //Fields
    private double radius;

    /**
     * Constructor for Circle shape object
     * @param centre The centre of the circle represented as a Point object
     * @param radius The radius of the circle created
     */
    public Circle(Point centre, double radius) {
        super(centre);
        this.radius = radius;
    }

    //Getters & Setters
    public double getRadius(){
        return this.radius;
    }

    private double setRadius(double radius){
        return this.radius = radius;
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
