import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;


public class Main {
        public static void main(String[] args){
            int dogCount = 0;
            System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
            flipNHeads(7);
            clock();
        }
        public static String pluralize(String word,int number ){
            if(number == 0 || number > 1 ){
                word += "s";
            }
            return word;
        }
        public static void flipNHeads(int n){
            int counter  = 0; int newRand; int headNumber = 0;
            Random random = new Random();
            do {
                newRand =(int) Math.round(random.nextFloat());
                if(newRand == 1 ) {
                    System.out.println("head");
                    headNumber++;
                } else System.out.println("tail") ;
                counter++;
            }while (n != headNumber);
            System.out.println("It took " + counter +" flips to flip " + headNumber + " head in a row.");
        }
        public static void clock() {
            String firstTime = "" ;
            int million = 1_000_000;
            double counter = 0;

            while(true){
                counter++;
                LocalDateTime now = LocalDateTime.now();
                String currentTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                if(!currentTime.equals(firstTime)){
                    firstTime = currentTime;
                    System.out.println(firstTime + " " +counter/million +" MHz" );
                    counter = 0;
                }
            }
        }

    }
