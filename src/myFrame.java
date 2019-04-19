import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    public myFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 3, screenHeight / 3);
        setLocationByPlatform(true);
        this.setTitle("旅行模拟查询系统");

//        JLabel titleLabel = new JLabel("欢迎使用旅行模拟查询系统",JLabel.CENTER);
//        Font titleFont = new Font("宋体", Font.PLAIN,36);
//        titleLabel.setFont(titleFont);
//
//        JButton goBtn = new JButton("GO");
//        Font btnFont = new Font("宋体",Font.PLAIN,26);
//        goBtn.setFont(btnFont);
    }

    public static void main(String[] args) {
//        EventQueue.invokeLater(()->
//        {
            myFrame frame = new myFrame();

            JButton goBtn = new JButton("GO");
            Font btnFont = new Font("宋体",Font.PLAIN,26);
            goBtn.setFont(btnFont);

            JLabel titleLabel = new JLabel("欢迎使用旅行模拟查询系统",JLabel.CENTER);
            Font titleFont = new Font("宋体", Font.PLAIN,36);
            titleLabel.setFont(titleFont);

            frame.add(goBtn,BorderLayout.SOUTH);

            frame.add(titleLabel,BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
//        });

    }
}

//class my_button extends JButton{
//
//    public my_button(){
//        setForeground(Color.BLUE);
//
//    }
//}
//class titleComponent extends JComponent{
//    public static final int x=75;
//    public static final int y=100;
//    private static final int WIDTH = 300;
//    private static final int HEIGHT = 200;
//
//    public void paintTitle(Graphics g)
//    {
//        g.drawString("欢迎使用旅行模拟查询系统",x,y);
//    }
//    public Dimension getpreferredSize(){
//        return new Dimension(WIDTH,HEIGHT);
//    }
//}




//    /**{
//     * 创建并显示GUI。出于线程安全的考虑，
//     * 这个方法在事件调用线程中调用。
//     */
//    private static void createAndShowGUI() {
//        // 确保一个漂亮的外观风格
////        JFrame.setDefaultLookAndFeelDecorated(true);
//
//        // 创建及设置窗口
//        JFrame frame = new JFrame("HelloWorldSwing");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////        frame.setLocation(100,200);
////        frame.setSize(500,600);
//
//        // 添加 "Hello World" 标签
//        JLabel label = new JLabel("旅行查询系统");
////        label.setLocation(130,230);
////        frame.getContentPane().add(label);
//        JButton btn = new JButton("试试看");
//        frame.add(label);
//        frame.add(btn, BorderLayout.NORTH);
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int x=0;
//                System.out.println("按了"+x+"次！！");
//                x++;
//            }
//        });
//
//
//        // 显示窗口
//        frame.pack();
//        frame.setVisible(true);
//    }


