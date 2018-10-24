package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_basic;

import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import javafx.scene.layout.VBox;

public class LifecycleTestJavaSub1View extends VBox implements JavaView<LifecycleTestSub1ViewModel> {

    @InjectViewModel
    public LifecycleTestSub1ViewModel viewModel;

    public void initialize() {

    }

}
