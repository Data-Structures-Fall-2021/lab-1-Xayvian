package src.main.java;

public class Battle {
    // YOUR CODE GOES HERE
    public String monster1Name;
    public float monster1Attack;
    public float monster1Defense;
    public float monster1HP;

    public String monster2Name;
    public float monster2Attack;
    public float monster2Defense;
    public float monster2HP;
    
    public int round_num;
    
    public Battle(String chikapuName, float chikapuAttack, float chikapuDefense, float chikapuHP, String zarichardName, float zarichardAttack, float zarichardDefense, float zarichardHP) {
        monster1Name = chikapuName;
        monster1Attack = chikapuAttack;
        monster1Defense = chikapuDefense;
        monster1HP = chikapuHP;
        
        monster2Name = zarichardName;
        monster2Attack = zarichardAttack;
        monster2Defense = zarichardDefense;
        monster2HP = zarichardHP;
        
        round_num = 1;
        
    }
    
    public String getMonster1Name(){
        return monster1Name;
    }
    
    public String getMonster2Name(){
        return monster2Name;
    }
    
    public boolean isMonster1Dead(){
        if (monster1HP <= 0){
            return true;
        }
        return false;
    }
    
    public boolean isMonster2Dead(){
        if (monster2HP <= 0){
            return true;
        }
        return false;
    }

    public float damageDealt(String name, float attack, float defense, float health){
        float damage = attack-defense;
        if (name.equals(monster1Name)){
            monster1HP -= damage;
        }
        else if (name.equals(monster2Name)){
            monster2HP -= damage;

        }
        return damage;
    }
    public float getMonster1HP(){
        return monster1HP;

    }

    public float getMonster2HP(){
        return monster2HP;
    }
    
    public void simulateRound(){
        System.out.printf(
                "\nRound %d\n%s does %.2f points of damage to %s\n%s does "
                + "%.2f points of damage to %s\n%s: %.2f\n%s: %.2f\n", round_num, getMonster1Name(),
                damageDealt(getMonster2Name(), monster1Attack, monster2Defense, getMonster2HP()),
                getMonster2Name(), getMonster2Name(), damageDealt(getMonster1Name(), monster2Attack, monster1Defense, getMonster1HP()),
                getMonster1Name(), getMonster1Name(), getMonster1HP(), getMonster2Name(), getMonster2HP());
        round_num++;
        
    }
}
