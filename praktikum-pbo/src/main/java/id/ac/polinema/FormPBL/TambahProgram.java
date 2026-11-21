
package id.ac.polinema.FormPBL;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TambahProgram {

    public static void main(String[] args) {

        JFrame frame = new JFrame();

        frame.setSize(700, 430);
        frame.setTitle("Tambah Program Inkubasi");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Label
        JLabel lblNamaProgram = new JLabel("Nama Program");
        JLabel lblDeskripsi = new JLabel("Deskripsi Program");

        lblNamaProgram.setBounds(35, 45, 120, 25);
        lblDeskripsi.setBounds(35, 85, 120, 25);

        frame.add(lblNamaProgram);
        frame.add(lblDeskripsi);

        // TextField
        JTextField txtNamaProgram = new JTextField();
        JTextField txtDeskripsi = new JTextField();

        txtNamaProgram.setBounds(165, 45, 480, 28);
        txtDeskripsi.setBounds(165, 85, 480, 28);

        frame.add(txtNamaProgram);
        frame.add(txtDeskripsi);

        // Button
        JButton btnCreate = new JButton("Create");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnEdit = new JButton("Edit");
        JButton btnView = new JButton("View");

        btnCreate.setBounds(35, 145, 130, 35);
        btnUpdate.setBounds(180, 145, 130, 35);
        btnDelete.setBounds(325, 145, 130, 35);

        btnEdit.setBounds(525, 240, 120, 35);
        btnView.setBounds(525, 290, 120, 35);

        btnUpdate.setEnabled(false);
        btnDelete.setEnabled(false);

        frame.add(btnCreate);
        frame.add(btnUpdate);
        frame.add(btnDelete);
        frame.add(btnEdit);
        frame.add(btnView);

        // JTable
        String[] kolom = {
            "Nama Program",
            "Deskripsi Program"
        };

        DefaultTableModel model = new DefaultTableModel(kolom, 0) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable tabel = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(tabel);
        scrollPane.setBounds(35, 220, 460, 150);

        frame.add(scrollPane);

        // Menyimpan baris yang dipilih
        final int[] selectedRow = {-1};

        // ActionListener Create
        btnCreate.addActionListener(e -> {

            String namaProgram = txtNamaProgram.getText().trim();
            String deskripsi = txtDeskripsi.getText().trim();

            if (namaProgram.isEmpty() || deskripsi.isEmpty()) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Nama Program dan Deskripsi Program harus diisi!"
                );

                return;
            }

            model.addRow(new Object[]{
                namaProgram,
                deskripsi
            });

            txtNamaProgram.setText("");
            txtDeskripsi.setText("");

        });

        // ActionListener Edit
        btnEdit.addActionListener(e -> {

            int row = tabel.getSelectedRow();

            if (row == -1) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Pilih program yang ingin diedit!"
                );

                return;
            }

            selectedRow[0] = row;

            txtNamaProgram.setText(
                model.getValueAt(row, 0).toString()
            );

            txtDeskripsi.setText(
                model.getValueAt(row, 1).toString()
            );

            btnCreate.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);

        });

        // ActionListener Update
        btnUpdate.addActionListener(e -> {

            String namaProgram = txtNamaProgram.getText().trim();
            String deskripsi = txtDeskripsi.getText().trim();

            if (namaProgram.isEmpty() || deskripsi.isEmpty()) {

                JOptionPane.showMessageDialog(
                    frame,
                    "Nama Program dan Deskripsi Program harus diisi!"
                );

                return;
            }

            if (selectedRow[0] != -1) {

                model.setValueAt(
                    namaProgram, selectedRow[0], 0
                );

                model.setValueAt(
                    deskripsi, selectedRow[0], 1
                );

                JOptionPane.showMessageDialog(
                    frame,
                    "Data program berhasil diupdate!"
                );

                txtNamaProgram.setText("");
                txtDeskripsi.setText("");

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
                    "Yakin ingin menghapus program ini?",
                    "Konfirmasi Hapus",
                    JOptionPane.YES_NO_OPTION
                );

                if (konfirmasi == JOptionPane.YES_OPTION) {

                    model.removeRow(selectedRow[0]);

                    txtNamaProgram.setText("");
                    txtDeskripsi.setText("");

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
                    frame,
                    "Pilih program terlebih dahulu!"
                );

                return;
            }

            String namaProgram =
                model.getValueAt(row, 0).toString();

            String deskripsi =
                model.getValueAt(row, 1).toString();

            JOptionPane.showMessageDialog(
                frame,
                "Nama Program : " + namaProgram
                + "\nDeskripsi Program : " + deskripsi,
                "Detail Program Inkubasi",
                JOptionPane.INFORMATION_MESSAGE
            );

        });

        frame.setVisible(true);

    }
}
