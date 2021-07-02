import java.util.*;
public class Manager{
    public static void main(String []args){
        Scanner k=new Scanner(System.in);
        StudentDatabase sd = new StudentDatabase();
        sd.records = new Student [3];
        int c=0;
        while(c<sd.records.length){
            sd.records[c] = new Student();
            System.out.print("Naam dao: ");
            sd.records[c].name=k.nextLine();
            System.out.print("ID dao: ");
            sd.records[c].id=k.nextLine();
            System.out.print("Section dao: ");
            sd.records[c].section=k.nextInt();
            System.out.print("Mark nai?: ");
            sd.records[c].mark=k.nextDouble();
            k.nextLine();
            ++c;
        }
        System.out.println();
        System.out.println("Press 1 for: Sort by Name");
        System.out.println("Press 2 for: Sort by ID");
        System.out.println("Press 3 for: Sort by Section");
        System.out.println("Press 4 for: Sort by Mark (Income)");
        System.out.println("Konta chao?");
        int choice = k.nextInt();
        
        if(choice==1){
            sd.sortByName();
        }else if(choice==2){
            sd.sortByID();
        }else if(choice==3){
            sd.sortBySection();
        }else if(choice==4){
            sd.sortByMark();
        }else{
            System.out.println("shudhu matro 1-4 er moddhe button press korte parba");
        }
        
        sd.printDatabase();
    }
}