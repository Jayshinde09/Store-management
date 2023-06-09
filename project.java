import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ecommerce 
{
   JFrame frame;
   JLabel l1,pic;
   JButton b1,b2,b3,b4;
   JTabbedPane jtp;
   ImageIcon Electronics,Clothes,Stationary,Sports;
   JButton E[]=new JButton[4];
   JButton C[]=new JButton[4];
   JButton ST[]=new JButton[4];
   JButton S[]=new JButton[4];
   ImageIcon Electro;

   public Ecommerce()
   {
      frame=new JFrame();
      jtp=new JTabbedPane();
      jtp.add("Home",new Home());
      jtp.setBounds(130,100,100, 40);
      jtp.add("Electronics",new Electronics());
      jtp.setBounds(130,110,100, 40);
      jtp.add("Clothes",new Clothes());
      jtp.setBounds(130,120,100, 40);
      jtp.add("Stationary",new Stationary());
      //jtp.setBounds(130,130,100, 40);
      jtp.add("Sports",new Sports());
      //jtp.setBounds(130,140,100, 40);
      frame.add(jtp);
      frame.setLayout(new FlowLayout());
      frame.setSize(400,500);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   public class Home extends JPanel implements ActionListener
   {
      public Home()
      {

      }
      public void actionPerformed(ActionEvent e)
      {

      }
   }
   public class Electronics extends JPanel implements ActionListener
   {
      public Electronics()
      {
         E[0]=new JButton("Laptop");
         E[0].addActionListener(this);
         add(E[0]);
         E[1]=new JButton("Headset");
         E[1].addActionListener(this);
         add(E[1]);
         E[2]=new JButton("Charger");
         E[2].addActionListener(this);
         add(E[2]);
         E[3]=new JButton("Mobile");
         E[3].addActionListener(this);
         add(E[3]);
      }
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==E[0])
         {
            int amount=75000;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==E[1])
         {
            int amount=2500;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==E[2])
         {
            int amount=250;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==E[3])
         {
            int amount=25000;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
      }
   }
   public class Clothes extends JPanel implements ActionListener
   {
      public Clothes()
      {
         C[0]=new JButton("TShirt");
         C[0].addActionListener(this);
         add(C[0]);
         C[1]=new JButton("Trousers");
         C[1].addActionListener(this);
         add(C[1]);
         C[2]=new JButton("Hoodie");
         C[2].addActionListener(this);
         add(C[2]);
         C[3]=new JButton("Shirts");
         C[3].addActionListener(this);
         add(C[3]);
      }
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==C[0])
         {
            int amount=700;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==C[1])
         {
            int amount=900;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==C[2])
         {
            int amount=2000;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==C[3])
         {
            int amount=1300;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
      }
   }
   public class Stationary extends JPanel implements ActionListener
   {
      public Stationary()
      {
         ST[0]=new JButton("Bags");
         ST[0].addActionListener(this);
         add(ST[0]);
         ST[1]=new JButton("Notebooks");
         ST[1].addActionListener(this);
         add(ST[1]);
         ST[2]=new JButton("Pens");
         ST[2].addActionListener(this);
         add(ST[2]);
         ST[3]=new JButton("Pencil");
         ST[3].addActionListener(this);
         add(ST[3]);
      }
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==ST[0])
         {
            int amount=1000;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==ST[1])
         {
            int amount=50;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==ST[2])
         {
            int amount=30;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==ST[3])
         {
            int amount=20;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         } 
      }
   }
   public class Sports extends JPanel implements ActionListener
   {
      public Sports()
      {
         S[0]=new JButton("Bat");
         S[0].addActionListener(this);
         add(S[0]);
         S[1]=new JButton("Football");
         S[1].addActionListener(this);
         add(S[1]);
         S[2]=new JButton("Basketball");
         S[2].addActionListener(this);
         add(S[2]);
         S[3]=new JButton("Stumps");
         S[3].addActionListener(this);
         add(S[3]);
      }
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==S[0])
         {
            int amount=1600;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==S[1])
         {
            int amount=600;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==S[2])
         {
            int amount=300;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
         if(e.getSource()==S[3])
         {
            int amount=250;
            int num=Integer.parseInt(JOptionPane.showInputDialog("Enter the Quantity"));
            amount=amount*num;
            JOptionPane.showMessageDialog(null,"Total Amount to Pay :"+amount);
            JOptionPane.showMessageDialog(null,"Order Placed !!!");
         }
      }
   } 
   public static void main(String a[])
   {
      Ecommerce ecom =new Ecommerce();
   }
}