package Ej11;

public class Character {
    // 10. Crea una clase Character con método attack(). 
    private String characterName;

    public Character(String characterName){
        this.characterName = characterName;
    }

     public String getName(){
        return characterName;
    }

    public void attack(){
        System.out.println("Melee attack");
    }
}
