/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

/**
 *
 * @author LENOVO
 */
import java.awt.*;
import javax.swing.*;

public class MyLayOut {
 JFrame f; MyLayOut(){
f=new JFrame(); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
f.setLayout(new FlowLayout());
f.setSize(500,500);
JButton b1=new JButton("1"); JButton b2=new JButton("Test 2"); JButton b3=new JButton("3"); JButton b4=new JButton("4"); JButton b5=new JButton("5"); JButton b6=new JButton("6"); JButton b7=new JButton("7"); JButton b8=new JButton("8"); JButton b9=new JButton("Last 9");
f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
f.add(b6);f.add(b7);f.add(b8);f.add(b9);
f.setVisible(true);
}


   public static void main(String[] args) { new
MyLayOut();
}

    
}
