import java.io.Console;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import lifeSimulation.God;
import lifeSimulation.God;

public class App {
    public static void main(String[] args) throws Exception {


        Console cnsl = System.console();
        AgeCalculator ageCalculator = new AgeCalculator();
        TempConvertissor tempConvertissor = new TempConvertissor();
        Calculator calculator = new Calculator();
        God lifeSimmulation = new God();
        Factoriel factoriel = new Factoriel();
        SuiteFibo suiteFibo = new SuiteFibo();
        
        


        System.out.println("\n\nHello, World!\n\n");


        String[] vowels = {
            "0 - life simulation",
            "1 - Calcule age",
            "2 - Calcule temp",
            "3 - Calculator",
            "4 - factoriel (recu)",
            "5 - suite fibo (recu)",
        };
        List<String> menuList =  Arrays.asList(vowels);
        menuList.forEach((x)->System.out.println(x));

        int menuChoice = Integer.parseInt( cnsl.readLine("\nchoose a menu Item :"));
        
        switch (menuChoice) {
            case 1 :
                ageCalculator.run();
                break;
            
            case 2 :
                tempConvertissor.run();
            break;
            case 3 :
                calculator.run();
            break;
            case 4 :
                factoriel.run();
            break;
            case 5 :
                suiteFibo.run();
            break;
            case 0 :
                lifeSimmulation.run();
            break;
            default:
                break;
        }


        


    }


}
