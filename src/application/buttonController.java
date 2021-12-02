package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class buttonController {
	@FXML Button loginButtonID;
	@FXML TextField userID;
	@FXML TextField passID;
	@FXML Label lblStatus;
	
	public void Login(ActionEvent action) throws Exception{
		
		if (userID.getText().equals("user") && passID.getText().equals("password"))
		{
			lblStatus.setText("Valid Login");
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
			Scene scene = new Scene(root,900,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		else 
			lblStatus.setText("Invalid Login");
	}
	

	
	//========================  MAIN BUTTONS ========================//
	
	//handle Home Button
	public void handleMain(ActionEvent event) throws Exception {
		
		Parent mainView = FXMLLoader.load(getClass().getResource("main.fxml"));
		Scene mainScene = new Scene(mainView);
		
		//this line gets the stage info
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(mainScene);
		window.show();
	
	}
	
	//Move to sleep page
	public void handleSleep(ActionEvent event) throws Exception {
		
		Parent sleepView = FXMLLoader.load(getClass().getResource("sleep.fxml"));
		Scene sleepScene = new Scene(sleepView);
		
		//this line gets the stage info
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(sleepScene);
		window.show();
	
	}
	
	//Move to eating habits page
	public void handleEating(ActionEvent event) throws Exception {
		
		Parent eatView = FXMLLoader.load(getClass().getResource("eating.fxml"));
		Scene eatScene = new Scene(eatView);
		
		//this line gets the stage info
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(eatScene);
		window.show();
	
	}
	
	//Move to study hours page
	public void handleStudy(ActionEvent event) throws Exception {
			
		Parent studyView = FXMLLoader.load(getClass().getResource("study.fxml"));
		Scene studyScene = new Scene(studyView);
			
		//this line gets the stage info
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			
		window.setScene(studyScene);
		window.show();
		
	}
	
	//Move to gpa page
	public void handleGpa(ActionEvent event) throws Exception {
			
		Parent gpaView = FXMLLoader.load(getClass().getResource("gpa.fxml"));
		Scene gpaScene = new Scene(gpaView);
				
		//this line gets the stage info
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
				
		window.setScene(gpaScene);
		window.show();
			
	}
	
	//Move to summary page
	public void handleSummary(ActionEvent event) throws Exception {
				
		Parent summaryView = FXMLLoader.load(getClass().getResource("summary.fxml"));
		Scene summaryScene = new Scene(summaryView);
					
		//this line gets the stage info
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
					
		window.setScene(summaryScene);
		window.show();
				
	}
	
	
     //========================  SUBMIT BUTTONS ========================//
	

	@FXML
	private TextField myTextField;
	@FXML
	private Button myButton;
	
	int numEat;
	double gpaScore;
	double hrsSleep;
	double hrsStudy;
	
	//submits number of meals eaten 
	public void eatingSubmit(ActionEvent event) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Confirm");
		window.setMinWidth(350);
		window.setMinHeight(150);
		
		try {
			numEat = Integer.parseInt(myTextField.getText());
			Label label = new Label();
			if(numEat > 0 && numEat < 10) {
				label.setText("Your number of meals eaten,"+numEat +", is saved!");
			} else {
				label.setText("Invalid input!");
			}
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
		catch(NumberFormatException err) {
			Label label = new Label();
			label.setText("Enter only number please");
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
		catch(Exception err) {
			
			Label label = new Label();
			label.setText("ERROR");
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
	}
	
	//Submits GPA score
	public void SubmitGpa(ActionEvent event) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Confirm");
		window.setMinWidth(350);
		window.setMinHeight(150);
		
		try {
			gpaScore = Double.parseDouble(myTextField.getText());
			Label label = new Label();
			if(gpaScore > 0 && gpaScore <= 4) {
				label.setText("Your GPA,"+gpaScore +", is saved!");
			} else {
				label.setText("Invalid input!");
			}
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
		catch(NumberFormatException err) {
			Label label = new Label();
			label.setText("Enter only number please");
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
		catch(Exception err) {
			
			Label label = new Label();
			label.setText("ERROR");
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
	}
	
	//Submits hours slept
	public void SubmitHrsSlept(ActionEvent event) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Confirm");
		window.setMinWidth(350);
		window.setMinHeight(150);
		
		try {
			hrsSleep = Double.parseDouble(myTextField.getText());
			Label label = new Label();
			if(hrsSleep > 0 && hrsSleep <= 24) {
				label.setText("Your hours slept,"+ hrsSleep+", is saved!");
			} else {
				label.setText("Invalid input!");
			}
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
		catch(NumberFormatException err) {
			Label label = new Label();
			label.setText("Enter only number please");
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
		catch(Exception err) {
			
			Label label = new Label();
			label.setText("ERROR");
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
	}
	
	//Submits hours study
	public void SubmitHrsStudy(ActionEvent event) {
		Stage window = new Stage();
		
		window.initModality(Modality.APPLICATION_MODAL);
		window.setTitle("Confirm");
		window.setMinWidth(350);
		window.setMinHeight(150);
		
		try {
			hrsStudy = Double.parseDouble(myTextField.getText());
			Label label = new Label();
			if(hrsStudy > 0 && hrsStudy <= 24) {
				label.setText("Your study hours per day is,"+ hrsStudy+", is saved!");
			} else {
				label.setText("Invalid input!");
			}
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
		catch(NumberFormatException err) {
			Label label = new Label();
			label.setText("Enter only number please");
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
		catch(Exception err) {
			
			Label label = new Label();
			label.setText("ERROR");
			Button closeBtn = new Button("Close the window");
			closeBtn.setOnAction(e -> window.close());
			
			VBox layout = new VBox(10);
			layout.getChildren().addAll(label, closeBtn);
			layout.setAlignment(Pos.CENTER);
			
			Scene scene = new Scene(layout);
			window.setScene(scene);
			window.showAndWait();
		}
	}
	
}
