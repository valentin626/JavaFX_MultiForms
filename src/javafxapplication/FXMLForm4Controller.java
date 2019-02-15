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
import static javafxapplication.JavaFXApplication.stageMain;

/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLForm4Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        stageMain.setTitle("Окно №4");
    }    

    @FXML
    private void doExit(ActionEvent event) {
        stageMain.close(); // Закрытие программы
    }

    @FXML
    private void doR2(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("2"));
    }
    
}
