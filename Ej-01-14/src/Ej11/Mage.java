package Ej11;

public class Mage extends Character{
    // 10. Luego crea subclases Warrior, Archer, Mage con ataques diferentes.   
    private String mageName;

    public Mage(String mageName){
        super(mageName);
        this.mageName = mageName;
    }

    @Override
    public String getName(){
        return mageName;
    }

    @Override
    public void attack(){
        System.out.println("Fireball!");
    }
}
