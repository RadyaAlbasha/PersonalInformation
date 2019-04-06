package com.mycompany.personinfogit;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneBase extends Pane {

    protected final Label ID;
    protected final Label FName;
    protected final Label MidName;
    protected final Label LName;
    protected final Label Email;
    protected final Label PhoneNum;
    protected final TextField IDField;
    protected final TextField FNameField;
    protected final TextField MidNameField;
    protected final TextField LNameField;
    protected final TextField EmailField;
    protected final TextField PhoneField;
    protected final Button New;
    protected final Button Update;
    protected final Button Delete;
    protected final Button First;
    protected final Button Previous;
    protected final Button Next;
    protected final Button Last;

    public SceneBase(Stage stage) {

        ID = new Label();
        FName = new Label();
        MidName = new Label();
        LName = new Label();
        Email = new Label();
        PhoneNum = new Label();
        IDField = new TextField();
        FNameField = new TextField();
        MidNameField = new TextField();
        LNameField = new TextField();
        EmailField = new TextField();
        PhoneField = new TextField();
        New = new Button();
        Update = new Button();
        Delete = new Button();
        First = new Button();
        Previous = new Button();
        Next = new Button();
        Last = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        ID.setLayoutX(58.0);
        ID.setLayoutY(39.0);
        ID.setText("ID:");

        FName.setLayoutX(58.0);
        FName.setLayoutY(83.0);
        FName.setText("First Name:");

        MidName.setLayoutX(58.0);
        MidName.setLayoutY(126.0);
        MidName.setText("Middle Name:");

        LName.setLayoutX(58.0);
        LName.setLayoutY(168.0);
        LName.setText("Last Name:");

        Email.setLayoutX(58.0);
        Email.setLayoutY(215.0);
        Email.setText("Email:");

        PhoneNum.setLayoutX(58.0);
        PhoneNum.setLayoutY(261.0);
        PhoneNum.setText("Phone:");

        IDField.setLayoutX(207.0);
        IDField.setLayoutY(34.0);
        IDField.setDisable(true);

        FNameField.setLayoutX(207.0);
        FNameField.setLayoutY(78.0);

        MidNameField.setLayoutX(207.0);
        MidNameField.setLayoutY(121.0);

        LNameField.setLayoutX(207.0);
        LNameField.setLayoutY(163.0);

        EmailField.setLayoutX(207.0);
        EmailField.setLayoutY(210.0);
        EmailField.setPrefWidth(300);

        PhoneField.setLayoutX(207.0);
        PhoneField.setLayoutY(256.0);

        New.setLayoutX(42.0);
        New.setLayoutY(333.0);
        New.setMnemonicParsing(false);
        New.setText("New");

        Update.setLayoutX(105.0);
        Update.setLayoutY(333.0);
        Update.setMnemonicParsing(false);
        Update.setPrefHeight(31.0);
        Update.setPrefWidth(76.0);
        Update.setText("Update");

        Delete.setLayoutX(191.0);
        Delete.setLayoutY(333.0);
        Delete.setMnemonicParsing(false);
        Delete.setPrefHeight(31.0);
        Delete.setPrefWidth(69.0);
        Delete.setText("Delete");

        First.setLayoutX(271.0);
        First.setLayoutY(333.0);
        First.setMnemonicParsing(false);
        First.setPrefHeight(31.0);
        First.setPrefWidth(63.0);
        First.setText("First");

        Previous.setLayoutX(343.0);
        Previous.setLayoutY(333.0);
        Previous.setMnemonicParsing(false);
        Previous.setText("Previous");

        Next.setLayoutX(429.0);
        Next.setLayoutY(333.0);
        Next.setMnemonicParsing(false);
        Next.setText("Next");

        Last.setLayoutX(490.0);
        Last.setLayoutY(333.0);
        Last.setMnemonicParsing(false);
        Last.setText("Last");

        getChildren().add(ID);
        getChildren().add(FName);
        getChildren().add(MidName);
        getChildren().add(LName);
        getChildren().add(Email);
        getChildren().add(PhoneNum);
        getChildren().add(IDField);
        getChildren().add(FNameField);
        getChildren().add(MidNameField);
        getChildren().add(LNameField);
        getChildren().add(EmailField);
        getChildren().add(PhoneField);
        getChildren().add(New);
        getChildren().add(Update);
        getChildren().add(Delete);
        getChildren().add(First);
        getChildren().add(Previous);
        getChildren().add(Next);
        getChildren().add(Last);

    }
}
