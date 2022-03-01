import javax.swing.JPanel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.image.BufferedImage;
import java.io.File;
public class MapObject {
    private MapPoint positionRTC;
    private MapObjectTypes type;
    private JPanel imagePanel;

    MapObject(MapPoint p, MapObjectTypes t){
        positionRTC = p;
        type = t;
    }
    MapObject(MapObjectTypes t){
        type = t;
    }
    /**
     * position relative to camera
     */
    public MapPoint getPositionRTC(){
        return positionRTC;
    }
    /**
     * position relative to camera
     */
    public void setPositionRTC(MapPoint p){
        positionRTC = p;
    }
    public void setPositionRTC(MapPoint absPoint, MapPoint cameraTopLeft){
        positionRTC = calcPointRTC(absPoint, cameraTopLeft);

    }
    public MapObjectTypes getType(){
        return type;
    }
    public JPanel createOrUpdateLabel(MapPoint pointRTC){
        
        if(imagePanel == null){
            JPanel panel = new JPanel();
            JLabel label = new JLabel(new ImageIcon(MapObjectImages.imgs.get(type)));
            panel.add(label);
            imagePanel = panel;
            System.out.println(pointRTC.getX() +" "+  pointRTC.getY());
            imagePanel.setLocation(pointRTC.getX()*10, pointRTC.getY()*10); 
            
            return imagePanel;
            
        }else{
            imagePanel.setLocation(pointRTC.getX()*10, pointRTC.getY()*10);
            return null;
        }
       
    }
    public void deleteLabel(){
        System.out.print("DELETED ");   
    }
    public static MapPoint calcPointRTC(MapPoint absPoint, MapPoint cameraTopLeft){
        return new MapPoint(absPoint.getX()-cameraTopLeft.getX(), absPoint.getY()-cameraTopLeft.getY());
    }
    public static MapPoint calcPointRTC(int x, int y, MapPoint cameraTopLeft){
        return new MapPoint(x-cameraTopLeft.getX(), y-cameraTopLeft.getY());
    }


}