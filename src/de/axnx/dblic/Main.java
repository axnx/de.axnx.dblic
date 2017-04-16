/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.axnx.dblic;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Testprogramm");
        AgendaDAO dao = new AgendaDAO();
        License lic = new License();
        lic.setName("Mustermann");
        lic.setVorname("Max");
        dao.persist(lic);
        System.out.println("gespeichert !");
        
    }
    
}
