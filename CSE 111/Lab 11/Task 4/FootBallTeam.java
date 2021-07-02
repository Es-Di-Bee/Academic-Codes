public class FootBallTeam extends Team {
    public FootBallTeam(String n, String m) {
        super(n, m);
    }
    
    public String toString() {
        return ("Our name is " + name + "\nWe play Football");
    }
    
    public void getMascot(){
        System.out.print("Our FootBall team mascot name is ");
        super.getMascot();
    }
    
}