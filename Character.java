public class Character extends MapObject {
    private MapPoint absolutePosition = new MapPoint(500,500);
    private MapObjectTypes type = MapObjectTypes.MAINCHAR;
    Character(){
        super(new MapPoint(50,50), MapObjectTypes.MAINCHAR);
    }

}
