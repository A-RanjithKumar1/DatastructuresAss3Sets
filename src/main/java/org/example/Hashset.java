package org.example;
import java.util.*;
import java.util.logging.Logger;
public class Hashset {
    public static void main(String[] args){
        Logger logger = Logger.getLogger("com.api.jar");
        String s;
        String s2="Enter your choice\n1.Add\n2.Print\n3.Size\n4.Remove";

        Scanner sc=new Scanner(System.in);
        HashSet<String> hs=new HashSet<>();

        while (true) {
            logger.info(s2);
            int ch=sc.nextInt();
            switch(ch){
                case 1:{
                    hs.add(sc.next());
                    logger.info("Added the element");
                    break;
                }
                case 2:{
                    String s1="The values in Set are "+hs;
                    logger.info(s1);
                    break;
                }
                case 3:{
                    String k=String.valueOf(hs.size());
                    logger.info(k);
                    break;
                }
                case 4:{
                    s=sc.next();
                    hs.remove(s);
                    logger.info("Removed the element");
                    break;
                }
                default:{
                    System.exit(0);
                }
            }
        }
    }
}