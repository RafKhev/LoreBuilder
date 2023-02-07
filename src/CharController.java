import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

//TODO: Salvar personagens localmente

public class CharController {

    @FXML
    private Button btn_next_char;

    @FXML
    private Button btn_prev_char;

    @FXML
    private Button btn_salvar_historia;

    @FXML
    private CheckBox edit_checkbox;

    @FXML
    private TextArea historia_box;

    @FXML
    private ComboBox<String> lista_chars;

    @FXML
    private Label subtitulo_char;

    @FXML
    private Label titulo_char;
    private ArrayList<Char> listaChar = new ArrayList<>();

    public void initialize(){
       listaChar.add(new Char("Ryan", "Silver Sytche"));
       listaChar.add(new Char("Bradley", "Lighting blader"));

       System.out.print(listaChar.get(0).titulo);
       lista_chars.getItems().addAll(listaChar.get(0).titulo);
       lista_chars.getItems().addAll(listaChar.get(1).titulo);
       lista_chars.getSelectionModel().selectFirst();
       setChar();
    }

    @FXML
    public void anterior(){
        lista_chars.getSelectionModel().selectPrevious();;
        setChar();
    }

    @FXML
    public void proximo(){
        lista_chars.getSelectionModel().selectNext();
        setChar();
    }

    @FXML
    public void setChar(){
        System.out.println(lista_chars.getSelectionModel().getSelectedIndex());
        Char currentChar = listaChar.get(lista_chars.getSelectionModel().getSelectedIndex());
        
        titulo_char.setText(currentChar.titulo);
        subtitulo_char.setText(currentChar.subtitulo);
        historia_box.setText(currentChar.historia);
    }

    @FXML
    public void setText(){
        Char currentChar = listaChar.get(lista_chars.getSelectionModel().getSelectedIndex());

        currentChar.historia = historia_box.getText();
    }

    @FXML
    public void setEditMode(){
        if (edit_checkbox.isSelected()){
            historia_box.setEditable(true);
            btn_salvar_historia.setVisible(true);
        }else{
            historia_box.setEditable(false);
            btn_salvar_historia.setVisible(false);
        }
    }
    
}
