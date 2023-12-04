/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import DLS.DepthLimitedSearch;
import node.Node;
/**
 *
 * @author syhnn
 */
public class Main {
    public static void main(String[] args) {
        Node setbud = new Node("Unpas Setiabudi");
        Node pvj = new Node("PVJ");
        Node hermina = new Node("Hermina Hotel Paster");
        Node cikapundung = new Node("Teras Cikapundung");
        Node itb = new Node("ITB Mesjid Salman");
        Node puskesmas = new Node("Puskesmas Pasirkaliki");
        Node tamsar = new Node("Unpas Tamansari");
        Node sumatera = new Node("Unpas Sumatera");
        Node alunalun = new Node("Alun Alun Bandung");
        Node lengkong = new Node("Unpas Lengkong");
        Node tegalega = new Node("Unpas Tegalega");
        
        setbud.addTetangga(pvj);
        setbud.addTetangga(hermina);
        pvj.addTetangga(cikapundung);
        pvj.addTetangga(puskesmas);
        cikapundung.addTetangga(itb);
        cikapundung.addTetangga(pvj);
        itb.addTetangga(cikapundung);
        itb.addTetangga(sumatera);
        itb.addTetangga(tamsar);
        puskesmas.addTetangga(pvj);
        puskesmas.addTetangga(hermina);
        puskesmas.addTetangga(tamsar);
        puskesmas.addTetangga(tegalega);
        tamsar.addTetangga(sumatera);
        tamsar.addTetangga(puskesmas);
        sumatera.addTetangga(tamsar);
        sumatera.addTetangga(alunalun);
        sumatera.addTetangga(lengkong);
        lengkong.addTetangga(tegalega);
        lengkong.addTetangga(sumatera);
        lengkong.addTetangga(alunalun);
        
        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(5);
        dls.search(setbud, lengkong);
        System.out.println();
    }
}
