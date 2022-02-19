public class MapPoint {
    private int x;
    private int y;
    MapPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    MapPoint(){
        x = 0;
        y = 0;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public double distance(Object o){
        if(!(o instanceof MapPoint)) return -1;
        MapPoint p = (MapPoint)o;
        int xDiff = p.getX()-x;
        int yDiff = p.getY() - y;
        return Math.sqrt((double)(xDiff*xDiff) + (yDiff*yDiff));
    } 
}