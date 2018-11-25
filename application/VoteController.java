package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class VoteController implements Initializable {

	@FXML CheckBox demo1, demo2, demo3, demo4, demo5, demo6, demo7, demo8 = new CheckBox();
	@FXML CheckBox repub1, repub2, repub3, repub4, repub5, repub6, repub7, repub8 = new CheckBox();
	@FXML Label demoL1, demoL2, demoL3, demoL4, demoL5, demoL6, demoL7, demoL8 = new Label();
	@FXML Label repubL1, repubL2, repubL3, repubL4, repubL5, repubL6, repubL7, repubL8 = new Label();
	@FXML Label voterName = new Label();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
