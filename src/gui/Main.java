package gui;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage stage) throws Exception{

        Modele modele = new Modele();
        Controleur controleur = new Controleur(stage, modele);
        Vue vue = new Vue(stage, modele, controleur);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
