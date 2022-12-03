import javax.swing.*;
import java.awt.*;

public class View {
    private final JButton triangleBtn;
    private final JButton rectangleBtn;
    private final JButton circleBtn;

    private final JSlider slider;
    private final JLabel shapeLabel;

    private final JButton redBtn;
    private final JButton yellowBtn;
    private final JButton blueBtn;

    public JButton getTriangleBtn() {
        return triangleBtn;
    }

    public JButton getRectangleBtn() {
        return rectangleBtn;
    }

    public JButton getCircleBtn() {
        return circleBtn;
    }

    public JButton getRedBtn() {
        return redBtn;
    }

    public JButton getYellowBtn() {
        return yellowBtn;
    }

    public JButton getBlueBtn() {
        return blueBtn;
    }

    public JSlider getSlider() {
        return slider;
    }

    public View(int shapeSize, Color color) {
        JFrame frame = new JFrame("Draw Shapes");

        JPanel shapesPanel = new JPanel();
        JPanel contentPanel = new JPanel();
        JPanel shapePanel = new JPanel();
        JPanel colorsPanel = new JPanel();

        triangleBtn = new JButton("Triangle");
        rectangleBtn = new JButton("Rectangle");
        circleBtn = new JButton("Circle");
        slider = new JSlider(JSlider.VERTICAL, 20, 300, 20);
        shapeLabel = new JLabel();

        shapePanel.add(shapeLabel);
        setShape(ShapeChoice.Triangle, color, shapeSize);

        redBtn = new JButton("Red");
        blueBtn = new JButton("Blue");
        yellowBtn = new JButton("Yellow");

        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        shapesPanel.setLayout(new BoxLayout(shapesPanel, BoxLayout.X_AXIS));
        contentPanel.setLayout(new GridLayout(1, 2));
        colorsPanel.setLayout(new BoxLayout(colorsPanel, BoxLayout.X_AXIS));
        shapePanel.setLayout(new BoxLayout(shapePanel, BoxLayout.X_AXIS));

        shapesPanel.add(triangleBtn);
        shapesPanel.add(rectangleBtn);
        shapesPanel.add(circleBtn);

        contentPanel.add(slider);
        contentPanel.add(shapePanel);

        colorsPanel.add(redBtn);
        colorsPanel.add(blueBtn);
        colorsPanel.add(yellowBtn);

        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        frame.add(shapesPanel);
        frame.add(contentPanel);
        frame.add(colorsPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }

    public void setShape(ShapeChoice shapeChoice, Color color, int shapeSize) {
        if (shapeChoice == ShapeChoice.Triangle) {
            shapeLabel.setIcon(new TriangleIcon(shapeSize, color));
        } else if (shapeChoice == ShapeChoice.Circle) {
            shapeLabel.setIcon(new CircleIcon(shapeSize, color));
        } else if (shapeChoice == ShapeChoice.Rectangle) {
            shapeLabel.setIcon(new RectangleIcon(shapeSize, color));
        }
    }
}


