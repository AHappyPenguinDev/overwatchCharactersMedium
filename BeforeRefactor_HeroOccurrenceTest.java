import java.io.IOException;
import java.util.Scanner;

public class HeroOccurrenceTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String characterNameCheck = null;
        String[] charactersPlayed = new String[5]; //0-1-2-3-4  -- 5 values

        boolean errorOccourred = false;

        System.out.println("Would you like to write a new match or obtain the medium of matches? (write/obtain)");
        String writeOrObtain = input.nextLine();

        if (writeOrObtain.equalsIgnoreCase("write")) {
            loop: for (int i = 0; i < 5; i++) {
                switch (i) {
                    case 0:
                        System.out.println("What was the first Tank? (Wrecking Ball = Hammond / Junker Queen = Queen)");
                        System.out.println(i);
                        break;
                    case 1:
                        System.out.println("What was the first DPS?");
                        System.out.println(i);
                        break;
                    case 2:
                        System.out.println("What was the second DPS?");
                        System.out.println(i);
                        break;
                    case 3:
                        System.out.println("What was the first Support?");
                        System.out.println(i);
                        break;
                    case 4:
                        System.out.println("What was the second Support?");
                        System.out.println(i);
                        break;
                }

                //Tratativa para ver se o nome está no banco de nomes
                characterNameCheck = input.nextLine();

                switch (i) {
                    case 0:
                        if (characterNameCheck.equalsIgnoreCase("dva") || characterNameCheck.equalsIgnoreCase("doomfist") || characterNameCheck.equalsIgnoreCase("queen") || characterNameCheck.equalsIgnoreCase("mauga") || characterNameCheck.equalsIgnoreCase("orisa") || characterNameCheck.equalsIgnoreCase("hazard") || characterNameCheck.equalsIgnoreCase("ramattra") || characterNameCheck.equalsIgnoreCase("reinhardt") || characterNameCheck.equalsIgnoreCase("roadhog") || characterNameCheck.equalsIgnoreCase("sigma") || characterNameCheck.equalsIgnoreCase("winston") || characterNameCheck.equalsIgnoreCase("hammond") || characterNameCheck.equalsIgnoreCase("zarya")) {
                            System.out.println("Tanque deu bom");
                            charactersPlayed[i] = characterNameCheck;
                            break;
                        } else {
                            System.out.println("Please enter a valid Tank");
                            errorOccourred = true;
                            break loop;
                        }

                    case 1:
                    case 2:
                        if (characterNameCheck.equalsIgnoreCase("ashe") || characterNameCheck.equalsIgnoreCase("bastion") || characterNameCheck.equalsIgnoreCase("cassidy") || characterNameCheck.equalsIgnoreCase("echo") || characterNameCheck.equalsIgnoreCase("genji") || characterNameCheck.equalsIgnoreCase("hanzo") || characterNameCheck.equalsIgnoreCase("junkrat") || characterNameCheck.equalsIgnoreCase("mei") || characterNameCheck.equalsIgnoreCase("pharah") || characterNameCheck.equalsIgnoreCase("reaper") || characterNameCheck.equalsIgnoreCase("sojourn") || characterNameCheck.equalsIgnoreCase("soldier76") || characterNameCheck.equalsIgnoreCase("soldier") || characterNameCheck.equalsIgnoreCase("76") || characterNameCheck.equalsIgnoreCase("sombra") || characterNameCheck.equalsIgnoreCase("symmetra") || characterNameCheck.equalsIgnoreCase("torbjörn") || characterNameCheck.equalsIgnoreCase("tracer") || characterNameCheck.equalsIgnoreCase("venture") || characterNameCheck.equalsIgnoreCase("widowmaker")) {
                            System.out.println("Dps deu bom");
                            charactersPlayed[i] = characterNameCheck;
                            break;
                        } else {
                            System.out.println("Please enter a valid Dps");
                            errorOccourred = true;
                            break loop;

                        }

                    case 3:
                    case 4:
                        if (characterNameCheck.equalsIgnoreCase("ana") || characterNameCheck.equalsIgnoreCase("baptiste") || characterNameCheck.equalsIgnoreCase("brigitte") || characterNameCheck.equalsIgnoreCase("illari") || characterNameCheck.equalsIgnoreCase("juno") || characterNameCheck.equalsIgnoreCase("kiriko") || characterNameCheck.equalsIgnoreCase("lifeweaver") || characterNameCheck.equalsIgnoreCase("lúcio") || characterNameCheck.equalsIgnoreCase("lucio") || characterNameCheck.equalsIgnoreCase("mercy") || characterNameCheck.equalsIgnoreCase("moira") || characterNameCheck.equalsIgnoreCase("zenyatta") || characterNameCheck.equalsIgnoreCase("zen")) {
                            System.out.println("Suporte deu bom");
                            charactersPlayed[i] = characterNameCheck;
                            break;
                        } else {
                            System.out.println("Please enter a valid Support");
                            errorOccourred = true;
                            break loop;
                        }
                }
            }
            if (errorOccourred == false) /*Executa se nenhum erro ocorreu*/ {
                HeroOccurrence heroOccurrence = new HeroOccurrence(charactersPlayed);
                heroOccurrence.plusMatches();
                heroOccurrence.addToFile();
            }

        } else if (writeOrObtain.equalsIgnoreCase("Obtain")) {
            HeroOccurrence heroOccurence = new HeroOccurrence(); // Esse constructor chama o método characterMedium() em HeroOccurrence
        } else {
            System.out.println("Please enter either WRITE or OBTAIN");
        }
    }
}








/*
    boolean validAnswer = false;

    while(validAnswer == false){}
    Are they the same?
    while(!validAnswer){}
*/
