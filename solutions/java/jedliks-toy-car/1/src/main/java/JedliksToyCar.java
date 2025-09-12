public class JedliksToyCar {
    private int batteryCharge;
    private int driving;
    public JedliksToyCar()
    {
        this.batteryCharge=100;
        this.driving=0;
    }
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
    }

    public String distanceDisplay() {
        String s = "Driven "+driving+" meters";
        return s;
    }

    public String batteryDisplay() {
        String s = "Battery at "+batteryCharge+"%";
        if(batteryCharge<=0)
            s="Battery empty";
        return s;
    }

    public void drive() {
        if(batteryCharge>0)
        {
            driving+=20;
            batteryCharge-=1; 
        }
    }
}
