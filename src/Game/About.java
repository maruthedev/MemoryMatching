package Game;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    public About() throws HeadlessException {
        initUI();
    }

    private void initUI() {
        this.setSize(450,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        Label label = new Label("NHÓM 8");
        label.setFont(new Font("Tahoma",Font.BOLD,28));
        Label label1 = new Label("Phạm Đức Lương-B18DCCN384");
        label1.setFont(new Font("Tahoma",Font.BOLD,26));
        Label label2 = new Label("Lã Mạnh Tú-B18DCCN549");
        label2.setFont(new Font("Tahoma",Font.BOLD,26));
        Label label3 = new Label("Phan Ngọc Tuấn-B18DCCN571");
        label3.setFont(new Font("Tahoma",Font.BOLD,26));
        Label label4 = new Label("Nguyễn Văn Minh-B18DCCN406");
        label4.setFont(new Font("Tahoma",Font.BOLD,26));
        Label label5 = new Label("PTIT");
        label5.setFont(new Font("Tahoma",Font.BOLD,30));
        label5.setForeground(Color.RED);
        Panel panel = new Panel();
        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        this.add(panel);
    }
}
