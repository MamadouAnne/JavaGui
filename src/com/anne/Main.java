package com.anne;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

    }
}
