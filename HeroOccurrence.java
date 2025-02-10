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

    String[] characters;

    int numberOfMatches;
    String stringNumberOfMatches = "";

    HeroOccurrence(String[] charactersPlayed){
        characters = charactersPlayed;
    }

    HeroOccurrence() {
        //characterMedium();
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

   BufferedReader reader = null;
   String line = "";

   public void plusMatches() { //takes value of matches , adds 1 and writes to numberOfMatchesFile file

      
       try {
           //creates numberOfMatches variable
           reader = new BufferedReader(new FileReader(numberOfMatchesFile));

           stringNumberOfMatches = reader.readLine();
           System.out.println(stringNumberOfMatches);

           numberOfMatches = Integer.parseInt(stringNumberOfMatches);
           numberOfMatches++;
           //System.out.printf("%-10s\n", numberOfMatches);

           //updates numberOfMatchesFile.csv

           stringNumberOfMatches = Integer.toString(numberOfMatches); // transforma numberOfMatches em stringNumberOfMatches denovo
           //System.out.print(stringNumberOfMatches);

           BufferedWriter out = new BufferedWriter(new FileWriter(numberOfMatchesFile));
           out.write(stringNumberOfMatches);
           out.flush();

       } catch(Exception e){
            e.printStackTrace();
       }
   }


    public void addToFile(){

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile));
            PrintWriter out = new PrintWriter(new FileWriter(csvFile, true)); //appends instead of creating new file;
            Scanner scan = new Scanner(csvFile);

            //adiciona conteudo de characters.csv em fileContent

            String fileContent = "";
            while(scan.hasNextLine()) {
                fileContent = fileContent.concat(scan.nextLine() + '\n');
            }

            for (int i = 0; i < 5; i++) {
                //System.out.p-rintln(characters[i]);

                //checar discord cumwel e voltar aqui

                //consigo checar se characters[i] está em fileContent, agora checar posição em que os personagens do input são iguais ao do fileContent
                //replace character after ; using split
            }
        } catch(Exception e){}

      }

    public void characterMedium() /*maybe change to public string later*/  {
        /*
         obter número de partidas de numberOfMatches.csv
         para cada linha ,ler nome de cada personagem e checar qual personagem é.
         se for personagem x, x++ no characterOccurrence.csv (orisa;23)                                                                                             1
         (split com "," ) até linha ser vazia
         BufferedReader.readLine()
        */


    }

}

