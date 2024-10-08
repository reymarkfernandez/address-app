module reymark.addressapp {
    requires transitive javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;

    requires jakarta.xml.bind;

    requires java.prefs;

    requires net.datafaker;

    opens dev.reymark.app.about to javafx.fxml;
    opens dev.reymark.app to javafx.fxml;
    opens dev.reymark.app.overview to javafx.fxml;
    opens dev.reymark.app.overview.form to javafx.fxml;
    opens dev.reymark.models.person to jakarta.xml.bind;

    exports dev.reymark;
    exports dev.reymark.models.person;
    exports dev.reymark.libs.xml.adapter;
}
