public class Methods {
   public static void main(String[] args) {
    String s = " Arif Shaikh ";
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println(s.trim());
    System.out.println(s.startsWith("Arif"));
    System.out.println(s.endsWith("Shaikh"));
    System.out.println(s.equals("Arif Shaikh"));
    System.out.println(s.equalsIgnoreCase("arif shaikh"));
    System.out.println(s.charAt(2));
    System.out.println(String.valueOf(100));
    System.out.println(s.replace("Arif","Mohammed"));
    System.out.println(s.contains("Shaikh"));
    System.out.println(s.substring(2,6));

    String[] parts = s.split(" ");
    for(String p : parts){
        System.out.println(p);
    }
    char[] chars = s.toCharArray();
    for(char c : chars){
        System.out.println(c);
    }
    System.out.println("".isEmpty());
   } 
}
