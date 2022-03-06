import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;


public class Main {
        public static void main(String[] args){
            int dogCount = 0;
            System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
            flipNHeads(7);
//            clock();
        }
        public static String pluralize(String word,int number ){
            if(number == 0 || number > 1 ){
                word += "s";
            }
            return word;
        }
        public static void flipNHeads(int n){
            int counter  = 0; int newRand; ArrayList<Integer> headNumber = new ArrayList<>();
            Random random = new Random();int index;
            for(index = 0 ; true ; index++){
                newRand =(int) Math.round(random.nextFloat());
                if(newRand == 1 ) {
                    headNumber.add(1);
                    System.out.println("head");
                  if(index >= 1){
                      if(headNumber.get(index)== headNumber.get(index - 1)){
                          counter++;
                          if(counter+1 == n) break;
                      }else counter = 0;
                  }

                } else {
                    System.out.println("tail");
                    headNumber.add(0);
                }
            }
            System.out.println("It took " + index +" flips to flip " + n + " head in a row.");
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
