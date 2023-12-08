/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import BFS.BreadthFirstSearch;
import DLS.DepthLimitedSearch;
import UCS.NodeUCS;
import node.Node;
import UCS.UniformCostSearch;
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

        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(setbud, lengkong);
        System.out.println();
        
        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(6);
        dls.search(setbud, lengkong);
        System.out.println();

        NodeUCS setbudUCS = new NodeUCS(setbud, 82);
        NodeUCS lengkongUCS = new NodeUCS(lengkong, 0);
        NodeUCS pvjUCS = new NodeUCS(pvj, 73);
        NodeUCS herminaUCS = new NodeUCS(hermina,78);
        NodeUCS cikapundungUCS = new NodeUCS(cikapundung, 59);
        NodeUCS itbUCS = new NodeUCS(itb, 53);
        NodeUCS puskesmasUCS = new NodeUCS(puskesmas, 95);
        NodeUCS tamsarUCS = new NodeUCS(tamsar, 31);
        NodeUCS sumateraUCS = new NodeUCS(sumatera, 27);
        NodeUCS alunalunUCS = new NodeUCS(alunalun, 20);
        NodeUCS tegalegaUCS = new NodeUCS(tegalega, 22);

        setbudUCS.addTetangga(pvjUCS);
        setbudUCS.addTetangga(herminaUCS);

        pvjUCS.addTetangga(setbudUCS);
        pvjUCS.addTetangga(cikapundungUCS);
        pvjUCS.addTetangga(puskesmasUCS);

        herminaUCS.addTetangga(setbudUCS);
        herminaUCS.addTetangga(puskesmasUCS);

        puskesmasUCS.addTetangga(herminaUCS);
        puskesmasUCS.addTetangga(pvjUCS);
        puskesmasUCS.addTetangga(tamsarUCS);
        puskesmasUCS.addTetangga(tegalegaUCS);

        cikapundungUCS.addTetangga(pvjUCS);
        cikapundungUCS.addTetangga(itbUCS);

        itbUCS.addTetangga(cikapundungUCS);
        itbUCS.addTetangga(tamsarUCS);
        itbUCS.addTetangga(sumateraUCS);

        tamsarUCS.addTetangga(sumateraUCS);
        tamsarUCS.addTetangga(itbUCS);
        tamsarUCS.addTetangga(puskesmasUCS);
        tamsarUCS.addTetangga(alunalunUCS);

        alunalunUCS.addTetangga(tamsarUCS);
        alunalunUCS.addTetangga(lengkongUCS);
        alunalunUCS.addTetangga(sumateraUCS);

        sumateraUCS.addTetangga(tamsarUCS);
        sumateraUCS.addTetangga(alunalunUCS);
        sumateraUCS.addTetangga(lengkongUCS);

        lengkongUCS.addTetangga(alunalunUCS);
        lengkongUCS.addTetangga(sumateraUCS);
        lengkongUCS.addTetangga(itbUCS);

        tegalegaUCS.addTetangga(lengkongUCS);
        tegalegaUCS.addTetangga(puskesmasUCS);

        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(setbudUCS, lengkongUCS);
        System.out.println();
    }
}
