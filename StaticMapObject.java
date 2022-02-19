public class StaticMapObject implements MapObject {
    private MapPoint postion;
    private MapObjectTypes type;

    StaticMapObject(MapPoint p, MapObjectTypes t){
        postion = p;
        type = t;
    }

    public void setPosition(MapPoint p) {
        postion = p;
    }
    public MapPoint getPosition() {
        return postion;
    }
    public MapObjectTypes getType() {
        return type;
    }
}
