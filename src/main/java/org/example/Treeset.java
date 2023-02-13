package org.example;
import java.util.*;
import java.util.logging.Logger;
public class Treeset {
    public static void main(String[] args){
        TreeSet<String> ts=new TreeSet<>();
        Logger logger = Logger.getLogger("com.api.jar");
        Scanner sc=new Scanner(System.in);

        String s;
        String s2="Enter your choice\n1.Add\n2.Remove\n3.size\n4.Print\n";
        while (true) {
            logger.info(s2);
            int ch=sc.nextInt();
            switch(ch){
                case 1:{
                    ts.add(sc.next());
                    logger.info("The element is added");
                    break;
                }
                case 2:{
                    s=sc.next();
                    ts.remove(s);
                    logger.info("The element is removed");
                    break;
                }
                case 3:{
                    String k=String.valueOf(ts.size());
                    logger.info(k);
                    break;
                }
                case 4:{
                    String s1="The values in Set are "+ts;
                    logger.info(s1);
                    break;
                }
                default:{
                    System.exit(0);
                }
            }
        }
    }
}
