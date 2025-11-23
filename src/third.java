import java.util.Locale;

public class third {
    public static void main(String[] args) {
         int x = 8;
         int y = 18;
         boolean q = (x>0 && y >0);
        System.out.println(q);

        int password = 1246772;
        int password2 = 56456;
        boolean result = password == password2;
        System.out.println(result);

        String name = "Reformer Fitness";
        int length = name.length();
        System.out.println(length);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('e'));
        System.out.println(name.charAt(8));
        System.out.println(name.contains("e"));
        System.out.println(name.replace('m' ,'u'));

        int customerAge = 17;
        if (customerAge <=15) {
            System.out.println("თქვენ შეგიძლიათ ისარგებლოთ ჩვენი მომსახურებით მშობლის ნებართვისა და ტრენერის მეთვალყურეობის ქვეშ");
        } else if (customerAge < 18) {
            System.out.println("რეგისტრაციისთვის დაგჭირდებათ მშობლის ნებართვა");
        }
        else if (customerAge>=18){
            System.out.println("თქვენ შეგიძლიათ გაიაროთ რეგისტრაცია");
        }

        int studentScore = 89;
        if (studentScore >=90) {
            System.out.println("ტუდენტი მიიღებს A ტიპის სერტიფიკატს");
        }else if (studentScore >=80) {
            System.out.println("სტუდენტი მიიღებს B ტიპის სერტიფიკატს");
        }else if (studentScore >=70) {
            System.out.println("სტუდენტი მიიღებს C ტიპის სერტიფიკატს");
        }else if (studentScore <70) {
            System.out.println("სერტიფიკატი არ გაიცემა");
        }
        int finalScore = 70;
        int mindScore = 70;
        String s = (finalScore <70)?"სერტიფიკატი არ გაიცემა":"გაიცემა სერტიფიკატი";
        System.out.println(s);

        int customerAge1 = 88;
        int minAGe = 18;
        String p = (customerAge1 <18) ? "რეგისტრაციისთვის გჭირდებათ მშობელი": "შეგიძლიათ რეგისტრაცია";
        System.out.println(p);
        System.out.println("i love \"manual\" testing");
        System.out.println("i am a \nsoftware tester");
    }
}
