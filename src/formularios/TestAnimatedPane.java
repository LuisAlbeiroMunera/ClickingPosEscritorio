
package formularios;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestAnimatedPane {

    public static void main(String[] args) {
        new TestAnimatedPane();
    }

    public TestAnimatedPane() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

    public class TestPane extends JPanel {

        private JPanel panel;

        public TestPane() {
            setLayout(null);
            panel = new JPanel();
            panel.setBackground(Color.RED);
            add(panel);
            Dimension size = getPreferredSize();

            Rectangle from = new Rectangle(size.width, (size.height - 50) / 2, 50, 50);
            Rectangle to = new Rectangle((size.width - 50) / 2, (size.height - 50) / 2, 50, 50);

            Animate animate = new Animate(panel, from, to);
            animate.start();

        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 200);
        }

    }

    public static class Animate {

        public static final int RUN_TIME = 2000;

        private JPanel panel;
        private Rectangle from;
        private Rectangle to;

        private long startTime;

        public Animate(JPanel panel, Rectangle from, Rectangle to) {
            this.panel = panel;
            this.from = from;
            this.to = to;
        }

        public void start() {
            Timer timer = new Timer(40, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    long duration = System.currentTimeMillis() - startTime;
                    double progress = (double)duration / (double)RUN_TIME;
                    if (progress > 1f) {
                        progress = 1f;
                        ((Timer)e.getSource()).stop();
                    }
                    Rectangle target = calculateProgress(from, to, progress);
                    panel.setBounds(target);
                }
            });
            timer.setRepeats(true);
            timer.setCoalesce(true);
            timer.setInitialDelay(0);
            startTime = System.currentTimeMillis();
            timer.start();
        }

    }

    public static Rectangle calculateProgress(Rectangle startBounds, Rectangle targetBounds, double progress) {

        Rectangle bounds = new Rectangle();

        if (startBounds != null && targetBounds != null) {

            bounds.setLocation(calculateProgress(startBounds.getLocation(), targetBounds.getLocation(), progress));
            bounds.setSize(calculateProgress(startBounds.getSize(), targetBounds.getSize(), progress));

        }

        return bounds;

    }

    public static Point calculateProgress(Point startPoint, Point targetPoint, double progress) {

        Point point = new Point();

        if (startPoint != null && targetPoint != null) {

            point.x = calculateProgress(startPoint.x, targetPoint.x, progress);
            point.y = calculateProgress(startPoint.y, targetPoint.y, progress);

        }

        return point;

    }

    public static int calculateProgress(int startValue, int endValue, double fraction) {

        int value = 0;
        int distance = endValue - startValue;
        value = (int)Math.round((double)distance * fraction);
        value += startValue;

        return value;

    }

    public static Dimension calculateProgress(Dimension startSize, Dimension targetSize, double progress) {

        Dimension size = new Dimension();

        if (startSize != null && targetSize != null) {

            size.width = calculateProgress(startSize.width, targetSize.width, progress);
            size.height = calculateProgress(startSize.height, targetSize.height, progress);

        }

        return size;

    }
}