public class Main {

    public static void main(String[] args) {

        ModelTermo model = new ModelTermo();

        Controller ctrl = new Controller(model);

        JFrameTermo view = new JFrameTermo(ctrl);
    }
}
