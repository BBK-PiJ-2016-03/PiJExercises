public class Person{

    public String getInitials(String fullName) {

        if(fullName == null || fullName.length() == 0)
            return "";

        String result = "";
        while(fullName.contains("  ")){
            fullName = fullName.replace("  ", " ");
        }        
        String[] words = fullName.split(" ");

        for (int i = 0; i < words.length; i++) {
            String nextInitial = "" + words[i].charAt(0);
            result = result + nextInitial.toUpperCase();
        }

        return result;
    }

}