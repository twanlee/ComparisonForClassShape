import javafx.scene.shape.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    double radius; String color; boolean filled;
    public ComparableCircle(){};
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled){
        super(radius);
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    @Override
    public int compareTo(ComparableCircle o){
        if(getRadius() > o.getRadius()) return 1;
        else if(getRadius() < o.getRadius()) return -1;
        else return 1;
    }
}
