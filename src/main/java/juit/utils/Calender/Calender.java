package juit.utils.Calender;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

class Calender {
    private JPanel panel;
    Subclass ssc = new Subclass(11,2021);
    public void createCalendar(JFrame frame) {
        // Month is zero based
        Subclass panel = new Subclass(11, 2021);

        frame.setTitle("Calendar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                removeCalendar(frame);
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(panel);
        frame.pack();
        // frame.setBounds(100, 100, 400, 200);
        frame.setVisible(true);
    }

    public void removeCalendar(JFrame frame) {
        frame.dispose();
        System.exit(0);
    }
    public Subclass getCalender()
    {
        return ssc;
    }

}
