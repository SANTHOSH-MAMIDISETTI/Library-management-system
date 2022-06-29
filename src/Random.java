public class Random extends Main {
    static int a;
    static  int b;
    public static int random() {
            int min = 1000;
            int max = 9999;
             b = (int)(Math.random()*(max-min+1)+min);
            return b;
        }
        public static int randomforslogans(){
            int min1 = 1;
            int max1 = 10;
            a = (int)(Math.random()*(max1-min1+1)+min1);
            return a;
        }
    }
