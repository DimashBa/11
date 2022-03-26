public class HomeWork {
    public static void main(String[] args) {
        static boolean doOne ( int a, int b){
            int sum = a + b;
            if (sum > 10 && sum < 20) return true;
            else return false;
        }
        static void doTwo ( int a){
            if (a >= 0) System.out.println("Число " + a + "положительное");
            else System.out.println("Число " + a + " отрицательное");
        }
        static boolean doThree ( int a){
            if (a < 0) return true;
            return false;
        }
        static void doFive ( int year){
            if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
                System.out.println(year + " г. не високосный");
            else System.out.println(year + " г. високосный");
        }
    }
}
