package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_gc;

import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import javafx.scene.layout.VBox;

public class LifecycleGCTestJavaSub2View extends VBox implements JavaView<LifecycleGCTestSub2ViewModel> {

    @InjectViewModel
    public LifecycleGCTestSub2ViewModel viewModel;

    public void initialize() {

    }

}
