public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        return(string1.trim().concat(string2.trim()));
    }
    public Integer getIndexOrNull(String string1, char char1) {
        int index = string1.indexOf(char1);
        if (index == -1) {
            return(null);
        }
        else {
            return(index);
        }
    } 
    public Integer getIndexOrNull(String string1, String string2) {
        int index = string1.indexOf(string2);
        if (index == -1) {
            return(null);
        }
        else {
            return (index);
        }
    }
    public String concatSubstring(String string1, int int1, int int2, String string2) {
        String substring = string1.substring(int1, int2);
        return (substring.concat(string2));
    }
}