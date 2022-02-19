public class Character implements MapObject {
    private MapPoint postionRTC;
    private MapObjectTypes type = MapObjectTypes.MAINCHAR;
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
