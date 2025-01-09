import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Inventos extends JPanel implements ActionListener {
    private int ballX = 250, ballY = 250, ballDiameter = 30;
    private int ballXSpeed = 2, ballYSpeed = 2;
    private int paddleWidth = 10, paddleHeight = 60;
    private int player1Y = 200, player2Y = 200;
    private Timer timer;

    public Inventos() {
        timer = new Timer(10, this);
        timer.start();
        
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_W && player1Y > 0) {
                    player1Y -= 10; // Mover hacia arriba
                }
                if (e.getKeyCode() == KeyEvent.VK_S && player1Y < getHeight() - paddleHeight) {
                    player1Y += 10; // Mover hacia abajo
                }
                if (e.getKeyCode() == KeyEvent.VK_UP && player2Y > 0) {
                    player2Y -= 10; // Mover hacia arriba
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN && player2Y < getHeight() - paddleHeight) {
                    player2Y += 10; // Mover hacia abajo
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        // Dibujar la pelota
        g.setColor(Color.WHITE);
        g.fillOval(ballX, ballY, ballDiameter, ballDiameter);
        
        // Dibujar las palas
        g.fillRect(30, player1Y, paddleWidth, paddleHeight); // Jugador 1
        g.fillRect(getWidth() - 40, player2Y, paddleWidth, paddleHeight); // Jugador 2
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Mover la pelota
        ballX += ballXSpeed;
        ballY += ballYSpeed;

        // Colisiones con los bordes
        if (ballY <= 0 || ballY >= getHeight() - ballDiameter) {
            ballYSpeed = -ballYSpeed; // Rebote vertical
        }

        // Colisiones con las palas
        if (ballX <= 40 && ballY + ballDiameter >= player1Y && ballY <= player1Y + paddleHeight) {
            ballXSpeed = -ballXSpeed; // Rebote con jugador 1
        }
        if (ballX >= getWidth() - 70 && ballY + ballDiameter >= player2Y && ballY <= player2Y + paddleHeight) {
            ballXSpeed = -ballXSpeed; // Rebote con jugador 2
        }

        // Reiniciar si la pelota sale del campo
        if (ballX < 0 || ballX > getWidth()) {
            ballX = 250; // Reiniciar posición
            ballY = 250;
        }

        repaint(); // Llamar a paintComponent
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong");
        Inventos pong = new Inventos();
        frame.add(pong);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}