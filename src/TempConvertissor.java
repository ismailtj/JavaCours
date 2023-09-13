import java.io.Console;

public class TempConvertissor {
  
  Console cnsl = System.console();

  public void run(){

    System.out.println("Choose one of those");
    System.out.println("    1 - C to F");
    System.out.println("    2 - F to C");

    int menuChoice = Integer.parseInt(cnsl.readLine(" choice : "));
    double temp = Integer.parseInt(cnsl.readLine(" the temp to convert is : "));

    switch (menuChoice) {
      case 1:
        System.out.println(temp+"C° = "+c2f(temp)+"F°");
        break;
      case 2:
          System.out.println(temp+"F° = "+f2c(temp)+"C°");
        break;
      default:
        break;
    }
  }


  private double f2c(double temp){
    return ((temp-32)/1.8);
  }

  private double c2f(double temp){
    return (5*1.8)+32;
  }

}
