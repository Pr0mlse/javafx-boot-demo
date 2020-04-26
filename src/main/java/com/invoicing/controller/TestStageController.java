package com.invoicing.controller;

import com.invoicing.Service.HeroService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.ResourceBundle;

@FXMLController
public class TestStageController implements Initializable {

    @Autowired
    private HeroService heroService;

    @FXML
    private TextArea text;

    @FXML
    private Button button;

    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void hello() {
        System.out.println(heroService.findHero(103));
        text.appendText(heroService.findHero(103).toString());
    }


}
