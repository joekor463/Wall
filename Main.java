public class Main{
    public static void main(String arg[]){
        Wall wall = new Wall(10,2.70);
        System.out.println ("Area = " + wall.getArea());
        wall.setHeigth ( 2.3 );
        System.out.println ("width - " + wall.getWidth());
        System.out.println ("heigt -  " + wall.getHeigth());
        System.out.println ("area - " + wall.getArea());

    }
}
