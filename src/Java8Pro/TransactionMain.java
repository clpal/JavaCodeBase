package Java8Pro;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TransactionMain {
    public static void main(String[] args) {
        Transaction t1=new Transaction(1,1000,"Amazon");
        Transaction t2=new Transaction(2,300,"Flipkart");
        Transaction t3=new Transaction(3,-8000,"Amazon");
        Transaction t4=new Transaction(5,1100,"Mantra");
        Transaction t5=new Transaction(6,-1200,"Flipkart");
        Transaction t6=new Transaction(7,2200,"Amazon");
        Transaction t7=new Transaction(8,-7000,"Amazon");
        // 1000 , -8000, 2200,-7000
        //1000,2200
        //-8000,-7000

        Stream<Transaction>listStream=Stream.of(t1,t2,t3,t4,t5,t6,t7);
        /*List<Transaction>listStream = new ArrayList<>();
        listStream.add(t1);
        listStream.add(t2);
        listStream.add(t3);
        listStream.add(t4);
        listStream.add(t5);
        listStream.add(t6);
        listStream.add(t7);*/

        List<Transaction>list2  =listStream.filter(x->x.getCategory().equals("Amazon")).collect(Collectors.toList());
    List<Transaction> creditlist=new ArrayList<>();
    List<Transaction> debitlist=new ArrayList<>();
        for (Transaction t:list2) {
            if (t.getAmount()>0) {
                creditlist.add(t);
            }
            else {
           debitlist.add(t);
            }
        }
        System.out.println("credit List"+creditlist);
        System.out.println("..........................................");
        System.out.println("debit  List"+debitlist);

        double sum = creditlist.stream()
                .mapToLong(Transaction::getAmount)
                .sum();

        System.out.println(sum);


        double debitsum=debitlist.stream().mapToLong(Transaction::getAmount).sum();
        System.out.println(debitsum);

    }
}
