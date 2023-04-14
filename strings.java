public class strings {
    public static void main(String args[]){
        String name = "Hello";
        System.out.println(name.length());
        String lString = name.toLowerCase();
        System.out.println(lString);
        String uString = name.toUpperCase();
        System.out.println(uString);
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace("l","r"));
        //System.out.println(replace("l","aa"));
        System.out.println(name.startsWith("H"));
        System.out.println(name.endsWith("l"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("l"));
        System.out.println(name.lastIndexOf("l"));
        System.out.println(name.equals("adarsh"));
        System.out.println(name.equalsIgnoreCase("hello"));
        String n = "   Hello world ";
        System.out.println(n);
        String t = n.trim();
        System.out.println(t);

    }
}
