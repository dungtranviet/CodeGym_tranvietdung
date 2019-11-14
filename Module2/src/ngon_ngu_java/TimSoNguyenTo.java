package ngon_ngu_java;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        String result="các số nguyên tố nhỏ hơn 100 là :";
        for(int i=2;i<100;i++){
            double endNumber=Math.sqrt(i);
            boolean isPrime=true;
            for(int j=2;j<=endNumber;j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                result+=i+", ";
            }
        }
        System.out.println(result);
    }
}
