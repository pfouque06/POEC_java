package crudOperation.demo;

import java.awt.EventQueue;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import crudOperation.services.MyConnection;
import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JFramePersonne extends javax.swing.JFrame {

	private JPanel contentPane;
	private JTextField tfNum;
	private JTable table;
	private JTextField tfNom;
	private JTextField tfPrenom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFramePersonne frame = new JFramePersonne();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFramePersonne() {
		setTitle("CRUD Operations");
		setDefaultCloseOperation(JFramePersonne.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteData();
			}
		});
		btnDelete.setBounds(585, 327, 89, 23);
		contentPane.add(btnDelete);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateData();
			}
		});
		btnUpdate.setBounds(486, 327, 89, 23);
		contentPane.add(btnUpdate);

		JButton btnInsert = new JButton("Insert");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				insertData();
			}
		});
		btnInsert.setBounds(387, 327, 89, 23);
		contentPane.add(btnInsert);

		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				fillData();
			}
		});
		btnSelect.setBounds(10, 327, 89, 23);
		contentPane.add(btnSelect);

		tfNum = new JTextField();
		tfNum.setBounds(588, 94, 86, 20);
		contentPane.add(tfNum);
		tfNum.setColumns(10);

		tfNom = new JTextField();
		tfNom.setColumns(10);
		tfNom.setBounds(588, 125, 86, 20);
		contentPane.add(tfNom);

		tfPrenom = new JTextField();
		tfPrenom.setColumns(10);
		tfPrenom.setBounds(588, 156, 86, 20);
		contentPane.add(tfPrenom);

		JLabel lblNum = new JLabel("Num");
		lblNum.setBounds(486, 97, 46, 14);
		contentPane.add(lblNum);

		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(486, 128, 46, 14);
		contentPane.add(lblNom);

		JLabel lblPrenom = new JLabel("Prenom");
		lblPrenom.setBounds(486, 159, 46, 14);
		contentPane.add(lblPrenom);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 330, 305);
		contentPane.add(scrollPane);

		table = new JTable();
//		DefaultTableCellRenderer render = new DefaultTableCellRenderer();
//	    render.setHorizontalAlignment(SwingConstants.CENTER);
//	    for (int index = 0; index < table.getColumnCount(); index++)
//	    	table.getColumnModel().getColumn(index).setCellRenderer(render);
		table.setShowGrid(false);
		scrollPane.setViewportView(table);

		// fill table
		//btnSelect.doClick();
		fillData();


	}

	protected void deleteData() {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();

		try {

			// check required Text Fields values
			if (this.tfNum.getText().isEmpty()) {
				// Dialog Popup
				JOptionPane.showMessageDialog(null, "Do not allow empty field!", "Alert", JOptionPane.WARNING_MESSAGE);
				return;
			}
			
			// insert
			String sql = "delete from personne where num = ?";
			PreparedStatement pst = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			pst.setInt(1, Integer.valueOf(this.tfNum.getText()));
			pst.executeUpdate();

			// reset Text Fields
			resetTF();

			// Dialog Popup
			JOptionPane.showMessageDialog(null, "Deleted!");

			// select
			fillData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void updateData() {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();

		try {

			// check required Text Fields values
			if (this.tfNum.getText().isEmpty() || this.tfNom.getText().isEmpty() || this.tfPrenom.getText().isEmpty()) {
				// Dialog Popup
				JOptionPane.showMessageDialog(null, "Do not allow empty fields!", "Alert", JOptionPane.WARNING_MESSAGE);
				return;
			}

			// insert
			String sql = "update personne set nom = ?, prenom = ? where num = ? ";
			PreparedStatement pst = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			pst.setString(1, this.tfNom.getText());
			pst.setString(2, this.tfPrenom.getText());
			pst.setInt(3, Integer.valueOf(this.tfNum.getText()));
			pst.executeUpdate();

			// reset Text Fields
			resetTF();

			// Dialog Popup
			JOptionPane.showMessageDialog(null, "Updated!");

			// select
			fillData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void insertData() {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();

		try {

			// check required Text Fields values
			if (this.tfNom.getText().isEmpty() || this.tfPrenom.getText().isEmpty()) {
				// Dialog Popup
				JOptionPane.showMessageDialog(null, "Do not allow empty fields!", "Alert", JOptionPane.WARNING_MESSAGE);
				return;
			}

			// insert
			String sql = "insert into personne (nom,prenom) values (?,?); ";
			PreparedStatement pst = c.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			pst.setString(1, this.tfNom.getText());
			pst.setString(2, this.tfPrenom.getText());
			pst.executeUpdate();

			// reset Text Fields
			resetTF();

			// Dialog Popup
			JOptionPane.showMessageDialog(null, "Inserted");

			// select
			fillData();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void resetTF() {
		// TODO Auto-generated method stub
		tfNum.setText("");
		tfNom.setText("");
		tfPrenom.setText("");
	}

	protected void fillData() {
		// TODO Auto-generated method stub
		Connection c = MyConnection.getConnection();

		try {
			String sql = "select * from personne";

			PreparedStatement pst = c.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
