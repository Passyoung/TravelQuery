import javax.swing.*;

public class input_face{
    private JPanel rootPanel;
    private JPanel panel1;
    private JRadioButton both;
    private JRadioButton time;
    private JRadioButton price;
    private JTextField MAX_price;
    private JTextField MAX_time;
    private JLabel priceLabel;
    private JLabel origin;
    private JComboBox orig_box;
    private JComboBox end_box;
    private JLabel end;
    private JRadioButton pass_btn;
    private JLabel start_time;
    private JPanel panel2;
    private JPanel panel3;
    private JComboBox moth;
    private JComboBox day;
    private JLabel monthlabel;
    private JLabel daylabel;
    private JButton start;
    private JButton 日志查询Button;
    private JButton move;
    private JPanel panel4;
    private JLabel timelabel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JPanel panel6;
    private JLabel year;
    private JTextArea solutionArea;
    private JLabel solu;
    private JLabel final_time;
    private JLabel final_cost;
    private JTextField textField1;
    private JLabel label2;
    private JLabel label3;
    private JButton btn;


    public static void main(String[] args) {
        JFrame frame = new JFrame("input_face");




        frame.setContentPane(new input_face().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
