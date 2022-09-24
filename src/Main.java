public class Main {
    public static void main(String[] args) {

        //Homework1
        //Task1
        int sum = 15000;
        int total = 0;
        int month = 0;
        while (total<=2459000){
            total = total + total/100;
            total=total+sum;
            month++;
            System.out.println("Месяц "+ month+ ", сумма накоплений равна "+ total + " рублей");
        }

        //Task2
        int q=1;
        while (q<=10){
            System.out.print(q + " ");
            q++;
        }
        System.out.println();
        q=10;
        for (; q>=1;  q--){
        System.out.print(q+ " ");
        }
        System.out.println();

        //Task3
        int population = 12_000_000;
        int fertility= population*17/1000;
        int mortality= population*8/1000;
        for (int j=1; j<=10; j++ ){
            population =  population+ fertility - mortality;
            System.out.println("Год "+ j+ ", численность населения составляет "+ population);
        }



        //Homework2
        //Task1
        int depositAmount = 15000;
        month = 1;
        while (depositAmount<=12_000_000){
        int interest = depositAmount*7/100;
            depositAmount= depositAmount+interest;
            System.out.println("Сумма накоплений в месяц " + month+ " равна "+ depositAmount);
            month++;
        }

        //Task2
        int depositAmount2 = 15000;
        month = 1;
        while (depositAmount2<=12_000_000){
            int interest = depositAmount2*7/100;
            depositAmount2= depositAmount2+interest;
            if (month%6==0){
            System.out.println("Сумма накоплений в месяц " + month+ " равна "+ depositAmount2);}
            month++;
        }

        //Task3
        int year =9;
        month= year*12;
        int summa= 15000;
        for (int i=1; i<=month; i++){
            int interest = summa*7/100;
            summa=summa+ interest;
            if (i%6==0){
                System.out.println("По окончании "+ i/6 + " полугодия, вы накопите сумму в размере "+ summa);
            }
        }


            //Task4
            int friday = 1;
            for (int i=1; i<=31; i++) {
                if (i==friday) {
                    System.out.println("Сегодня пятница, "+ i+ "-е число. Необходимо подготовить отчет.");
                    friday = friday+7;

                }
            }


            //Homework 3
            //Task1
            int yearNow = 2022;
            int yearBefore= yearNow-200;
            int yearAfter= yearNow + 100;
            for (int i= 0; i<=yearAfter; i++){
                if (i%79==0 && i>= yearBefore){
                    System.out.println(i);
                }
            }


            //Task2
            for (int i=1; i<=10; i++){
                System.out.println("2*"+i+"="+2*i);
            }


    }
}