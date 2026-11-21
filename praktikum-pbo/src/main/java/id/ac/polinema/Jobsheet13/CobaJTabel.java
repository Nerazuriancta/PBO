package id.ac.polinema.Jobsheet13;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class CobaJTabel {
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

        // Membuat JTable
        String[] kolom = {"NIM", "Nama"};

        DefaultTableModel model = new DefaultTableModel(kolom, 0);

        JTable tabel = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(tabel);

        scrollPane.setBounds(30, 160, 320, 120);

        frame.add(scrollPane);

        frame.setVisible(true);
    }    
}
