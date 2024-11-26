import java.util.Scanner;

public class HeroOccurrenceTest {

    public static void Main (String[] args) {

        Scanner input = new Scanner(System.in);

        String characterNameCheck = null;
        String[] charactersPlayed = new String[5]; //0-1-2-3-4  -- 5 values

        loop : for(int i = 0 ; i < 5; i++) {
            switch (i){
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

            switch(i) {
                case 0:
                    if(characterNameCheck.equalsIgnoreCase("dva") ||  characterNameCheck.equalsIgnoreCase("doomfist") ||  characterNameCheck.equalsIgnoreCase("queen") ||  characterNameCheck.equalsIgnoreCase("mauga") ||  characterNameCheck.equalsIgnoreCase("orisa") ||  characterNameCheck.equalsIgnoreCase("ramattra") ||  characterNameCheck.equalsIgnoreCase("reinhardt") ||  characterNameCheck.equalsIgnoreCase("roadhog") ||  characterNameCheck.equalsIgnoreCase("sigma") ||  characterNameCheck.equalsIgnoreCase("winston") ||  characterNameCheck.equalsIgnoreCase("hammond") ||  characterNameCheck.equalsIgnoreCase("zarya") )
                    {
                        System.out.println("Tanque deu bom");
                        charactersPlayed[i] = characterNameCheck;
                        break;
                    } else {
                        System.out.println("Please enter a valid Tank");
                        break loop;
                    }

                case 1:
                case 2:
                    if(characterNameCheck.equalsIgnoreCase("ashe") ||  characterNameCheck.equalsIgnoreCase("bastion") ||  characterNameCheck.equalsIgnoreCase("cassidy") ||  characterNameCheck.equalsIgnoreCase("echo") ||  characterNameCheck.equalsIgnoreCase("genji") ||  characterNameCheck.equalsIgnoreCase("hanzo") ||  characterNameCheck.equalsIgnoreCase("junkrat") ||  characterNameCheck.equalsIgnoreCase("mei") ||  characterNameCheck.equalsIgnoreCase("pharah") ||  characterNameCheck.equalsIgnoreCase("reaper") ||  characterNameCheck.equalsIgnoreCase("sojourn") ||  characterNameCheck.equalsIgnoreCase("soldier76") ||  characterNameCheck.equalsIgnoreCase("soldier") ||  characterNameCheck.equalsIgnoreCase("76") ||  characterNameCheck.equalsIgnoreCase("sombra") ||  characterNameCheck.equalsIgnoreCase("symmetra") ||  characterNameCheck.equalsIgnoreCase("torbjörn") ||  characterNameCheck.equalsIgnoreCase("tracer") ||  characterNameCheck.equalsIgnoreCase("venture") ||  characterNameCheck.equalsIgnoreCase("widowmaker") )
                    {
                        System.out.println("Dps deu bom");
                        charactersPlayed[i] = characterNameCheck;
                        break;
                    } else {
                        System.out.println("Please enter a valid Dps");
                        break loop;
                        
                    }

                case 3:
                case 4:
                    if(characterNameCheck.equalsIgnoreCase("ana") ||  characterNameCheck.equalsIgnoreCase("baptiste") ||  characterNameCheck.equalsIgnoreCase("brigitte") ||  characterNameCheck.equalsIgnoreCase("illari") ||  characterNameCheck.equalsIgnoreCase("juno") ||  characterNameCheck.equalsIgnoreCase("kiriko") ||  characterNameCheck.equalsIgnoreCase("lifeweaver") ||  characterNameCheck.equalsIgnoreCase("lúcio") ||  characterNameCheck.equalsIgnoreCase("lucio") ||  characterNameCheck.equalsIgnoreCase("mercy") ||  characterNameCheck.equalsIgnoreCase("moira") ||  characterNameCheck.equalsIgnoreCase("zenyatta")|| characterNameCheck.equalsIgnoreCase("zen"))
                    {
                        System.out.println("Suporte deu bom");
                        charactersPlayed[i] = characterNameCheck;
                        break;
                    } else {
                        System.out.println("Please enter a valid Support");
                        break loop;
                    }
            }
        }

        HeroOccurrence heroOccurrence = new HeroOccurrence(charactersPlayed);
        heroOccurrence.addToFile();

        // Perguntar se quer obter média de personagens. (Y/N)
        // Se sim, chama método characterMedium() em HeroOccurrence



    }
}
