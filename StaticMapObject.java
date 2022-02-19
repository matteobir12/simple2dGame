public class StaticMapObject implements MapObject {
    private MapPoint postionRTC;
    private MapObjectTypes type;

    StaticMapObject(MapPoint p, MapObjectTypes t){
        postionRTC = p;
        type = t;
    }

    public void setPositionRTC(MapPoint p) {
        postionRTC = p;
    }
    public MapPoint getPositionRTC() {
        return postionRTC;
    }
    public MapObjectTypes getType() {
        return type;
    }
}
