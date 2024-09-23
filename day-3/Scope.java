public class Scope{
    public static void main(String[] args) {
        int a = 10 ;
      {
        int c = 5;
      }
        System.out.println(c);
    }
}