package com.spartajet.fxboot.demo.controller;

import com.spartajet.fxboot.demo.MainController;
import com.spartajet.fxboot.demo.Service.HeroService;
import com.spartajet.fxboot.demo.view.TestStageView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @description
 * @create 2017-05-20 下午1:55
 * @email spartajet.guo@gmail.com
 */
@FXMLController
public class MainStageController implements Initializable {

    @Autowired
    private HeroService heroService;

    @FXML
    private TextArea text;

    @FXML
    private Button button;
    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  <tt>null</tt> if the location is not known.
     * @param resources The resources used to localize the root object, or <tt>null</tt> if
     */
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void actionButton() {
        System.out.println("yes");
        System.out.println(heroService.findHero(Integer.valueOf(text.getText())));
//        System.out.println(heroService.addHero("akl"));
//        System.out.println(heroService.updateHeroDamage(103, 100));
//        System.out.println(heroService.delHero(102));

        MainController.showView(TestStageView.class);


    }
}
