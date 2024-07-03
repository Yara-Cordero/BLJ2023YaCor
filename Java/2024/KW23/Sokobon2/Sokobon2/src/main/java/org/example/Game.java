package org.example;

public class Game {

  private int[][] gameField;

  boolean boxDestination = false;

  public Game() {
    gameField = new int[][] {
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 1, 1, 1, 1, 1, 0, 0 },
            { 0, 1, 1, 1, 0, 0, 0, 1, 0, 0 },
            { 0, 1, 4, 2, 3, 0, 0, 1, 0, 0 },
            { 0, 1, 1, 1, 0, 3, 4, 1, 0, 0 },
            { 0, 1, 4, 1, 1, 3, 0, 1, 0, 0 },
            { 0, 1, 0, 1, 0, 4, 0, 1, 1, 0 },
            { 0, 1, 3, 0, 7, 3, 3, 4, 1, 0 },
            { 0, 1, 0, 0, 0, 4, 0, 0, 1, 0 },
            { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
    };
  }

  public Game(int[][] gameField) {
    this.gameField = gameField;
  }

  
  public void moveUp() {
    System.out.println("UP");
    for(int x = 0; x < gameField.length; x++) {
      for (int y = 0; y < gameField[0].length; y++){
          if (gameField[x][y] == 2){
            // Move over empty spaces
            if (gameField[x - 1][y] == 0) {
              gameField[x][y] = 0;
              gameField[x - 1][y] = 2;
              return;
            }
            // Move on green field
            if (gameField[x - 1][y] == 4) {
              gameField[x][y] = 0;
              gameField[x - 1][y] = 6;
              return;
            }
            // Move box with non-empty space
            if (gameField[x - 1][y] == 3 && gameField[x - 2][y] == 4) {
              gameField[x][y] = 0;
              gameField[x - 1][y] = 2;
              gameField[x - 2][y] = 7;
              return;
            }
            // Move box with empty space
            if (gameField[x - 1][y] == 3 && gameField[x - 2][y] == 0) {
              gameField[x][y] = 0;
              gameField[x - 1][y] = 2;
              gameField[x - 2][y] = 3;
              return;
            }
            try {
              if (gameField[x - 1][y] == 7 && gameField[x - 2][y] == 4) {
                gameField[x][y] = 0;
                gameField[x - 1][y] = 2;
                gameField[x - 2][y] = 7;
                return;
              }
              // Move box with empty space
              if (gameField[x - 1][y] == 7 && gameField[x - 2][y] == 0) {
                gameField[x][y] = 0;
                gameField[x - 1][y] = 2;
                gameField[x - 2][y] = 3;
                return;
              }
            } catch (ArrayIndexOutOfBoundsException e){
              System.out.println("u are a bitch ");
            }

          }
          // special case of 6
          if (gameField[x][y] == 6) {
            if (gameField[x - 1][y] == 0) {
              gameField[x][y] = 4;
              gameField[x - 1][y] = 2;
              return;
            }
            // Move box with non-empty space
            if (gameField[x - 1][y] == 3 && gameField[x - 2][y] == 4) {
              gameField[x][y] = 4;
              gameField[x - 1][y] = 2;
              gameField[x - 2][y] = 7;
              return;
            }
            // Move box with empty space
            if (gameField[x - 1][y] == 3 && gameField[x - 2][y] == 0) {
              gameField[x][y] = 4;
              gameField[x - 1][y] = 2;
              gameField[x - 2][y] = 3;
              return;
            }
            if (gameField[x - 1][y] == 7 && gameField[x - 2][y] == 4) {
              gameField[x][y] = 4;
              gameField[x - 1][y] = 2;
              gameField[x - 2][y] = 7;
              return;
            }
            // Move box with empty space
            if (gameField[x - 1][y] == 7 && gameField[x - 2][y] == 0) {
              gameField[x][y] = 4;
              gameField[x - 1][y] = 2;
              gameField[x - 2][y] = 3;
              return;
            }
          }
      }
    }
  }

