package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_notification;

import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import javafx.scene.layout.VBox;

public class LifecycleJavaNotificationView extends VBox implements JavaView<LifecycleNotificationViewModel> {

    @InjectViewModel
    private LifecycleNotificationViewModel viewModel;
}
