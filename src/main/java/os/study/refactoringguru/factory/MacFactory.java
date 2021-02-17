package os.study.refactoringguru.factory;

import os.study.refactoringguru.factory.model.Button;
import os.study.refactoringguru.factory.model.CheckBox;
import os.study.refactoringguru.factory.model.MacButton;
import os.study.refactoringguru.factory.model.MacCheckBox;

public class MacFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
