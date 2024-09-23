public class overriding {
    public static void main(String[] args) {
        fun(60);
        fun("dev parakh");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
