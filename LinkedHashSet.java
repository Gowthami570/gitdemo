import java.util.*;
class LinkedHashSet1{
    public static void main(String args[]){

        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("mmu");
        set.add("vrm");
        set.add("gowthu");

        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}