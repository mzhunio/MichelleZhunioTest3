import javax.swing.*;
import java.awt.*;

public class TriangleIcon implements Icon {
    private final int size;
    private final Color color;

    public TriangleIcon(int size, Color color) {
        this.size = size;
        this.color = color;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;

        int[] p = {0, size / 2, size};
        int[] q = {size, 0, size};

        Polygon triangle = new Polygon(p, q, 3);
        g2.setColor(color);
        g2.fill(triangle);
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
