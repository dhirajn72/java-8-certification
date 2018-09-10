/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 05/09/18
 */
public class TestClass33 {
    Queue<Request> container= new LinkedList<>();
    public synchronized void addRequest(Request r){
        container.add(r);
    }
    public synchronized Request getRequestToProcess(){
        return container.poll();
    }
}
class Request { }

