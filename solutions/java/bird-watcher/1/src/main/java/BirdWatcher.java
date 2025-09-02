
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int today=birdsPerDay[birdsPerDay.length-1];
        return today;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]+=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i=0;i<birdsPerDay.length;i++)
            {
                if(birdsPerDay[i]==0)
                {
                    return true;
                }
            }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum=0;
        if(numberOfDays>birdsPerDay.length)
            numberOfDays=birdsPerDay.length;
        for(int i=0;i<numberOfDays;i++)
            {
                sum+=birdsPerDay[i];
            }
        return sum;
        
    }

    public int getBusyDays() {
        int busy=0;
        for(int i=0;i<birdsPerDay.length;i++)
            {
                if(birdsPerDay[i]>=5)
                    busy+=1;
            }
        return busy;
    }
}
