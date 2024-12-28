package javaLearning;

import java.util.HashMap;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int quantityCountry = sc.nextInt();
        sc.nextLine();
        HashMap<String, String> countryHash = new HashMap<>();
        
        for (int i = 0; i < quantityCountry; i++){
            String[] line = sc.nextLine().split(" ");
            String country = line[0];
           // System.out.println("log-1." + i);
            for (int j = 1; j < line.length; j++){
            	countryHash.put(line[j], country);
             //   System.out.println("log-"+ i +  + j);
            	
            }
        }
        
        
         int quanityCities = sc.nextInt();
         sc.nextLine();
         
         for (int i = 0; i < quanityCities; i++) {
            // System.out.println("log-3." + i);
        	 String city = sc.nextLine();
             String findCountry = countryHash.get(city);
             System.out.println(findCountry);
         }
        
         sc.close();
        
    }

}

