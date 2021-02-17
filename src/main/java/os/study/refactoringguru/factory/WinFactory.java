package os.study.refactoringguru.factory;

import os.study.refactoringguru.factory.model.Button;
import os.study.refactoringguru.factory.model.CheckBox;
import os.study.refactoringguru.factory.model.WinButton;
import os.study.refactoringguru.factory.model.WinCheckBox;

public class WinFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
}
