package com.mycompany.icetask5;
import javax.swing.JOptionPane;

public class IceTask5 {

    public static void main(String[] args) {
        
        String employee_1[] =randomNumber(JOptionPane.showInputDialog(null," Enter Employee 1 name "));
        String employee_2[] =randomNumber(JOptionPane.showInputDialog(null," Enter Employee 2 name "));
        String employee_3[] =randomNumber(JOptionPane.showInputDialog(null," Enter Employee 3 name "));
        
        String temp1 = employee_1[0] + " is " + employee_1[1] + " network and has the phonenumber of " + employee_1[2];
        String temp2 = employee_2[0] + " is " + employee_2[1] + " network and has the phonenumber of " + employee_2[2];
        String temp3 = employee_3[0] + " is " + employee_3[1] + " network and has the phonenumber of " + employee_3[2];
        
       JOptionPane.showMessageDialog(null,"""
                                           CellPhone Number Generator 
                                          ***************************
                                           Cellphone Number Generator
                                          """ + temp1 + "\n" + temp2 + "\n" + temp3 + "\n" + " Network Provider Assignment");
    
    
    }
    
   public static String[] randomNumber(String name){
    final String CellC = "084";
       final String MTN = "083";
    final String Vodacom = "072";
    
    String network_provider = "";
    String number = "";
    
  int option = (1 + (int)(Math.random()*3));
if(option == 1)
{ number = formatNumber(CellC);
  network_provider = "CellC";
}
else if (option ==2)
{ number = formatNumber(MTN);
network_provider = "MTN";
}
else if(option==3)
{ number = formatNumber(Vodacom);
network_provider = "Vodacom"; 
}

String employee[] = {name, network_provider , number};
return employee;
} 
    
public static String formatNumber(String network_code)
{ String temp1 = String.format("%03d", 0 + (int)(Math.random()*999));
String temp2 = String.format("%04d", 0 + (int)(Math.random()*9999));
String temp3 = (network_code + " " + temp1 + "-(" + temp2 + ")");
return temp3;
    
}
    
    
    
}



















