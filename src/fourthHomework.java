void main(String[]args) {
     int age = 28;
     float height=1.50F;
     boolean driverLicense = true;
     char favLetter = 'S';
     long   population =3914000;
    System.out.println("ასაკი"  + age +
            "\nსიმაღლე" + height +
            "\nმართვის მოწმობა" + driverLicense +
            "\nდსყვარელი ასო" + favLetter +
            "\n nსაქართველოს მოსახლეობა არის " + population);

    byte a = 127;
    short b = 120;
    int c = 1000;
    long d = 10000000L;
    float e = 10000.0F;
    double f = 10000.0D;
    boolean g = true;
    char h = 'A';
    System.out.println("byte" + "=" + a+
                    "\nshort" + "=" + b+
            "\nint" + "=" + c +
            "\nlong" + "=" + d +
            "\nfloat" + "=" + e+
            "\ndouble" + "=" + f+
            "\nboolean" + "=" + g+
            "\nchar" + "=" + h);

    byte numb = 100;
    int numb1 = 10000;
    double numb2 = 36.65;
    char symbol = 'N';
    boolean version = (10>5);
    System.out.println("Result of 10>5 is:" + (10>5));

    int x = 25;
    int y = 4;


    System.out.println(x+y);
    System.out.println(x-y);
    System.out.println(x*y);
    System.out.println(x/y);
    System.out.println((double) x/y);
    System.out.println(x%y);

    int numero=50;
    if (numero %2==0){
        System.out.println("ლუწია");
    }
    else System.out.println("კენტია");

    int numero2=75;
    System.out.println(numero2%2==0);

    System.out.println((7+3)*2-10/3);

    int r=9;
    double l=2.5;
    System.out.println(r+l);
    System.out.println(r-l);
    System.out.println(r*l);
    System.out.println(r/l);
    System.out.println(r%l);

    int m= 7;
    int n= 2;
    double  result1=m/n;
    double result = m/(double)n;
    double result2=(double)m/n;
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result);


    double price1 = 12.99;
    double price2 = 5.49;
    double price3 = 2.75;

    int quantity1 = 3;
    int quantity2 = 5;
    int quantity3 = 2;

    double discountPercent= 7.5;
    double taxPercent= 18;

    System.out.println((float) price1*quantity1);
    System.out.println((float) price2*quantity2);
    System.out.println((float) price3*quantity3);
    double price4 = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
    System.out.println(price4);
    System.out.println(price4-((price4*discountPercent/100)));
    double saveMoney = price4*discountPercent/100;
    System.out.println(saveMoney + "დააკლდა");
    double taxMoney = saveMoney-(saveMoney*taxPercent/100);
    System.out.println(taxMoney + "დღგ");
    double total =price4-saveMoney -taxMoney;
    System.out.println("ტოტალ" + total);


}