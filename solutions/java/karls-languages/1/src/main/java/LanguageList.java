import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(languages.size()==0)
            return true;
        else
            return false;
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        if(languages.contains(language))
        {
            languages.remove(language);
        }
    }

    public String firstLanguage() {
        return languages.get(0);
        
    }

    public int count() {
        int count=languages .size();
        return count;
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        if(containsLanguage("Java")||containsLanguage("Kotlin"))
            return true;
        return false; 
        
    }
}
