class SqueakyClean {
    static String clean(String identifier) {
        String k="";
        if(!identifier.equals(null))
        {
            //For single element string
            if(identifier.length()==1)
            {
                char ch=identifier.charAt(0);
                if(Character.isAlphabetic(ch))
                    return identifier;
            }
            for(int i=0;i<identifier.length();i++)
            {
                char ch=identifier.charAt(i);
                if(ch!=' ')
                {
                        k=k+ch;
                }
                else
                {
                    k=k+"_";
                } 
            }
            identifier =k;
            k="";
            //Improved code for kebab case
            for (int i = 0; i < identifier.length(); i++) {
                char ch = identifier.charAt(i);
                if (ch == '-' && i + 1 < identifier.length() && Character.isAlphabetic(identifier.charAt(i + 1))) {
                    // Capitalize the next character and skip adding '-'
                    k += Character.toUpperCase(identifier.charAt(i + 1));
                    i++; // Skip the next character, since it's already added
                } else {
                    k += ch;
                }
            }
           

            //leetspeak
            identifier=k;
            k="";
            for(int i=0;i<identifier.length();i++)
            {
                char ch=identifier.charAt(i);
                if(Character.isDigit(ch))
                {
                    if(ch=='4')
                    {
                        ch='a';
                    }
                    else if(ch=='3')
                    {
                        ch='e';
                    }
                    else if(ch=='0')
                    {
                        ch='o';
                    }
                    else if(ch=='1')
                    {
                        ch='l';
                    }
                    else if(ch=='7')
                    {
                        ch='t';
                    }
                   
                }
                k=k+ch;
                
            }

            //Omit characters
            identifier=k;
            k="";
            for(int i=0;i<identifier.length();i++)
            {
                    char ch= identifier.charAt(i);
                    if(Character.isAlphabetic(ch)||ch=='_')
                        k=k+ch;
            }
        }
        return k;
        
    }
}
