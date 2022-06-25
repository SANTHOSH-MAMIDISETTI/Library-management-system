import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class neeraj extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    neeraj frame = new neeraj();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public neeraj() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 720, 450);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Garuda Library :");
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setFont(new Font("Agency FB", Font.BOLD, 48));
        lblNewLabel.setBounds(201, 11, 400, 58);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("Username :");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_2.setForeground(Color.WHITE);
        lblNewLabel_2.setBounds(206, 138, 78, 31);
        contentPane.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("Date Of Issue :");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_3.setForeground(Color.WHITE);
        lblNewLabel_3.setBounds(206, 220, 111, 20);
        contentPane.add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("New label");
        lblNewLabel_4.setBounds(358, 224, 111, 16);
        contentPane.add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("New label");
        lblNewLabel_5.setBounds(358, 147, 111, 22);
        contentPane.add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("Librarian Sign");
        lblNewLabel_6.setHorizontalAlignment(SwingConstants.TRAILING);
        lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 14));
        lblNewLabel_6.setForeground(Color.WHITE);
        lblNewLabel_6.setBounds(477, 318, 217, 82);
        contentPane.add(lblNewLabel_6);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\naidu\\Downloads\\Library_Management_System\\src\\Membershipjpg.jpg"));
        lblNewLabel_1.setBounds(0, 0, 704, 411);
        contentPane.add(lblNewLabel_1);
    }
}