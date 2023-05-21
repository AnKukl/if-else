package HW4;

import java.util.Random;

public class Tablo {
   public static void main(String[] args) {

      Random random = new Random();
      int n = random.nextInt(28800);
      int hour = n/3600;
      int time = 17 - hour;
      System.out.println("Актуальное время: " + time + ":00");
      if (time <= 9) {
         System.out.println("До конца рабочего дня осталось: " + hour + " часов");
         System.out.println("До конца рабочего дня осталось: " + n + " секунд");
      } else if (time <= 10) {
            System.out.println("До конца рабочего дня осталось: " + hour + " часов");
            System.out.println("До конца рабочего дня осталось: " + n + " секунд");
         }
         else if (time <= 11) {
            System.out.println("До конца рабочего дня осталось: " + hour + " часов");
            System.out.println("До конца рабочего дня осталось: " + n + " секунд");
         }
         else if (time <= 12) {
            System.out.println("До конца рабочего дня осталось: " + hour + " часов");
            System.out.println("До конца рабочего дня осталось: " + n + " секунд");
         }
         else if (time <= 13) {
            System.out.println("До конца рабочего дня осталось: " + hour + " часа");
            System.out.println("До конца рабочего дня осталось: " + n + " секунд");
         }
         else if (time <= 14) {
            System.out.println("До конца рабочего дня осталось: " + hour + " часа");
            System.out.println("До конца рабочего дня осталось: " + n + " секунд");
         }
         else if (time <= 15) {
            System.out.println("До конца рабочего дня осталось: " + hour + " часа");
            System.out.println("До конца рабочего дня осталось: " + n + " секунд");
         }
        else if (time <= 16) {
            System.out.println("До конца рабочего дня осталось: " + hour + " час");
            System.out.println("До конца рабочего дня осталось: " + n + " секунд");
         }
         else if (time <= 17) {
            System.out.println("До конца рабочего дня осталось меньше часа");
            System.out.println("До конца рабочего дня осталось: " + n + " секунд");
         }


      }





}
