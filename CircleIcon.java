import javax.swing.*;
import java.awt.*;

public class CircleIcon implements Icon {
    private int size;
    private Color color;

    public CircleIcon(int size, Color color) {
        this.size = size;
        this.color = color;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }

    @Override
    public int getIconWidth() {
        return this.size;
    }

    @Override
    public int getIconHeight() {
        return this.size;
    }
}
