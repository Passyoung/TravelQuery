import javax.swing.*;

public class log_face {
    private JLabel IDlabel;
    private JTextField IDinput;
    private JButton 确认Button;
    private JPanel rootPanel;
    private JPanel panel1;
    private JPanel panel2;
    private JTextArea state_txt;
    private JLabel state;
    private JPanel panel3;
    private JLabel label2;
    private JPanel panel4;
    private JPanel panel5;
    private JScrollPane roll;
    private JTable table1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("日志查询");
        frame.setContentPane(new log_face().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
