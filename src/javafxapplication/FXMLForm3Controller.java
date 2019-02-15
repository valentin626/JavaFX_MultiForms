/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import static javafxapplication.JavaFXApplication.firstPerson;
import static javafxapplication.JavaFXApplication.stageMain;

/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLForm3Controller implements Initializable {

    @FXML
    private Label labelFirst;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        stageMain.setTitle("1.2 окно");
        labelFirst.setText(firstPerson); 
    }    

    @FXML
    private void doR(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("1"));
    }

    @FXML
    private void doExit(ActionEvent event) {
        stageMain.close(); // Закрытие программы
    }

    @FXML
    private void doNext(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("2"));
    }
    
}
