package os.study.factory;

import os.study.factory.model.Button;
import os.study.factory.model.CheckBox;
import os.study.factory.model.MacButton;
import os.study.factory.model.MacCheckBox;

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
