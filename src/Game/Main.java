package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JLabel Title;
    private JPanel Control;

    Main() {
        this.setTitle("Memory Matching");
        this.setSize(300, 300);
        this.setLayout(new GridLayout(2, 1));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Title = new JLabel("Memory Matching Demo", JLabel.CENTER);

        Control = new JPanel();
        Control.setLayout(new FlowLayout());

        JButton startBtn = new JButton("Start");
        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText("Gaming");
                start();
            }
        });
        Control.add(startBtn);

        JButton aboutBtn = new JButton("About");
        aboutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Title.setText("About");
                about();
            }
        });
        Control.add(aboutBtn);

        JButton exitBtn = new JButton("Exit");
        exitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        Control.add(exitBtn);

        this.add(Title);
        this.add(Control);
        this.setVisible(true);
    }

    public void start() {
        Board board = new Board();
        board.initUI();
    }

    public void about() {
        new About().setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }
}
