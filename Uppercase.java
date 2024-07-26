import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;



class Test extends JFrame implements ActionListener {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JLabel l1;
    
    private JTextField t1;

   public void Test(){
    setSize(500,500);
    setLayout(null);
    setTitle("APPLICATION");
    t1=new JTextField();
    b1=new JButton("UPPERCASE");
    b2=new JButton("COUNT");
    b3=new JButton("LAST OCCURANCE OF A CHARACTER");
    l1=new JLabel("INPUT");
    

    t1.setBounds(150,100,200,50);
    l1.setBounds(50,100,100,100);
  
    b1.setBounds(50, 200, 100, 30);
    b2.setBounds(150, 200, 100, 30);
    b3.setBounds(250, 200, 100, 30);



    add(t1);
    add(l1);
   
    add(b1);
    add(b2);
    add(b3);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

}

public void actionPerformed(ActionEvent e){

    String sentence = t1.getText();
    if (e.getSource() == b1) {
        sentence = sentence.toUpperCase();
        JOptionPane.showMessageDialog(this, "Uppercase Sentence: " + sentence);
    } else if (e.getSource() == b2) {
        int wordCount = countWords(sentence);
        JOptionPane.showMessageDialog(this, "Word Count: " + wordCount);
    } else if (e.getSource() == b3) {
        String searchCharInput = JOptionPane.showInputDialog(this, "Enter a character to find:");
            if (searchCharInput != null && searchCharInput.length() == 1) {
                char searchChar = searchCharInput.charAt(0);
                int lastIndex = findLastOccurrence(sentence, searchChar);
                JOptionPane.showMessageDialog(this, "Last Occurrence Index of '" + searchChar + "': " + lastIndex);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid input. Please enter a single character.");
            }
    }
}

private int countWords(String sentence) {
    String[] words = sentence.split("\\s+");
    return words.length;
}
  private int findLastOccurrence(String sentence, char searchChar) {
        return sentence.lastIndexOf(searchChar);
    }


 class Testgui2{
    public static void main(String args[])
    {
        Test appli = new Test();
        //appli.test();
        appli.setVisible(true);
    }
}
}