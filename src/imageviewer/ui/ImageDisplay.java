package imageviewer.ui;

import imageviewer.model.Image;

public interface ImageDisplay {

    Image currentImage();
    
    void show(Image image);
    
}
