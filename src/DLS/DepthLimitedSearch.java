/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DLS;

import node.Node;
/**
 *
 * @author syhnn
 */
public class DepthLimitedSearch {
    private int limit;

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void search(Node start, Node goal) {
        System.out.println("Mencari solusi dari "+start.getNilai()+" ke "+goal.getNilai());
        Node eval = start;
        for (int i = 0; i < limit; i++) {
            System.out.println("Level "+i+" evaluasi: "+eval.getNilai());
            if (eval.equals(goal)) {
                System.out.println("Solusi ditemukan ");
                break;
            }
            if (!eval.getTetangga().isEmpty()) {
                eval = eval.getTetangga().get(0);
            } else {
                break;
            }
        }
    }
}
