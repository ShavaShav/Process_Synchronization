package sim;

import java.awt.EventQueue;
import java.util.ArrayList;

import kernel.CPUScheduler;
import kernel.Process;

public class StartSimulator {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CPUScheduler model = new CPUScheduler(0, new ArrayList<Process>());
					SimWindow view = new SimWindow(model);
					SimController controller = new SimController(view, model);
					view.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
