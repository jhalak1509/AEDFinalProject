/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.requestPipeline;

import java.util.ArrayList;

/**
 *
 * @author patil
 */
public class RequestPipeline {
    
    
    
    private ArrayList<Request> requestList;

    public RequestPipeline() {
        requestList = new ArrayList<>();
    }

    public ArrayList<Request> getRequestList() {
        return requestList;
    }

}
