import javax.swing.*;
public class FeedbackForm extends JFrame {
    JButton button;
    JComboBox<String> meal;
    JComboBox<Integer> rating;
    JTextField name;
    //JLabel label;
    JTextArea area;
    FeedbackForm(){
        setTitle("the feedback form of hostel mess");
        setSize(400,400);
        setLayout(null);
        button=new JButton("Sumbit");
        button.setBounds(130,330,120,40);
        add(button);
        button.addActionListener(e->saveFeedback());
        JLabel label=new JLabel("Name of student");
        label.setBounds(30, 30, 120, 30);
        add(label);
        name=new JTextField();
        name.setBounds(170,30,150,30);
        add(name);
        JLabel mealLabel = new JLabel("Meal Type:");
        mealLabel.setBounds(30, 80, 120, 30);
        add(mealLabel);
        String a[]={"Breakfast","Lunch","Snacks","Dinner"};
        meal=new JComboBox<>(a);
        meal.setBounds(170, 80, 180, 30);
        add(meal);
        JLabel rate=new JLabel("Ratings");
        rate.setBounds(30,130,100,30);
        add(rate);
        Integer b[]={1,2,3,4,5,6,7,8,9,10};
        rating=new JComboBox<>(b);
        rating.setBounds(170,130,180,30);
        add(rating);
        JLabel comment=new JLabel("Comments");
        comment.setBounds(30,210,150,30);
        add(comment);
        area=new JTextArea();
       // area.setBounds(170,210,100,40);
        //add(area);
        JScrollPane sp=new JScrollPane(area);
        sp.setBounds(170,210,100,40);
        add(sp);
        setVisible(true);
    }
    public void saveFeedback() {
        String n = name.getText();
        String m = (String) meal.getSelectedItem();
        int r = (Integer) rating.getSelectedItem();
        String c = (String) area.getText();
        try {
            java.sql.Connection conn = DBConnection.connect();
            String sql = "INSERT INTO feedback(student_name,meal_type,rating,comment) values (?,?,?,?)";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, n);
            pst.setString(2, m);
            pst.setInt(3, r);
            pst.setString(4, c);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Feedback Submitted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }public static void main(String[] args) {

        new FeedbackForm();
    }
    }
