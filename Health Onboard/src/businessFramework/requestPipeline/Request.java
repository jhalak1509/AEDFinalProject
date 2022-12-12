/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.requestPipeline;

import businessFramework.userAccount.User;
import java.util.Date;

/**
 *
 * @author jhalaksurve
 */
public abstract class Request {
    
    private String reqMessage;
    private User senderDetails;
    private User receiverDetails;
    private String statusOfRequest;
    private Date requestDate;
    private Date resolveDate;
    
    public Request(){
        requestDate = new Date();
    }

    public String getReqMessage() {
        return reqMessage;
    }

    public void setReqMessage(String reqMessage) {
        this.reqMessage = reqMessage;
    }

    public User getSenderDetails() {
        return senderDetails;
    }

    public void setSenderDetails(User senderDetails) {
        this.senderDetails = senderDetails;
    }

    public User getReceiverDetails() {
        return receiverDetails;
    }

    public void setReceiver(User receiverDetails) {
        this.receiverDetails = receiverDetails;
    }

    public String getStatusOfRequest() {
        return statusOfRequest;
    }

    public void setStatus(String statusOfRequest) {
        this.statusOfRequest = statusOfRequest;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    @Override
    public String toString() {
        return this.reqMessage;
    }
    
}
