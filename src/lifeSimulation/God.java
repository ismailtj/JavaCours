package lifeSimulation;

public class God {
  private LifeSimu lifeSimu ;

  int[][] coordinatesAliveCells = {
    // {0, 0},
    // {0, 4},
    // {1, 2},
    // {1, 3},
    // {2, 2},
    // {2, 4},
    // {3, 0},
    // {3, 3},
    // {3, 0},
    {25,25},
    {26,25},
    {27,25},
    {27,26},
    {27,27},
    {26,27},
    {25,27},
  };

  // {0, 0},
  //   {0, 4},
  //   {1, 2},
  //   {1, 3},
  //   {2, 2},
  //   {2, 4},
  //   {3, 0},
  //   {3, 3},
  //   {3, 0},
  
  


  public God(){
    lifeSimu = new LifeSimu(50,50,2,4,3,coordinatesAliveCells);
  }

  private void drawGrid(boolean[][] x){
    for (boolean[] row : x) {
      for (boolean cell : row) {
        if (cell) {
          System.out.printf("\u2588"); 
        }
        if (!cell) {
          System.out.printf("\u2591"); 
          
        }
      }
      System.out.println();
    }
    System.out.println();
  }


  public void run() throws InterruptedException{

    int i=0;
    //drawGrid(lifeSimu.getGrid());
    do{
      System.out.println("Generation:  "+i);
      // if (i==0 || (i>=109 && i<=111)) {
      //   drawGrid(lifeSimu.getGrid());
      // } 
      drawGrid(lifeSimu.getGrid());
      lifeSimu.passToNextGen();
      Thread.sleep(100);
      i++;
      // if (i==112) {
      //   return;
      // }
    }while(!lifeSimu.isAllCellsDead(lifeSimu.getGrid()));
    drawGrid(lifeSimu.getGrid());
  }
  
  
}
