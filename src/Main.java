public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        short fcTokyo = -25000;
        System.out.println("значение переменной fcTokyo " + " с типом " + "short " + " равно " + fcTokyo);
        int gambaOsaka = 1234567891;
        System.out.println("значение переменной gambaOsaka " + " с типом " + "int " + " равно " + gambaOsaka);
        long visselCobe = 1234567891234567891L;
        System.out.println("значение переменной visselCobe " + " с типом " + "long " + " равно " + visselCobe);
        byte cerezaOsaka = 127;
        System.out.println("значение переменной cerezaOsaka " + " с типом " + "byte " + " равно " + cerezaOsaka);
        float atlantaUnited = 3.1234567F;
        System.out.println("значение переменной atlantaUnited " + " с типом " + "float " + " равно " + atlantaUnited);
        double jueventusItalia = 1.9123678;
        System.out.println("значение переменной jueventusItalia " + " с типом " + "double " + " равно " + jueventusItalia);
        System.out.println("Задача №2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786F;
        System.out.println(c);
        int d = 11;
        boolean e = 10 > 11;
        System.out.println(e);
        short f = 569;
        System.out.println(f);
        short g = -159;
        System.out.println(g);
        short h = 27897;
        System.out.println(h);
        int i = 67;
        System.out.println(i);
        System.out.println("Задача №3");
        int lyudmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int totalPeoples = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short paperList = 480;
        System.out.println("На каждого ученика рассчитано "+ paperList/totalPeoples +" листов бумаги");
        System.out.println("Задача №4");
        byte perfomanceCar = 8;
        byte time = 20;
        System.out.println("За " + time + " минут " + "машина произвела бутылок " + perfomanceCar * time + " штук");
        int perfomanceHour = perfomanceCar * 60;
        byte time2 = 24;
        int perfomanceDay = perfomanceHour * time2;
        System.out.println("За " + time2 + " часа " + "машина произвела бутылок " + perfomanceDay + " штук");
        byte day = 3;
        System.out.println("За " + day + " дня " + "машина произвела бутылок " + perfomanceDay * day + " штук");
        byte mounth = 1;
        byte daysMounth = 30;
        System.out.println("За " + mounth + " месяц " + "машина произвела бутылок " + perfomanceDay * daysMounth + " штук");
        System.out.println("задача №5");
         byte whiteDye = 2;
         byte brownDye = 4;
         byte totalDye = 120;
         int dyeClassroom = whiteDye + brownDye;
         int amountClass = totalDye / dyeClassroom;
        System.out.println("В школе, где " + amountClass + " классов, нужно " + amountClass * 2 + " банок белой красски и " + amountClass * 4 + " банок коричневой красски" );
        System.out.println("Задача №6");
        byte bananasAmount = 5;
        int bananasWeight = 80 * bananasAmount ;
        double milkAmount = 200;
        double milkWeight = milkAmount / 105;
        byte icecreamAmount = 2;
        int icecreamWeight = 100 * icecreamAmount;
        int eggAmount = 4;
        int eggWeight = eggAmount * 70;
        double totalWeight = bananasWeight + milkWeight + icecreamWeight + eggWeight;
        double weightKg = totalWeight / 1000;
        System.out.println("Вес завтрака составляет " + weightKg + " килограмм");

        System.out.println("Задача №7");
        int coloriesDay = 250;
        int coloriesDay2 = 500;
        int totalColories = 7700 * 7;
        int looseWeight = totalColories / coloriesDay;
        int looseWeight2 = totalColories / coloriesDay2;
        System.out.println("спортсмен похудеет на 7 килограмм за " + looseWeight + " дней" + " при сбрасывании" + coloriesDay + " колорий в сутки");
        System.out.println("спортсмен похудеет на 7 килограмм за " + looseWeight2 + " дней" + " при сбрасывании" + coloriesDay2 + " колорий в сутки");

        System.out.println("Задача №8");
        int mashaPayroll = 67760;
        int denisPayroll = 83690;
        int chrissPayroll = 76230;
        int yearpayrollMasha = mashaPayroll * 12;
        int yearpayrollDenis = denisPayroll * 12;
        int yearpayrollChriss = chrissPayroll * 12;
        double mashaIncomming = mashaPayroll * 1.1;
        double denisIncomming = denisPayroll * 1.1;
        double chrissIncomming = chrissPayroll * 1.1;
        double mashaUpgrade = mashaIncomming * 12;
        double denisUpgrade = denisIncomming * 12;
        double chrissUpgrade = chrissIncomming * 12;
        System.out.println("годовой доход маши до повышения был " + yearpayrollMasha + " После повышения стал " + mashaUpgrade);
        System.out.println("годовой доход дениса до повышения был " + yearpayrollDenis + " После повышения стал " + denisUpgrade);
        System.out.println("годовой доход кристины до повышения был " + yearpayrollChriss + " После повышения стал " + chrissUpgrade);










    }
}