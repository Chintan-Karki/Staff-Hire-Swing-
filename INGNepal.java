/**
     * Importing all the packages and components for JAVA Swing
     */
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;


	/**
     * Declaring class for INGNepal.java file as public
     */
public class INGNepal {
	/**
     * Declaring all the global variables for swing components .
     */
    public JFrame frame;
    public JPanel welcomePanel, panelFullTime, panelPartTime, terminationPanel;
    public JTextField tfVacancyNumberFT, tfDesignationFT, tfJobTypeFT, tfSalaryFT, tfWorkingHourFT, tfAppointedByFT,
            tfStaffNameFT, tfJoiningDateFT, tfQualificationFT, tfVacNumberFT;
    public JTextField tfJobTypePT, tfDesignationPT, tfVacancyNumberPT, tfShiftsPT, tfWagesPT, tfWorkingHourPT,
            tfStaffNamePT, tfJoiningDatePT, tfQualificationPT, tfAppointedByPT, tfTerminationPT, tfVacNumberPT;
    
    /**
     * Declaring and initializing an array-list to store the objects.
     */
    public ArrayList<StaffHire> list = new ArrayList<>();
    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	//Using UI manager for uniform look and feel
     				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    //Creating new object if INGNepal to run the application
                    INGNepal window = new INGNepal();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    //To catch any exceptions in program and show its trace in the terminal.
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public INGNepal() {
    	//Initializing/Calling methods with all the components in the program.
        initializeFrame();
        initializeWelcomePanel();
        initializeFulltimeStaff();
        initializeParttimeStaff();
        initializeTerminationPanel();
    }

    /**
     * Initialize the contents of the frame.
     */
    public void initializeFrame() {
        // Frame Layout:
        frame = new JFrame("Staff Hire");
        frame.setBounds(0, 0, 750, 450);
        //Positions of all components are manually set in null layout
        frame.getContentPane().setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        //To launch the application at the center of the screen.
        frame.setLocationRelativeTo(null);
    }

    // First Welcome Panel Layout

