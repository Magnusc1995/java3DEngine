import javax.swing.*;
import java.awt.*;

public class EnginePanel extends JPanel implements Runnable{

    Graph graph;
    Thread gameThread;

    public EnginePanel() {
        setPreferredSize(new Dimension(EngineFrame.WIDTH, EngineFrame.HEIGHT));

        graph = new Graph();
    }

    public void startThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while(true) {
            update();

            repaint();
        }
    }

    public void update() {
        graph.update();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, EngineFrame.WIDTH, EngineFrame.HEIGHT);

        graph.render(g2d);
    }

}
