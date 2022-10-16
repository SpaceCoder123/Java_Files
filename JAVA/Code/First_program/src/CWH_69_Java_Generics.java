import java.util.ArrayList;

public class CWH_69_Java_Generics {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        System.out.println(arrayList);

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("one");
        arrayList1.add("two");
        arrayList1.add("three");
        arrayList1.add(1);
        System.out.println(arrayList1);
    }
}
