import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class decode {


    public static void encode(){

        List <String> word  = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h","i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","1","2","3","4","5","6","7","8","9","0",".","!","@","#","$","%","^","&","*","(",")","-","+","="," ");

        Random rand = new Random(); 
        int low = 2;
        int high = 10;
        int ran = rand.nextInt(high -low)+low;

        List <String> spl = new ArrayList<String>();
 
        Scanner user = new Scanner(System.in);

        System.out.println("enter the word");

        String inputString = user.nextLine().toLowerCase();

        String [] user_word = inputString.split("");

      
        for (String arr : user_word){
            
            int wordIndex= word.indexOf(arr);

            int newKey = ran + wordIndex;



            String newLett = word.get(newKey);

            spl.add(newLett);
            
        }

        String joined = String.join("", spl);

        System.out.println("The encrypted word is => "+ joined + " <= and please remember the encrpty key is :"+ran);

    }

    public static void decode(){


        List <String> word  = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h","i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z","1","2","3","4","5","6","7","8","9","0",".","!","@","#","$","%","^","&","*","(",")","-","+","="," ");
        Scanner key = new Scanner(System.in);

        System.out.println("please enter the encrypt key ?");

        int encrptyKey = key.nextInt();

        List <String> spl = new ArrayList<String>();
 
        Scanner user = new Scanner(System.in);

        System.out.println("enter the word you want to encrypt");

        String inputString = user.nextLine().toLowerCase();

        String [] user_word = inputString.split("");

        

        for (String arr : user_word){

            int wordIndex= word.indexOf(arr);
            int newKey =wordIndex - encrptyKey;

            String newLett = word.get(newKey);


            spl.add(newLett);
            
        }

        String joined = String.join("", spl);

        System.out.println("The encrypted word is => "+ joined );


    }


    public static void main(String[] args) {

        Scanner inUser = new Scanner(System.in);

        System.out.println("Type encrypt or decrypt");

        String user = inUser.nextLine().toLowerCase();
        
        if (user.equals("encrypt") ){
            encode();
        }
        else if (user.equals("decrypt")){
            decode();
        }
        else{
            System.out.println("Er00r");
        }



       
        



    }






    
} 
//  jmr#q*jw 9