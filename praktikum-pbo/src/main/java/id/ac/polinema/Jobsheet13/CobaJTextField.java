package id.ac.polinema.Jobsheet13;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CobaJTextField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(400, 300);
        frame.setTitle("Aplikasi Database Java");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        // Membuat Label
        JLabel lblNIM = new JLabel("NIM");
        JLabel lblNama = new JLabel("Nama");

        lblNIM.setBounds(30, 30, 100, 25);
        lblNama.setBounds(30, 65, 100, 25);

        frame.add(lblNIM);
        frame.add(lblNama);

        // Membuat Input NIM dan Nama
        JTextField txtNIM = new JTextField();
        JTextField txtNama = new JTextField();

        txtNIM.setBounds(140, 30, 210, 25);
        txtNama.setBounds(140, 65, 210, 25);

        frame.add(txtNIM);
        frame.add(txtNama);

        // Membuat Button
        JButton btnCreate = new JButton("Create");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");

        btnCreate.setBounds(30, 120, 100, 30);
        btnUpdate.setBounds(140, 120, 100, 30);
        btnDelete.setBounds(250, 120, 100, 30);

        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);

        frame.add(btnCreate);
        frame.add(btnUpdate);
        frame.add(btnDelete);

        frame.setVisible(true);
    }    
}
