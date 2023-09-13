package lifeSimulation;

public class God {
  private LifeSimu lifeSimu ;

  int[][] coordinatesAliveCells = {
    {3,2},
    {2,2},
    {3,3},
    {3,4},
    //{2, 3},
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
    lifeSimu = new LifeSimu(10,10,3,7,coordinatesAliveCells);
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

    //drawGrid(lifeSimu.getGrid());
    do{
      drawGrid(lifeSimu.getGrid());
      lifeSimu.passToNextGen();
      Thread.sleep(100);
    }while(!lifeSimu.isAllCellsDead(lifeSimu.getGrid()));
    drawGrid(lifeSimu.getGrid());
  }
  
  
}
