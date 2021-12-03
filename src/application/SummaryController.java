package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SummaryController implements Initializable {

	@FXML
	Label hrsStudiedLbl;
	@FXML
	Label optimalHrsStudiedLbl;
	@FXML
	Label mealsEatenLbl;
	@FXML
	Label optimalMeals;
	@FXML
	Label hrsSleptLbl;
	@FXML
	Label optimalHrsSleptLbl;

	String status;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		if (buttonController.user.getOptimalStudyHrs() <= 3) {
			status = "Below average study time, please try to study more hours a day";

		} else if (buttonController.user.getOptimalStudyHrs() <= 6) {
			status = "Average number of study hours, good job!";
		} else if (buttonController.user.getOptimalStudyHrs() <= 9) {
			status = "Above average study hours, keep up the good work!";
		} else if (buttonController.user.getOptimalStudyHrs() <= 12) {
			status = "Productive study day! Well done ";

		} else if (buttonController.user.getOptimalStudyHrs() <= 24) {
			status = "Please make sure to take study breaks, keep up the good work!";

		}

		hrsStudiedLbl.setText("Hours Studied: " + buttonController.user.getOptimalStudyHrs());
		optimalHrsStudiedLbl.setText(status);
		mealsEatenLbl.setText("Meals Eaten: " + buttonController.user.getOptimalEatMins());
		optimalMeals
				.setText("The optimal number of meals to eat per day is: " + buttonController.user.getOptimalEatMins());
		hrsSleptLbl.setText("Hours Slept: " + buttonController.user.getOptimalSleepHrs());
		optimalHrsSleptLbl.setText(
				"The optimal number of hours to spleet per day is: " + buttonController.user.getOptimalSleepHrs());

	}

	// handle Home Button
	public void handleMain(ActionEvent event) throws Exception {

		Parent mainView = FXMLLoader.load(getClass().getResource("main.fxml"));
		Scene mainScene = new Scene(mainView);

		// this line gets the stage info
		Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

		window.setScene(mainScene);
		window.show();

	}

}
