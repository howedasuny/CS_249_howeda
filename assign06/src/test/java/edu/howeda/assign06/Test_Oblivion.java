package edu.howeda.assign06;
//NOTE: CHANGE realemj to YOUR SITNETID!!!
import edu.realemj.testing.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.*;

public class Test_Oblivion {

    @Test()
    public void testMain() throws IOException {

        String [] allInputs = {
                "data/NotARealFile.txt\n",
                "data/Level_1.txt\n",
                "data/Level_2.txt\n",
                "data/Level_3.txt\n",
                "data/Level_4.txt\n",
                "data/BadTome.txt\n",
                "data/BadCreature.txt\n",
                "data/BadItem.txt\n"
        };

        GeneralTesting.OutPack [] correctOutputs = {
                new GeneralTesting.OutPack(
                        """
                        Enter level filename:
                        MAP:
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        
                        CREATURES:
                        INVENTORY:   

                        """, 
                        "Game File Error: data/NotARealFile.txt not found!\n"),

                new GeneralTesting.OutPack(
                        """
                        Enter level filename:
                        MAP:
                        ..............................
                        ..............................
                        ..............................
                        ..S...........................
                        ..............................
                        ..............................
                        ............R.................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        
                        CREATURES:
                        * Skeleton at 3,2
                        * Rat at 6,12
                        INVENTORY:   

                        """,                        
                        ""),
                new GeneralTesting.OutPack(
                        """
                        Enter level filename:
                        MAP:
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..S...........................
                        ..............................
                        ..............................
                        ...............R..............
                        ..............................
                        ...R..........................
                        ....S.........................
                        ..............................
                        
                        CREATURES:
                        * Skeleton at 4,2
                        * Rat at 7,15
                        * Rat at 9,3
                        * Skeleton at 10,4
                        INVENTORY:

                        """,                        
                        ""),
                new GeneralTesting.OutPack(
                        """
                        Enter level filename:
                        MAP:
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        
                        CREATURES:
                        INVENTORY:
                        * CUP with value 5
                        * TOME_OF_MAGIC with value 120, enhances sorcery
                        * FORK with value 7     

                        """,                        
                        ""),

                new GeneralTesting.OutPack(
                        """
                        Enter level filename:
                        MAP:
                        ..............................
                        ..............................
                        ..............................
                        .......S......................
                        ..............................
                        ..............................
                        ..............................
                        .........R....................
                        ..............................
                        ..............................
                        ............R.................
                        ..S...........................
                        
                        CREATURES:
                        * Rat at 10,12
                        * Skeleton at 3,7
                        * Rat at 7,9
                        * Skeleton at 11,2
                        INVENTORY:
                        * GROGNAK_COMIC with value 170, enhances courage
                        * SPOON with value 2
                        * TAO_OF_PROGRAMMING with value 25, enhances wisdom 

                        """,                        
                        ""),

                new GeneralTesting.OutPack(
                        """
                        Enter level filename:
                        MAP:
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ............R.................
                        ..............................
                        
                        CREATURES:
                        * Rat at 10,12
                        INVENTORY:

                        """,                        
                        "Game File Error: Error loading Tome\n"),

                new GeneralTesting.OutPack(
                        """
                        Enter level filename:
                        MAP:
                        ..............................
                        ..............................
                        ..............................
                        .......S......................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ..............................
                        ............R.................
                        ..............................
                        
                        CREATURES:
                        * Rat at 10,12
                        * Skeleton at 3,7
                        INVENTORY:
                        * GROGNAK_COMIC with value 170, enhances courage 

                        """,                        
                        "Game File Error: Error loading Creature\n"),

                new GeneralTesting.OutPack(
                        """
                        Enter level filename:
                        MAP:
                        ..............................
                        ..............................
                        ..............................
                        .......S......................
                        ..............................
                        ..............................
                        ..............................
                        .........R....................
                        ..............................
                        ..............................
                        ............R.................
                        ..............................
                        
                        CREATURES:
                        * Rat at 10,12
                        * Skeleton at 3,7
                        * Rat at 7,9
                        INVENTORY:
                        * GROGNAK_COMIC with value 170, enhances courage 

                        """,                        
                        "Game File Error: Error loading Item\n"),

        };

        for(int i = 0; i < allInputs.length; i++) {

            // Start redirect
            GeneralTesting.StreamPack.getInstance().start(allInputs[i]);

            // Call main
            Oblivion.main(null);

            // Stop redirect
            GeneralTesting.OutPack programOutput = GeneralTesting.StreamPack.getInstance().stop();

            // Compare to correct result
            Assert.assertEquals(programOutput, correctOutputs[i]);

            System.out.println(correctOutputs[i]);
        }
    }
}
