import java.util.NavigableMap;
public class Render {
    private Render(){}
    private static final int FRAMEHEIGHT = 100;
    private static final int FRAMEWIDTH = 100;
    private static GameMap currentMap;
    private static boolean frameIsReady = true;
    private static MapPoint topLeft = new MapPoint(0,0);

    public static void renderFrame(){
        if (currentMap == null) return;
        frameIsReady = false;
        NavigableMap<Integer,NavigableMap<Integer,MapObject>> subMapOfX = currentMap.getXSubMapFromAB(topLeft.getX(), topLeft.getX()+FRAMEWIDTH);
        for (int x : subMapOfX.keySet()){
            subMapOfX.get(x).subMap(topLeft.getY(), true, topLeft.getY()+FRAMEHEIGHT, true).forEach((y, obj) -> placeObject(x, y, obj));
        }
        frameIsReady = true;
    }
    public static void placeObject(int x, int y, MapObject obj){
        System.out.println(x + " " +y+ " "+ obj.getType());
    }
    public static void setCurrentMap(GameMap map){
        currentMap = map;
    }
    public static void moveCamera(MapPoint p){
        topLeft = p;
    }
}