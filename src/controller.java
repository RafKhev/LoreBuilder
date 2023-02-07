import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TODO: Fazer os botoes mudarem

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class controller {

    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bp;

    @FXML
    public Button btn_side_inicio;

    @FXML
    private Button btn_side_local;

    @FXML
    private Button btn_side_mundo;

    @FXML
    public Button btn_side_personagem;

    @FXML
    private Button btn_side_timeline;

    //public String[] btns = {"btn_side_inicio", "btn_side_local", "btn_side_mundo", "btn_side_personagem", "btn_side_timeline"};
    public Button[] btns;

    public void initialize(){
        initBtnArray();
    }

    public void initBtnArray(){
        btns = new Button[5];

        btns[0] = btn_side_inicio;
        btns[1] = btn_side_local;
        btns[2] = btn_side_mundo;
        btns[3] = btn_side_personagem;
        btns[4] = btn_side_timeline;
        
    }

    // public void mudar(Button btn){
    //     System.out.println(btn.getId());
    //     for (Button button : btns) {
    //         System.out.println(button.getId());
    //         // if (button.getId() == btn.getId()){
    //         //     button.getStyleClass().setAll("btn_side_active");
    //         // }else{
    //         //     button.getStyleClass().setAll("btn_side_inactive");
    //         // }
    //     }
    // }

    @FXML
    void inicio(MouseEvent event) {
        bp.setCenter(ap);
        //mudar(btn_side_inicio);
    }

    @FXML
    void locais(MouseEvent event) {
        load("local");
        //mudar(btn_side_local);
    }

    @FXML
    void mundo(MouseEvent event) {
        load("mundo");
        //mudar(btn_side_mundo);
    }

    @FXML
    void personagens(MouseEvent event) {
        load("personagem");
        //mudar(btn_side_personagem);
    }

    @FXML
    void timeline(MouseEvent event) {
        load("local");
        //mudar(btn_side_timeline);
    }

    private void load(String page){
        Parent root = null;

        try {
            root = FXMLLoader.load(getClass().getResource(page+".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        bp.setCenter(root);

    }

}
