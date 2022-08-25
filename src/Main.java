public class Main {
    public static void main(String[] args) {
        String pal = "a rza?  upala.  na   lapu azora";
        System.out.println(pal.trim());
        StringBuilder sb = new StringBuilder(pal.replaceAll("\\W", "").trim());
       pal = sb.toString();
        System.out.println(sb);
        if (sb.reverse().toString().equals(pal)){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
