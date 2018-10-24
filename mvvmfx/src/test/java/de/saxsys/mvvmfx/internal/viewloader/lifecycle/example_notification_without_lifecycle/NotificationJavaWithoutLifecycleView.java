package de.saxsys.mvvmfx.internal.viewloader.lifecycle.example_notification_without_lifecycle;

import de.saxsys.mvvmfx.InjectViewModel;
import de.saxsys.mvvmfx.JavaView;
import javafx.scene.layout.VBox;

public class NotificationJavaWithoutLifecycleView extends VBox implements JavaView<NotificationWithoutLifecycleViewModel> {

    @InjectViewModel
    private NotificationWithoutLifecycleViewModel viewModel;
}
