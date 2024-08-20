import javax.swing.*; 
import java.awt.*; 
import java.awt.event.KeyEvent; 
import java.awt.event.KeyListener; 

public class MovingCircleApp extends JFrame implements KeyListener { 
    private int x = 50; 
    private int y = 50; 
    private final int circleDiameter = 30; 
    private boolean moveLeft, moveRight, moveUp, moveDown;
    private final JPanel panel;

    public MovingCircleApp() { 
        setTitle("Moving Circle Application"); 
        setSize(400, 400); 
        setLayout(new BorderLayout()); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLUE); 
                g.fillOval(x, y, circleDiameter, circleDiameter); 
            }
        };

        panel.setFocusable(true);
        panel.addKeyListener(this);
        add(panel, BorderLayout.CENTER);

        Timer timer = new Timer(10, e -> updatePosition()); // Reduce interval to make movement faster
        timer.start();
    } 

    @Override 
    public void keyTyped(KeyEvent e) { 
        // Not used in this example 
    } 

    @Override 
    public void keyPressed(KeyEvent e) { 
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) { 
            moveLeft = true;
        } else if (keyCode == KeyEvent.VK_UP) { 
            moveUp = true;
        } else if (keyCode == KeyEvent.VK_RIGHT) { 
            moveRight = true;
        } else if (keyCode == KeyEvent.VK_DOWN) { 
            moveDown = true;
        }
    } 

    @Override 
    public void keyReleased(KeyEvent e) { 
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_LEFT) { 
            moveLeft = false;
        } else if (keyCode == KeyEvent.VK_UP) { 
            moveUp = false;
        } else if (keyCode == KeyEvent.VK_RIGHT) { 
            moveRight = false;
        } else if (keyCode == KeyEvent.VK_DOWN) { 
            moveDown = false;
        }
    } 

    private void updatePosition() {
        if (moveLeft) {
            x -= 50; // Increase speed
        }
        if (moveRight) {
            x += 50; // Increase speed
        }
        if (moveUp) {
            y -= 50; // Increase speed
        }
        if (moveDown) {
            y += 50; // Increase speed
        }
        panel.repaint();
        System.out.println("X=" + x + ", Y=" + y); // Display position in console
    }

    public static void main(String[] args) { 
        MovingCircleApp frame = new MovingCircleApp(); 
        frame.setVisible(true); 
    } 
}
