import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Studentform extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;

    JTextField idField;
    JTextField nameField;
    JTextField sub1Field;
    JTextField sub2Field;
    JTextField sub3Field;

    JButton submitButton;
    JButton calculateButton;

    JTable table;
    DefaultTableModel model;

    public Studentform() {

        setTitle("Attendance Management System");
        setLayout(null);

        // ID
        l1 = new JLabel("ID :");
        l1.setBounds(50, 30, 100, 30);
        add(l1);

        idField = new JTextField();
        idField.setBounds(170, 30, 150, 30);
        add(idField);

        // Name
        l2 = new JLabel("Name :");
        l2.setBounds(50, 80, 100, 30);
        add(l2);

        nameField = new JTextField();
        nameField.setBounds(170, 80, 150, 30);
        add(nameField);

        // Subject 1
        l3 = new JLabel("Subject 1 :");
        l3.setBounds(50, 130, 100, 30);
        add(l3);

        sub1Field = new JTextField();
        sub1Field.setBounds(170, 130, 150, 30);
        add(sub1Field);

        // Subject 2
        l4 = new JLabel("Subject 2 :");
        l4.setBounds(50, 180, 100, 30);
        add(l4);

        sub2Field = new JTextField();
        sub2Field.setBounds(170, 180, 150, 30);
        add(sub2Field);

        // Subject 3
        l5 = new JLabel("Subject 3 :");
        l5.setBounds(50, 230, 100, 30);
        add(l5);

        sub3Field = new JTextField();
        sub3Field.setBounds(170, 230, 150, 30);
        add(sub3Field);

        // Calculate Button
        calculateButton = new JButton("Calculate");
        calculateButton.setBounds(50, 300, 120, 40);
        add(calculateButton);

        calculateButton.addActionListener(e -> {

            try {

                double s1 = Double.parseDouble(sub1Field.getText());
                double s2 = Double.parseDouble(sub2Field.getText());
                double s3 = Double.parseDouble(sub3Field.getText());

                double avg = (s1 + s2 + s3) / 3;

                JOptionPane.showMessageDialog(this,
                        "Average = " + avg);

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this,
                        "Enter valid marks!");

            }

        });

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(200, 300, 120, 40);
        add(submitButton);

        submitButton.addActionListener(this);

        // Table

        String columns[] = {
                "ID",
                "Name",
                "Subject1",
                "Subject2",
                "Subject3",
                "Average"
        };

        model = new DefaultTableModel(columns, 0);

        table = new JTable(model);

        JScrollPane sp = new JScrollPane(table);

        sp.setBounds(370, 30, 500, 300);

        add(sp);

        setSize(950, 450);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (idField.getText().isEmpty() ||
                nameField.getText().isEmpty() ||
                sub1Field.getText().isEmpty() ||
                sub2Field.getText().isEmpty() ||
                sub3Field.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Please fill all fields");

            return;
        }

        try {

            int id = Integer.parseInt(idField.getText());

            String name = nameField.getText();

            double s1 = Double.parseDouble(sub1Field.getText());

            double s2 = Double.parseDouble(sub2Field.getText());

            double s3 = Double.parseDouble(sub3Field.getText());

            double avg = (s1 + s2 + s3) / 3;

            // Add to JTable

            model.addRow(new Object[]{
                    id,
                    name,
                    s1,
                    s2,
                    s3,
                    avg
            });

            // Save to MySQL

            Connection conn = DBConnection.connect();

            String sql =
                    "INSERT INTO student(id,name,subject1,subject2,subject3,tot_attendance) VALUES (?,?,?,?,?,?)";

            PreparedStatement pst =
                    conn.prepareStatement(sql);

            pst.setInt(1, id);

            pst.setString(2, name);

            pst.setDouble(3, s1);

            pst.setDouble(4, s2);

            pst.setDouble(5, s3);

            pst.setDouble(6, avg);

            pst.executeUpdate();

            pst.close();

            conn.close();

            JOptionPane.showMessageDialog(this,
                    "Attendance Saved Successfully!");

            // Clear fields

            idField.setText("");

            nameField.setText("");

            sub1Field.setText("");

            sub2Field.setText("");

            sub3Field.setText("");

        } catch (Exception ex) {

            ex.printStackTrace();

            JOptionPane.showMessageDialog(this,
                    "Invalid Input!");

        }

    }
}

