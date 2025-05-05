package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Köpek Testleri ---");
        System.out.println("shouldWakeUp(false, 2): " + shouldWakeUp(false, 2));
        System.out.println("shouldWakeUp(true, 8): " + shouldWakeUp(true, 8));
        System.out.println("shouldWakeUp(true, 20): " + shouldWakeUp(true, 20));
        System.out.println("shouldWakeUp(true, 1): " + shouldWakeUp(true, 1));
        System.out.println("shouldWakeUp(true, 24): " + shouldWakeUp(true, 24));
        System.out.println("shouldWakeUp(false, 22): " + shouldWakeUp(false, 22));


        System.out.println("\n--- Yaş Testleri ---");
        System.out.println("hasTeen(9, 99, 19): " + hasTeen(9, 99, 19));
        System.out.println("hasTeen(23, 15, 42): " + hasTeen(23, 15, 42));
        System.out.println("hasTeen(22, 23, 34): " + hasTeen(22, 23, 34));
        System.out.println("hasTeen(13, 20, 30): " + hasTeen(13, 20, 30));
        System.out.println("hasTeen(12, 19, 20): " + hasTeen(12, 19, 20));
        System.out.println("hasTeen(12, 20, 20): " + hasTeen(12, 20, 20));


        System.out.println("\n--- Kedi Testleri ---");
        System.out.println("isCatPlaying(true, 10): " + isCatPlaying(true, 10));
        System.out.println("isCatPlaying(false, 36): " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(false, 35): " + isCatPlaying(false, 35));
        System.out.println("isCatPlaying(true, 45): " + isCatPlaying(true, 45));
        System.out.println("isCatPlaying(true, 46): " + isCatPlaying(true, 46));
        System.out.println("isCatPlaying(false, 25): " + isCatPlaying(false, 25));
        System.out.println("isCatPlaying(true, 24): " + isCatPlaying(true, 24));



        System.out.println("\n--- Alan Hesaplama Testleri (Dikdörtgen) ---");
        System.out.println("area(5.0, 4.0): " + area(5.0, 4.0));
        System.out.println("area(-1.0, 4.0): " + area(-1.0, 4.0));
        System.out.println("area(5.0, -1.0): " + area(5.0, -1.0));
        System.out.println("area(-1.0, -1.0): " + area(-1.0, -1.0));




        System.out.println("\n--- Alan Hesaplama Testleri (Daire) ---");
        System.out.println("area(5.0): " + area(5.0));
        System.out.println("area(-1): " + area(-1));
        System.out.println("area(0.0): " + area(0.0));



        System.out.println("\n--- Testler Bitti ---");



    }


    public static boolean shouldWakeUp(boolean isBarking, int clock) {
            if (clock < 0 || clock > 23) {
                return false;
            }
            if (!isBarking) { 
                return false;
            }
            if (clock >= 0 && clock <= 7 || clock >= 20 && clock <= 23) {
                return true;
            } else {
                return false;
            }

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        
            // firstAge genç mi?
            boolean isFirstAgeTeen = (firstAge >= 13 && firstAge <= 19);
            // secondAge genç mi?
            boolean isSecondAgeTeen = (secondAge >= 13 && secondAge <= 19);
            // thirdAge genç mi?
            boolean isThirdAgeTeen = (thirdAge >= 13 && thirdAge <= 19);

            // Herhangi biri gençse true dön
            if (isFirstAgeTeen || isSecondAgeTeen || isThirdAgeTeen) {
                return true;
            } else {
                return false;
            }
        
    }

    
    
    
    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            if (temp >= 25 && temp <= 45) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temp >= 25 && temp <= 35) {
                return true;
            } else {
                return false;
            }
        }
    }

    
    
    
    
    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1.0;
        }
        return width * height;
    }

    
    
    
    
    
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * Math.PI;
    }
    
    
    
    
    
}
