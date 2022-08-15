package day32_Constructors.Browsers;

public class Browsers {

    public String name, origin;
    public double version;
    public boolean isFast, isSecure;
    public long numOfUsers;

    public Browsers(){

        System.out.println("openning");


    }

    public Browsers(String name, String origin, double version, boolean isFast, boolean isSecure, long numOfUsers) {
        this();
        this.name = name;
        this.origin = origin;
        this.version = version;
        this.isFast = isFast;
        this.isSecure = isSecure;
        this.numOfUsers = numOfUsers;
    }

    public String toString() {
        return "Browsers{" +
                "name='" + name + '\'' +
                ", origin='" + origin + '\'' +
                ", version=" + version +
                ", isFast=" + isFast +
                ", isSecure=" + isSecure +
                ", numOfUsers=" + numOfUsers +
                '}';
    }
}
