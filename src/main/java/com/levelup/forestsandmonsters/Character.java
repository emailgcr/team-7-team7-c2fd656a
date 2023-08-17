package com.levelup.forestsandmonsters;

public class Character {


    private String name;

    GameMap gm;

    public Character(){
        name = "Character";
    }
    
    public Character(String name){
        this.name = name;
    }
    

   public String getName(){

    return this.name;
   }


//     public void move(Direction direction){
        
//  }

    public void enterMap(GameMap map){
        this.gm = map;
        System.out.println("Enter Map method");
    }

  public Position gePosition(){
    return null;
  }

}
