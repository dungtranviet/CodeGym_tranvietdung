package ngon_ngu_java;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        String result="các số nguyên tố nhỏ hơn 100 là :2, ";
        for(int i=3;i<100;){
            double endNumber=Math.sqrt(i);
            boolean isPrime=true;
            for(int j=3;j<=endNumber;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                result+=i+", ";
            }
            i+=2;
        }
        System.out.println(result);
    }
}
