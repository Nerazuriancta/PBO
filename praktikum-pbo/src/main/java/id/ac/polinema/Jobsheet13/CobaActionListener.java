
package id.ac.polinema.Jobsheet13;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CobaActionListener {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(500, 380);
        frame.setTitle("Aplikasi Database Java");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label
        JLabel lblNIM = new JLabel("NIM");
        JLabel lblNama = new JLabel("Nama");

        lblNIM.setBounds(35, 55, 100, 25);
        lblNama.setBounds(35, 100, 100, 25);

        frame.add(lblNIM);
        frame.add(lblNama);

        // TextField
        JTextField txtNIM = new JTextField();
        JTextField txtNama = new JTextField();

        txtNIM.setBounds(165, 55, 265, 28);
        txtNama.setBounds(165, 100, 265, 28);

        frame.add(txtNIM);
        frame.add(txtNama);

        // Button
        JButton btnCreate = new JButton("Create");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnEdit = new JButton("Edit");
        JButton btnView = new JButton("View");

        btnCreate.setBounds(35, 165, 120, 35);
        btnUpdate.setBounds(165, 165, 120, 35);
        btnDelete.setBounds(295, 165, 120, 35);

        btnEdit.setBounds(315, 230, 120, 35);
        btnView.setBounds(315, 280, 120, 35);

        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);

        frame.add(btnCreate);
        frame.add(btnUpdate);
        frame.add(btnDelete);
        frame.add(btnEdit);
        frame.add(btnView);

        // JTable
        String[] kolom = {"NIM", "Nama"};

        DefaultTableModel model = new DefaultTableModel(kolom, 0) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable tabel = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(tabel);
        scrollPane.setBounds(35, 230, 265, 105);

        frame.add(scrollPane);

        // Menyimpan baris yang dipilih
        final int[] selectedRow = {-1};

        // ActionListener Create
        btnCreate.addActionListener(e -> {

            String nim = txtNIM.getText().trim();
            String nama = txtNama.getText().trim();

            if (nim.isEmpty() || nama.isEmpty()) {
                JOptionPane.showMessageDialog(
                    frame, "NIM dan Nama harus diisi!"
                );
                return;
            }

            try {
                Integer.parseInt(nim);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    frame, "NIM harus berupa angka!"
                );
                return;
            }

            model.addRow(new Object[]{nim, nama});

            txtNIM.setText("");
            txtNama.setText("");

        });

        // ActionListener Edit
        btnEdit.addActionListener(e -> {

            int row = tabel.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(
                    frame, "Pilih data terlebih dahulu!"
                );
                return;
            }

            selectedRow[0] = row;

            txtNIM.setText(
                model.getValueAt(row, 0).toString()
            );

            txtNama.setText(
                model.getValueAt(row, 1).toString()
            );

            btnCreate.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);

        });

        // ActionListener Update
        btnUpdate.addActionListener(e -> {

            String nim = txtNIM.getText().trim();
            String nama = txtNama.getText().trim();

            if (nim.isEmpty() || nama.isEmpty()) {
                JOptionPane.showMessageDialog(
                    frame, "NIM dan Nama harus diisi!"
                );
                return;
            }

            try {
                Integer.parseInt(nim);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    frame, "NIM harus berupa angka!"
                );
                return;
            }

            if (selectedRow[0] != -1) {

                model.setValueAt(nim, selectedRow[0], 0);
                model.setValueAt(nama, selectedRow[0], 1);

                JOptionPane.showMessageDialog(
                    frame, "Data berhasil diupdate!"
                );

                txtNIM.setText("");
                txtNama.setText("");

                selectedRow[0] = -1;

                btnCreate.setEnabled(true);
                btnUpdate.setEnabled(false);
                btnDelete.setEnabled(false);

                tabel.clearSelection();
            }

        });

        // ActionListener Delete
        btnDelete.addActionListener(e -> {

            if (selectedRow[0] != -1) {

                int konfirmasi = JOptionPane.showConfirmDialog(
                    frame,
                    "Yakin ingin menghapus data?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION
                );

                if (konfirmasi == JOptionPane.YES_OPTION) {

                    model.removeRow(selectedRow[0]);

                    txtNIM.setText("");
                    txtNama.setText("");

                    selectedRow[0] = -1;

                    btnCreate.setEnabled(true);
                    btnUpdate.setEnabled(false);
                    btnDelete.setEnabled(false);

                    tabel.clearSelection();
                }
            }

        });

        // ActionListener View
        btnView.addActionListener(e -> {

            int row = tabel.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(
                    frame, "Pilih data terlebih dahulu!"
                );
                return;
            }

            String nim = model.getValueAt(row, 0).toString();
            String nama = model.getValueAt(row, 1).toString();

            JOptionPane.showMessageDialog(
                frame,
                "NIM : " + nim + "\nNama : " + nama,
                "Detail Mahasiswa",
                JOptionPane.INFORMATION_MESSAGE
            );

        });

        frame.setVisible(true);

    }
}
