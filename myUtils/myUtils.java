/***
 * An in-house Utils library.
 * @author Shufan Zhang
 */
package MyUtils;

public class myUtils {

    /***
     * Cave Test: print class name with contained informations of an input object
     * @param o Any object
     */
    public static void caveTest(Object o) {
        System.out.println("Test print " + o.getClass().getSimpleName() + " : " + o);
    }

    /***
     * Cave Test: print an introductory string with contained informations of an input object
     * @param string An introductory string
     * @param o Any object
     */
    public static void caveTest(String string, Object o) {
        System.out.println("Test print " + string + " : " + o);
    }

    /***
     * Cave Test: when ifPrint is true, print an introductory string with contained informations of an input object
     * @param string An introductory string
     * @param o Any object
     * @param ifPrint Condition
     */
    public static void caveTest(String string, Object o, boolean ifPrint) {
        if (ifPrint)
            System.out.println("Test print " + string + " : " + o);
    }

    /***
     * This function can clear cmd interface.
     */
    static void clearConsole() {
        // clear console output
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }
        catch (Exception e){
            System.out.println("Console clear error!");
        }
    }


}
