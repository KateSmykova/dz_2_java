public class dz {
 public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("3+56=59");
    String str = sb.toString();
    System.out.println(sb.append(" 3-56=-53 3*56=168"));
    System.out.println(sb.insert(4, "равно"));
    System.out.println(sb.deleteCharAt(9));
 }   
}
