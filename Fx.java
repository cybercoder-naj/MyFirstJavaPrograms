import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Fx extends Application implements EventHandler<ActionEvent>
{
    private int c = 0;
    private Label l = new Label("count=" + c);

    @Override
    public void start(Stage stage) throws Exception
    {
        
        Button b = new Button("Count");
        HBox h = new HBox(20);
        b.setOnAction(this);
        h.getChildren().addAll(b, l);

        Scene scene = new Scene(h, 300,100);
        stage.setTitle("JavaFX Example");
        stage.setScene(scene);

        stage.show();
    }

    @Override
    public void handle(ActionEvent event)
    {
        l.setText("count=" + ++c);
    }
}
