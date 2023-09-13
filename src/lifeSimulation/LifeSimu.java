package lifeSimulation;

public class LifeSimu {
  

  private boolean[][] grid;
  private int ruleOfNeighboorMin; //0
  private int ruleOfNeighboorMax; //8
  private int ruleToNewBorn;

  public LifeSimu( int x, int y, int minNeighboor, int maxNeighboor, int ruleToNewBorn, int[][] aliveCells ){
    grid = new boolean[x][y];
    initCellsLife(aliveCells);
    ruleOfNeighboorMax = maxNeighboor;
    ruleOfNeighboorMin = minNeighboor;
    this.ruleToNewBorn= ruleToNewBorn;
  }

  public boolean[][] getGrid() {
    return grid;
  }

  private void initCellsLife(int[][] coordinats){
    for (int[] row : coordinats) {
      if (row[0]>=0 && row[1]>=0 && row[0]<grid[1].length && row[0]<grid.length) {
        grid[row[0]][row[1]]=true;
      }
    }
  }




  public boolean isAllCellsDead(boolean[][] x){
    for (boolean[] row : x) {
      for (boolean cell : row) {
        if (cell) {
          //System.out.println("still alive");
          return false;
        }
      }
    }
    return true;
  }

  private boolean isCellSurvives(int x, int y){


    int pop = 0;
    
    for(int j = y-1; j<= y+1 ;j++){
      for(int i = x-1; i<=x+1;i++ ){
        if (i<0||j<0||i>=grid.length||j>=grid[0].length) {
          
        }else if (grid[j][i]) {pop++;}
      }
    }

    
    if (y==46 && x==45) {
      System.out.println("x:"+x+"    y:"+y+"voisins : "+pop);
    }


    if (grid[y][x]==true) {
      pop--;
      if (pop>=ruleOfNeighboorMin && pop<ruleOfNeighboorMax) {
        return true;
      }
      
    }

    //System.out.println("y:"+ x + "  x:"+y+"     "+pop);
    if (grid[y][x]==false && pop==ruleToNewBorn ) {
      
      return true;
    }

    return false;

  }


  private boolean[][] nextGenGrid(boolean[][] x){
    boolean[][] nextGrid=new boolean[x[0].length][x.length];

    int rowIndex=0;
    int cellIndex;
    for (boolean[] row : x) {
      cellIndex = 0;
      for (boolean cell : row) {
          nextGrid[rowIndex][cellIndex]=isCellSurvives(cellIndex,rowIndex );
        cellIndex++;
      }
      rowIndex++;
    }

    return nextGrid;

  }

  public void passToNextGen(){
    grid = nextGenGrid(grid);
  }







  






}
