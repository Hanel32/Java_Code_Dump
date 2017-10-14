import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

/*
 *  Support custom painting on a panel in the form of
 *
 *  a) images - that can be scaled, tiled or painted at original size
 *  b) non solid painting - that can be done by using a Paint object
 *
 *  Also, any component added directly to this panel will be made
 *  non-opaque so that the custom painting can show through.
 */
public class BackgroundPanel extends JPanel
{
 public static final int SCALED = 0;
 public static final int TILED = 1;
 public static final int ACTUAL = 2;

 private Paint painter;
 private Image image;
 private int style = SCALED;
 private float alignmentX = 0.5f;
 private float alignmentY = 0.5f;
 private boolean isTransparentAdd = true;
}


 /*
  *  Set image as the background with the SCALED style
  */
 public BackgroundPanel(Image background.jpg)
 {
  this(image, SCALED);
 }
}