package tankegame03;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class LkpTankGame03 extends JFrame {
    @SuppressWarnings({"all"})


    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        LkpTankGame03 lkpTankGame02 = new LkpTankGame03();
    }

    public LkpTankGame03() {
        System.out.println("请输入一个选择 1：新游戏 2：继续上局");
        String key = scanner.next();
        mp = new MyPanel(key);
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//面板
        this.setSize(1300, 950);
        this.addKeyListener(mp);//让JFrame监听mp的键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //在JFrame 中增加相应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("监听到关闭窗口");
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
