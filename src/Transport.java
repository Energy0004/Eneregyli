public class Transport {
    private float speed;
    private int weight;
    private String color;
    private byte[] coordinate;

    public Transport(float _speed, int _weight, String _color, byte[] _coordinate){
        //Join to DB
        System.out.println("Object created");
        setValues(_speed,_weight,_color,_coordinate);
        System.out.println(getValues());
    }
    public Transport(int weight, byte[] coordinate){
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(getValues());
    }
    public void setValues(float speed, int weight, String color, byte[] coordinate){
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }
    public String getValues(){
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".\n";
        String infoCoordinates = "Coordinates:\n";

        for(int i = 0; i < coordinate.length; i++){
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;
    }
}
