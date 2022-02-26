package juit.Components.URL;

import juit.Components.Label;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class URL {
    String URL;
    Label uri = new Label("");
    public URL(String URL){
        this.URL = URL;
        uri.setText(URL);
        uri.setFontColor(0,199,255);
        uri.getLabel().addMouseListener(new MouseLiberalAdapter() {
            @Override
            public void mouseLiberalClick(MouseEvent e) throws URISyntaxException, IOException {
                java.awt.Desktop.getDesktop().browse(new URI(uri.getText()));
            }
        });
    }
    public String getURL(){
        return URL;
    }
    public JLabel getURLLabel(){
        return uri.getLabel();
    }
}
