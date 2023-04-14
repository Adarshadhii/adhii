public class practice_set_2 {
    public static void main(String args[]){
        //Problem 1
        String n = "ADARSH";
        String lString = n.toLowerCase();
        System.out.println(lString);
        //Problem_2
        String m = "Im learing java";
        System.out.println(m.replace(" ", "_"));
        //Problem_3
        String e = "Dear <|name|>,Thanks a lot";
        System.out.println(e.replace("<|name|>", "adarsh"));
        //Problem_4
        String w = "Congts  You are   learing java....!";
        System.out.println(w.indexOf("  "));
        System.out.println(w.indexOf("   "));
        String Letter = "\tDear Harry ,This Java\t\nCourse is nice.Thanks.";
        System.out.println(Letter);
    }
}
