package os.study.factory.model;

import os.study.factory.model.Button;

import java.awt.*;

public class WinButton implements Button {
    private String name;
    private Color color;

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