  public void moveDown() {
    System.out.println("DOWN");
    for(int x = 0; x < gameField.length; x++) {
      for (int y = 0; y < gameField[0].length; y++){
        if (gameField[x][y] == 2){
          // Move over empty spaces
          if (gameField[x + 1][y] == 0) {
            gameField[x][y] = 0;
            gameField[x + 1][y] = 2;
            return;
          }
          // Move on green field
          if (gameField[x + 1][y] == 4) {
            gameField[x][y] = 0;
            gameField[x + 1][y] = 6;
            return;
          }
          // Move box with non-empty space
          if (gameField[x + 1][y] == 3 && gameField[x + 2][y] == 4) {
            gameField[x][y] = 0;
            gameField[x + 1][y] = 2;
            gameField[x + 2][y] = 7;
            return;
          }
          // Move box with empty space
          if (gameField[x + 1][y] == 3 && gameField[x + 2][y] == 0) {
            gameField[x][y] = 0;
            gameField[x + 1][y] = 2;
            gameField[x + 2][y] = 3;
            return;
          }
          if (gameField[x + 1][y] == 7 && gameField[x + 2][y] == 4) {
            gameField[x][y] = 0;
            gameField[x + 1][y] = 2;
            gameField[x + 2][y] = 7;
            return;
          }
          // Move box with empty space
          if (gameField[x + 1][y] == 7 && gameField[x + 2][y] == 0) {
            gameField[x][y] = 0;
            gameField[x + 1][y] = 2;
            gameField[x + 2][y] = 3;
            return;
          }
        }
        // special case of 6
        if (gameField[x][y] == 6) {
          if (gameField[x + 1][y] == 0) {
            gameField[x][y] = 4;
            gameField[x + 1][y] = 2;
            return;
          }
          if (gameField[x + 1][y] == 3 && gameField[x + 2][y] == 4) {
            gameField[x][y] = 4;
            gameField[x + 1][y] = 2;
            gameField[x + 2][y] = 7;
            return;
          }
          // Move box with empty space
          if (gameField[x + 1][y] == 3 && gameField[x + 2][y] == 0) {
            gameField[x][y] = 4;
            gameField[x + 1][y] = 2;
            gameField[x + 2][y] = 3;
            return;
          }
          if (gameField[x + 1][y] == 7 && gameField[x + 2][y] == 4) {
            gameField[x][y] = 4;
            gameField[x + 1][y] = 2;
            gameField[x + 2][y] = 7;
            return;
          }
          // Move box with empty space
          if (gameField[x + 1][y] == 7 && gameField[x + 2][y] == 0) {
            gameField[x][y] = 4;
            gameField[x + 1][y] = 2;
            gameField[x + 2][y] = 3;
            return;
          }
        }
      }
    }
  }

