package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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

	@FXML Label position1 = new Label("President");
	@FXML Label position2 = new Label("Senator");
	@FXML Label position3 = new Label("Representative");
	@FXML Label position4 = new Label("Govenor");
	@FXML Label position5 = new Label("State Representative");
	@FXML Label position6 = new Label("State Senator");
	@FXML Label position7 = new Label("Mayor");
	@FXML Label position8 = new Label("Councilman");
	@FXML Label position9 = new Label("Comptroller");
	
	@FXML Label voterName = new Label();
	@FXML Button clearAll = new Button();
	@FXML Button submit = new Button();
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
	ArrayList<ToggleGroup> toggleGroups = new ArrayList<ToggleGroup>();
	
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
		toggleGroups.add(tg);
	}
	
	public void clearAll() {
		setSelectedFalse(demoButtons);
		setSelectedFalse(repubButtons);
	}
	
	private void setSelectedFalse(ArrayList<RadioButton> buttons) {
		for (RadioButton rb : buttons) {
			rb.setSelected(false);
		}
	}
	
	public void submitVote() {
		ArrayList<String> candidates = new ArrayList<String>();
		for (ToggleGroup tg : toggleGroups) {
			Toggle t = tg.getSelectedToggle();
			try {
				if (t != null) {
					String candidate = t.toString()
										.split(Pattern.quote("'"))[1]
										.split(Pattern.quote("'"))[0];
					candidates.add(candidate);
					System.out.println(candidate);
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
