package kenhoang.util;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

/**
 * Created by kenhoang on 7/8/17.
 */
public class Util {
    public void iconPass(ImageView iv, TextField tf, PasswordField pwf) {

        iv.setOnMousePressed((MouseEvent e) -> {
            tf.setText(pwf.getText());
            //tf.setStyle("-fx-background-color: WHITE; -fx-font-weight: bold;");
            pwf.setVisible(false);
            tf.setDisable(false);
            tf.setVisible(true);
            iv.setImage(new Image(getClass().getResource(
                    "/img/appearClick.png").toString()));
        });

        iv.setOnMouseReleased((MouseEvent e) -> {
            pwf.setVisible(true);
            pwf.setDisable(false);
            tf.setDisable(true);
            tf.setVisible(false);
            // tf.setStyle("-fx-font-size: 12;");
            iv.setImage(new Image(getClass().getResource("/img/appear.png")
                    .toString()));
        });

            pwf.setOnKeyTyped((KeyEvent e) -> {
                if (pwf.getText().length() != 0) {
                    iv.setVisible(true);
                } else {
                    iv.setVisible(false);
                }
            });
    }

    public void iconClean(ImageView iv, TextField tf) {
        iv.setOnMouseEntered((MouseEvent e) -> {
            iv.setImage(new Image(getClass().getResource(
                    "/img/exitIconHove.png").toString()));
        });
        iv.setOnMouseExited((MouseEvent e) -> {
            iv.setImage(new Image(getClass().getResource("/img/exitIcon.png")
                    .toString()));
        });
        iv.setOnMouseClicked((MouseEvent) -> {
            tf.clear();
            iv.setVisible(false);
        });
        tf.setOnKeyTyped((KeyEvent e) -> {
            if (tf.getText().length() != 0) {
                iv.setVisible(true);
            } else {
                iv.setVisible(false);
            }
        });
    }
}
