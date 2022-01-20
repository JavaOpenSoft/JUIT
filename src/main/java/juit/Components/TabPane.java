package juit.Components;

import javax.swing.*;
import java.awt.*;

public class TabPane {
    javax.swing.JTabbedPane jTabbedPane = new JTabbedPane();
    private int SizeX;

    public int getSizeX() {
        return SizeX;
    }

    public int getSizeY() {
        return SizeY;
    }

    public int getPositionX() {
        return PositionX;
    }

    public int getPositionY() {
        return PositionY;
    }

    private int SizeY;
    private int PositionX;
    private int PositionY;

    public void setSize(int SizeX, int SizeY){
        jTabbedPane.setSize(SizeX, SizeY);
        this.SizeX = SizeX;
        this.SizeY = SizeY;
    }
    public void setPosition(int PositionX, int PositionY){
        jTabbedPane.setBounds(PositionX, PositionY,SizeX,SizeY);
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }
    public void setPositionAndSize(int PositionX, int PositionY,int SizeX, int SizeY){
        setPosition(PositionX,PositionY);
        setSize(SizeX, SizeY);
    }
    public void add(Button button){
        jTabbedPane.add(button.jButton);
    }
    public void add(CheckBox checkBox){
        jTabbedPane.add(checkBox.jCheckBox);
    }
    public void add(EditorPane editorPane){
        jTabbedPane.add(editorPane.jEditorPane);
    }
    public void add(FileChooser fileChooser){
        jTabbedPane.add(fileChooser.jFileChooser);
    }
    public void add(ImageFrame imageFrame){
        jTabbedPane.add(imageFrame.imageFrame);
    }
    public void add(Label label){
        jTabbedPane.add(label.label);
    }
    public void add(Panel panel){
        jTabbedPane.add(panel.jPanel);
    }
    public void add(PasswordField passwordField){
        jTabbedPane.add(passwordField.jPasswordField);
    }
    public void add(ProgressBar progressBar){
        jTabbedPane.add(progressBar.progressBar);
    }
    public void add(RadioButton radioButton){
        jTabbedPane.add(radioButton.jRadioButton);
    }
    public void add(ScrollBar scrollBar, String Type){
        if(Type.equals("HORIZONTAL"))jTabbedPane.add(scrollBar.BottomScrollBar);
        if(Type.equals("VERTICAL"))jTabbedPane.add(scrollBar.jScrollBar);
        if(Type.equals("HORIZONTAL AND VERTICAL")){
            jTabbedPane.add(scrollBar.BottomScrollBar);
            jTabbedPane.add(scrollBar.jScrollBar);
        }
    }
    public void add(ScrollPane scrollPane){
        jTabbedPane.add(scrollPane.jScrollPane);
    }
    public void add(Separator separator){
        jTabbedPane.add(separator.jSeparator);
    }
    public void add(Slider slider){
        jTabbedPane.add(slider.jSlider);
    }
    public void add(Spinner spinner){
        jTabbedPane.add(spinner.jSpinner);
    }
    public void add(TabPane tabPane){
        jTabbedPane.add(tabPane.jTabbedPane);
    }
    public void add(TextArea textArea){
        jTabbedPane.add(textArea.jTextArea);
    }
    public void add(TextField textField){
        jTabbedPane.add(textField.jTextField);
    }
    public void add(TextPane textPane){
        jTabbedPane.add(textPane.textPane);
    }
    public void add(ToggleSwitch toggleSwitch){
        jTabbedPane.add(toggleSwitch.jToggleButton);
    }
}
