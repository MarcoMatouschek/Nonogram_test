public class Model{
  
  private static final int EASY;
  private static final int MED;
  private static final int HARD;
 
  private boolean[][] value;
  
  public Model(){
    EASY = 25;
    MED = 15;
    HARD = 10;
    init(2);
  }
  
  public boolean[][] getValue(){
    return this.value;
  }
  
  public void init(int diff){
    int size;
    if(diff == 1) size = EASY;
    else if(diff == 2) size = MED;
    else if(diff == 3) size = HARD;
    
    this.value = new boolean[size][size];
    
    for(int i=0; i<size; i++){
      for(int j=0; j<size; j++){
        this.value[i][j] = randomBoolean();
      }
    }
  }
}
