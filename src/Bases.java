
public class Bases {
    public static void main(String[] args) {
        // Variables
        // Numbers
        byte var1 = 127; // Max value
        short var2 = 32767; // Max value
        int var3 = 2147483647; // Max value
        long var4 = 9223372036854775807L; // Max value
        float var5 = 3.1416f;
        double var6 = 5.31514e5;
        // Text
        char var7 = '@';
        char var8 = '\u0040';
        char var9 = 64;
        String var10 = "Hello!";
        // Booleans
        boolean var11 = true;
        // Dynamic variables
        var dynamicVar = 10;
        // Parse
        var intStr = "50";
        var floatStr = "5.10f";
        // String to number
        var realInt = Integer.parseInt(intStr);
        var realFloat = Double.parseDouble(floatStr);
        // ...
        // Number to String
        var parseStr = Integer.toString(realInt);
        parseStr = String.valueOf(realInt);
        // Force convert
        int intNum = 10000;
        short shortNum = (short)intNum;
        float floatNum = (float)intNum;
    }
}