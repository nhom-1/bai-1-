package Phan2;

import java.awt.Button;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JFrameDemo {
    private JFrame frame;
    JButton button;

    public JFrameDemo() {
        creatAndShow();
    }

    public void creatAndShow() {
        button = new JButton("NEXT");
        frame = new JFrame("HAN TRUNG KIEN");                        //thiết lập tiêu đề cho frame
        frame.setSize(900, 500);                            //Kích thước của frame
        frame.setLocationRelativeTo(null);                                //cho frame hiện ở giữa màn hình
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             //Dừng chương trình luôn khi mình tắt
        frame.add(button);                                               //hiển thị button "OK" ở trong frame
        frame.setVisible(true);                                          //Hiển thị frame lên màn hình
    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}



