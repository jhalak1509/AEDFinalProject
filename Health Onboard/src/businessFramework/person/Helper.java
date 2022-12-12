/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businessFramework.person;

import businessFramework.network.Network;
import java.util.ArrayList;

/**
 *
 * @author vinaykumargudooru
 */
public class Helper extends Person{
 
    private String helperId;
    private static int order = 001;
    private String latitiude;
    private String longitude;
    private ArrayList<Review> reviewList;
    
    
    public Helper()
    {
        StringBuffer hp = new StringBuffer();
        hp.append("VOL");
        hp.append(order);
        helperId = hp.toString();
        order++;
        reviewList= new ArrayList<>();
    }

    @Override
    public String toString() {
        return this.getName();
    }

  
    public String getHelperId() {
        return helperId;
    }

    public String getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(String latitiude) {
        this.latitiude = latitiude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public ArrayList<Review> getReviewList() {
        return reviewList;
    }

   
    public Review addReview()
    {
        Review review = new Review();
        reviewList.add(review);
        return review;
    }
    
}
