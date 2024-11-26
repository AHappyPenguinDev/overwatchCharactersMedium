import java.io.*;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;
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
    File numberOfMatchesFile = new File("C:\\java_dev_kit\\MyMavenProject\\numberOfMatchesFile.csv");
    Scanner input = new Scanner(System.in);

    String[] characters;

    HeroOccurrence(String[] charactersPlayed){
        characters = charactersPlayed;
    }

    public void addToFile(){

        try {
            PrintWriter out = new PrintWriter(new FileWriter(csvFile , true)); //appends instead of creating new file;
            for (int i = 0; i < 5; i++) {
                System.out.println(characters[i]);
                out.write(characters[i] + ","); //https://stackoverflow.com/questions/9961292/write-to-text-file-without-overwriting-in-java
            }
            out.write("\n");
            out.close();

        } catch(Exception e){}

    }
}

