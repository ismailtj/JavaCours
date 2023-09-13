import java.io.Console;

public class Calculator {

  private Console console = System.console();

  public void run(){
    int num1 = Integer.parseInt(console.readLine("first number is : "));
    int num2 = Integer.parseInt(console.readLine("second number is : "));
    boolean b = true;
    String op;
    do {
      
      op = console.readLine("the operation is ( +, -, *, / ) : ");
      if (op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")) {
        b= false;
      }else{
        System.out.println("Enter the right character");
      }
    } while (b);

    switch (op) {
      case "+":
        System.out.println(num1+op+num2+"="+add(num1, num2));
        break;
        case "-":
        System.out.println(num1+op+num2+"="+sou(num1, num2));
        
        break;
        case "/":
        System.out.println(num1+op+num2+"="+div(num1, num2));
        
        break;
        case "*":
        System.out.println(num1+op+num2+"="+mul(num1, num2));
        
        break;
    
      default:
        break;
    }

  }


  private int add(int x,int z){
    return x+z;
  }
  private int sou(int x,int z){
    return x-z;
  }
  private int mul(int x,int z){
    return x*z;
  }
  private int div(int x,int z){
    return x/z;
  }

}
