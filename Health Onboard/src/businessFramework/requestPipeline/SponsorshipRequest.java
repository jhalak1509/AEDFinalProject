/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.requestPipeline;

import businessFramework.commonFunctions.Sponsorship;

/**
 *
 * @author jhalaksurve
 */
public class SponsorshipRequest extends Request{
    
    private String sponsoredBy;
    private String reqId;
    private static int count = 000;
    private Sponsorship sponsorship;
   
    public SponsorshipRequest()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("SPONSORSHIP");
        sb.append(count);
        reqId = sb.toString();
        count++;
    }

    public String getSponsoredBy() {
        return sponsoredBy;
    }

    public void setSponsoredBy(String sponsoredBy) {
        this.sponsoredBy = sponsoredBy;
    }

    public void setDonation(Sponsorship sponsorship) {
        this.sponsorship = sponsorship;
    }

    public Sponsorship getSponsorShip() {
        return sponsorship;
    }

    @Override
    public String toString() {
        return this.reqId;
    }
    
}
