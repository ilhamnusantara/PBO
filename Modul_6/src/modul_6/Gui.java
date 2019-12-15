/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_6;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Gui extends JFrame{
    public String textDate = "";
    public String formateDate;
    public Gui(){
        
        JLabel judul = new JLabel("     DATE FORMATTER");
        judul.setBounds(120, 5, 300, 70);
        judul.setFont(new Font("Times new roman", Font.BOLD,20));
        add(judul);
        
        JLabel cusDate = new JLabel("Custom Date");
        cusDate.setBounds(10, 60, 100, 20);
        cusDate.setFont(new Font("Times new roman", Font.BOLD, 14));
        add(cusDate);
        
        JTextField EntryDate = new JTextField("01101998");
        EntryDate.setBounds(10, 80, 400, 25);
        this.textDate = EntryDate.getText();
        add(EntryDate);
        
        if (textDate.length() > 8 && textDate.length() < 8)
        {
            JOptionPane.showMessageDialog(this,"Warning", "Login Gagal", JOptionPane.WARNING_MESSAGE);
        }
        setVisible(false);
        
        JLabel Formate = new JLabel("Format Date");
        Formate.setBounds(10, 105, 100, 50);
        Formate.setFont(new Font("Times new roman", Font.BOLD, 14));
        add(Formate);
        
        String date[]={"yyyy/MM/dd", "dd/MM/yyyy"};
        JComboBox dt = new JComboBox(date);
        dt.setBounds(10, 150, 200, 25);
        add(dt);
        this.formateDate = dt.getSelectedItem().toString();
        
        JLabel result = new JLabel("Result");
        result.setBounds(10, 170, 200, 50);
        result.setFont(new Font("Times new roman", Font.BOLD, 14));
        add(result);
        
        JTextField DateLama = new JTextField("");
        DateLama.setBounds(10, 210, 300, 22);
        DateLama.setFont(new Font("Times new roman", Font.BOLD, 14));
        add(DateLama);

        
        dt.addActionListener(new ActionListener(){
    @Override
    public void actionPerformed(ActionEvent e){
        textDate = EntryDate.getText();
        formateDate = dt.getSelectedItem().toString();
        System.out.println("Text Date = "+textDate);
        System.out.println("Format Date = "+formateDate);
        if (textDate.length() > 8 && textDate.length() < 8)
        {
            JOptionPane.showMessageDialog(rootPane, textDate);
        }
//        setVisible(false);
        setDate tanggal = new setDate(textDate, formateDate);
        tanggal.DateValue();
        DateLama.setText(tanggal.stringDate());
        
}
});
        
        
        
//        else{
//        
//        }
        
//        JButton refresh = new JButton(Action);
//        refresh.
        
        setTitle("MODUL 4");
        setSize(500, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
        validate();
        repaint(); 
    }
    
}

