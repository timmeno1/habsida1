import java.util.*;

public class Calculator{

    public static void main(String[] args) {

        Symbols symbols = new Symbols();
        StringChecker strCh = new StringChecker();

        System.out.println(symbols.list.get("VI"));
//        получим объект по ключу 2
       String first = symbols.list.get("VI");
       System.out.println(first);

       // получим весь набор ключей
       Set<String> keys = symbols.list.keySet();
       // получить набор всех значений
       Collection<String> values = symbols.list.values();

       System.out.println(strCh.checkStr("VIsuka", keys));
       // перебор элементов
//        for(Map.Entry<String, String> item : symbols.entrySet()){
//
//            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
//        }
        String somestr = "3+VI";
        System.out.println(somestr.length()); // dlina stroki
        int oper = somestr.indexOf("+"); // nalichie simvola arifmeticheskoy operacii
        String strA = somestr.substring(0, oper);
        String strB = somestr.substring(oper+1);
        System.out.println(strA);
        System.out.println(strB);
        int a = Integer.parseInt(symbols.list.get(strA));
        int b = Integer.parseInt(symbols.list.get(strB));
        System.out.println(a+b);
        System.out.println(keys);


    }
}

class Symbols {

    public HashMap<String, String> list = new HashMap<String, String>();

    public Symbols() {
            list.put("1", "1");
            list.put("2", "2");
            list.put("3", "3");
            list.put("4", "4");
            list.put("5", "5");
            list.put("6", "6");
            list.put("7", "7");
            list.put("8", "8");
            list.put("9", "9");
            list.put("10", "10");
            list.put("I", "1");
            list.put("II", "2");
            list.put("III", "3");
            list.put("IV", "4");
            list.put("V", "5");
            list.put("VI", "6");
            list.put("VII", "7");
            list.put("VIII", "8");
            list.put("IX", "9");
            list.put("X", "10");
    }

}

class StringChecker {

    StringChecker() {
    }

    static String checkStr(String str, String arr) {
        boolean existance;
        for(int i=0; i<arr.length(); i++){
            if(str.indexOf(arr[i])>=1){
                existance = true;
            }
        }
        if(existance) {
            return arr[i];
        } else {
        return 0;
        }
    }

}