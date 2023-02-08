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
    public void setSide  (int s){
        if(s<1){
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
         sides=s;
    }
    public int getVolume(){
       return  sides*sides*sides;
    } //cube side=volume
    public int getSurfaceArea(){
        return  sides*sides*6;
    }
}
