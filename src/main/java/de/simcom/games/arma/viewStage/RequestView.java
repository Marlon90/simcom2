package de.simcom.games.arma.viewStage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.controlsfx.control.textfield.TextFields;

import de.simcom.games.view.viewStage.ViewStage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RequestView implements ViewStage {

	private Stage stage;

	@Override
	public void setViewStage() {
		stage = new Stage();
		BorderPane root = new BorderPane();
		HBox box = new HBox();
		TextField ta = new TextField();
		ta.setMaxHeight(40);
		ta.setMaxWidth(500);
		File file = new File("commandList.txt");
		Scanner inputFile = null;
		try {
			inputFile = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		List<String> allCommands = new ArrayList<String>();
		while (inputFile.hasNext()) {
			allCommands.add(inputFile.nextLine());
		}
		TextFields.bindAutoCompletion(ta, allCommands);
		

		box.getChildren().add(ta);
		box.setAlignment(Pos.CENTER);
		root.setCenter(ta);
		stage.setScene(new Scene(root));

	}

	@Override
	public Stage getViewStage() {
		return stage;
	}

}
