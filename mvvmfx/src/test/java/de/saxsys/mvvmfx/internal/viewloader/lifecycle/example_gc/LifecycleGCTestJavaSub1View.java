package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_gc;

import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_basic.LifecycleTestSub1ViewModel;
import javafx.scene.layout.VBox;

public class LifecycleGCTestJavaSub1View extends VBox implements JavaView<LifecycleTestSub1ViewModel> {

    @InjectViewModel
    public LifecycleTestSub1ViewModel viewModel;

    public void initialize() {

    }

}
