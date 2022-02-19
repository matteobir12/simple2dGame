import java.util.NavigableMap;
import java.util.TreeMap;



public class GameMap {
    private int height;
    private int width;
    private NavigableMap<Integer, NavigableMap<Integer, MapObject>> staticContent = new TreeMap<>();
    GameMap(){
        height = 1000;
        width = 1000;
    }
    GameMap(int h, int w){
        height = h;
        width = w;
    }
    public NavigableMap<Integer, NavigableMap<Integer, MapObject>> getXSubMapFromAB(int a, int b){
        return staticContent.subMap(a, true, b, true);
    }
    public NavigableMap<Integer, MapObject> getYSubMapFromAB(int x, int a, int b){
        return staticContent.get(x).subMap(a, true, b, true);
    }
    public NavigableMap<Integer, MapObject> getContentsAtX(int x) {
        return staticContent.get(x);
    }
    public MapObject getContentsAtXY(int x, int y) {
        return staticContent.get(x).get(y);
    }
    public void addContent(int x, int y, MapObject obj){
        if (x > width || y > height || x < 0 || y < 0) return;
        if (staticContent.get(x) == null){
            NavigableMap<Integer, MapObject> yMap = new TreeMap<>();
            yMap.put(y, obj);
            staticContent.put(x, yMap);
        }else{
            staticContent.get(x).put(y, obj);
        }
        
     }
}
