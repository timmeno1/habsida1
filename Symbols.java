import java.util.*;

public class Symbols{

    public static void main(String[] args) {

        Map<String, String> symbols = new HashMap<String, String>();
       symbols.put("1", "1");
       symbols.put("2", "2");
       symbols.put("3", "3");
       symbols.put("4", "4");
       symbols.put("5", "5");
       symbols.put("6", "6");
       symbols.put("7", "7");
       symbols.put("8", "8");
       symbols.put("9", "9");
       symbols.put("10", "10");
       symbols.put("I", "1");
       symbols.put("II", "2");
       symbols.put("III", "3");
       symbols.put("IV", "4");
       symbols.put("V", "5");
       symbols.put("VI", "6");
       symbols.put("VII", "7");
       symbols.put("VIII", "8");
       symbols.put("IX", "9");
       symbols.put("X", "10");

       // получим объект по ключу 2
       String first = symbols.get("VI");
       System.out.println(first);
       // получим весь набор ключей
       Set<String> keys = symbols.keySet();
       // получить набор всех значений
       Collection<String> values = symbols.values();
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
        int a = Integer.parseInt(symbols.get(strA));
        int b = Integer.parseInt(symbols.get(strB));
        System.out.println(a+b);


    }
}