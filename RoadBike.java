public class RoadBike extends Bike{
    private int tireWidhth;

    public void setTireWidth(int width) {
        tireWidhth = width;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Tire Width  : " + tireWidhth + " mm");
        System.out.println("Bike Type   : Road Bike");
    }
}