package Ej11;

public class Archer extends Character{
    // 10. Luego crea subclases Warrior, Archer, Mage con ataques diferentes. 
    private String archerName;

    public Archer(String archerName){
        super(archerName);
        this.archerName = archerName;
    }

    @Override
    public String getName(){
        return archerName;
    }

    @Override
    public void attack(){
        System.out.println("Acid Arrows!");
    }
}

