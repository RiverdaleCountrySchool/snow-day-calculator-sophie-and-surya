public class SnowDay {
    public static void main(String[] args) {
//arguments --> endTime snowLevel snowDays tempAt7
       double chance = 0;

       double endTime = Double.valueOf(args[0]);
        if (endTime >= 8 && endTime <= 15) {
           chance = chance + 0.09;
        }
        if (endTime >= 1 && endTime <= 7) {
          chance = chance + 0.03;
        }
        if (endTime >= 16 && endTime <=24) {
            chance = chance + 0.02;
        }

       char snowLevel = args[1].charAt(0);
       if (snowLevel == 'L'){
           chance = chance + 0.025;
       }
       if (snowLevel == 'M'){
            chance = chance + 0.125;
        }
       if (snowLevel == 'H') {
           chance = chance + 0.225;
       }

       double snowDays = Double.valueOf(args[2]);
       if (snowDays >= 0 && snowDays <= 3) {
           chance = chance + 0.045;
       }
       if (snowDays >= 4 && snowDays <= 6 ) {
           chance = chance + (0.4 * 0.05);
       }

       if (snowDays >= 7) {
           chance = chance + (0.1 * 0.05);
       }

       double tempAt7 = Double.valueOf(args[3]);
       if(tempAt7 <=20){
           chance = chance + (.225);
       }
       if(tempAt7 > 20 && tempAt7 <= 32){
           chance = chance + (.25 * .6);
       }
       if(tempAt7 > 32){
           chance = chance + (.25 * .1);
       }

       double percentChance = Double.valueOf(args[4]);
       if (percentChance > 80){
           chance = chance + (.2 * .9);
       }
       if (percentChance <= 80 && percentChance >50){
           chance = chance + (.2 * .5);
       }
       if (percentChance <=50){
           chance = chance + (.2 * .1);
       }

       char dayOfWeek = args[5].charAt(0);
       if (dayOfWeek == 'M' || dayOfWeek == 'F') {
           chance = chance + (0.9 * 0.05);
       }
       if (dayOfWeek == 'T') {
           chance = chance + (0.5 * 0.05);
       }
       if (dayOfWeek == 'W') {
           chance = chance + (0.2 * 0.05);
       }

       int leniency = Integer.valueOf(args[6]);
       if (leniency == '1') {
           chance = chance + (0.2 * 0.1);
       }
       if (leniency == '2') {
           chance = chance + (0.4 * 0.1);
       }
       if (leniency == '3') {
           chance = chance + (0.6 * 0.1);
       }
       if (leniency == '4') {
           chance = chance + (0.8 * 0.1);
       }
       if (leniency == '5') {
           chance = chance +(1 * 0.1);
       }

       System.out.println ("The chance of a snow day is " + Math.round(chance * 100));


    }
}
