import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Test extends JFrame implements ActionListener {
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;

    public void test() {
        setSize(640, 480);
        setLayout(null);
        l1 = new JLabel("number one");
        l2 = new JLabel("number two");
        l3 = new JLabel("result");
        l4 = new JLabel("");
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("ADD");
        b2 = new JButton("SUB");
        b3 = new JButton("MULTI");
        b4 = new JButton("DIV");

        l1.setBounds(100, 100, 100, 50);
        t1.setBounds(200, 100, 100, 30);
        l2.setBounds(100, 140, 100, 50);
        t2.setBounds(200, 140, 100, 30);
        b1.setBounds(100, 200, 100, 30);
        b2.setBounds(180, 200, 100, 30);
        b3.setBounds(260, 200, 100, 30);
        b4.setBounds(340, 200, 100, 30); // Adjusted the Y position
        l3.setBounds(100, 240, 100, 30);
        l4.setBounds(200, 240, 100, 30); // Adjusted the X position

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
            add(b2);
                add(b3);
                    add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Integer num1 = Integer.parseInt(t1.getText());
            Integer num2 = Integer.parseInt(t2.getText());
            Integer res = 0;
            if (e.getSource()==b1) {
                res=num1+num2;
            }
            else if(e.getSource()==b2) {
            res=num1-num2;
            }
            else if(e.getSource()==b3)
            {
            res=num1*num2;
            }
            else if(e.getSource()==b4)
            {
            res=num1/num2;
            }
            l4.setText(res.toString());
        } catch (NumberFormatException ex) {
            l4.setText("Invalid input");
        }
    }
}

class Testgui1{
    public static void main(String args[]) {
        Test testFrame = new Test();
        testFrame.test();
        
        testFrame.setVisible(true);
    }
}
