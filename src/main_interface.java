import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_interface extends JPanel{
    private JPanel rootPanel;
    private JPanel mapPanel;
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JPanel panel2;
    private JPanel panel3;
    private JLabel timeLabel;
    private JRadioButton costBtn;
    private JRadioButton timeBtn;
    private JRadioButton bothBtn;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel costLabel;
    private JLabel timeLb;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JLabel orig_place;
    private JLabel end_place;
    private JPanel panel4;
    private JPanel panel5;
    private JRadioButton path_city;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JComboBox comboBox7;
    private JPanel panel6;
    private JPanel panel7;
    private JComboBox comboBox8;
    private JComboBox comboBox9;
    private JComboBox comboBox10;
    private JLabel dataLabel;
    private JPanel panel8;
    private JLabel year;
    private JLabel month;
    private JLabel day;
    private JButton startBtn;
    private JPanel panel9;
    private JPanel panel10;
    private JPanel rootPanel2;
    private JPanel statePanel;
    private JPanel tablePanel;
    private JPanel tp1;
    private JPanel tp2;
    private JPanel tp3;
    private JPanel tp4;
    private JPanel timePanel;
    private JLabel solu_label;

    //    public main_interface(){
//        Toolkit kit = Toolkit.getDefaultToolkit();
//        Dimension screenSize = kit.getScreenSize();
//        int screenHeight = screenSize.height;
//        int screenWidth = screenSize.width;
////        setSize(screenWidth / 2, screenHeight / 2);
////        setPreferredSize(screenSize);
////        setMaximumSize(screenSize);
//        setLocationByPlatform(true);
////        this.setTitle("旅行模拟查询系统");
//    }
    private char[] info = new char[50];
    private int info_num=0;
    private String cost_MAX;
    private String time_MAX;
    public main_interface() {

        //优先策略选择
        costBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info[0]='1';
                info[1]='0';
                info[2]='0';
//                info_num++;
            }
        });
        timeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info[0]='0';
                info[1]='1';
                info[2]='0';
//                info_num++;
            }
        });
        bothBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                info[0]='0';
                info[1]='0';
                info[0]='1';
            }
        });


        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println(textField1.getText());
                cost_MAX=textField1.getText();
                System.out.println(cost_MAX);
                time_MAX=textField2.getText();
                System.out.println(time_MAX);

            }
        });
//        textField1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                cost_MAX=textField1.getText();
//                System.out.println(cost_MAX);
//            }
//        });
//        textField2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                time_MAX=textField2.getText();
//                System.out.println(time_MAX);
//            }
//        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x=comboBox1.getSelectedIndex();
                System.out.println(x);
            }
        });
    }

    public void draw_main() {
        JFrame frame = new JFrame("旅行模拟查询系统");
        frame.setContentPane(new main_interface().rootPanel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