  public void moveLeft() {
    System.out.println("LEFT");
    for (int x = 0; x < gameField.length; x++) {
      for (int y = 0; y < gameField[0].length; y++) {
        if (gameField[x][y] == 2) {
          // Move over empty spaces
          if (gameField[x][y - 1] == 0) {
            gameField[x][y] = 0;
            gameField[x][y - 1] = 2;
            return;
          }
          // Move on green field
          if (gameField[x][y - 1] == 4) {
            gameField[x][y] = 0;
            gameField[x][y - 1] = 6;
            return;
          }
          // Move box with non-empty space
          if (gameField[x][y - 1] == 3 && gameField[x][y - 2] == 4) {
            gameField[x][y] = 0;
            gameField[x][y - 1] = 2;
            gameField[x][y - 2] = 7;
            return;
          }
          // Move box with empty space
          if (gameField[x][y - 1] == 3 && gameField[x][y - 2] == 0) {
            gameField[x][y] = 0;
            gameField[x][y - 1] = 2;
            gameField[x][y - 2] = 3;
            return;
          }
          if (gameField[x][y - 1] == 7 && gameField[x][y - 2] == 4) {
            gameField[x][y] = 0;
            gameField[x][y - 1] = 2;
            gameField[x][y - 2] = 7;
            return;
          }
          // Move box with empty space
          if (gameField[x][y - 1] == 7 && gameField[x][y - 2] == 0) {
            gameField[x][y] = 0;
            gameField[x][y - 1] = 2;
            gameField[x][y - 2] = 3;
            return;
          }
        }
        // special case of 6
        if (gameField[x][y] == 6) {
          if (gameField[x][y - 1] == 0) {
            gameField[x][y] = 4;
            gameField[x][y - 1] = 2;
            return;
          }
          // Move box with non-empty space
          if (gameField[x][y - 1] == 3 && gameField[x][y - 2] == 4) {
            gameField[x][y] = 4;
            gameField[x][y - 1] = 2;
            gameField[x][y - 2] = 7;
            return;
          }
          // Move box with empty space
          if (gameField[x][y - 1] == 3 && gameField[x][y - 2] == 0) {
            gameField[x][y] = 4;
            gameField[x][y - 1] = 2;
            gameField[x][y - 2] = 3;

          }
          if (gameField[x][y - 1] == 7 && gameField[x][y - 2] == 4) {
            gameField[x][y] = 4;
            gameField[x][y - 1] = 2;
            gameField[x][y - 2] = 7;
            return;
          }
          // Move box with empty space
          if (gameField[x][y - 1] == 7 && gameField[x][y - 2] == 0) {
            gameField[x][y] = 4;
            gameField[x][y - 1] = 2;
            gameField[x][y - 2] = 3;

          }
        }
      }
    }
  }
  public void moveRight(){
    System.out.println("RIGHT");
    for(int x = 0; x < gameField.length; x++) {
      for (int y = 0; y < gameField[0].length; y++) {
        if (gameField[x][y] == 2) {
          //move over empty spaces
          if (gameField[x][y + 1] == 0) {
            gameField[x][y] = 0;
            gameField[x][y + 1] = 2;
            return;
          }
          //move on green field
          if (gameField[x][y + 1] == 4) {
            gameField[x][y] = 0;
            gameField[x][y + 1] = 6;
            return;
          }
          // move box with non-empty space
          if (gameField[x][y + 1] == 3 && gameField[x][y + 2] == 4) {
            gameField[x][y] = 0;
            gameField[x][y + 1] = 2;
            gameField[x][y + 2] = 7;
            return;
          }
          // move box with empty space
          if (gameField[x][y + 1] == 3 && gameField[x][y + 2] == 0) {
            gameField[x][y] = 0;
            gameField[x][y + 1] = 2;
            gameField[x][y + 2] = 3;
            return;
          }
          if (gameField[x][y + 1] == 7 && gameField[x][y + 2] == 4) {
            gameField[x][y] = 0;
            gameField[x][y + 1] = 2;
            gameField[x][y + 2] = 7;
            return;
          }
          // move box with empty space
          if (gameField[x][y + 1] == 7 && gameField[x][y + 2] == 0) {
            gameField[x][y] = 0;
            gameField[x][y + 1] = 2;
            gameField[x][y + 2] = 3;
            return;
          }
        }
        // special case of 6
        if (gameField[x][y] == 6) {
          if (gameField[x][y + 1] == 0) {
            gameField[x][y] = 4;
            gameField[x][y + 1] = 2;
            return;
          }
          if (gameField[x][y + 1] == 3 && gameField[x][y +2] == 4){
            gameField[x][y] = 4;
            gameField[x][y + 1] = 2;
            gameField[x][y + 2] = 7;
            return;
          }
          // move box with empty space
          if (gameField[x][y + 1] == 3 && gameField[x][y +2] == 0) {
            gameField[x][y] = 4;
            gameField[x][y + 1] = 2;
            gameField[x][y + 2] = 3;
            return;
          }
          if (gameField[x][y + 1] == 7 && gameField[x][y +2] == 4){
            gameField[x][y] = 4;
            gameField[x][y + 1] = 2;
            gameField[x][y + 2] = 7;
            return;
          }
          // move box with empty space
          if (gameField[x][y + 1] == 7 && gameField[x][y +2] == 0) {
            gameField[x][y] = 4;
            gameField[x][y + 1] = 2;
            gameField[x][y + 2] = 3;
            return;
          }
        }
      }
    }
  }


  public void resetField() {
    System.out.println("ESC");
  }

  public int[][] getField() {
    return gameField;
  }

  public int getColCount() {
    return gameField.length;
  }

  public int getRowCount() {
    return gameField[0].length;
  }


}
