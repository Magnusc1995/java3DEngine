import javax.swing.*;

public class EngineFrame extends JFrame {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public EngineFrame() {
        setTitle("3D-Engine");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        EnginePanel enginePanel = new EnginePanel();

        add(enginePanel);
        pack();

        setVisible(true);

        enginePanel.startThread();
    }

}
