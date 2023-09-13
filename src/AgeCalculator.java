import java.io.Console;
import java.time.LocalDate;

public class AgeCalculator {
  

  private Console cnsl = System.console();


  public AgeCalculator(){} 

  public void run (){

    boolean b = false;

    do{
      int birthDate = Integer.parseInt(cnsl.readLine("Enter your birth year : "));

      if (birthDate>1930 & birthDate<LocalDate.now().getYear() ) {
        System.out.println(LocalDate.now().getYear()-birthDate);
      }else{
        b= true;
        System.out.println("wrong input");
      }

    }while(b);
  }
  

  


}
