import java.util.Scanner;

class Drobi{
    public int chislitel, znamenatel;

    //дробь по умолчанию
    public Drobi(){
        chislitel = 1;
        znamenatel = 1;
    }
    //создаем дробь
    public Drobi(int a, int b) throws Exception {
        if (b != 0) {
            chislitel = a;
            znamenatel = b;
        } else {
            throw new Exception("знаменатель не равен 0");


        }
    }
    //vivodDrobi
    public void vivodDrobi(){
        System.out.println(chislitel + "/" + znamenatel);
    }
    //сумма
    public void sum(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * d + b * c) + "/" + b * d);
    }
    //разность
    public void min(int a, int b, int c, int d) {System.out.println("Результат: " + (a * d - b * c) + "/" + b * d);}
    //умножение
    public void umnogenie(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * c) + "/" + b * d);
    }
    //деление
    public void delenie(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * d) + "/" + c * b);
    }

}

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //дробь по умолчанию
        Drobi drob1 = new Drobi();
        drob1.vivodDrobi();

        //создание дроби
        System.out.println("Введите целые значения числителя и знаменателя:");
        Drobi drob2 = new Drobi(in.nextInt(), in.nextInt());
        drob2.vivodDrobi();


        //сумма
        System.out.println("сложение - Введите целые значения числителя и знаменателя первой дроби:");
        Drobi drob3 = new Drobi(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби:");
        Drobi drob4 = new Drobi(in.nextInt(), in.nextInt());
        drob3.sum(drob3.chislitel, drob3.znamenatel, drob4.chislitel, drob4.znamenatel);

        //сумма со значением по умолчанию
        System.out.println("Сложение - Введите целые значения числителя и знаменателя первой дроби:");
        Drobi drob31 = new Drobi(in.nextInt(), in.nextInt());
        Drobi drob41 = new Drobi();
        System.out.println("Значение по умолчанию: "+ drob41.chislitel + "/"+ drob41.znamenatel);
        drob3.sum(drob31.chislitel, drob31.znamenatel, drob41.chislitel, drob41.znamenatel);


        //вычитание дробей
        System.out.println("Вычитание - Введите целые значения числителя и знаменателя первой дроби:");
        Drobi drob5 = new Drobi(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби:");
        Drobi drob6 = new Drobi(in.nextInt(), in.nextInt());
        drob5.min(drob5.chislitel, drob5.znamenatel, drob6.chislitel, drob6.znamenatel);

        //вычитанние дробей со значением по умолчанию
        System.out.println("Вычитание - Введите целые значения числителя и знаменателя первой дроби:");
        Drobi drob51 = new Drobi(in.nextInt(), in.nextInt());
        Drobi drob61 = new Drobi();
        System.out.println("Значение по умолчанию: "+ drob61.chislitel + "/"+ drob61.znamenatel);
        drob5.min(drob51.chislitel, drob51.znamenatel, drob61.chislitel, drob61.znamenatel);

        //умножение
        System.out.println("Умножение - Введите целые значения числителя и знаменателя первой дроби:");
        Drobi drob7 = new Drobi(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби:");
        Drobi drob8 = new Drobi(in.nextInt(), in.nextInt());
        drob7.umnogenie(drob7.chislitel, drob7.znamenatel, drob8.chislitel, drob8.znamenatel);

        //умножение со значением по умалчиванию
        System.out.println("Умножение - Введите целые значения числителя и знаменателя первой дроби:");
        Drobi drob71 = new Drobi(in.nextInt(), in.nextInt());
        Drobi drob81 = new Drobi();
        System.out.println("Значение по умолчанию: "+ drob81.chislitel + "/"+ drob81.znamenatel);
        drob7.umnogenie(drob71.chislitel, drob71.znamenatel, drob81.chislitel, drob81.znamenatel);

        //деление
        System.out.println("Деление - Введите целые значения числителя и знаменателя первой дроби:");
        Drobi drob9 = new Drobi(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби:");
        Drobi drob10 = new Drobi(in.nextInt(), in.nextInt());
        drob9.delenie(drob9.chislitel, drob9.znamenatel, drob10.chislitel, drob10.znamenatel);

        //деление со значениями по умолчанию
        System.out.println("Деление - Введите целые значения числителя и знаменателя первой дроби:");
        Drobi drob91 = new Drobi(in.nextInt(), in.nextInt());
        Drobi drob101 = new Drobi();
        System.out.println("Значение по умолчанию: "+ drob91.chislitel + "/"+ drob101.znamenatel);
        drob9.delenie(drob91.chislitel, drob91.znamenatel, drob101.chislitel, drob101.znamenatel);
        in.close();

    }
    }


