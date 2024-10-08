package dev.reymark.models.person;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Author {

    private final StringProperty name;
    private final StringProperty address;
    private final StringProperty email;
    private final StringProperty contactNum;

    public Author(String name,
            String address,
            String email,
            String contactNumber) {
        this.name = new SimpleStringProperty(name);
        this.address = new SimpleStringProperty(address);
        this.email = new SimpleStringProperty(email);
        this.contactNum = new SimpleStringProperty(contactNumber);

    }

    public StringProperty nameProperty() {
        return this.name;
    }

    public String getName() {
        return nameProperty().get();
    }

    public void setName(String name) {
        nameProperty().set(name);

    }

    public StringProperty addressProperty() {
        return this.address;
    }

    public String getAddress() {
        return addressProperty().get();
    }

    public void streetAddress(String address) {
        addressProperty().set(address);

    }

    public StringProperty emailProperty() {
        return this.email;
    }

    public String getEmail() {
        return emailProperty().get();
    }

    public void setEmail(String email) {
        emailProperty().set(email);
    }

    public StringProperty contactNumProperty() {
        return this.contactNum;
    }

    public String getContactNum() {
        return contactNumProperty().get();
    }

    public void setContactNum(String contactNum) {
        contactNumProperty().set(contactNum);
    }

}