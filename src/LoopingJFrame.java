import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoopingJFrame {
    private static JFrame myFrameWindow;

    public static void main(String[] args) {
        myFrameWindow = new JFrame();
        myFrameWindow.setTitle("Looping Button JFrame");
        myFrameWindow.setResizable(false);
        myFrameWindow.setBounds(50,50,800,600);

        JLabel myLabel = new JLabel();
        myLabel.setText("Input Jumlah Button : ");
        myLabel.setBounds(50,30,300,30);

        JTextField myInputNumber = new JTextField();
        myInputNumber.setBounds(50,60,200,30);

        JButton myBtnExec = new JButton();
        myBtnExec.setText("Hit Me");
        myBtnExec.setBounds(255,60,100,30);

        myBtnExec.addActionListener(e-> {

                int jumlahBtn = Integer.parseInt(myInputNumber.getText());
            JButton[] btnNew = new JButton[jumlahBtn];

                int posX;
                int posY = 110;
                int count= 0;
                for(int loop=0;loop<jumlahBtn;loop++) {
                    btnNew[loop] = new JButton();

                    count++;
                    if(count == 5){
                        posX = 50;
                        posY = posY+40;
                        //count = 0;
                    }else{
                        posX = 50 + (loop*155);
                    }

                    btnNew[loop].setBounds(posX,posY, 150, 30);
                    btnNew[loop].setText("Button loop " + loop);
                    myFrameWindow.add(btnNew[loop]);
                    myFrameWindow.repaint();

            }
        });
        myFrameWindow.add(myLabel);
        myFrameWindow.add(myBtnExec);
        myFrameWindow.add(myInputNumber);
        myFrameWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrameWindow.setLayout(null);
        myFrameWindow.setVisible(true);
    }
}
