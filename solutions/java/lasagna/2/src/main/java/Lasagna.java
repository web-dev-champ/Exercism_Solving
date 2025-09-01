public class Lasagna {
    public int expectedMinutesInOven()
    {
        return 40;
    }
    public int remainingMinutesInOven(int TimeInOven)
    {
        return (expectedMinutesInOven()-TimeInOven);
    }

    public int preparationTimeInMinutes(int noOfLayers)
    {
        return (2 * noOfLayers);
    }
    //TOTAL TIME TAKEN TILL NOW = PrepTime + TimeInOven
    public int totalTimeInMinutes(int noOfLayers,int TimeInOven)
    {
        return (preparationTimeInMinutes(noOfLayers)+TimeInOven);
    }
}
