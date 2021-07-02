import java.math.BigInteger;
public class BoroInt {
    public String val = "";
    public BoroInt() {
        this.val = "0";
    }
    public BoroInt(String str) {
        try {
            for(int i = 0; i < str.length(); ++i) {
                if ((int)str.charAt(i) < 48 || (int)str.charAt(i) > 57) {
                    MyException me = new MyException("You can't put any character other than digits");
                    throw me;
                }
            }
            this.val = str;
        } catch (MyException e) {
            System.out.println(e.msg);
        }
    }
    public BoroInt(int i) {
        this.val = Integer.toString(i);
    }
    public BoroInt(BoroInt another) {
        this.val = another.val;
    }
    public String trim(String str) {
        return str.replaceAll(" ", "");
    }
    public boolean validValue(String str) {
        BoroInt temp = new BoroInt(str);
        if (temp.val == str) return true;
        return false;
    }
    public BoroInt add(BoroInt another) {
        BigInteger a = new BigInteger(this.val);
        BigInteger b = new BigInteger(another.val);
        BigInteger c = a.add(b);
        BoroInt temp = new BoroInt(c.toString());
        return temp;
    }
    public BoroInt subtract(BoroInt another) {
        BigInteger a = new BigInteger(this.val);
        BigInteger b = new BigInteger(another.val);
        BigInteger c = a.subtract(b);
        BoroInt temp = new BoroInt(c.toString());
        return temp;
    }
    public BoroInt multiply(BoroInt another) {
        BigInteger a = new BigInteger(this.val);
        BigInteger b = new BigInteger(another.val);
        BigInteger c = a.multiply(b);
        BoroInt temp = new BoroInt(c.toString());
        return temp;
    }
    public BoroInt divide(BoroInt another) {
        BigInteger a = new BigInteger(this.val);
        BigInteger b = new BigInteger(another.val);
        BigInteger c = a.divide(b);
        BoroInt temp = new BoroInt(c.toString());
        return temp;
    }
}