package core;

import javax.swing.*;
import java.awt.*;

// This class operates text message and size operations

public class Helper {
    public static void setTheme() {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
        }
    }

    public static boolean isFieldEmpty(JTextField field) {
        return field.getText().trim().isEmpty();
    }

    public static void showMsg(String str) {
        String msg;
        String title;

        switch (str) {
            case ("fill") -> {
                msg = "Please Fill All The Blanks";
                title = "Error";
            }
            case ("done") -> {
                msg = "Success";
                title = "Result";
            }
            case ("notFound") -> {
                msg = "Not Found";
                title = "Result";
            }
            case ("error") -> {
                msg = "Error";
                title = "Error";
            }
            default -> {
                msg = str;
                title = "Message";
            }
        }
        JOptionPane.showMessageDialog(null, msg, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(String str) {
        String msg;
        if (str.equals("sure")) {
            msg = "Are you sure ?";
        } else {
            msg = str;
        }
        return JOptionPane.showConfirmDialog(null, msg, "Are You Sure ?", JOptionPane.YES_NO_OPTION) == 0;
    }

    public static boolean isFieldListEmpty(JTextField[] fieldList) {
        for (JTextField field : fieldList) {
            if (isFieldEmpty(field)) return true;
        }
        return false;
    }

    public static int getLocationPoint(String type, Dimension size) {
        return switch (type) {
            case "x" -> (Toolkit.getDefaultToolkit().getScreenSize().width - size.width) / 2;
            case "y" -> (Toolkit.getDefaultToolkit().getScreenSize().height - size.height) / 2;
            default -> 0;
        };
    }
}
