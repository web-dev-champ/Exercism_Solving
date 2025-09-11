class SqueakyClean {
    static String clean(String identifier) {
        String k="";
        if(!identifier.equals(null))
        {
            //Space
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
            //kebab case
            for(int i=0;i<identifier.length();i++)
            {
                char ch=identifier.charAt(i);
                char ch2=0;
                if(i+1<identifier.length())
                {
                    ch2=identifier.charAt(i+1);
                }
                else{
                    k=k+ch;
                    break;
                }
                
                if(ch=='-'&& identifier.lastIndexOf('-')!=identifier.length())
                {
                    if(Character.isAlphabetic(ch2))
                    {
                        ch2=Character.toUpperCase(ch2);
                        k=k+ch2;
                        i++;
                        /*i++ is used to prevent repitition.
                          e.g. Input is 'a-bc'
                               if we don't use i++
                               Output becomes aBbc
                               so we need to skip once a '-' is replaced
                        */
                    }
                }
                else
                 {
                     k=k+ch;
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
