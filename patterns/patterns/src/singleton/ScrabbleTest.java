package singleton;

import java.util.*;

public class ScrabbleTest {
    
    public static void main(String[] args){

        Singleton newInstance = Singleton.getInstance();

        System.out.print("Instance ID: " + System.identityHashCode(newInstance) + "\n");

        System.out.println(newInstance.getLetterList());

        System.out.println(newInstance.getTiles(5));

        LinkedList<String> playerOneTiles = newInstance.getTiles(8);

        System.out.println("Player One Tiles: " + playerOneTiles);

        System.out.println(newInstance.getLetterList());

        Singleton newInstance2 = Singleton.getInstance();
        
        System.out.print("Instance 2 ID: " + System.identityHashCode(newInstance2) + "\n");

        System.out.println(newInstance2.getLetterList());

         LinkedList<String> playerTwoTiles = newInstance2.getTiles(8);

        System.out.println("Player Two Tiles: " + playerTwoTiles);
        
        

    }
    
}
