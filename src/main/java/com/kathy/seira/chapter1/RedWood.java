/*
 * All Rights Reserved @Dhiraj
 */

package com.kathy.seira.chapter1;

/**
 * @author Dhiraj
 * @date 16/06/18
 */
public class RedWood extends Tree {
    public static void main(String[] args) {
        new RedWood().go();
    }
    void go() {
        go2(new Tree(), new RedWood());
        go2((RedWood) new Tree(), new RedWood());
    }
    void go2(Tree tree, RedWood redwood) {
        RedWood r2 = (RedWood) tree;
        Tree t2 = (Tree) redwood;
    }
}
class Tree {
}