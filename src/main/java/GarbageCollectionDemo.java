import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GarbageCollectionDemo {

    /* VM options

    * SerialCollector
    * -Xms6m -Xmx18m -Xmn2m -XX:PermSize=20m -XX:MaxPermSize=30m -XX:+UseSerialGC
    *
    * parallelCollector (old)
    * -Xms9m -Xmx18m -Xmn3m -XX:PermSize=40m -XX:MaxPermSize=40m -XX:+UseParallelGC
    *
    * ParallelCollector (new)
    * -Xms3m -Xmx12m -Xmn1m -XX:PermSize=20m -XX:MaxPermSize=20m -XX:+UseParNewGC
    *
    * CMS
    * -Xms6m -Xmx18m -Xmn2m -XX:PermSize=20m -XX:MaxPermSize=30m -XX:+UseConcMarkSweepGC -XX:ConcGCThreads=2
    *
    * G1
    * -Xms4m -Xmx16m -Xmn2m -XX:PermSize=12m -XX:MaxPermSize=18m -XX:+UseG1GC
    * */

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        sc.next();
        Random random = new Random();
        List<String[]> list = new ArrayList<String[]>();
        while (true){
            String[] mass = new String[random.nextInt(100)];
            for (int j  =0; j<mass.length; j++){
                mass[j] = new String(""+(j+random.nextInt(10)));
            }
            list.add(mass);
        }
    }
}
