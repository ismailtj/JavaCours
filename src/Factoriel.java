import java.io.Console;

public class Factoriel {
  
  private Console console = System.console();

  public void run(){
    int num = Integer.parseInt(console.readLine("choose a number : "));
    System.out.println("the factoriel of "+num+" is "+calculeFacto(num));
  }

  private int calculeFacto(int x){
    if (x<0) {
      throw new IllegalArgumentException("le num doit etre positife");
    } else if (x==0||x==1) {
      return 1;
    }else{
      return x*calculeFacto(x-1);
    }
  }

  

}
