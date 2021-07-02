public class Task7 {
    
    static int comparingFunc (String one, String two) {
        return  one.compareTo(two);          //checking lexicographically
        // if a char of first string has  less ASCII than the char of second index, it returns a negative value, otherwise positive
        // will print 0 if both the strings are the same
    }
    
    static void comparingIgnoringCase (String one, String two) {
        System.out.println("Comapare TO Ignore Case: " + one.compareToIgnoreCase(two)); // ignoring upper and lower case issue while checking lexicographically
    }
    
    static void startingWith (String one) {
        if (one.startsWith("this")) {
            System.out.println("Starts With: Yes, it does.");
        } else {
            System.out.println("Starts With: No, it doesn't.");
        }
    }
    
    static boolean endingWith (String one) {
        if (one.endsWith("lab")) {
            return true;
        } 
        return false;
    }
    
    static boolean isequal (String one, String two) {
        if(one.equals(two)) {
            return true;
        }
        return false;
    }
    
    static void isequalIgnoringCase(String one, String two) {
        if (one.equalsIgnoreCase(two)) {
            System.out.println("Equal Ignore Case: Yes, it IS equal");
        } else {
            System.out.println("Equal Ignore Case: No, it IS NOT equal");
        }
    }
    
    static int indexFoundAt(String one) {
        return one.indexOf('n');
    }
    
    static int lastIndexFoundAt(String one) {
        return one.lastIndexOf('a');
    }
    
    static String replacing(String one) {
        return one.replace('a', 'p');
    }
    
    static String subStringFunc(String one) {
        return one.substring(3);
    }
    
    static String subStringFunc2 (String one) {
        return one.substring(5,14);
    }
    
    static char[] characterArray (String one) {
        char[] array = one.toCharArray();
        return array;
    }
    
    static void lowerCase (String one) {
        System.out.println(one.toLowerCase());
    }
    
    static void upperCase (String one) {
        System.out.println(one.toUpperCase());
    }
   
    static String trimFunc (String one) {
        return one.trim();
    }
    
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "dcab";
        System.out.println("CompareTo: " + comparingFunc(str1, str2));
        System.out.println("CompareTo: " + comparingFunc(str2, str1));
        str1 = "asd";
        str2 = "asd";
        System.out.println("CompareTo: " + comparingFunc(str1, str2));
        str1 = "AbCd";
        str2 = "aBcD";
        comparingIgnoringCase(str1, str2);
        str1 = "this is a practice code";
        startingWith(str1);
        str2 = "practice code is this one";
        startingWith(str2);
        str1 = "i am doig this at the lab";
        if(endingWith(str1)) {
            System.out.println("Ends With: Yes, it does");
        }
        str2 = "at the lab, this is being done by me";
        if(endingWith(str2)) {
            System.out.println("Ends With: Yes, it does");
        } else {
            System.out.println("Ends With: No, it doesn't");
        }
        str1 = "my name is shadab";
        str2 = "shadab is my name";
        if (isequal(str1, str2)) {
            System.out.println("Equals: Yes, it is equal.");
        } else {
            System.out.println("Equals: No, it is NOT equal.");
        }
        str1 = "my name is shadab";
        str2 = "MY NAME IS SHADAB";
        isequalIgnoringCase(str1, str2);
        System.out.println("Index Of: "+ indexFoundAt(str1));
        System.out.println("Last Index Of: " + lastIndexFoundAt(str1));
        System.out.println(replacing(str1));
        System.out.println(subStringFunc(str1));
        System.out.println(subStringFunc2(str1));
        char[] a = characterArray(str1);
        for (char i : a) {
            System.out.print(i + ", ");
        }
        System.out.println();
        lowerCase(str2);
        upperCase(str1);
        str1 = "    whitespace will be removed    ";
        System.out.println(trimFunc(str1));
        
    }
}