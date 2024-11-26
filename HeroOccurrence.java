import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* PseudoCode
On run, creates a new instance of class HeroOccurence
HeroOccurence has an instance array variable of type string charactersPlayed[], run method addCharacter() that takes in five arguments and adds to the array
Takes in user input (t1Init, d1Init, d2Init , s1Init , s2Init) as strings.
Recover numberOfMatches from CSV file and add +1


Goes through array and for each position, check what character was played

Method in Match class showInfo() checks if character in charactersUsedArray[] is NOT zero , if true, do the following:
charactersUsedArray[i] / numberOfMatches * 100
and print the percentage of how much the character was used
(System.out.print(charactersArray[i] " was used " + charactersUsedArray[i] + " times")
 */

public class HeroOccurrence {

    File csvFile = new File("C:\\java_dev_kit\\MyMavenProject\\characters.csv");
    Scanner input = new Scanner(System.in);

    String[] characters;

    HeroOccurrence(String[] charactersPlayed){
        characters = charactersPlayed;
    }


    //É preciso checar se o nome dado existe no banco. Checar no HeroOccurenceTest
    /*public void checkCharacters() {
        //Tratativa para ver se o nome está no banco de nomes

        for(int i = 0; i < 5; i++) {
            if(characters[i] == "Dva"){
                System.out.println("Deu certo!");
            }
        }
    }*/


   

    public void addToFile(){

        try {
            PrintWriter out = new PrintWriter(csvFile);
            for (int i = 0; i < 5; i++) {
                System.out.println(characters[i]);
                out.write(characters[i] + ",\n"); //https://stackoverflow.com/questions/9961292/write-to-text-file-without-overwriting-in-java
            }

            out.close();

        } catch(Exception e){}

    }
}



