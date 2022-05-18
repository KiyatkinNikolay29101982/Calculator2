import java.util.Scanner;

public class YourNumber {
    double rezult = 0;
    double one;
    double two;
    char operant;



    public YourNumber()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число");
        one = sc.nextDouble();

        System.out.println("введите требуемую Вам операцию");
        operant = sc.next().charAt(0);

        if(operant == 's'){
           return;
        } else if(operant == 'c')
        {
            return;
        } else if (operant == 't')

        {
            return;
        } else

        {
            System.out.println("Введите число");
            two = sc.nextDouble();}
        }




    public static double compute(YourNumber o, Action number)
    {
       return number.actionValue();
    }


    public static double computeDecision(YourNumber f, Conformity nul, Action num ){
        if(nul.test(f.two))
        {
          return num.actionValue();
        } else

        {
          System.out.println("На ноль делить нельзя");
          System.out.println("выберите другое значение делителя");
          Scanner newsc = new Scanner(System.in);
          f.two = newsc.nextDouble();
          return num.actionValue();
        }
    }

    public static double engineerCompute(YourNumber f,Conformity tester,  Action num){
        if(tester.test(f.one))
        {
           return num.actionValue();
        } else
        {
            System.out.println("Вы ввели не корректное число");
            Scanner secondSc = new Scanner(System.in);
            f.one = secondSc.nextDouble();
            return  num.actionValue();
        }

    }
}


