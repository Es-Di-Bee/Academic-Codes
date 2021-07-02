public class Main{
    public static void main(String[] args) {
        MyString a = new MyString();
        
        MyString b = new MyString("programming");
//        System.out.println(b.length());
//        
//        System.out.println(b.charAt(3));
//        
//        System.out.println(b.startsWith("pro"));
//        
//        System.out.println(b.endsWith("ing"));
//       
//        MyString c = b.replaceFirst('o', 'U');
//        System.out.println(c.a);
//        System.out.println(b.a); // this line is to show that the main char array is still unchanged
//        
//        MyString d = b.replaceAll('r', 'H');
//        System.out.println(d.a);
//        
//        MyString e = b.replaceLast('n', 'G');
//        System.out.println(e.a);
//        
        MyString f = new MyString("PrOGrAmMiNg");
        f = f.toLowerCase();
        System.out.println(f.a);
//        
//        MyString g = new MyString("PrOGrAmMiNg");
//        g = g.toUpperCase();
//        System.out.println(g.a);
//        
//        MyString h = new MyString("coding");
//        System.out.println(b.equals(f)); // f has now "programming"
//        System.out.println(b.equals(h)); // h has now "coding"
//        
//        System.out.println("programming".equalsIgnoreCase("PROGRAMMING")); // f has now smallCase and g hase UpperCase
//        
//        System.out.println("abj".compareTo("abe"));
//        
//        System.out.println("abj".compareToIgnoreCase("ABE"));
//        
//        MyString i = new MyString("programming");
//        i = i.substring(3);
//        System.out.println(i.a);
//        
//        MyString j = new MyString("programming");
//        j = j.substring(3, 7);
//        System.out.println(j.a);
//        
//        System.out.println(b.indexOf('m'));
//        
//        System.out.println(b.lastIndexOf('m'));
//        
//        System.out.println(b.lastIndexOf('m', 8));
//        
//        MyString k = new MyString("oracle");
//        System.out.println(b.indexOf(k));
//        
//        System.out.println(b.concat(k).a);
//        
//        char[] chars = {'o','r','a','c','l','e'};
//        System.out.println(b.concat(chars).a);
    }
}