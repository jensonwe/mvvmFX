package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_basic;

import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import javafx.scene.layout.VBox;

public class LifecycleTestJavaSub2View extends VBox implements JavaView<LifecycleTestSub2ViewModel> {

    @InjectViewModel
    public LifecycleTestSub2ViewModel viewModel;

    public void initialize() {

    }

}
