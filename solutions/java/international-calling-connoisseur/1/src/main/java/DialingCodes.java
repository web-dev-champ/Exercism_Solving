import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    private Map<Integer, String> M= new HashMap<>();
    public Map<Integer, String> getCodes() {
        
            return M;
    }

    public void setDialingCode(Integer code, String country) {
        
            M.put(code,country);
    }

    public String getCountry(Integer code) {
        
                return M.get(code);
        
    }

    public void addNewDialingCode(Integer code, String country) {
        
            if(!M.containsKey(code) && !M.containsValue(country))
            {
                M.put(code,country);
            }
        
    }

    public Integer findDialingCode(String country) {
        
            for(Integer i: M.keySet())
            {
                if(M.get(i)==country)
                {
                    return i;
                }
            }
            return null;
        
    }

    public void updateCountryDialingCode(Integer code, String country) {
            if(findDialingCode(country)!=null)
            {
                int old = findDialingCode(country);
                M.remove(old);
                M.put(code,country);
            }    
    }
}
