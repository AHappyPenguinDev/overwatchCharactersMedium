import java.util.Scanner;

public class HeroOccurrenceTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String characterNameCheck;
        String[] charactersPlayed = new String[5]; //0-1-2-3-4  -- 5 values

        boolean errorOccurred = false;

        System.out.println("Would you like to write a new match or obtain the medium of matches? (write/obtain)");
        String writeOrObtain = input.nextLine();

        if (writeOrObtain.equalsIgnoreCase("write")) {
            /*label*/ loop: for (int i = 0; i < 5; i++) {
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

                characterNameCheck = input.nextLine().toLowerCase();

                //characterNameCheck = characterNameCheck.toLowerCase();

                switch (i) {
                    case 0:
                        if (characterNameCheck.equals("dva") || characterNameCheck.equals("doomfist") || characterNameCheck.equals("queen") || characterNameCheck.equals("mauga") || characterNameCheck.equals("orisa") || characterNameCheck.equals("hazard") || characterNameCheck.equals("ramattra") || characterNameCheck.equals("reinhardt") || characterNameCheck.equals("roadhog") || characterNameCheck.equals("sigma") || characterNameCheck.equals("winston") || characterNameCheck.equals("hammond") || characterNameCheck.equals("zarya")) {
                            System.out.println("Tanque deu bom");
                            charactersPlayed[i] = characterNameCheck;
                            break;
                        } else {
                            System.out.println("Please enter a valid Tank");
                            errorOccurred = true;
                            break loop;
                        }

                    case 1:
                    case 2:
                        if (characterNameCheck.equals("ashe") || characterNameCheck.equals("bastion") || characterNameCheck.equals("cassidy") || characterNameCheck.equals("echo") || characterNameCheck.equals("genji") || characterNameCheck.equals("hanzo") || characterNameCheck.equals("junkrat") || characterNameCheck.equals("mei") || characterNameCheck.equals("pharah") || characterNameCheck.equals("reaper") || characterNameCheck.equals("sojourn") || characterNameCheck.equals("soldier76") || characterNameCheck.equals("soldier") || characterNameCheck.equals("76") || characterNameCheck.equals("sombra") || characterNameCheck.equals("symmetra") || characterNameCheck.equals("torbjörn") || characterNameCheck.equals("tracer") || characterNameCheck.equals("venture") || characterNameCheck.equals("widowmaker")) {
                            System.out.println("Dps deu bom");
                            charactersPlayed[i] = characterNameCheck;
                            break;
                        } else {
                            System.out.println("Please enter a valid Dps");
                            errorOccurred = true;
                            break loop;

                        }

                    case 3:
                    case 4:
                        if (characterNameCheck.equals("ana") || characterNameCheck.equals("baptiste") || characterNameCheck.equals("brigitte") || characterNameCheck.equals("illari") || characterNameCheck.equals("juno") || characterNameCheck.equals("kiriko") || characterNameCheck.equals("lifeweaver") || characterNameCheck.equals("lúcio") || characterNameCheck.equals("lucio") || characterNameCheck.equals("mercy") || characterNameCheck.equals("moira") || characterNameCheck.equals("zenyatta") || characterNameCheck.equals("zen")) {
                            System.out.println("Suporte deu bom");
                            charactersPlayed[i] = characterNameCheck;
                            break;
                        } else {
                            System.out.println("Please enter a valid Support");
                            errorOccurred = true;
                            break loop;
                        }
                }
            }
            if (!errorOccurred) /*Executa se nenhum erro ocorreu*/ {
                HeroOccurrence heroOccurrence = new HeroOccurrence(charactersPlayed);
                heroOccurrence.plusMatches();
                heroOccurrence.addToFile();
            }

        } else if (writeOrObtain.equals("Obtain")) {
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
