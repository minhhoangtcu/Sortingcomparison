package sorting.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.Font;

public class View extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldSize;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View frame = new View();
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
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[33%,grow][33%][33%,grow]", "[90%][10%]"));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 0 3 1,grow");
		
		JTextPane paneHTMLOutput = new JTextPane();
		scrollPane.setViewportView(paneHTMLOutput);
		
		JPanel panelInput = new JPanel();
		contentPane.add(panelInput, "cell 0 1 2 1,grow");
		panelInput.setLayout(new MigLayout("", "[33%][33%,grow][33%]", "[50%][50%,grow]"));
		
		JLabel lblSortingSize = new JLabel("Sorting Size");
		panelInput.add(lblSortingSize, "cell 0 0,alignx trailing");
		
		textFieldSize = new JTextField();
		panelInput.add(textFieldSize, "cell 1 0,growx");
		textFieldSize.setColumns(10);
		
		JButton btnSort = new JButton("Sort");
		panelInput.add(btnSort, "cell 2 0 1 2,grow");
		
		JLabel lblSortingAlgorithm = new JLabel("Sorting Algorithm");
		panelInput.add(lblSortingAlgorithm, "cell 0 1");
		
		JList list = new JList();
		panelInput.add(list, "cell 1 1,grow");
		
		JPanel panelFeedback = new JPanel();
		contentPane.add(panelFeedback, "cell 2 1,grow");
		panelFeedback.setLayout(new MigLayout("", "[100%]", "[50%][50%]"));
		
		JLabel lblFeedBack = new JLabel("Feed Back");
		lblFeedBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelFeedback.add(lblFeedBack, "cell 0 0,alignx center,growy");
		
		JLabel lblFile = new JLabel("file");
		lblFile.setFont(new Font("Tahoma", Font.ITALIC, 11));
		panelFeedback.add(lblFile, "cell 0 1,alignx right,growy");
	}

}
