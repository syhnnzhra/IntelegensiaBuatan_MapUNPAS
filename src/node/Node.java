/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package node;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author syhnn
 */
public class Node {
    private String nilai;
    private List<Node> tetangga;

    public Node(String nilai) {
        tetangga = new ArrayList<>();
        this.nilai = nilai;
    }

    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    public String getNilai() {
        return nilai;
    }

    public void setTetangga(List<Node> tetangga) {
        this.tetangga = tetangga;
    }

    public List<Node> getTetangga() {
        return tetangga;
    }

    public void addTetangga(Node node) {
        tetangga.add(node);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            return ((Node) obj).nilai.equals(this.nilai);
        }
        return false;
    }
}
