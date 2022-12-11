/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.requestPipeline;

import java.util.Date;

/**
 *
 * @author jhalaksurve
 */
public abstract class Request {
    
    private String message;
    private User senderName;
    private User receiverName;
    private String status;
    private Date requestDate;
    private Date resolveDate;
}
