public class StringBase {
    public static void main(String[] args) {
        var name = "Alejandro";

        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Alejandro\") = " + name.equals("Alejandro"));
        System.out.println("name.equalsIgnoreCase(\"alejandro\") = " + name.equalsIgnoreCase("alejandro"));
        System.out.println("name.compareTo(\"alejandro\") = " + name.compareTo("alejandro"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(name.length()-1) = " + name.charAt(name.length()-1));
        System.out.println("name.substring(3, 5) = " + name.substring(3, 5));
        System.out.println("name.replace(\"o\", \"0\") = " + name.replace("o", "0"));
        System.out.println("name.indexOf('l') = " + name.indexOf('l'));
        System.out.println("name.lastIndexOf('a') = " + name.lastIndexOf('a'));
        System.out.println("name.indexOf(\"dro\") = " + name.indexOf("dro"));
        System.out.println("name.contains(\"dro\") = " + name.contains("dro"));
        System.out.println("name.startsWith(\"Al\") = " + name.startsWith("Al"));
        System.out.println("name.endsWith(\"o\") = " + name.endsWith("o"));

        var file = "image.jpg";
        System.out.println("file = " + file);
        var fileExtension = file.substring(file.lastIndexOf(".")+1);
        System.out.println("file extension = " + fileExtension);
        String[] fileWords = file.split("[.]");
        for(String word : fileWords){
            System.out.println(word);
        }
    }
}
