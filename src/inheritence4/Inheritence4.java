/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritence4;

/**
 *
 * @author Sheba.xyz
 */
public class Inheritence4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teacher teacher=new Teacher();
        teacher.setName("Zubayer");
        teacher.setAge(5);
        teacher.dept="Physics";
        teacher.DisplayInfo();
        //-----------------------------------
        System.out.println("-----------------------------------");
        Abstraction sms=new Sebdsms1();
        //sms=new Sebdsms1();
        sms.SendMessage();
        sms=new SendSMS2();
        //sms=new Sebdsms1();
        sms.SendMessage();
        
    }
    
}
