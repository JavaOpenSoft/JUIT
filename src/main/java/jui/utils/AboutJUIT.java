package jui.utils;
import java.awt.*;
import java.util.Objects;
import javax.swing.*;

public class AboutJUIT {

    private JFrame frame;
    public void ShowJUIDetails() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("About");
        String pathOfFile = "jui/img/Unknown.jpeg";
        Image icon = Toolkit.getDefaultToolkit().getImage(pathOfFile);
        frame.setIconImage(icon);


        JLabel IconImage = new JLabel("");
        IconImage.setBounds(165, 6, 115, 133);
        IconImage.setIcon(new ImageIcon(Objects.requireNonNull(AboutJUIT.class.getResource("/jui/img/db877c2e-4f32-43bf-8454-7d34afd48786 (1).png"))));
        frame.getContentPane().add(IconImage);

        JLabel VersionNumber = new JLabel("Version 0.1 Beta");
        VersionNumber.setBounds(162, 194, 106, 16);
        frame.getContentPane().add(VersionNumber);

        JLabel Author = new JLabel("Author: Rishon Jonathan");
        Author.setBounds(126, 222, 184, 16);
        frame.getContentPane().add(Author);

        JLabel Copyright = new JLabel("@Copyright Opensoftshop.in 2020-2021. All Rights Preserved");
        Copyright.setFont(new Font("SansSerif", Font.PLAIN, 13));
        Copyright.setBounds(26, 250, 396, 16);
        frame.getContentPane().add(Copyright);
    }
}

