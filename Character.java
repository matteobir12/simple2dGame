public class Character implements MapObject {
    private MapPoint postion;
    private MapObjectTypes type = MapObjectTypes.MAINCHAR;
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
