import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class welcome {
    private JPanel rootPanel;
    private JButton GOButton;
    private JButton EXITButton;
    private JPanel panel1;
    private JLabel label1;
    private JTextField textField1;
    private JPanel panel2;
    private JLabel IDLabel;
//    private boolean is_click=false;



    public welcome() {

//        GOButton.setPreferredSize(new Dimension(10,10));

        GOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                main_interface mi = new main_interface();
                mi.draw_main();
            }
        });
    }

    public void draw_welcome() {
        JFrame frame = new JFrame("旅行模拟查询系统");
        JPanel jpDAD = ((new welcome()).rootPanel);
        rootPanel.setLayout(null);
        jpDAD.setSize(new Dimension(200,100));
        frame.setContentPane(jpDAD);
//        rootPanel.setLayout(null);
//        Toolkit kit = Toolkit.getDefaultToolkit();
//        Dimension screenSize = kit.getScreenSize();
//        frame.setMaximumSize(new Dimension(500,100));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
