package wk10;

public class MyRectangle2D {
    /* ~ Fields ~ */
    private double x;
    private double y;
    private double width;
    private double height;

    /* ~ Constuctors ~ */
    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }
    
    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    /* ~ Setters ~ */
    // Sets the value of X
    public void setX(double x) {
        this.x = x;
    }
    
    // Sets the value of Y
    public void setY(double y) {
        this.y = y;
    }
    
    // Sets the value of width
    public void setWidth(double width) {
        this.width = width;
    }
    
    // Sets the value of height
    public void setHeight(double height) {
        this.height = height;
    }
    
    /* ~ Getters ~ */
    // gets the value of X
    public double getX() {
        return x;
    }
    
    // gets the value of Y
    public double getY() {
        return y;
    }
    
    // gets the value of the height
	public double getHeight() {
        return height;
	}
    
    // gets the value of the width
	public double getWidth() {
        return width;
	}
    
    /* ~ Computations ~ */
    // calculates the area of the rectangle
	public double getArea() {
        return width * height;
	}
    
    // calculates the perimeter of the rectangle
	public double getPerimeter() {
        return 2 * (width + height);
	}

    // Computes the distance of two points 
    private double getDistance(double p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));
    }
    
    /* ~ Booleans ~ */
    // if the 
	public boolean contains(double x, double y) {
        return getDistance(this.y, y) <= height / 2 && getDistance(this.x, x) <= width / 2; 
	}
    
    // 
	public boolean contains(MyRectangle2D r) {
		return getDistance(y, r.getY()) + r.getHeight() / 2 <= height / 2 && getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 && height / 2 + r.getHeight() / 2 <= height && width / 2 + r.getWidth() / 2 <= width;
	}

    // if two rectangles overlap then this method will return true
	public boolean overlaps(MyRectangle2D r) {
		return !contains(r) && ((x + width / 2 > r.getX() - r.getWidth()) || (y + height / 2 > r.getY() - r.getHeight())) && (getDistance(y, r.getY()) < height / 2 + r.getHeight() / 2) && (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
	}


}
