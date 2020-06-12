package net.mikaelzero.app;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

import net.mikaelzero.diooto.interfaces.ImageViewFactory;

import org.jetbrains.annotations.NotNull;

import java.io.File;

public class PhotoImageViewFactory implements ImageViewFactory {

    @Override
    public void loadAnimatedContent(@NotNull View view, int imageType, @NotNull File imageFile) {

    }

    @Override
    public void loadSillContent(@NotNull View view, @NotNull Uri uri) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageURI(uri);
        }
    }
}
