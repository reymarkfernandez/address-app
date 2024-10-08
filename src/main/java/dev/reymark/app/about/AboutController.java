package dev.reymark.app.about;

import dev.reymark.core.controller.Controller;
import dev.reymark.models.person.Author;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AboutController extends Controller {
    @FXML
    private ImageView logo;
    @FXML
    private Label nameLabel;
    @FXML
    private Label addressLabel;
    @FXML
    private Label email;
    @FXML
    private Label contactNum;
    @FXML
    private TextArea description;

    @Override
    protected void load_fields() {

    }

    public Author author;

    @Override
    protected void load_bindings() {
        author = new Author("Reymark C. Fernandez",
                "Brgy.Igang Baybay City,Leyte",
                "reymarkfernandez71@gmail.com",
                "09480266342");

    }

    @Override
    protected void load_listeners() {
        nameLabel.textProperty().bind(author.nameProperty());
        addressLabel.textProperty().bind(author.addressProperty());
        email.textProperty().bind(author.emailProperty());
        contactNum.textProperty().bind(author.contactNumProperty());
        logo.setImage(new Image(
                getClass().getResource("/dev/reymark/assets/img/favicon.png")
                        .toExternalForm()));
    }

}
