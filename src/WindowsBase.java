import javax.swing.*;

public class WindowsBase {
    public static void main(String[] args) {
        // Window input
        var winMsg = JOptionPane.showInputDialog(null, "Type something: ");
        // Window show message
        JOptionPane.showMessageDialog(null, winMsg);
    }
}
