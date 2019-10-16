package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Shapes + Cubic Curve");
        // creating a custom shape
        Group root = new Group();
        Image img1 = new Image("/sample/screenshot.jpg");
        //Image img2 = new Image("/screenshot2.png");
        ImageView iv1 = new ImageView(img1);
        ImageView iv2 = new ImageView(img1);
        Text txt1 = new Text();
        Text txt2 = new Text();
        txt1.setText("Color adjustment applied");
        txt2.setText("Color adjustment not applied");
        txt1.setX(50);
        txt1.setY(300);
        txt2.setX(355);
        txt2.setY(300);

        iv1.setX(100);
        iv1.setY(90);
        iv2.setX(400);
        iv2.setY(90);

        ColorAdjust colorAdjust = new ColorAdjust();
        colorAdjust.setContrast(0.1);
        colorAdjust.setHue(0.5);
        colorAdjust.setBrightness(0.2);
        colorAdjust.setSaturation(0.2);
        iv1.setEffect(colorAdjust);

        root.getChildren().addAll(iv1, iv2, txt1, txt2);

        /* Cubic curve custom shape
        CubicCurve cc = new CubicCurve();
        cc.setStartX(50);
        cc.setStartY(50);
        //setControl are points
        cc.setControlX1(300);
        cc.setControlX2(200);
        cc.setControlY1(100);
        cc.setControlY2(90);
        cc.setFill(Color.PEACHPUFF);
        root.getChildren().add(cc);*/

        /*
        // rectangle
        Rectangle rect = new Rectangle();
        rect.setLayoutX(10);
        rect.setLayoutY(20);
        rect.setWidth(50);
        rect.setHeight(80);
        rect.setFill(Color.PURPLE);

        // circle
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setFill(Color.BLUEVIOLET);

        // add shapes to constructor
        VBox vbox = new VBox(rect, circle);*/

        Scene scene = new Scene(root, 800, 800);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
