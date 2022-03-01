import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
public class MapObjectImages{
    private MapObjectImages() {}
    protected static Map<MapObjectTypes,BufferedImage> imgs = new EnumMap<>(MapObjectTypes.class);
    static{
        Map<MapObjectTypes,BufferedImage> tmp = new EnumMap<>(MapObjectTypes.class);
        try{
            tmp.put(MapObjectTypes.ROCK, ImageIO.read(new File("./assets/rock1.png"))); 
            tmp.put(MapObjectTypes.GRASS, ImageIO.read(new File("./assets/rock1.png")));
            tmp.put( MapObjectTypes.MAINCHAR,ImageIO.read(new File("./assets/rock1.png")));
            imgs = Collections.unmodifiableMap(tmp);
        }catch (Exception e) {
            System.out.println("U suck " + e);
        }
        
    }
}