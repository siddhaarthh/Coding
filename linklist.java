import java.util.LinkedList;
import javax.swing.JOptionPane;

public class linklist {
public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 0; i < 10; i++) {
        list.add((int) (Math.random() * 100));
    }
    System.out.println("Initial List: " + list);

    String[] options = {"Stack", "Queue"};
    int option = JOptionPane.showOptionDialog(null, "Choose an option:", "Data Structure", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

    if (option == 0) {
        // Stack Operations
        String[] stackOptions = {"Push", "Pop"};
        int stackOption = JOptionPane.showOptionDialog(null, "Choose a stack operation:", "Stack", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, stackOptions, stackOptions[0]);
        if (stackOption == 0) {
            // Push
            int value = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to push onto the stack:"));
            list.addFirst(value);
        } else if (stackOption == 1) {
            // Pop
            if (!list.isEmpty()) {
                list.removeFirst();
            } else {
                JOptionPane.showMessageDialog(null, "Stack is empty!");
            }
        }
    } else if (option == 1) {
        // Queue Operations
        String[] queueOptions = {"Add", "Delete"};
        int queueOption = JOptionPane.showOptionDialog(null, "Choose a queue operation:", "Queue", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, queueOptions, queueOptions[0]);
        if (queueOption == 0) {
            // Add
            int value = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to add to the queue:"));
            list.addLast(value);
        } else if (queueOption == 1) {
            // Delete
            if (!list.isEmpty()) {
                list.removeFirst();
            } else {
                JOptionPane.showMessageDialog(null, "Queue is empty!");
            }
        }
    }

    System.out.println("Final List: " + list);
}
}