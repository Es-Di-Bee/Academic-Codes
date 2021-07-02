abstract public class Animal {
    private String name;
    
    Animal(String _name){
        this.name = _name;
    }
    
    protected String getName(){
        return name;
    }
}