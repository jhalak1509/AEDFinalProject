/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.requestPipeline;

import static businessFramework.organizations.Organizations.Type.Helper;
import businessFramework.person.Helper;

/**
 *
 * @author jhalaksurve
 */
public class TransportationRequest extends Request {
    
    private String transReqId;
    private static int count = 000;
    private String needTransportation;
    private String transReqOutcome;
    
    
     public TransportationRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("TRANS");
        sb.append(count);
        transReqId = sb.toString();
        count++;
    }
     
    public void setNeedTransportation(String needTransportation) {
        this.needTransportation = needTransportation;
    }

    public String getNeedTransportion() {
        return needTransportation;
    }

    @Override
    public String toString() {
        Helper helper = (Helper)this.getSenderDetails().getPerson();
        String address = helper.getAddress1().concat(helper.getAddress2().concat(helper.getTown()));
        return address;
                
    }

    public String geTransReqOutcome() {
        return transReqOutcome;
    }

    public void setTransReqOutcome(String transReqOutcome) {
        this.transReqOutcome = transReqOutcome;
    }
     
    
}
