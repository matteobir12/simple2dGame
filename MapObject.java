public interface MapObject {
    /**
     * position relative to camera
     */
    public MapPoint getPositionRTC();
    /**
     * position relative to camera
     */
    public void setPositionRTC(MapPoint p);
    public MapObjectTypes getType();

}