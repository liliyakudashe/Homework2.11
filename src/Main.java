import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Main {
    public static void main(String[] args) {
       Passport smit = new Passport(Collections.singleton("4789562BHY"),"Смит", "Уинстон", null, "10.04.1944");
       Passport julie = new Passport(Collections.singleton("563248BHY"), "О’Брайен", "Джулия", null,"05.08.1958");
       Passport brother = new Passport(Collections.singleton("45278KIU"), "Большой", "Брат", null,"16.10.1939");


        Set<Passport> passportSet = new HashSet<>();
        passportSet.add(smit);
        passportSet.add(julie);
        passportSet.add(brother);


        System.out.println(passportSet);


    }

}