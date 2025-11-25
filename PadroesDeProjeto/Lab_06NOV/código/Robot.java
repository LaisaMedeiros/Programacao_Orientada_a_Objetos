public class Robot extends Mobile {

    private State state = State.CENTER;
    private int targetLine = 5;
    private int targetColumn = 5;
    private boolean shouldMove = true;

    public Robot(){
    }    

    public Move move(){
        if (!shouldMove) {
            return Move.STOP;
        }
        
        int currentLine = this.GPS.getLine(this.id);
        int currentColumn = this.GPS.getColumn(this.id);

        System.out.println("DEBUG - Drone " + this.id + " em (" + currentLine + "," + currentColumn + ") -> Alvo (" + targetLine + "," + targetColumn + ")");

        if (currentLine == targetLine && currentColumn == targetColumn) {
            return Move.STOP;
        }

     
        if (currentLine < targetLine) return Move.UP;    
        if (currentLine > targetLine) return Move.DOWN;   
        if (currentColumn < targetColumn) return Move.LEFT;  
        if (currentColumn > targetColumn) return Move.RIGHT; 
        
        return Move.STOP;
    }
    
    public void setState(State newState) {
        this.state = newState;
    }
    
    public void setTarget(int line, int column) {
        this.targetLine = line;
        this.targetColumn = column;
        this.state = State.CENTER;
        this.shouldMove = true;
    }
    
    public void setMoving(boolean moving) {
        this.shouldMove = moving;
    }
}