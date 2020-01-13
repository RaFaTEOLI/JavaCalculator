package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JTextField tFtela;
    private JButton bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btDIV, btVz, btMi, btPs, btDot, btEqls, btClear;
    private JPanel jPanel1, jPanel2, jPanel3;
    private String n1, n2, numero = "";
    private double d1, d2, d_final;
    
    private enum Operacao_Calculadora {
       soma,
       subtracao,
       multiplicacao,
       divisao;
    }
    
    private Operacao_Calculadora op;
    
    public Calculator (){
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Font myFont = new Font("Consolas", Font.PLAIN, 18);
        
        tFtela = new JTextField(20);
        bt0 = new JButton("0");
        bt1 = new JButton("1");
        bt2 = new JButton("2");
        bt3 = new JButton("3");
        bt4 = new JButton("4");
        bt5 = new JButton("5");
        bt6 = new JButton("6");
        bt7 = new JButton("7");
        bt8 = new JButton("8");
        bt9 = new JButton("9");
        btDIV = new JButton("÷");
        btVz = new JButton("x");
        btMi = new JButton("-");
        btPs = new JButton("+");
        btDot = new JButton(".");
        btEqls = new JButton("=");
        btClear = new JButton("AC");
        
        bt0.setPreferredSize(new Dimension(300, 40));
        
        // Setting fonts
        bt0.setFont(myFont);
        bt1.setFont(myFont);
        bt2.setFont(myFont);
        bt3.setFont(myFont);
        bt4.setFont(myFont);
        bt5.setFont(myFont);
        bt6.setFont(myFont);
        bt7.setFont(myFont);
        bt8.setFont(myFont);
        bt9.setFont(myFont);
        btDIV.setFont(myFont);
        btVz.setFont(myFont);
        btMi.setFont(myFont);
        btPs.setFont(myFont);
        btDot.setFont(myFont);
        btEqls.setFont(myFont);
        btClear.setFont(myFont);
        
        tFtela.setPreferredSize(new Dimension(300, 40));
        tFtela.setFont(myFont);
        tFtela.setHorizontalAlignment(SwingConstants.RIGHT);
        
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();
        
        Container janela;
        janela = getContentPane();
        janela.setLayout(new BorderLayout());
        jPanel1.setLayout(new GridLayout(4,4));
        jPanel2.setLayout(new GridLayout(1,1));
        jPanel3.setLayout(new GridLayout(1,1));
        
        jPanel2.add(tFtela);
        
        jPanel3.add(btClear);
        //Primeira Linha
        jPanel1.add(bt7);
        jPanel1.add(bt8);
        jPanel1.add(bt9);
        jPanel1.add(btDIV);

        //Segunda Linha
        jPanel1.add(bt4);
        jPanel1.add(bt5);
        jPanel1.add(bt6);
        jPanel1.add(btVz);

        //Terceira Linha
        jPanel1.add(bt1);
        jPanel1.add(bt2);
        jPanel1.add(bt3);
        jPanel1.add(btMi);

        //Quarta Linha
        jPanel1.add(bt0);
        jPanel1.add(btDot);
        jPanel1.add(btEqls);
        jPanel1.add(btPs);
        
        bt0.addActionListener(this);
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);
        btDIV.addActionListener(this);
        btVz.addActionListener(this);
        btMi.addActionListener(this);
        btPs.addActionListener(this);
        btDot.addActionListener(this);
        btEqls.addActionListener(this);
        btClear.addActionListener(this);

        janela.add(jPanel1, BorderLayout.PAGE_END);
        janela.add(jPanel3, BorderLayout.CENTER);
        janela.add(jPanel2, BorderLayout.PAGE_START);
        
        pack();  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bt0) {
                numero += "0";
                tFtela.setText(numero);  
            }
            else if (e.getSource() == bt1){
                numero += "1";
                tFtela.setText(numero);
            }
            else if (e.getSource() == bt2){
                numero += "2";
                tFtela.setText(numero); 
            }
            else if (e.getSource() == bt3){
                numero += "3";
                tFtela.setText(numero); 
            }
            else if (e.getSource() == bt4){
                numero += "4";
                tFtela.setText(numero); 
            }
            else if (e.getSource() == bt5){
                numero += "5";
                tFtela.setText(numero); 
            }
            else if (e.getSource() == bt6){
                numero += "6";
                tFtela.setText(numero); 
            }
            else if (e.getSource() == bt7){
                numero += "7";
                tFtela.setText(numero); 
            }
            else if (e.getSource() == bt8){
                numero += "8";
                tFtela.setText(numero); 
            }
            else if (e.getSource() == bt9){
                numero += "9";
                tFtela.setText(numero); 
            }
            else if (e.getSource() == btDIV){
               op = Operacao_Calculadora.divisao;
               tFtela.setText("/");
            }
            else if (e.getSource() == btVz){
               op = Operacao_Calculadora.multiplicacao;
               tFtela.setText("*");
            }
            
            else if (e.getSource() == btMi){
               op = Operacao_Calculadora.subtracao;
               tFtela.setText("-");
            }
            
            else if (e.getSource() == btPs){
                op = Operacao_Calculadora.soma;
                tFtela.setText("+");
            }
            
            else if (e.getSource() == btDot){
                String a = ".";
                numero += a;
                tFtela.setText(numero);
            }
            
            else if (e.getSource() == btClear){
                numero = "";
                tFtela.setText(numero);
            }
            
            if (e.getSource() == btPs){
                op = Operacao_Calculadora.soma;
                d1 = Double.parseDouble(numero);
                numero = "";
                tFtela.setText(numero);
            }
            
            if (e.getSource() == btDIV){
                op = Operacao_Calculadora.divisao;
                d1 = Double.parseDouble(numero);
                numero = "";
                tFtela.setText(numero);
            }
            
            if (e.getSource() == btMi){
                op = Operacao_Calculadora.subtracao;
                d1 = Double.parseDouble(numero);
                numero = "";
                tFtela.setText(numero);
            }
            
            if (e.getSource() == btVz){
                op = Operacao_Calculadora.multiplicacao;
                d1 = Double.parseDouble(numero);
                numero = "";
                tFtela.setText(numero);
            }
            
            if (e.getSource() == btEqls) {
                d2 = Double.parseDouble(numero);
                switch(op){
                    case soma:
                        d_final = (d1 + d2);
                        numero = "" + d_final;
                        tFtela.setText(numero);
                        break;
                    case subtracao:
                        d_final = (d1 - d2);
                        numero = "" + d_final;
                        tFtela.setText(numero);
                        break;
                    case multiplicacao:
                        d_final = (d1 * d2);
                        numero = "" + d_final;
                        tFtela.setText(numero);
                        break;
                    case divisao:
                        d_final = (d1 / d2);
                        numero = "" + d_final;
                        tFtela.setText(numero);
                        break;
                }
            }
            
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setSize(250, 270);
        calc.setVisible(true);
    }
    
}