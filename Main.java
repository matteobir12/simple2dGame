public class Main {
    public static void main(String[] args) {
        GameMap gameMap = new GameMap();
        gameMap.addContent(100, 100, new MapObject(MapObjectTypes.ROCK));
        gameMap.addContent(130, 130, new MapObject(MapObjectTypes.ROCK));
        gameMap.addContent(560, 70, new MapObject(MapObjectTypes.GRASS));
        gameMap.addContent(200, 450, new MapObject(MapObjectTypes.ROCK));
        gameMap.addContent(30, 50, new MapObject(MapObjectTypes.GRASS));
        gameMap.addContent(370, 320, new MapObject(MapObjectTypes.ROCK));
        gameMap.addContent(310, 390, new MapObject(MapObjectTypes.GRASS));
        Render.setCurrentMap(gameMap);
        Render.renderFrame();
        // Render.moveCamera(new MapPoint(300,300));
        // System.out.println("moved cam");
        // Render.renderFrame();
    }

}
