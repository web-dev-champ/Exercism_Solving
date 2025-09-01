public class Lasagna {
    public int expectedMinutesInOven()
    {
        int EXPECTED_MINUTES_IN_OVEN =40;
        return EXPECTED_MINUTES_IN_OVEN;
    }
    public int remainingMinutesInOven(int TimeInOven)
    {
        return (expectedMinutesInOven()-TimeInOven);
    }

    public int preparationTimeInMinutes(int noOfLayers)
    {
        int PREPARATION_TIME_PER_LAYER = 2;
        return (PREPARATION_TIME_PER_LAYER * noOfLayers);
    }
    //TOTAL TIME TAKEN TILL NOW = PrepTime + TimeInOven
    public int totalTimeInMinutes(int noOfLayers,int TimeInOven)
    {
        return (preparationTimeInMinutes(noOfLayers)+TimeInOven);
    }
}
