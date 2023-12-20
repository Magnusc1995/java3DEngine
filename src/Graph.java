import java.awt.*;
import java.awt.geom.Path2D;
import java.util.ArrayList;

public class Graph {

    Triangle triangle;

    Graph() {
        triangle = new Triangle(new Vertex(100, 100, 100),
                new Vertex(-100, -100, 100),
                new Vertex(-100, 100, -100),
                Color.WHITE);
    }

    public void update() {
        
    }

    public void render(Graphics2D g) {
        g.translate(EngineFrame.WIDTH / 2, EngineFrame.HEIGHT / 2);
        g.setColor(Color.WHITE);

        Path2D path2D = new Path2D.Double();
        path2D.moveTo(triangle.v1.x, triangle.v1.y);
        path2D.lineTo(triangle.v2.x, triangle.v2.y);
        path2D.lineTo(triangle.v3.x, triangle.v3.y);
        path2D.closePath();
        g.draw(path2D);

    }

}


class Triangle {
    Vertex v1;
    Vertex v2;
    Vertex v3;
    Color color;
    Triangle(Vertex v1, Vertex v2, Vertex v3, Color color) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.color = color;
    }
}

// x indicates the movement in the left and right directions
// y indicates the up-and-down movement on the screen
// z indicates depth (so the z axis is perpendicular to your screen). Positive z means "towards the observer".
class Vertex {
    double x;
    double y;
    double z;
    Vertex(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}