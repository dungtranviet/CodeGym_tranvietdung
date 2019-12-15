package model;

public class Caculator {
    public static String caculator(float num1, float num2, String operator) {

        switch (operator) {
            case "Addtion(+)":
                return num1+" + "+num2+" = "+(num1 + num2);
            case "Subtraction(-)":
                return num1+" - "+num2+" = "+(num1 - num2);
            case "Mutiplication(X)":
                return num1+" * "+num2+" = "+(num1 * num2);
            case "Division(/)":
                if (num2 != 0) {
                    return num1+" / "+num2+" = "+(num1 / num2);
                } else {
                    return "so chia phai khac 0";
                }
            default:
                throw new RuntimeException("phep tinh khong hop le");
        }
    }
}
