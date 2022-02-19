public interface MapObject {
    /**
     * position relative to camera
     * @return
     */
    public MapPoint getPositionRTC();
    public void setPosition(MapPoint p);
    public MapObjectTypes getType();

}