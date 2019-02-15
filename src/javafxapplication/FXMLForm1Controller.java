package javafxapplication;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import static javafxapplication.JavaFXApplication.firstPerson;
import static javafxapplication.JavaFXApplication.namePerson;
import static javafxapplication.JavaFXApplication.stageMain;

public class FXMLForm1Controller implements Initializable {

    @FXML
    private TextField textFieldName;
    @FXML
    private TextField textFieldName1;
     
    @FXML
    // Кнопка вперед
    private void doNext(ActionEvent event) throws IOException {
        namePerson = textFieldName.getText(); // Считывания из поля значения в общую переменную
        firstPerson = textFieldName1.getText(); // Считывания из поля значения в общую переменную
        stageMain.setScene(new SceneBuilder().getScene("3")); // Переход на второе окно
    }

    @FXML
    // Кнопка выхода
    private void doExit(ActionEvent event) {
        stageMain.close(); // Закрытие программы
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Первое окно");
    }

}
