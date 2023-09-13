import java.io.Console;

public class SuiteFibo {
  private Console console = System.console();
  public void run(){
    int num = Integer.parseInt(console.readLine("choose a number : "));
    System.out.println("the factoriel of "+num+" is "+calculeSuite(num));
  }
  private int calculeSuite(int num) {
    if (num==0) {
      return 0;
    }

    if (num==1) {
      return 1;
    }
    return calculeSuite(num-1)+calculeSuite(num-2);
  }
}
