public class CricketTeam extends Team {
    public CricketTeam(String n, String m) {
        super(n, m);
    }
    
    public String toString() {
        return ("Our name is " + name + "\nWe play Cricket");
    }
    
    public void getMascot(){
        System.out.print("Our Cricket team mascot name is ");
        super.getMascot();
    }
}