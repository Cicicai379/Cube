public class Cube {
    private int sides;
    public Cube(int sides){
        this.sides = sides;
    }
    public Cube(){
        this.sides = 1;
    }
    public int getSide(){
        return sides;
    }
    public void setSide(int s){
         sides=s;
    }
    public int getVolume(){
       return  sides*sides*sides;
    }
    public int getSurfaceArea(){
        return  sides*sides*6;
    }
}
