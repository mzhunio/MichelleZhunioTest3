import javax.swing.*;
import java.awt.*;

public class RectangleIcon implements Icon {
    private int size;
    private Color color;

    public RectangleIcon(int size, Color color) {
        this.size = size;
        this.color = color;
    }

    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(color);
        g.fillRect(x, y, getIconWidth(), getIconHeight());
    }

    @Override
    public int getIconWidth() {
        return this.size * 2;
    }

    @Override
    public int getIconHeight() {
        return this.size;
    }
}
