package testers;
public class Main {
    public static void main(String[] args) {
        // the gui
        javax.swing.SwingUtilities.invokeLater(() -> {
            new gui(); // launches window
        });
    }
}
