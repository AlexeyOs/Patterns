package os.study.factory;

import os.study.factory.model.Button;
import os.study.factory.model.CheckBox;

public interface GuiFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
