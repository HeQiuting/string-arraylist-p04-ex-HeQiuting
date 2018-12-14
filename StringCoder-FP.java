/** @param str the string to encode using the master string
     *  Precondition: all of the characters in str appear in the master string;
     *  str.length() > 0
     *  @return a string part in the master string that matches the beginning of str.
     *  The returned string part has length at least 1 and largest 5. 
     *  The method gives prefernce to return the longer matches.
     */
    private StringPart findPart(String str)
        if(str.length() >= 5){
            int i = str.length();
        }
        else{
            int i = 5;
        }
        while(n > 0){
            int index = masterString.indexOf(str.substring(0, n));
            if(index == -1){
                n--;
            }
            else{
                return  new StringPart(index, n);
            }
        }
        return null;
}
                
