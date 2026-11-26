enum Day
{
    MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumBasics
{
    public static void main(String[] args)
    {
        Day today = Day.WEDNESDAY;

        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + Day.THURSDAY);
    }
}
