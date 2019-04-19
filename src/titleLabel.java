import javax.swing.*;
import java.awt.*;

public class titleLabel extends JLabel{

    public titleLabel(){
        JLabel titleLabel = new JLabel("欢迎使用旅行模拟查询系统",JLabel.CENTER);
        Font titleFont = new Font("宋体", Font.PLAIN,36);
        titleLabel.setFont(titleFont);
    }
}
