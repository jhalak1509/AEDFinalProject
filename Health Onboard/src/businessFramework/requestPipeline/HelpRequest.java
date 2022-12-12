/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.requestPipeline;

import businessFramework.commonFunctions.Help;

/**
 *
 * @author jhalaksurve
 */
public class HelpRequest extends Request{
    
    private String reqId;
    private static int count = 000;
    private String comments;
    private Help help;
    private String requestOutcome;
   

    public HelpRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("REQ");
        sb.append(count);
        reqId = sb.toString();
        count++;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getReqId() {
        return reqId;
    }

    public void setNeedHelp(Help help) {
        this.help = help;
    }

    public Help getHelp() {
        return help;
    }

    public void setRequestOutcome(String requestOutcome) {
        this.requestOutcome = requestOutcome;
    }

    public String getRequestOutcome() {
        return requestOutcome;
    }


    
    @Override
    public String toString() {
        return getHelp().getHelp();
    }
    
    
}
