import javax.swing.*;
import java.awt.*;

public class TreeViewerRunner {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new DOMTreeFrame();
                frame.setTitle("TreeViewer");
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
