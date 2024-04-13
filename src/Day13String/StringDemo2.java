package Day13String;

public class StringDemo2 {
    public static void main(String[] args) {
        String str = "Akshansh";
//        System.out.println(str.contains("Aks"));

        String[] s = str.split("a");
        for(String st:s){
            System.out.println(st);
        }
    }
}
