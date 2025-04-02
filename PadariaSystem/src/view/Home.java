package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.components.Sidebar;

import java.util.Objects;


public class Home extends Application {
    public void start (Stage stage) throws Exception {
        //Carregamento de imagens
        Image imgIconStarbucks = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/view/img/starbucks96px.png")));
        Image imgBackground = new Image(getClass().getResourceAsStream("/view/img/"+"background1.jpg"));

        Sidebar sidebar = new Sidebar();

        BorderPane layoutPrincipal = new BorderPane();
        layoutPrincipal.setStyle("-fx-background-image: url('/view/img/"+"background1.jpg');");

        Scene scene = new Scene(layoutPrincipal, 1024, 700);
        stage.setScene(scene);
        stage.setTitle("Starbucks");
        stage.getIcons().add(imgIconStarbucks);
        stage.show();

    }

    public static void main(String[] lifecyle) {
        launch(lifecyle); //lifecycle --> init(), start(), stop()

    }
}
