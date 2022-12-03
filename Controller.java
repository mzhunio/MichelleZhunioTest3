import java.awt.*;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void control() {
        view.getTriangleBtn().addActionListener(e -> {
            model.setShapeChoice(ShapeChoice.Triangle);
            view.setShape(model.getShapeChoice(), model.getShapeColor(), model.getShapeSize());
        });

        view.getRectangleBtn().addActionListener(e -> {
            model.setShapeChoice(ShapeChoice.Rectangle);
            view.setShape(model.getShapeChoice(), model.getShapeColor(), model.getShapeSize());
        });

        view.getCircleBtn().addActionListener(e -> {
            model.setShapeChoice(ShapeChoice.Circle);
            view.setShape(model.getShapeChoice(), model.getShapeColor(), model.getShapeSize());
        });

        view.getRedBtn().addActionListener(e -> {
            model.setShapeColor(Color.red);
            view.setShape(model.getShapeChoice(), model.getShapeColor(), model.getShapeSize());
        });

        view.getYellowBtn().addActionListener(e -> {
            model.setShapeColor(Color.yellow);
            view.setShape(model.getShapeChoice(), model.getShapeColor(), model.getShapeSize());
        });

        view.getBlueBtn().addActionListener(e -> {
            model.setShapeColor(Color.blue);
            view.setShape(model.getShapeChoice(), model.getShapeColor(), model.getShapeSize());
        });

        view.getSlider().addChangeListener(e -> {
            model.setShapeSize(view.getSlider().getValue());
            view.setShape(model.getShapeChoice(), model.getShapeColor(), model.getShapeSize());
        });
    }
}
