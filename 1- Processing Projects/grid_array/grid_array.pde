void setup() {
  size (1700, 800);
}

void draw() {
  background(220);
}
class grid {
  int ROWS, COLS;
  Boolean[][] gridarray;
  //constructor
  grid(int tempr, int tempc) {
    ROWS = tempr;
    COLS = tempc;
    gridarray = new boolean[ROWS][COLS];
  }   
     
    void gridarray {  
    for (int y =0; y < ROWS; y++) {
      for (int x = 0, x < COLS; x++) {
        gridarray[y][x] = false;
      }
    }
  }
}
