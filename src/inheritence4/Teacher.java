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
public class Teacher extends Person{
    
    protected String dept;
    
    void DisplayInfo()
    {
        System.out.println("Name =>"+ this.name);
        System.out.println("Age =>"+super.age);
        System.out.println("Department =>"+this.dept);
    
    }
    
    
}
