// java program to convert ArrayList
// to LinkedHashSet

// importing the utils package
import java.util.*;

class GFG {

    // defining the method
    void arrayListToLinkedHashSet()
    {

        System.out.println("Hello World");

        // initializing the ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // adding values in the ArrayList
        arrayList.add("For");
        arrayList.add("Geeks");
        arrayList.add("Geeks");

        // printing the list
        System.out.println("The array list : " + arrayList);

        // initializing the LinkedHashSet class
        // passing the ArrayList as parameter
        LinkedHashSet<String> linkedHashSet
                = new LinkedHashSet<String>(arrayList);

        // printing the LinkedHashSet
        System.out.println("The converted "
                + "Linked Hash Set : "
                + linkedHashSet);

        boolean flag = linkedHashSet.contains("for");

        if(flag)
        {
            System.out.println("true, it is present");
        }
        else
        {
            System.out.println("false, it is not present");
        }

        for(String str:linkedHashSet){
            System.out.println(str);
        }

        Iterator iterator = linkedHashSet.iterator();

        while(iterator.hasNext()){
            String name = (String)iterator.next();
            System.out.println(name + ",");
        }

    }



    // Driver Code
    public static void main(String[] args)
    {

        // instantiating the class
        GFG ob = new GFG();

        // calling the method
        ob.arrayListToLinkedHashSet();
    }
}
