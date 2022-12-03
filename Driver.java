public class Driver {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(model.getShapeSize(), model.getShapeColor());
        Controller controller = new Controller(model, view);

        controller.control();
    }
}
