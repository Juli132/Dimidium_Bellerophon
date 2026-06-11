package testers;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class gui extends JFrame {

    private JPanel menuPanel;
    private JPanel generatorPanel;

    private JTextArea inputArea;
    private JTextArea outputArea;
    private JButton runButton;
    private JButton backButton;

    public gui() {
        setTitle("Jupitore: Your Macros Generator for Klipper");
        setSize(950, 700); // bigger window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new CardLayout());

        createMenuPanel();
        createGeneratorPanel();

        add(menuPanel, "Menu");
        add(generatorPanel, "Generator");

        showPanel("Menu");
        setVisible(true);
    }

    private void createMenuPanel() {
        // Darkened Jupiter image
        ImageIcon jupiterImage = new ImageIcon("jupiter1.jpg");
        menuPanel = new ImagePanel(darkenImage(jupiterImage.getImage(), 0.7f));
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));

        JLabel title = new JLabel("Jupitore");
        title.setForeground(new Color(0, 255, 255));
        title.setFont(new Font("Monospaced", Font.BOLD, 42));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton libraryButton = createBigMenuButton("Library");
        libraryButton.addActionListener(e -> JOptionPane.showMessageDialog(
                this, "Language documentation should be here", "Jupitore Library", JOptionPane.INFORMATION_MESSAGE));

        JButton generatorButton = createBigMenuButton("Macros Generator");
        generatorButton.addActionListener(e -> showPanel("Generator"));

        menuPanel.add(title);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 60)));
        menuPanel.add(libraryButton);
        menuPanel.add(Box.createRigidArea(new Dimension(0, 40))); // BIGGER
        menuPanel.add(generatorButton);
    }

    private void createGeneratorPanel() {
        generatorPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                int w = getWidth();
                int h = getHeight();

                // changed background
                GradientPaint gp = new GradientPaint(
                        0, 0, new Color(15, 15, 15),  //  dark black
                        0, h, new Color(60, 60, 60)  //  smoky grey
                );
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, w, h);

                // ???
                g2d.setColor(new Color(255, 255, 255, 50));
                for (int i = 0; i < 30; i++) {
                    int x = (int)(Math.random() * w);
                    int y = (int)(Math.random() * h);
                    int size = (int)(Math.random() * 2) + 1;
                    g2d.fillOval(x, y, size, size);
                }
            }
        };
        generatorPanel.setLayout(new BoxLayout(generatorPanel, BoxLayout.Y_AXIS));
        generatorPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        inputArea = createTextArea("Jupitore Input", new Color(150, 255, 255), new Color(25, 25, 25));
        outputArea = createTextArea("Generated G-Code", new Color(120, 220, 255), new Color(20, 20, 30));
        outputArea.setEditable(false);

        runButton = createDarkButton("Generate G-Code");
        runButton.addActionListener(e -> outputArea.setText("Processed macro:\n" + inputArea.getText()));

        backButton = createDarkButton("Back to Menu");
        backButton.addActionListener(e -> showPanel("Menu"));

        generatorPanel.add(new JScrollPane(inputArea));
        generatorPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        generatorPanel.add(runButton);
        generatorPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        generatorPanel.add(new JScrollPane(outputArea));
        generatorPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        generatorPanel.add(backButton);
    }

  private JTextArea createTextArea(String title, Color textColor, Color bgColor) {
    JTextArea area = new JTextArea(6, 60);
    area.setFont(new Font("Monospaced", Font.PLAIN, 14));
    area.setForeground(textColor);
    area.setBackground(bgColor);
    area.setBorder(BorderFactory.createTitledBorder(new LineBorder(textColor.darker(), 2),
            title, 0, 0, new Font("SansSerif", Font.BOLD, 14), textColor));
    area.setCaretColor(Color.WHITE); // cursor white change
    return area;
}

    // New method for bigger menu buttons
    private JButton createBigMenuButton(String text) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);

        Color base = new Color(30, 30, 30);
        Color hover = new Color(50, 50, 50);
        Color border = new Color(100, 180, 220);  // cyan border
        Color t_Text = new Color(180, 255, 255);

        button.setBackground(base);
        button.setForeground(t_Text);
        button.setFocusPainted(false);
        button.setBorder(new LineBorder(border, 3)); // thicker border
        button.setFont(new Font("Monospaced", Font.BOLD, 28)); // bigger font
        button.setPreferredSize(new Dimension(400, 80)); // bigger button
        button.setMaximumSize(new Dimension(400, 80)); // prevent shrinking
        button.setMargin(new Insets(15, 30, 15, 30));

        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setBackground(hover);
                button.setBorder(new LineBorder(new Color(120, 220, 255), 3));
            }
            public void mouseExited(MouseEvent e) {
                button.setBackground(base);
                button.setBorder(new LineBorder(border, 3));
            }
        });

        return button;
    }

    private JButton createDarkButton(String text) {
        JButton button = new JButton(text);
        button.setAlignmentX(Component.CENTER_ALIGNMENT);

        Color base = new Color(30, 30, 30);
        Color hover = new Color(50, 50, 50);
        Color border = new Color(100, 180, 220);  // cyan border
        Color t_Text = new Color(180, 255, 255);

        button.setBackground(base);
        button.setForeground(t_Text);
        button.setFocusPainted(false);
        button.setBorder(new LineBorder(border, 2));
        button.setMargin(new Insets(8, 20, 8, 20));

        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setBackground(hover);
                button.setBorder(new LineBorder(new Color(120, 220, 255), 2));
            }
            public void mouseExited(MouseEvent e) {
                button.setBackground(base);
                button.setBorder(new LineBorder(border, 2));
            }
        });

        return button;
    }

    private void showPanel(String name) {
        ((CardLayout)getContentPane().getLayout()).show(getContentPane(), name);
    }

    private Image darkenImage(Image img, float factor) {
        int w = img.getWidth(null), h = img.getHeight(null);
        BufferedImage darkImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = darkImg.createGraphics();
        g2d.drawImage(img, 0, 0, null);
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1 - factor));
        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, w, h);
        g2d.dispose();
        return darkImg;
    }

    private static class ImagePanel extends JPanel {
        private final Image image;
        public ImagePanel(Image img) { this.image = img; setOpaque(true); }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(gui::new);
    }
}
