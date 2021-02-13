import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> nb=new ArrayList<String>();
        nb.add("goetthu");
        nb.add("fggtg");
        nb.add("fgr");
        System.out.println(nb.size());
        System.out.println(nb.contains("goetthu"));
        System.out.println(nb.isEmpty());
        System.out.println(nb.get(0));
    }
}
