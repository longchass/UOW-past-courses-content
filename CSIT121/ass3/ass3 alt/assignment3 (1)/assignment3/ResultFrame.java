package assignment3;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;

public class ResultFrame extends SearchCustomer {
    private JLabel resultLabel;
    private JList resultsList;
    private UserManagement manager;
    private String keyword;

    protected ResultFrame(UserManagement manager, String keyword) {
        super(manager);
        setLayout(new FlowLayout());
        this.manager = manager;
        this.keyword = keyword;

        this.setVisible(true);
        this.setSize(400, 150);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        resultLabel = new JLabel("Results list");
        add(resultLabel);
        
        resultsList = new JList<>(manager.displayCustomerByFullName(keyword));
        resultsList.setVisibleRowCount(3);
        resultsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        add(new JScrollPane(resultsList));

        resultsList.addListSelectionListener((ListSelectionEvent event) -> {
            JOptionPane.showMessageDialog(null, 
                    manager.searchCustomerByFullName(keyword).get(resultsList.getSelectedIndex()));
        });
    }
}
