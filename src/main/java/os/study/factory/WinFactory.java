package os.study.factory;

import os.study.factory.model.Button;
import os.study.factory.model.CheckBox;
import os.study.factory.model.WinButton;
import os.study.factory.model.WinCheckBox;

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
