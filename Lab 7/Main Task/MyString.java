public class MyString {
    public char[] a;
    
    public MyString() {
    }
    public MyString (char[ ] charSeq) {
        a = charSeq;
    }
    public MyString (String str) {
        a = str.toCharArray();
    }
    
    public int length() {
        return a.length;
    }
    
    public char charAt ( int n ) {
        return a[n];
    }
    
    public boolean startsWith (String prefix) {
        char[] b = prefix.toCharArray();
        if (a.length < b.length)  return false;
        for (int i = 0 ; i < b.length; ++i)  if (b[i] != a[i]) return false;
        return true;
    }
    
    public boolean endsWith(String suffix) {
        char[] b = suffix.toCharArray();
        if (a.length < b.length) return false;
        for (int i = b.length-1 ; i >= 0; --i)  if (b[i] != a[a.length-b.length+i])   return false;      
        return true;
    }
    
    public MyString replaceFirst(char oldChar, char newChar) {
        MyString str = new MyString();
        str.a = new char[this.a.length];        
        for (int i = 0; i < a.length; ++i) {   // this is for copying the values of a string to another string
            str.a[i] = this.a[i];
        }
        for (int i = 0; i < a.length; ++i) {
            if (str.a[i] == oldChar) {
                str.a[i] = newChar;
                break;
            }
        }
        return str;
    }
    
    public MyString replaceAll(char oldChar, char newChar) {
        MyString str = new MyString();
        str.a = new char[this.a.length];
        for (int i = 0; i < a.length; ++i) {
            str.a[i] = this.a[i];
        }
        for (int i = 0; i < a.length; ++i) {
            if (str.a[i] == oldChar) {
                str.a[i] = newChar;
            }
        }
        return str;
    }
    
    public MyString replaceLast(char oldChar, char newChar) {
        MyString str = new MyString();
        str.a = new char[this.a.length];
        for (int i = 0; i < a.length; ++i) {
            str.a[i] = this.a[i];
        }
        for (int i = a.length-1; i >= 0; --i) {
            if (str.a[i] == oldChar) {
                str.a[i] = newChar;
                break;
            }
        }
        return str;
    }
    
    public MyString toLowerCase () {
        MyString str = new MyString();
        str.a = new char[this.a.length];
        for (int i = 0; i < a.length; ++i) {
            str.a[i] = this.a[i];
        }
        for (int i = 0; i < a.length; ++i) {
            if ( (int)a[i] < 97 )  str.a[i] = (char) ( (int) a[i] + 32 );
            else str.a[i] = this.a[i];
        }
        return str;
    }
    
    public MyString toUpperCase () {
        MyString str = new MyString();
        str.a = new char[this.a.length];
        for (int i = 0; i < a.length; ++i) {
            str.a[i] = this.a[i];
        }
        for (int i = 0; i < a.length; ++i) {
            if ( (int)a[i] >= 97 )  str.a[i] = (char) ( (int) a[i] - 32 );
            else str.a[i] = this.a[i];
        }
        return str;
    }
    public boolean equals(MyString rightStr) {
        if (this.a.length != rightStr.a.length) return false;
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] != rightStr.a[i]) return false;
        }
        return true;
    }
    
    public boolean equalsIgnoreCase(MyString rightStr) {
        if (this.a.length != rightStr.a.length) return false;
        for (int i = 0; i < this.a.length; ++i) {
            if ( (this.a[i] != rightStr.a[i]) || ((char) ((int)a[i]+32) != rightStr.a[i]) || ((char) ((int)a[i]-32) != rightStr.a[i])) {
                return false;
            }
        }
        return true;
    }
    
    public int compareTo ( MyString rightStr ) {
        for (int i = 0; i <this.a.length; ++i) {
            if ( this.a[i] != rightStr.a[i] ) return (int)this.a[i] - (int)rightStr.a[i];
        }
        return 0;
    }
    
    public int compareToIgnoreCase ( MyString rightStr ) {
        for (int i = 0; i < this.a.length; ++i) {
            if ( (this.a[i] != rightStr.a[i]) || ((char) ((int)a[i]+32) != rightStr.a[i]) || ((char) ((int)a[i]-32) != rightStr.a[i])) {
                if ((int)a[i] >= 97 && (int)rightStr.a[i] >= 97) return (int)this.a[i] - (int)rightStr.a[i];
                if ((int)a[i] >= 97 && (int)rightStr.a[i] < 97) return (int)this.a[i] - 32 - (int)rightStr.a[i];
                if ((int)a[i] < 97 && (int)rightStr.a[i] >= 97) return (int)this.a[i] + 32 - (int)rightStr.a[i];
                if ((int)a[i] < 97 && (int)rightStr.a[i] < 97) return (int)this.a[i] - (int)rightStr.a[i];
            }
        }
        return 0;
    }
    
    public MyString substring(int start) {
        MyString str = new MyString();
        str.a = new char[this.a.length - start];
        for (int i = 0; i < str.a.length; ++i) {
            str.a[i] = this.a[i+start];
        }
        return str;
    }
    
    public MyString substring (int start, int end) {
        MyString str = new MyString();
        str.a = new char[end - start + 1];
        for (int i = 0; i < str.a.length; ++i) {
            str.a[i] = this.a[i+start];
        }
        return str;
    }
    
    public int indexOf (char ch) {
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] == ch) return i;
        }
        return -1;
    }
    
    public int lastIndexOf (char ch) {
        for (int i = this.a.length-1; i >= 0; --i) {
            if (this.a[i] == ch) return i;
        }
        return -1;
    }
    
    public int lastIndexOf (char ch, int start) {
        for (int i = this.a.length-1; i >= start; --i) {
            if (this.a[i] == ch) return i;
        }
        return -1;
    }
    
    public int indexOf ( MyString str) {
        for (int i = 0; i < this.a.length; ++i) {
            if (this.a[i] == str.a[0]) return i;
        }
        return -1;
    }
    
    public MyString concat (MyString str) {
        MyString s = new MyString();
        s.a = new char[this.a.length + str.a.length];
        for (int i = 0; i < a.length; ++i) {
            s.a[i] = this.a[i];
        }
        for (int i = 0; i < str.a.length; ++i) {
            s.a[i+this.a.length] = str.a[i];
        }
        return s;
    }
    
    public MyString concat (char[ ] charSeq) {
        MyString s = new MyString();
        s.a = new char[this.a.length + charSeq.length];
        for (int i = 0; i < a.length; ++i) {
            s.a[i] = this.a[i];
        }
        for (int i = 0; i < charSeq.length; ++i) {
            s.a[i+this.a.length] = charSeq[i];
        }
        return s;
    }
}






