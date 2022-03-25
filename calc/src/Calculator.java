import java.util.Scanner;

public class Calculator
{
    private double number1;
    private double number2;
    private char operator;

    public Calculator()
    {}
    public double getNumber1()
    {
        return this.number1;
    }
    public double getNumber2()
    {
        return this.number2;
    }
    public char getOperator()
    {
        return this.operator;
    }
    public void setNumber1(double n )
    {
        this.number1 = n;
    }
    public void setNumber2(double n )
    {
        this.number2 = n;
    }
    public void setOperator(char op )
    {
        this.operator = op;
    }
    public void sum(Calculator calc){
        Scanner read = new Scanner(System.in);
        System.out.println("Now insert a value: ");
        calc.setNumber1(read.nextInt());
        System.out.println("Another value please: ");
        calc.setNumber2(read.nextInt());
        System.out.println(calc.getNumber1()+" "+calc.getOperator()+" "+ calc.getNumber2()+" = "+ (calc.getNumber1() + calc.getNumber2()));
    }
    public void min(Calculator calc){
        Scanner read = new Scanner(System.in);
        System.out.println("Now insert a value: ");
        calc.setNumber1(read.nextInt());
        System.out.println("Another value please: ");
        calc.setNumber2(read.nextInt());
        System.out.println(calc.getNumber1()+" "+calc.getOperator()+" "+ calc.getNumber2()+" = "+ (calc.getNumber1() - calc.getNumber2()));
    }
    public void div(Calculator calc){
        Scanner read = new Scanner(System.in);
        System.out.println("Now insert a value: ");
        calc.setNumber1(read.nextInt());
        System.out.println("Another value please: ");
        calc.setNumber2(read.nextInt());
        System.out.println(calc.getNumber1()+" "+calc.getOperator()+" "+ calc.getNumber2()+" = "+ (calc.getNumber1() / calc.getNumber2()));
    }
    public void mult(Calculator calc){
        Scanner read = new Scanner(System.in);
        System.out.println("Now insert a value: ");
        calc.setNumber1(read.nextInt());
        System.out.println("Another value please: ");
        calc.setNumber2(read.nextInt());
        System.out.println(calc.getNumber1()+" "+calc.getOperator()+" "+ calc.getNumber2()+" = "+ (calc.getNumber1() * calc.getNumber2()));
    }
    public void calculate(Calculator calc){
        Scanner read = new Scanner(System.in);
        do{
            System.out.println("Please insert the operation desired: +,-,*,/ and x to Exit");
            System.out.print("R: ");
            calc.setOperator(read.next().charAt(0));
            switch (calc.getOperator()) {
                case '+':
                    calc.sum(calc);
                    break;
                case '-':
                    calc.min(calc);
                    break;
                case '/':
                    calc.div(calc);
                    break;
                case '*':
                    calc.mult(calc);
                    break;
                case 'x':
                    System.out.println("Good bye.");
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        }while (calc.getOperator() != 'x');
    }
}