/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class EmpSer {

  
 EmailSer es;

    public void setEs(EmailSer es) {
        this.es = es;
    }
    void reg(){
       System.out.println("registered successfuly"); 
       es.sendEmail();
    }

   
}
