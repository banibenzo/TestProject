package com.cheibani.bugsstats;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {
	
	private int totalBugCount = 3;
	private Label statusLabel;
	private Button addBugButton;
	private Button removeBugButton;

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Bugs Stats"); //ma fenetre 
				
		/*StackPane root = new StackPane();
		Label label = new Label("Bonjour");
		Rectangle rectangle = new Rectangle(400, 200, Color.YELLOW);	
		root.getChildren().addAll(rectangle, label);
		Scene scene = new Scene(root, 600, 400); 
		
		primaryStage.setScene(scene);*/
		
		// Présentation de l'application
		VBox root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(25));
		statusLabel = new Label("Nombres de bugs actuel : 3");
		
		addBugButton = new Button("J'ai un nouveau Bug");
		addBugButton.setOnAction((e) -> {
			updateStatutsLabel(++totalBugCount);
		});
		
		removeBugButton = new Button("J'ai résolu un Bug");
		removeBugButton.setOnAction((e) -> {
			if(totalBugCount > 0) {
				updateStatutsLabel(--totalBugCount);
			}				
		});

		
		root.getChildren().addAll(statusLabel, addBugButton, removeBugButton);
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private void updateStatutsLabel(int newTotalBugCount) {
		statusLabel.setText("Nombres de bugs actuel : " + totalBugCount);
		
	}

}
