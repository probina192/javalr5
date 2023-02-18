import java.util.Scanner;

class Drobi{
    public int chislitel, znamenatel;

    //ДРОБЬ ПО УМАЛЧИВАНИЮ СЫС
    public Drobi(){
        chislitel = 1;
        znamenatel = 1;
    }
    //СОСДАЁТ ДРОПЬ
    public Drobi(int a, int b) throws Exception {
        if (b != 0) {
            chislitel = a;
            znamenatel = b;
        } else {
            throw new Exception("На ноль делить- матан учить, а нам это не нужно; могу сказать, что lim(x/0)= +-бесконечность");


        }
    }
    //vivodDrobi
    public void vivodDrobi(){
        System.out.println(chislitel + "/" + znamenatel);
    }
    //СУММА В СУМКЕ У ПАПЫ
    public void sum(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * d + b * c) + "/" + b * d);
    }
    //НА БАРЕ СИНИЕ МЫ ТАНЦУЕМ ПОД МИНУС
    public void min(int a, int b, int c, int d) {System.out.println("Результат: " + (a * d - b * c) + "/" + b * d);}
    //ДВАЖДЫ ДВА ЧОТЫРЕ ЭТО ВСЕМ ИЗВЕТНО В ЦЕЛОМ МИРЕ
    public void umnogenie(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * c) + "/" + b * d);
    }
    //ОТОБРАТЬ И ПОДЕЛИТЬ НАРОДНОЕ ДОСТОЯНИЕ CUMУНИЗМ РУЛИТ
    public void delenie(int a, int b, int c, int d) {
        System.out.println("Результат: " + (a * d) + "/" + c * b);
    }

}

public class Main{
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        //ДРОООООБЬ ПО УМАЛЧИВАНИЮ
        Drobi drob1 = new Drobi();
        drob1.vivodDrobi();

        //СОЗДАНИЕ ВСЕЛЕНСКОЙ ДРОБИ, КОТОРАЯ УЖЕ ТЫСЯЧИ И МИЛИЛОНЫ МИЛИАРДДОВ ЛЕТ ПРОЖИВАЕТ НА ЭТОЙ И ТРИЛЛИОНАХ ТАКИХ ЖЕ ГАЛАКТИК ЕЙ ЭТОТ МИР АБСОЛЮТНО ПОНЯТЕН
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя:");
        Drobi drob2 = new Drobi(in.nextInt(), in.nextInt());
        drob2.vivodDrobi();


        //СКЛАДЫВАНИЕ
        System.out.println("Складываем как сигма - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Drobi drob3 = new Drobi(in.nextInt(), in.nextInt());
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя второй дроби:");
        Drobi drob4 = new Drobi(in.nextInt(), in.nextInt());
        drob3.sum(drob3.chislitel, drob3.znamenatel, drob4.chislitel, drob4.znamenatel);

        //Складывание со значением по умолчанию
        System.out.println("Складываем как сигма - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Drobi drob31 = new Drobi(in.nextInt(), in.nextInt());
        Drobi drob41 = new Drobi();
        System.out.println("Значение по умолчанию: "+ drob41.chislitel + "/"+ drob41.znamenatel);
        drob3.sum(drob31.chislitel, drob31.znamenatel, drob41.chislitel, drob41.znamenatel);


        //Вычетаем дробби
        System.out.println("Вычитание - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Drobi drob5 = new Drobi(in.nextInt(), in.nextInt());
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя второй дроби:");
        Drobi drob6 = new Drobi(in.nextInt(), in.nextInt());
        drob5.min(drob5.chislitel, drob5.znamenatel, drob6.chislitel, drob6.znamenatel);

        //Вычетаем дробби со значением по умолчанию
        System.out.println("Вычитание - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Drobi drob51 = new Drobi(in.nextInt(), in.nextInt());
        Drobi drob61 = new Drobi();
        System.out.println("Значение по умолчанию: "+ drob61.chislitel + "/"+ drob61.znamenatel);
        drob5.min(drob51.chislitel, drob51.znamenatel, drob61.chislitel, drob61.znamenatel);

        //ДЮП В МАЙНКРАФТЕ(УМНОЖЕНИЕ)
        System.out.println("Умножение - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Drobi drob7 = new Drobi(in.nextInt(), in.nextInt());
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя второй дроби:");
        Drobi drob8 = new Drobi(in.nextInt(), in.nextInt());
        drob7.umnogenie(drob7.chislitel, drob7.znamenatel, drob8.chislitel, drob8.znamenatel);

        //ДЮП В МАЙНКРАФТЕ(УМНОЖЕНИЕ) Со значением по умалчиванию
        System.out.println("Умножение - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Drobi drob71 = new Drobi(in.nextInt(), in.nextInt());
        Drobi drob81 = new Drobi();
        System.out.println("Значение по умолчанию: "+ drob81.chislitel + "/"+ drob81.znamenatel);
        drob7.umnogenie(drob71.chislitel, drob71.znamenatel, drob81.chislitel, drob81.znamenatel);

        //БЫЛО ДВА ЯБЛОКА ИХ РАЗДЕЛИЛИ КАК ПОЛЬШУ В 39
        System.out.println("Деление - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Drobi drob9 = new Drobi(in.nextInt(), in.nextInt());
        System.out.println("Введите ЦЕЛЫЕ значения числителя и знаменателя второй дроби:");
        Drobi drob10 = new Drobi(in.nextInt(), in.nextInt());
        drob9.delenie(drob9.chislitel, drob9.znamenatel, drob10.chislitel, drob10.znamenatel);

        //БЫЛО ДВА ЯБЛОКА ИХ РАЗДЕЛИЛИ КАК ПОЛЬШУ В 39 со значение по умолчанию(пакт молотова-риббентропа)
        System.out.println("Деление - Введите ЦЕЛЫЕ значения числителя и знаменателя первой дроби:");
        Drobi drob91 = new Drobi(in.nextInt(), in.nextInt());
        Drobi drob101 = new Drobi();
        System.out.println("Значение по умолчанию: "+ drob91.chislitel + "/"+ drob101.znamenatel);
        drob9.delenie(drob91.chislitel, drob91.znamenatel, drob101.chislitel, drob101.znamenatel);


    }
    }


