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
    public void addAsTab(Button button,String name){
        jTabbedPane.add(button.jButton, name);
    }
    public void addAsTab(CheckBox checkBox,String name){
        jTabbedPane.add(checkBox.jCheckBox, name);
    }
    public void addAsTab(EditorPane editorPane,String name){
        jTabbedPane.add(editorPane.jEditorPane, name);
    }
    public void addAsTab(FileChooser fileChooser,String name){
        jTabbedPane.add(fileChooser.jFileChooser, name);
    }
    public void addAsTab(ImageFrame imageFrame,String name){
        jTabbedPane.add(imageFrame.imageFrame, name);
    }
    public void addAsTab(Label label,String name){
        jTabbedPane.add(label.label, name);
    }
    public void addAsTab(Panel panel,String name){
        jTabbedPane.add(panel.jPanel, name);
    }
    public void addAsTab(PasswordField passwordField,String name){
        jTabbedPane.add(passwordField.jPasswordField);
    }
    public void addAsTab(ProgressBar progressBar,String name){
        jTabbedPane.add(progressBar.progressBar);
    }
    public void addAsTab(RadioButton radioButton,String name){
        jTabbedPane.add(radioButton.jRadioButton);
    }
    public void addAsTab(ScrollBar scrollBar, String Type,String name){
        if(Type.equals("HORIZONTAL"))jTabbedPane.add(scrollBar.BottomScrollBar);
        if(Type.equals("VERTICAL"))jTabbedPane.add(scrollBar.jScrollBar);
        if(Type.equals("HORIZONTAL AND VERTICAL")){
            jTabbedPane.add(scrollBar.BottomScrollBar);
            jTabbedPane.add(scrollBar.jScrollBar);
        }
    }
    public void addAsTab(ScrollPane scrollPane,String name){
        jTabbedPane.add(scrollPane.jScrollPane, name);
    }
    public void addAsTab(Separator separator,String name){
        jTabbedPane.add(separator.jSeparator, name);
    }
    public void addAsTab(Slider slider,String name){
        jTabbedPane.add(slider.jSlider, name);
    }
    public void addAsTab(Spinner spinner,String name){
        jTabbedPane.add(spinner.jSpinner);
    }
    public void addAsTab(TabPane tabPane,String name){
        jTabbedPane.add(tabPane.jTabbedPane);
    }
    public void addAsTab(TextArea textArea,String name){
        jTabbedPane.add(textArea.jTextArea);
    }
    public void addAsTab(TextField textField,String name){
        jTabbedPane.add(textField.jTextField);
    }
    public void addAsTab(TextPane textPane,String name){
        jTabbedPane.add(textPane.textPane);
    }
    public void addAsTab(ToggleSwitch toggleSwitch,String name){
        jTabbedPane.add(toggleSwitch.jToggleButton);
    }



}
