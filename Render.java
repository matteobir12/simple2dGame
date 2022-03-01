import java.util.NavigableMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Render {
    
    private static final int FRAMEHEIGHT = 100;
    private static final int FRAMEWIDTH = 100;
    private static GameMap currentMap;
    private static boolean frameIsReady = true;
    private static MapPoint topLeft = new MapPoint(0,0);
    private static JFrame mainWindow;

    private Render(){ }
    static{
        // main window
        JFrame.setDefaultLookAndFeelDecorated(true);
        mainWindow = new JFrame();
        mainWindow.setSize(FRAMEHEIGHT*10, FRAMEWIDTH*10);
        mainWindow.setLayout(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        mainWindow.setVisible(true);
    }

    public static void renderFrame(){
        if (currentMap == null) return;
        frameIsReady = false;
        NavigableMap<Integer,NavigableMap<Integer,MapObject>> subMapOfX = currentMap.getXSubMapFromAB(topLeft.getX()-40, topLeft.getX()+FRAMEWIDTH+40);
        subMapOfX.keySet().forEach( x -> {
            boolean xUnloadZone = (x < (topLeft.getX()-20) && x > topLeft.getX()+FRAMEWIDTH+20);
            boolean xLoadZone = !xUnloadZone && (x > (topLeft.getX()-10) && x < topLeft.getX()+FRAMEWIDTH+10);
            //boolean displayZone = !xUnloadZone && (x > (topLeft.getX()) && x < topLeft.getX()+FRAMEWIDTH);
           
            subMapOfX.get(x).subMap(topLeft.getY()-40, true, topLeft.getY()+FRAMEHEIGHT+40, true).forEach((y, obj) -> {
                boolean unloadZone = (xUnloadZone || (y < (topLeft.getX()-20) && y > topLeft.getX()+FRAMEWIDTH+20));
                if (unloadZone){
                    obj.deleteLabel();
                }else if ((xLoadZone || y > (topLeft.getY()-10) && y < topLeft.getY()+FRAMEHEIGHT+10)){
                    JPanel lab = obj.createOrUpdateLabel(MapObject.calcPointRTC(x, y, topLeft));
                    if (lab != null) mainWindow.add(lab); 
                    
                }
                System.out.println(x + " " + y + " " + obj.getType());
            });
            
        });
        frameIsReady = true;
        mainWindow.invalidate();
        mainWindow.validate();
        mainWindow.repaint();
    }

    public static void setCurrentMap(GameMap map){
        currentMap = map;
    }
    public static void moveCamera(MapPoint p){
        topLeft = p;
    }
}