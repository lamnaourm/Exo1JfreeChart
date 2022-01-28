import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("80 - 100", 120);
		dataset.setValue("60 - 79", 80);
		dataset.setValue("39 - 59", 20);
		dataset.setValue("20 - 39", 7);
		dataset.setValue("0 - 19", 3);
		
		// Les parametres de createPieChart est Nom de chart, legend, tooltips et urls
		
		JFreeChart chart1 = ChartFactory.createPieChart("Graphe des notes des etudiants", dataset, true, true, true);
		        
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));

		contentPane.add(new ChartPanel(chart1));

		setContentPane(contentPane);
	}

}
