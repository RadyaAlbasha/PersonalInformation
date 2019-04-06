package com.mycompany.personinfogit;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public abstract class SceneBase extends Pane {

    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final TextField textField;
    protected final TextField textField0;
    protected final TextField textField1;
    protected final TextField textField2;
    protected final TextField textField3;
    protected final TextField textField4;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;

    public SceneBase() {

        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        textField2 = new TextField();
        textField3 = new TextField();
        textField4 = new TextField();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        label.setLayoutX(58.0);
        label.setLayoutY(39.0);
        label.setText("ID:");

        label0.setLayoutX(58.0);
        label0.setLayoutY(83.0);
        label0.setText("First Name:");

        label1.setLayoutX(58.0);
        label1.setLayoutY(126.0);
        label1.setText("Middle Name:");

        label2.setLayoutX(58.0);
        label2.setLayoutY(168.0);
        label2.setText("Last Name:");

        label3.setLayoutX(58.0);
        label3.setLayoutY(215.0);
        label3.setText("Email:");

        label4.setLayoutX(58.0);
        label4.setLayoutY(261.0);
        label4.setText("Phone:");

        textField.setLayoutX(207.0);
        textField.setLayoutY(34.0);

        textField0.setLayoutX(207.0);
        textField0.setLayoutY(78.0);

        textField1.setLayoutX(207.0);
        textField1.setLayoutY(121.0);

        textField2.setLayoutX(207.0);
        textField2.setLayoutY(163.0);

        textField3.setLayoutX(207.0);
        textField3.setLayoutY(210.0);

        textField4.setLayoutX(207.0);
        textField4.setLayoutY(256.0);

        button.setLayoutX(42.0);
        button.setLayoutY(333.0);
        button.setMnemonicParsing(false);
        button.setText("New");

        button0.setLayoutX(105.0);
        button0.setLayoutY(333.0);
        button0.setMnemonicParsing(false);
        button0.setPrefHeight(31.0);
        button0.setPrefWidth(76.0);
        button0.setText("Update");

        button1.setLayoutX(191.0);
        button1.setLayoutY(333.0);
        button1.setMnemonicParsing(false);
        button1.setPrefHeight(31.0);
        button1.setPrefWidth(69.0);
        button1.setText("Delete");

        button2.setLayoutX(271.0);
        button2.setLayoutY(333.0);
        button2.setMnemonicParsing(false);
        button2.setPrefHeight(31.0);
        button2.setPrefWidth(63.0);
        button2.setText("First");

        button3.setLayoutX(343.0);
        button3.setLayoutY(333.0);
        button3.setMnemonicParsing(false);
        button3.setText("Previous");

        button4.setLayoutX(429.0);
        button4.setLayoutY(333.0);
        button4.setMnemonicParsing(false);
        button4.setText("Next");

        button5.setLayoutX(490.0);
        button5.setLayoutY(333.0);
        button5.setMnemonicParsing(false);
        button5.setText("Last");

        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(textField);
        getChildren().add(textField0);
        getChildren().add(textField1);
        getChildren().add(textField2);
        getChildren().add(textField3);
        getChildren().add(textField4);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button2);
        getChildren().add(button3);
        getChildren().add(button4);
        getChildren().add(button5);

    }
}
