package chaoyue.designPattert.observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
  JFrame frame;

  public static void main(String[] args) {
    SwingObserverExample example = new SwingObserverExample();
    example.go();
  }

  public void go(){
    frame = new JFrame();
    JButton button = new JButton("Should I do it?");
    button.addActionListener(new AgenlListener());
    button.addActionListener(new DevilListener());
    frame.getContentPane().add(BorderLayout.CENTER,button);
  }

  class AgenlListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      System.out.println("don't do it! you might regret it");
    }
  }

  class DevilListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
      System.out.println("come on,do it!");
    }
  }
}
