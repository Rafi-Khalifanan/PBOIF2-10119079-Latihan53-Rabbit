package pboif2.pkg10119079.latihan53.rabbit;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class Rabbit extends Animal{
    private String color,name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg,food,legs);
        this.color=color;
        this.name=name;
    }
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
}
