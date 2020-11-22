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
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String eats, int legs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = legs;
    }
    
    public boolean isVegetarian() {
        return vegetarian;
    }
    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    } 
    
}