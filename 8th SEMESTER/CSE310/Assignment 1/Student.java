public class Student {

    private String name;
    private String sid;
    private String email;
    private String password;

    public Student(String n, String s, String e, String p) {
        this.name = n;
        this.sid = s;
        this.email = e;
        this.password = p;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSid() {
        return sid;
    }

    public String getPassword() {
        return password;
    }

    public String toString() {
        return String.format("\nName: %s\nSID: %s\nEmail: %s\nPassword: %s\n", name, sid, email, password);
    }

}