    public void initializeWelcomePanel() {

    	/**
     	* Creating a welcome panel .
     	*/
        welcomePanel = new JPanel();
        welcomePanel.setLayout(null);
        welcomePanel.setBounds(0, 0, 744, 421);

        //Heading of the panel in JLabel/ 	
        JLabel lblWelcome = new JLabel("Welcome to Staff Hiring Portal.");
        lblWelcome.setBounds(301, 59, 153, 31);
        welcomePanel.add(lblWelcome);

        JLabel lblChoose = new JLabel("Choose what you want to do:");
        lblChoose.setBounds(301, 90, 153, 31);
        welcomePanel.add(lblChoose);


	/**
    * Setting up all the functional buttons in the welcome page.
    */
        JButton btnAppointFTS = new JButton("Appoint Full Time Staff ");
        btnAppointFTS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomePanel.setVisible(false);
                panelFullTime.setVisible(true);
                panelPartTime.setVisible(false);
                terminationPanel.setVisible(false);
            }
        });
        btnAppointFTS.setBounds(276, 132, 194, 39);
        welcomePanel.add(btnAppointFTS);

        JButton btnAppointPTS = new JButton("Appoint Part Time Staff");
        btnAppointPTS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomePanel.setVisible(false);
                panelFullTime.setVisible(false);
                panelPartTime.setVisible(true);
                terminationPanel.setVisible(false);
            }
        });
        btnAppointPTS.setBounds(276, 182, 194, 38);
        welcomePanel.add(btnAppointPTS);

        JButton btnTerminateS = new JButton("Terminate a Staff");
        btnTerminateS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomePanel.setVisible(false);
                panelFullTime.setVisible(false);
                panelPartTime.setVisible(false);
                terminationPanel.setVisible(true);
            }
        });
        btnTerminateS.setBounds(276, 231, 194, 39);
        welcomePanel.add(btnTerminateS);
        
        JButton display_Staffs = new JButton("Display Staffs");
        display_Staffs.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    displaySTFS();
                } catch (NullPointerException ae) {
                    JOptionPane.showMessageDialog(frame, "No staffs found.", "Insufficient Data", 0);
                }
            }
        });
        display_Staffs.setBounds(276, 281, 194, 39);
        welcomePanel.add(display_Staffs);
        welcomePanel.setVisible(true);
        //adding panel and all of its components to the frame.
        frame.getContentPane().add(welcomePanel);

    }

    /**
     * Setting up full time staff panel
     */
    public void initializeFulltimeStaff() {

    	//Creating a JPanel object for the full time staff with null layout
        panelFullTime = new JPanel();
        panelFullTime.setBounds(0, 0, 744, 421);
        panelFullTime.setLayout(null);

    /**
     * Creating text fields in the panel and 
     	adding them to the panel in appropriate position. 
     */    
        tfVacancyNumberFT = new JTextField();
        tfVacancyNumberFT.setBounds(120, 122, 167, 20);
        panelFullTime.add(tfVacancyNumberFT);
        tfVacancyNumberFT.setColumns(10);

        tfDesignationFT = new JTextField();
        tfDesignationFT.setBounds(120, 153, 167, 20);
        panelFullTime.add(tfDesignationFT);
        tfDesignationFT.setColumns(10);

        tfSalaryFT = new JTextField();
        tfSalaryFT.setBounds(434, 153, 146, 20);
        panelFullTime.add(tfSalaryFT);
        tfSalaryFT.setColumns(10);

        tfWorkingHourFT = new JTextField();
        tfWorkingHourFT.setBounds(434, 188, 146, 20);
        panelFullTime.add(tfWorkingHourFT);
        tfWorkingHourFT.setColumns(10);        

        tfJobTypeFT = new JTextField();
        tfJobTypeFT.setBounds(120, 184, 167, 20);
        panelFullTime.add(tfJobTypeFT);
        tfJobTypeFT.setColumns(10);

        //Adding a separator between add and appoint section 	
        JSeparator separator = new JSeparator();
        separator.setBounds(20, 215, 582, 2);
        panelFullTime.add(separator);

        tfVacNumberFT = new JTextField();
        tfVacNumberFT.setColumns(10);
        tfVacNumberFT.setBounds(120, 248, 167, 20);
        panelFullTime.add(tfVacNumberFT);

        tfAppointedByFT = new JTextField();
        tfAppointedByFT.setBounds(434, 310, 168, 20);
        panelFullTime.add(tfAppointedByFT);
        tfAppointedByFT.setColumns(10);

        tfStaffNameFT = new JTextField();
        tfStaffNameFT.setBounds(120, 279, 167, 20);
        panelFullTime.add(tfStaffNameFT);
        tfStaffNameFT.setColumns(10);

        tfJoiningDateFT = new JTextField();
        tfJoiningDateFT.setBounds(120, 310, 167, 20);
        panelFullTime.add(tfJoiningDateFT);
        tfJoiningDateFT.setColumns(10);

        tfQualificationFT = new JTextField();
        tfQualificationFT.setBounds(435, 279, 167, 20);
        panelFullTime.add(tfQualificationFT);
        tfQualificationFT.setColumns(10);
    /**
     * Creating required JLabels and 
       adding them to the panel in appropriate position. 
     */     
        JLabel lblFullTimeStaffHire = new JLabel("Full Time Staff Hire ");
        lblFullTimeStaffHire.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        lblFullTimeStaffHire.setBounds(20, 60, 167, 27);
        panelFullTime.add(lblFullTimeStaffHire);        

        JLabel lblSalaryFT = new JLabel("Salary:");
        lblSalaryFT.setBounds(338, 156, 46, 14);
        panelFullTime.add(lblSalaryFT);

        JLabel lblWorkingHourFT = new JLabel("Working Hour:");
        lblWorkingHourFT.setBounds(338, 191, 86, 14);
        panelFullTime.add(lblWorkingHourFT);

        JLabel lblVacancyNumberFT = new JLabel("Vacancy Number:");
        lblVacancyNumberFT.setBounds(20, 125, 96, 14);
        panelFullTime.add(lblVacancyNumberFT);

        JLabel lblDesignationFT = new JLabel("Designation:");
        lblDesignationFT.setBounds(20, 156, 62, 14);
        panelFullTime.add(lblDesignationFT);

        JLabel lblJobTypeFT = new JLabel("Job Type:");
        lblJobTypeFT.setBounds(20, 187, 86, 14);
        panelFullTime.add(lblJobTypeFT);

        JLabel lblStaffNameFT = new JLabel("Staff Name:");
        lblStaffNameFT.setBounds(20, 282, 62, 14);
        panelFullTime.add(lblStaffNameFT);

        JLabel lblJoiningDateFT = new JLabel("Joining Date:");
        lblJoiningDateFT.setBounds(20, 313, 86, 14);
        panelFullTime.add(lblJoiningDateFT);

        JLabel lblQualificationFT = new JLabel("Qualification:");
        lblQualificationFT.setBounds(338, 282, 86, 14);
        panelFullTime.add(lblQualificationFT);

        JLabel lblAppointedByFT = new JLabel("Appointed By:");
        lblAppointedByFT.setBounds(338, 313, 86, 14);
        panelFullTime.add(lblAppointedByFT);

        JLabel lblVacNumberFT = new JLabel("Vacancy Number:");
        lblVacNumberFT.setBounds(20, 251, 96, 14);
        panelFullTime.add(lblVacNumberFT);        

    /**
     * 
     	Creating all the buttons in the panel.
     	Adding them to the panel.
     	Setting up appropriate position.
     	Handling the event by calling the appropriate method.  
     */     
        JButton btnAddFT = new JButton("Add ");
        btnAddFT.setBounds(627, 175, 96, 40);
        btnAddFT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addFullTimeStaff();
            }
        });
        panelFullTime.add(btnAddFT);

        JButton btnAppointFT = new JButton("Appoint");
        btnAppointFT.setBounds(627, 324, 96, 40);
        btnAppointFT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appointFullTimeStaff();
            }
        });
        panelFullTime.add(btnAppointFT);

        JButton btnDisplayFT = new JButton("Display");
        btnDisplayFT.setBounds(617, 11, 106, 40);
        btnDisplayFT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayFT();
            }
        });
        panelFullTime.add(btnDisplayFT);

        JButton btnClearFT = new JButton("Clear");
        btnClearFT.setBounds(627, 369, 96, 33);
        btnClearFT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearFT();
            }
        });
        panelFullTime.add(btnClearFT);

        JButton btnBackFT = new JButton("Back");
        btnBackFT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomePanel.setVisible(true);
                panelFullTime.setVisible(false);
                panelPartTime.setVisible(false);
                terminationPanel.setVisible(false);
            }
        });
        btnBackFT.setBounds(20, 370, 89, 23);
        panelFullTime.add(btnBackFT);

        //Setting up invisible panel at the launch.	
        panelFullTime.setVisible(false);
        //Adding panel and all of its components to the frame 
        frame.getContentPane().add(panelFullTime);

        

    }

    /**
     * Setting up part time staff panel
     */
    public void initializeParttimeStaff() {
    	//Creating a JPanel object for the part time staff with null layout
        panelPartTime = new JPanel();
        panelPartTime.setBounds(0, 0, 744, 421);
        panelPartTime.setLayout(null);

        //Setting the title of the panel
        JLabel lblPartTimeStaffHire = new JLabel("Part Time Staff Hire");
        lblPartTimeStaffHire.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        lblPartTimeStaffHire.setBounds(10, 59, 167, 14);
        panelPartTime.add(lblPartTimeStaffHire);

    /**
     * Creating text fields in the panel and 
        adding them to the panel in appropriate position. 
     */     	
        tfJobTypePT = new JTextField();
        tfJobTypePT.setBounds(117, 183, 154, 20);
        panelPartTime.add(tfJobTypePT);
        tfJobTypePT.setColumns(10);

        tfDesignationPT = new JTextField();
        tfDesignationPT.setColumns(10);
        tfDesignationPT.setBounds(117, 145, 154, 20);
        panelPartTime.add(tfDesignationPT);

        tfVacancyNumberPT = new JTextField();
        tfVacancyNumberPT.setColumns(10);
        tfVacancyNumberPT.setBounds(117, 114, 154, 20);
        panelPartTime.add(tfVacancyNumberPT);

        tfShiftsPT = new JTextField();
        tfShiftsPT.setColumns(10);
        tfShiftsPT.setBounds(410, 179, 154, 20);
        panelPartTime.add(tfShiftsPT);

        tfWagesPT = new JTextField();
        tfWagesPT.setColumns(10);
        tfWagesPT.setBounds(410, 148, 154, 20);
        panelPartTime.add(tfWagesPT);

        tfWorkingHourPT = new JTextField();
        tfWorkingHourPT.setColumns(10);
        tfWorkingHourPT.setBounds(410, 114, 154, 20);
        panelPartTime.add(tfWorkingHourPT);

        //Adding a separator between add and appoint section	
        JSeparator separator = new JSeparator();
        separator.setBounds(10, 210, 603, 14);
        panelPartTime.add(separator);

        tfStaffNamePT = new JTextField();
        tfStaffNamePT.setBounds(117, 277, 154, 20);
        panelPartTime.add(tfStaffNamePT);
        tfStaffNamePT.setColumns(10);

        tfJoiningDatePT = new JTextField();
        tfJoiningDatePT.setColumns(10);
        tfJoiningDatePT.setBounds(117, 308, 154, 20);
        panelPartTime.add(tfJoiningDatePT);

        tfQualificationPT = new JTextField();
        tfQualificationPT.setColumns(10);
        tfQualificationPT.setBounds(410, 277, 154, 20);
        panelPartTime.add(tfQualificationPT);

        tfAppointedByPT = new JTextField();
        tfAppointedByPT.setColumns(10);
        tfAppointedByPT.setBounds(410, 308, 154, 20);
        panelPartTime.add(tfAppointedByPT);

        tfVacNumberPT = new JTextField();
        tfVacNumberPT.setColumns(10);
        tfVacNumberPT.setBounds(117, 246, 154, 20);
        panelPartTime.add(tfVacNumberPT);

    /**
     * Creating required JLabels and 
       adding them to the panel in appropriate position. 
     */    
        JLabel lblVacancyNumberPT = new JLabel("Vacancy Number:");
        lblVacancyNumberPT.setBounds(18, 117, 89, 14);
        panelPartTime.add(lblVacancyNumberPT);

        JLabel lblDesignationPT = new JLabel("Designation:");
        lblDesignationPT.setBounds(20, 148, 89, 14);
        panelPartTime.add(lblDesignationPT);

        JLabel lblJobTypePT = new JLabel("Job Type:");
        lblJobTypePT.setBounds(18, 185, 89, 14);
        panelPartTime.add(lblJobTypePT);

        JLabel lblShiftsPT = new JLabel("Shifts:");
        lblShiftsPT.setBounds(311, 185, 89, 14);
        panelPartTime.add(lblShiftsPT);

        JLabel lblWagesperhourPT = new JLabel("Wages (per-hour):");
        lblWagesperhourPT.setBounds(311, 151, 97, 14);
        panelPartTime.add(lblWagesperhourPT);

        JLabel lblWorkingHourPT = new JLabel("Working Hour:");
        lblWorkingHourPT.setBounds(311, 117, 89, 14);
        panelPartTime.add(lblWorkingHourPT);

        JLabel lblQualificationPT = new JLabel("Qualification:");
        lblQualificationPT.setBounds(311, 280, 89, 14);
        panelPartTime.add(lblQualificationPT);

        JLabel lblAppiontedByPT = new JLabel("Appionted by:");
        lblAppiontedByPT.setBounds(311, 311, 89, 14);
        panelPartTime.add(lblAppiontedByPT);

        JLabel lblStaffNamePT = new JLabel("Staff Name:");
        lblStaffNamePT.setBounds(18, 280, 89, 14);
        panelPartTime.add(lblStaffNamePT);

        JLabel lblJoiningDatePT = new JLabel("Joining Date:");
        lblJoiningDatePT.setBounds(18, 311, 89, 14);
        panelPartTime.add(lblJoiningDatePT);

        JLabel labelVacNumberPT = new JLabel("Vacancy Number:");
        labelVacNumberPT.setBounds(18, 249, 89, 14);
        panelPartTime.add(labelVacNumberPT);
        panelPartTime.setVisible(false);

    /**
     * 
        Creating all the buttons in the panel.
        Adding them to the panel.
        Setting up appropriate position.
        Handling the event by calling the appropriate method.  
     */    
        JButton btnAddPT = new JButton("Add");
        btnAddPT.setBounds(596, 170, 107, 38);
        btnAddPT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addPartTimeStaff();
            }
        });
        panelPartTime.add(btnAddPT);

        JButton btnAppointPT = new JButton("Appoint");
        btnAppointPT.setBounds(596, 322, 107, 38);
        btnAppointPT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                appointPartTimeStaff();
            }
        });
        panelPartTime.add(btnAppointPT);

        JButton btnDisplayPT = new JButton("Display");
        btnDisplayPT.setBounds(596, 22, 107, 38);
        btnDisplayPT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                displayPT();
            }
        });
        panelPartTime.add(btnDisplayPT);

        JButton btnClearPT = new JButton("Clear");
        btnClearPT.setBounds(596, 364, 107, 38);
        btnClearPT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearPT();
            }
        });
        panelPartTime.add(btnClearPT);

        JButton btnBackPT = new JButton("Back");
        btnBackPT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomePanel.setVisible(true);
                panelFullTime.setVisible(false);
                panelPartTime.setVisible(false);
                terminationPanel.setVisible(false);
            }
        });
        btnBackPT.setBounds(18, 372, 89, 23);
        panelPartTime.add(btnBackPT);

        //Setting up invisible panel at the launch. 
        panelPartTime.setVisible(false);
        //Adding panel and all of its components to the frame 
        frame.getContentPane().add(panelPartTime);
    }

    /**
     * Setting up termination panel
     */
    public void initializeTerminationPanel() {

        terminationPanel = new JPanel();
        terminationPanel.setLayout(null);
        terminationPanel.setBounds(0, 0, 744, 421);
    /**
     * Creating required JLabels and 
       adding them to the panel in appropriate position. 
     */    
        JLabel lblTerminatePTS = new JLabel("Terminate a part time staff:");
        lblTerminatePTS.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTerminatePTS.setBounds(238, 134, 233, 34);
        terminationPanel.add(lblTerminatePTS);

        JLabel lblVacancyNumberPT = new JLabel("Vacancy Number:");
        lblVacancyNumberPT.setBounds(217, 185, 96, 14);
        terminationPanel.add(lblVacancyNumberPT);

        /**
     	* 	Creating text field in the panel for vacancy number 
     		and adding them to the panel in appropriate position. 
     	*/ 
        tfTerminationPT = new JTextField();
        tfTerminationPT.setBounds(341, 179, 109, 27);
        terminationPanel.add(tfTerminationPT);
        tfTerminationPT.setColumns(10);

    /**
     * 
        Creating all the buttons in the panel.
        Adding them to the panel.
        Setting up appropriate position.
        Handling the event by calling the appropriate method.  
     */     
        JButton btnTerminatePT = new JButton("Terminate");
        btnTerminatePT.setBounds(217, 217, 233, 46);
        btnTerminatePT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                terminationStaff();         
                tfTerminationPT.setText("");
            }
        });
        terminationPanel.add(btnTerminatePT);

        JButton btnBackTS = new JButton("Back");
        btnBackTS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                welcomePanel.setVisible(true);
                panelFullTime.setVisible(false);
                panelPartTime.setVisible(false);
                terminationPanel.setVisible(false);
            }
        });
        btnBackTS.setBounds(22, 359, 89, 23);
        terminationPanel.add(btnBackTS);

        terminationPanel.setVisible(false);
        frame.getContentPane().add(terminationPanel);
        
    }

    /**
     * 
     	Creating a method that handles all the event 
     	of 'Add' button of Part time staff. 
     */ 
    public void addPartTimeStaff() {
        int vnumber, wkhour, wphour;
        //Declaring variables and storing the inputs from appropriate text fields in them.
        String vacancyNumberPT = tfVacancyNumberPT.getText();
        String designationPT = tfDesignationPT.getText();
        String jobTypePT = tfJobTypePT.getText();
        String workingHourPT = tfWorkingHourPT.getText();
        String wagesPT = tfWagesPT.getText();
        String shiftsPT = tfShiftsPT.getText();

        //Checking for an empty text field.
        if (vacancyNumberPT.trim().equals("") || designationPT.trim().equals("") || jobTypePT.trim().equals("")
                || workingHourPT.trim().equals("") || wagesPT.trim().equals("") || shiftsPT.trim().equals("")) {
            //Error message for empty textfields.
            JOptionPane.showMessageDialog(frame, "Please fill all the Text Fields.", "TextField Empty", 0);
        } else {
            try {
            	//Converting Strings to integers.
                vnumber = Integer.parseInt(vacancyNumberPT);
                wkhour = Integer.parseInt(workingHourPT);
                wphour = Integer.parseInt(wagesPT);
            } catch (NumberFormatException ae) {
            	//Error message for unsuitable inputs. 
                JOptionPane.showMessageDialog(frame, "Please fill the form in correct format.", "Format Mismatch", 0);
                return;
            }
            //Iterating through all the objects in Array list.
            for (StaffHire s : list) {
            	//Checking for the appropriate instance
                if (s instanceof PartTimeStaffHire) {
                	//Type Casting the StaffHire object to PartTimeStaffHire 
                    PartTimeStaffHire  p = (PartTimeStaffHire) s;
                    //Comparing vacancy number to previously added ones.
                    if (s.getVacancyNumber() == vnumber) {
                    	//Overrite error in case the vacancy number (is same)already exists.
                    	JOptionPane.showMessageDialog(frame, "The specified vacancy number already exists.","Vacancy Override", 0);
                        return;
                    }
                }
            }
            //Calling the constructor object and passing appropriate parameters.
            PartTimeStaffHire ptsh = new PartTimeStaffHire(vnumber, designationPT, jobTypePT, wkhour, wphour, shiftsPT);
            //Adding object to Array list.
            list.add(ptsh);
            //Successful addition Information Message.
            JOptionPane.showMessageDialog(frame, "Staff Added Successfully.", "Staff Addition", 1);
            return;
        }

    }

    /**
     * 
     	Creating a method that handles all the event 
     	of 'Add' button of Full time staff. 
     */ 
    public void addFullTimeStaff() {
        int vcnumber, salary, wkhour;
        //Declaring variables and storing the inputs from appropriate text fields in them.
        String vacancyNumberFT = tfVacancyNumberFT.getText();
        String designationFT = tfDesignationFT.getText();
        String jobTypeFT = tfJobTypeFT.getText();
        String workingHourFT = tfWorkingHourFT.getText();
        String salaryFT = tfSalaryFT.getText();
        //Checking for an empty text field.
        if (vacancyNumberFT.trim().equals("") || designationFT.trim().equals("") || jobTypeFT.trim().equals("")
                || workingHourFT.trim().equals("") || salaryFT.trim().equals("")) {
        	//Error message for empty textfields.
            JOptionPane.showMessageDialog(frame, "Please fill all the Text Fields.", "TextField Empty", 0);
        } else {
            try {
            	//Converting Strings to integers.
                vcnumber = Integer.parseInt(vacancyNumberFT);
                wkhour = Integer.parseInt(workingHourFT);
                salary = Integer.parseInt(salaryFT);
            } catch (NumberFormatException ae) {
            	//Error message for unsuitable inputs.
                JOptionPane.showMessageDialog(frame, "Please fill the form in correct format.", "Format Mismatch", 0);
                return;
            }
            //Iterating through all the objects in Array list.
            for (StaffHire s : list) {
            	//Checking for the appropriate instance
                if (s instanceof FullTimeStaffHire) {
                	//Type Casting the StaffHire object to FullTimeStaffHire 
                    FullTimeStaffHire p = (FullTimeStaffHire) s;
                    //Comparing vacancy number to previously added ones.
                    if (p.getVacancyNumber() == vcnumber) {
                    	//Overrite error in case the vacancy number (is same)already exists.
                        JOptionPane.showMessageDialog(frame, "The specified vacancy number already exists.",
                                "Vacancy Override", 0);
                        return;
                    }
                }
            }
            //Calling the constructor object and passing appropriate parameters.
            FullTimeStaffHire ftsh = new FullTimeStaffHire(vcnumber, designationFT, jobTypeFT, salary, wkhour);
            //Adding object to Array list.
            list.add(ftsh);
            //Successful addition Information Message.
            JOptionPane.showMessageDialog(frame, "Staff Added Successfully.", "Staff Addition", 1);
            return;
        }

    }

    /**
     * 
     	Creating a method that handles all the event 
     	of 'Appoint' button of Part time staff. 
     */ 
    public void appointPartTimeStaff() {
        int vcnumber;
        //Declaring variables and storing the inputs from appropriate text fields in them.
        String vacNumberPT = tfVacNumberPT.getText();
        String staffName = tfStaffNamePT.getText();
        String joiningDatePT = tfJoiningDatePT.getText();
        String qualificationPT = tfQualificationPT.getText();
        String appointedByPT = tfAppointedByPT.getText();

        //Checking for an empty text field.
        if (vacNumberPT.trim().equals("") || staffName.trim().equals("") || joiningDatePT.trim().equals("")
                || qualificationPT.trim().equals("") || appointedByPT.trim().equals("")) {
        	//Error message for empty textfields.
            JOptionPane.showMessageDialog(frame, "Please fill all the Text Fields.", "TextField Empty", 0);
        } else {
            try {
            	//Converting Strings to integers.	
                vcnumber = Integer.parseInt(vacNumberPT);
            } catch (NumberFormatException ae) {
            	//Error message for unsuitable inputs.
                JOptionPane.showMessageDialog(frame, "Please fill the form in correct format.", "Format Mismatch", 0);
                return;
            }
            boolean appointed = false;
            //Iterating through all the objects in Array list.
            for (StaffHire a : list) {
            	//Checking for the appropriate instance
                if (a instanceof PartTimeStaffHire) {
                	//Type Casting the StaffHire object to PartTimeStaffHire 
                    PartTimeStaffHire pp = (PartTimeStaffHire) a;
                    //Comparing vacancy number to previously added ones.
                    if (pp.getVacancyNumber() == vcnumber) {
                        if (pp.getJoined() == false) {
                        	//Calling the hiring method.
                            pp.partTimeStaffHire(staffName, joiningDatePT, qualificationPT, appointedByPT);
                            //Successful appointment message in case the vacancy number is hired.
                            JOptionPane.showMessageDialog(frame, "Part Time Staff Appointed Successfully.",
                                    "Appointment Succesful", 1);
                            pp.setJoined(true);
                            appointed = true;
                            //Clearing all the text fields.
                            clearPT();
                            return;
                        } else {
                        	//Overrite error in case the vacancy number is already hired.
                            JOptionPane.showMessageDialog(frame, "Staff has already been Appointed.",
                                    "Appointment Override", 1);
                            return;
                        }
                    }
                }
            }
            if (!appointed) {
            	//Failure message incase the vacancy number is not previously added.
                JOptionPane.showMessageDialog(frame, "Vacancy number not found", "Appointment Failure", 0);
            }
        }
    }

    /**
     * 
        Creating a method that handles all the event 
        of 'Appoint' button of Full time staff. 
     */
    public void appointFullTimeStaff() {
        int vcnumber;
        //Declaring variables and storing the inputs from appropriate text fields in them.
        String vacNumberFT = tfVacNumberFT.getText();
        String staffNameFT = tfStaffNameFT.getText();
        String joiningDateFT = tfJoiningDateFT.getText();
        String qualificationFT = tfQualificationFT.getText();
        String appointedByFT = tfAppointedByFT.getText();
        //Checking for an empty text field.
        if (vacNumberFT.trim().equals("") || staffNameFT.trim().equals("") || joiningDateFT.trim().equals("")
                || qualificationFT.trim().equals("") || appointedByFT.trim().equals("")) {
            JOptionPane.showMessageDialog(frame, "Please fill all the Text Fields.", "TextField Empty", 0);
        	//Error message for empty textfields.
        } else {
            try {
            	//Converting Strings to integers.
                vcnumber = Integer.parseInt(vacNumberFT);
            } catch (NumberFormatException ae) {
            	//Error message for unsuitable inputs.
                JOptionPane.showMessageDialog(frame, "Please fill the form in correct format.", "Format Mismatch", 0);
                return;
            }
            boolean appointed = false;
            //Iterating through all the objects in Array list.
            for (StaffHire a : list) {
                if (a instanceof FullTimeStaffHire) {
                	//Type Casting the StaffHire object to FullTimeStaffHire 
                    FullTimeStaffHire pp = (FullTimeStaffHire) a;
                    //Comparing vacancy number to previously added ones.
                    if (pp.getVacancyNumber() == vcnumber) {
                        if (pp.getJoined() == false) {
                        	 //Calling the hiring method.
                            pp.fullTimeStaffHire(staffNameFT, joiningDateFT, qualificationFT, appointedByFT);
                            //Successful appointment message in case the vacancy number is hired.
                            JOptionPane.showMessageDialog(frame, "Full Time Staff Appointed Successfully.",
                                    "Appointment Succesful", 1);
                            pp.setJoined(true);
                            appointed = true;
                            //Clearing all the text fields.
                            clearFT();
                            return;
                        } else {
                        	//Overrite error in case the vacancy number is already hired.
                            JOptionPane.showMessageDialog(frame, "Staff has already been Appointed.",
                                    "Appointment Override", 1);
                            return;
                        }
                    }
                }
            }
            if (!appointed) {
            	//Failure message incase the vacancy number is not previously added.
                JOptionPane.showMessageDialog(frame, "Vacancy number not found", "Appointment Failure", 0);
            }
        }
    }

    /**
     * 
        Creating a method that handles all the event 
        of 'Add' button of Part time staff. 
     */     
    public void terminationStaff() {
    	//Storing the input from textfield to a variable
        String vacNumberTerm = tfTerminationPT.getText();
        int vacn;
        if (vacNumberTerm.trim().equals("")) {
        	//Checking for empty textfield
            JOptionPane.showMessageDialog(frame, "Please fill the Text Field.", "TextField Empty", 0);
        } else {
            try {
            	//Converting string to integer
                vacn = Integer.parseInt(vacNumberTerm);
            } catch (NumberFormatException ae) {
            	//Error message for unsuitable inputs.
                JOptionPane.showMessageDialog(frame, "Please fill the form in correct format.", "Format Mismatch", 0);
                return;
            }

            boolean sterminated = false;
            //Iterating through all the objects in Array list.
            for (StaffHire s : list) {
            	//Checking for the appropriate instance
                if (s instanceof PartTimeStaffHire) {
                	//Type Casting the StaffHire object to PartTimeStaffHire 
                    PartTimeStaffHire p = (PartTimeStaffHire) s;
                    //Comparing vacancy number to previously added ones.
                    if (p.getVacancyNumber() == vacn) {
                    	//Calling the termination method
                        p.terminateStaff();
                        list.remove(s);
                        //Successful termination Information Message.
                        JOptionPane.showMessageDialog(frame, "Staff Terminated Succesfully.", "Termination Success", 1);
                        sterminated = true;
                        break;
                    }
                }
            }
            if (!sterminated) {
            	//termination error in case of non existing vacancy number.
                JOptionPane.showMessageDialog(frame, "Vacancy number not found.", "Vacancy unidentified", 0);
            }
        }

    }

    /**
     * 
        Creating a method that handles all the event 
        of 'Display' button of Welcome staff. 
     */
    public void displaySTFS() {
        boolean staffs = false;
        //Iterating through the array list
        for (StaffHire s : list) {
        	//Checking for the instance of PartTimeStaffHire
            if (s instanceof PartTimeStaffHire) {
                PartTimeStaffHire p = (PartTimeStaffHire) s;
                //Calling for the display method 
                p.displayStaffDetails();
                staffs = true;
           }
           //Checking for the instance of FullTimeStaffHire
           else if (s instanceof FullTimeStaffHire) {
                FullTimeStaffHire p = (FullTimeStaffHire) s;
                //Calling for the display method 
                p.displayStaffDetails();
                staffs = true;
           }
           
        }
        if (!staffs) {
        	//Error message in case no staff exists in the list
            JOptionPane.showMessageDialog(frame, "No staffs found.", "Insufficient Data", 0);
        }
    }

	/**
     * 
        Creating a method that handles all the event 
        of 'Display' button of Part time staff panel. 
     */
    public void displayPT() {
        boolean staffs = false;
        //Iterating through the array list
        for (StaffHire s : list) {
        	//Checking for the instance of PartTimeStaffHire
           if (s instanceof PartTimeStaffHire) {
           		//Type Casting the StaffHire object to PartTimeStaffHire 
                PartTimeStaffHire p = (PartTimeStaffHire) s;
                //Calling for the display method 
                p.displayStaffDetails();
                staffs = true;
            }            
        }
        if (!staffs) {
        	//Error message in case no staff exists in the list
            JOptionPane.showMessageDialog(frame, "No staffs found.", "Insufficient Data", 0);
        }
    }

    /**
     * 
        Creating a method that handles all the event 
        of 'Display' button of Full time staff panel. 
     */
    public void displayFT() {
        boolean staffs = false;
        //Iterating through the array list
        for (StaffHire s : list) {
        	//Checking for the instance of FullTimeStaffHire
           if (s instanceof FullTimeStaffHire) {
           		//Type Casting the StaffHire object to FullTimeStaffHire 
                FullTimeStaffHire p = (FullTimeStaffHire) s;
                //Calling for the display method 
                p.displayStaffDetails();
                staffs = true;
           }           
        }
        if (!staffs) {
        	//Error message in case no staff exists in the list
            JOptionPane.showMessageDialog(frame, "No staffs found.", "Insufficient Data", 0);
           }
    }
    /**
     * 
        Creating a method that handles all the event 
        of 'Clear' button of Full time staff panel. 
     */
    public void clearFT() {
    	//Setting all the text fields in Full-time panel to null
        tfVacancyNumberFT.setText("");
        tfDesignationFT.setText("");
        tfJobTypeFT.setText("");
        tfSalaryFT.setText("");
        tfWorkingHourFT.setText("");
        tfAppointedByFT.setText("");
        tfStaffNameFT.setText("");
        tfJoiningDateFT.setText("");
        tfQualificationFT.setText("");
        tfVacNumberFT.setText("");
        
    }
    /**
     * 
        Creating a method that handles all the event 
        of 'Clear' button of Part time staff panel. 
     */
    public void clearPT(){
    	//Setting all the text fields in Part-time panel to null
        tfJobTypePT.setText("");
        tfDesignationPT.setText("");
        tfVacancyNumberPT.setText("");
        tfShiftsPT.setText("");
        tfWagesPT.setText("");
        tfWorkingHourPT.setText("");
        tfStaffNamePT.setText("");
        tfJoiningDatePT.setText("");
        tfQualificationPT.setText("");
        tfAppointedByPT.setText("");
        tfVacNumberPT.setText("");
    }
}//End of the class INGNepal