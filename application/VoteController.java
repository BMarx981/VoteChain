package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

public class VoteController implements Initializable {

	@FXML RadioButton demo1 = new RadioButton();
	@FXML RadioButton demo2 = new RadioButton();
	@FXML RadioButton demo3 = new RadioButton();
	@FXML RadioButton demo4 = new RadioButton();
	@FXML RadioButton demo5 = new RadioButton();
	@FXML RadioButton demo6 = new RadioButton();
	@FXML RadioButton demo7 = new RadioButton();
	@FXML RadioButton demo8 = new RadioButton();
	@FXML RadioButton demo9 = new RadioButton();
	
	@FXML RadioButton repub1 = new RadioButton();
	@FXML RadioButton repub2 = new RadioButton();
	@FXML RadioButton repub3 = new RadioButton();
	@FXML RadioButton repub4 = new RadioButton();
	@FXML RadioButton repub5 = new RadioButton();
	@FXML RadioButton repub6 = new RadioButton();
	@FXML RadioButton repub7 = new RadioButton();
	@FXML RadioButton repub8 = new RadioButton();
	@FXML RadioButton repub9 = new RadioButton();

	@FXML Label position1, position2, position3, position4, position5, position6, position7, position8, position9 = new Label();
	@FXML Label voterName = new Label();
	ToggleGroup tg1 = new ToggleGroup();
	ToggleGroup tg2 = new ToggleGroup();
	ToggleGroup tg3 = new ToggleGroup();
	ToggleGroup tg4 = new ToggleGroup();
	ToggleGroup tg5 = new ToggleGroup();
	ToggleGroup tg6 = new ToggleGroup();
	ToggleGroup tg7 = new ToggleGroup();
	ToggleGroup tg8 = new ToggleGroup();
	ToggleGroup tg9 = new ToggleGroup();
	
	Voter voter = new Voter();
	ArrayList<String> candidates = new ArrayList<String>();
	ArrayList<RadioButton> demoButtons = new ArrayList<RadioButton>();
	ArrayList<RadioButton> repubButtons = new ArrayList<RadioButton>();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		demoButtons.add(demo1);
		demoButtons.add(demo2);
		demoButtons.add(demo3);
		demoButtons.add(demo4);
		demoButtons.add(demo5);
		demoButtons.add(demo6);
		demoButtons.add(demo7);
		demoButtons.add(demo8);
		demoButtons.add(demo9);
		repubButtons.add(repub1);
		repubButtons.add(repub2);
		repubButtons.add(repub3);
		repubButtons.add(repub4);
		repubButtons.add(repub5);
		repubButtons.add(repub6);
		repubButtons.add(repub7);
		repubButtons.add(repub8);
		repubButtons.add(repub9);
		setupToggleGroup(demo1, repub1, tg1);
		setupToggleGroup(demo2, repub2, tg2);
		setupToggleGroup(demo3, repub3, tg3);
		setupToggleGroup(demo4, repub4, tg4);
		setupToggleGroup(demo5, repub5, tg5);
		setupToggleGroup(demo6, repub6, tg6);
		setupToggleGroup(demo7, repub7, tg7);
		setupToggleGroup(demo8, repub8, tg8);
		setupToggleGroup(demo9, repub9, tg9);
		
	}
	
	private void setupToggleGroup(RadioButton demo, RadioButton repub, ToggleGroup tg) {
		demo.setToggleGroup(tg);
		repub.setToggleGroup(tg);
//		tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>(){
//			public void changed(ObservableValue<? extends Toggle> ov, Toggle toggle, Toggle new_toggle) {
//				if (demo.isSelected()) {
//					
//				}
//
//			}
//		});
	}

	public void comboPressed(ActionEvent event) {
		CheckBox box = (CheckBox) event.getSource();
		String party = (box.getId().charAt(0) == 'r') ? "repub" : "demo";
		String otherParty = (box.getId().charAt(0) == 'r') ? "demo" : "repub";
		int boxNum = Integer.parseInt(box.getId().split(Pattern.quote(party))[1]);

		if (box.isSelected()) {
			String onOff = party.equals("repub") ? "Republican #" + boxNum + " selcted" : "Democrat #" + boxNum + " selected";
			System.out.println(onOff);
		}
	}
}
