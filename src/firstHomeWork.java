public class firstHomeWork {
    public static void main(String[] args) {
        String p = "ვნახოთ ახალ ფაილს როგორ გადავიტან გითზე";
        System.out.println(p);

        int temperature = 25;
        String x ="ძალიან ცხელა";
        String y = "თბილია";
        String z = "ცოტა გრილა";
        String m = "ცივა";
        if (temperature<10) {
            System.out.println(m);
        }else if (temperature >=10 && temperature<20){
            System.out.println(z);
        }else if (temperature>=20 && temperature<30){
            System.out.println(y);
        }else if (temperature>30){
            System.out.println(x);
        }
        int balance = 506;
        if (balance<100) {
            System.out.println("კრიტიკულად დაბალია");
        }else if (balance>=100 && balance<500){
            System.out.println("ნორმალურია");
        }else if (balance>=500){
            System.out.println("ძალიან მაღალია");
        }

        String l = (balance >=100) ? "ნორმალურია" : "დაბალია";
        System.out.println(l);

        int age = 18;

        String result = (age<18)? "მშობლის თანხმობა აუცილებელია":
                        (age <=60) ? "შესაძლებელია რეგისტრაცია" :
                                 "გთხოვთ აირჩიეთ შესაბამისი პროგრამა";
        System.out.println(result);
        int score = 90;
        String finalScore =
                (score<50) ? "Fail":
                        (score <=74) ? "Average":
                                (score <=89) ? "Good" :
                                            "Excellent";
        System.out.println(finalScore);

        int age1 = 9;
        String discount =
                (age1<10) ? "free":
                        (age1<18) ? "child ticket" :
                                (age1<60) ? "Adult ticket" :
                                        "senior discount";
        System.out.println(discount);

        int price = 456;

        String priceCateogory =
                (price < 100) ? "Cheap":
                        (price <=299) ? "Budget" :
                                (price <500)? "Standart" :
                                        "Expensive";
        System.out.println(priceCateogory);

        double temp =36.8;

        String fever =
                (temp<36) ? "Low":
                        (temp <37) ? "normal":
                                (temp <39) ? "fever":
                                        "High fever";
        System.out.println(fever);


    }
}
