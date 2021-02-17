package os.study.refactoringguru.factory;

import os.study.refactoringguru.factory.model.Button;
import os.study.refactoringguru.factory.model.CheckBox;

public interface GuiFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
