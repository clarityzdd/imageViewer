package imageviewer;

import imageviewer.control.NextImageCommand;
import imageviewer.control.PrevImageCommand;
import imageviewer.persistence.ImageLoader;
import imageviewer.persistence.file.FileImageLoader;

public class Main {
    
    public static void main(String[] args) {
        ImageLoader imageLoader = new FileImageLoader("Images");
        MainFrame mainFrame = new MainFrame();
        mainFrame.add(new NextImageCommand(mainFrame.getImageDisplay()));
        mainFrame.add(new PrevImageCommand(mainFrame.getImageDisplay()));
        mainFrame.getImageDisplay().show(imageLoader.load());
    }

}
