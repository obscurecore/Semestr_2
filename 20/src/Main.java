public class Main {
    public static void main (String [] args){
        //F check = new F("1+[2+5{7*8}+9]+10)})))");
        //F check = new F("(((((((((((");
        F check = new F(")");
        LList ll = new LList();
        ll.push(5);
        //System.out.println();
        check.FF();
    }
}
