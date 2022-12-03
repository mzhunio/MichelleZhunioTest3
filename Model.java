import java.awt.*;

public class Model {
    private ShapeChoice shapeChoice = ShapeChoice.Triangle;
    private int shapeSize = 50;
    private Color shapeColor = Color.red;

    public ShapeChoice getShapeChoice() {
        return shapeChoice;
    }

    public int getShapeSize() {
        return shapeSize;
    }

    public Color getShapeColor() {
        return shapeColor;
    }

    public void setShapeChoice(ShapeChoice shapeChoice) {
        this.shapeChoice = shapeChoice;
    }

    public void setShapeSize(int shapeSize) {
        this.shapeSize = shapeSize;
    }

    public void setShapeColor(Color shapeColor) {
        this.shapeColor = shapeColor;
    }
}
