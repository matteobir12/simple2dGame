public class Main {
    public static void main(String[] args) {
        StaticMapObject rock = new StaticMapObject(new MapPoint(), MapObjectTypes.ROCK);
        StaticMapObject grass = new StaticMapObject(new MapPoint(), MapObjectTypes.GRASS);
        GameMap gameMap = new GameMap();
        gameMap.addContent(100, 100, rock);
        gameMap.addContent(560, 70, grass);
        gameMap.addContent(200, 450, rock);
        gameMap.addContent(30, 50, grass);
        gameMap.addContent(370, 320, rock);
        gameMap.addContent(310, 390, grass);
        Render.setCurrentMap(gameMap);
        Render.renderFrame();
        Render.moveCamera(new MapPoint(300,300));
        System.out.println("moved cam");
        Render.renderFrame();
    }

}
