public class Main {
    public static void main(String[] args) {
        YourNumber worck = new YourNumber();

        switch (worck.operant){
            case '+' : worck.rezult =  YourNumber.compute(worck, ()-> worck.one + worck.two);
            break;

            case '-' : worck.rezult = YourNumber.compute(worck, () ->worck.one - worck.two);
            break;

            case '*' : worck.rezult = YourNumber.compute(worck, ()->worck.one * worck.two);
            break;

            case ':' : worck.rezult = YourNumber.computeDecision(worck, (two)-> worck.two !=0,
                    ()-> worck.one / worck.two );
            break;

            case 'c' :  worck.rezult = YourNumber.engineerCompute(worck, (one)-> worck.one >= 0,//cos
                        ()-> Math.cos(worck.one));
            break;

            case 's' :  worck.rezult = YourNumber.engineerCompute(worck, (one)-> worck.one >= 0,//sin
                        ()-> Math.sin(worck.one));
            break;

            case 't' : worck.rezult = YourNumber.engineerCompute(worck, (one)-> worck.one >= 0,//tg
                    () -> Math.sin(worck.one));

            default: System.out.println("Необходимой операции у меня не запрограмированно");
            return;

        }

        System.out.println(worck.rezult);


    }
}
