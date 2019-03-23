public class MyClock
{
    public static void main(String[] args){
        ClockDisplay hkTime = new ClockDisplay(15,30);
        ClockDisplay londonTime = new ClockDisplay(10,30);
        hkTime.timeTick();
        londonTime.timeTick();
        System.out.println(hkTime.getTime());
        System.out.println(londonTime.getTime());
    }
}