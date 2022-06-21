
public class Main {

    static Boolean dayFound = false;
    static char[] results = new char[9];

    public static void main(String[] args) {
        int rats = 10;
        int day = 1;

        while(day < 1000) {


            rats+= 6;

            if (day % 2 == 0) {
                rats += 3;
            }if (day % 3 == 0) {
                rats += 7;
            }if (day % 4 == 0) {
                rats += 18;
            }if (day % 5 == 0) {
                rats += 20;
            }if (day % 6 == 0) {
                rats += 25;
            }if (day % 7 == 0) {
                rats += 32;
            }if(day%30 == 0){
                rats = 3;
            }


            if(rats > 128){
                rats = rats/2;
            }
            printHits(day, rats);

            day ++;


        }
        System.out.println(results);
    }

    public static void printHits(int day, int rats){
       if(!dayFound && rats == 36){
           dayFound = true;
           results[2] = (char)day;
           results[5] = (char)day;
       }
       switch(day){
           case 88 -> results[1] = (char)rats;
           case 138 -> results[0] = (char)rats;
           case 110 -> {
               results[3] = (char) rats;
               results[7] = (char) rats;
           }
           case 10 -> results[4] = (char)rats;
           case 161 -> results[6] = (char)rats;
           case 133 -> results[8] = (char)rats;
       }
    }

}
