package Ej11;

public class Warrior extends Character{
    // 10. Luego crea subclases Warrior, Archer, Mage con ataques diferentes. 
    private String warriorName;

    public Warrior(String warriorName){
        super(warriorName);
        this.warriorName = warriorName;
    }

    @Override
    public String getName(){
        return warriorName;
    }

    @Override
    public void attack(){
        System.out.println("Hammer Slam!");
    }
}
