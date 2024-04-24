import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame {

    Calculator() {
        double first_operand;
        double second_opperand;
        JLabel label1 = new JLabel("the following is calculator");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton button10 = new JButton("0");
        JButton button11 = new JButton("+");
        JButton button12 = new JButton("-");
        JButton button13 = new JButton("*");
        JButton button14 = new JButton("/");
        JButton button15 = new JButton("%");
        JButton button16=new JButton("=");

        JTextArea textArea1 = new JTextArea();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        textArea1.setEditable(false);
        button1.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                                     textArea1.append("1");   

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString); 
                           
                      }
        });
        button2.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                textArea1.append("2");          

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
                      }
        });
        button3.addActionListener(new ActionListener() 
        {            
            String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
            public void actionPerformed( ActionEvent e) 
            {
                textArea1.append("3");          

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
                      }
        });
        button4.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                textArea1.append("4");          

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
                      }
        });
        button5.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                textArea1.append("5");          

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
                      }
        });
        button6.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                textArea1.append("6");          

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
                      }
        });
        button7.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                textArea1.append("7");          

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
                      }
        });
        button8.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                textArea1.append("8");          

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
                      }
        });
        button9.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                textArea1.append("9");          

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
                      }
        });
        button10.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                textArea1.append("0");          

                String inpuString=textArea1.getText();
                double first_operand=Double.parseDouble(inpuString);
                      }
        });
        button11.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {      
                String inpuString=textArea1.getText();
                
                
                     textArea1.append("-");      
                         
                      }
        });
        button12.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                     textArea1.append("+");      

                      }
        });
        button13.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                     textArea1.append("*");          
                      }
        });
        button14.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                     textArea1.append("/");          
                      }
        });
        button15.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                     textArea1.append("%");          
                      }
        });
        button16.addActionListener(new ActionListener() 
        {            
            public void actionPerformed( ActionEvent e) 
            {
                     textArea1.append("=");          
                      }
        });
        panel1.add(textArea1);
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(button10);
        panel2.add(button11);
        panel2.add(button12);
        panel2.add(button13);
        panel2.add(button14);
        panel2.add(button15);
        panel2.add(button16);
        panel2.setLayout(new GridLayout(4, 4));
        add(panel1);
        add(panel2);
        setVisible(true);
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

    }

    public static void main(String[] args) {
        Calculator Calculator = new Calculator();

    }
}
