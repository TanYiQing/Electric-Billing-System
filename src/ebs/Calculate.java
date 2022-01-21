/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebs;

/**
 *
 * @author Yi Qing Tan
 */

public class Calculate {
   
    private int cM,pM;
    private double t;
    private int totalUsage;
    private double currentCharge;
    private String cC,cMeter,pMeter,tgkan,tU;
    
    Calculate() {}
    
    public void calCurrentCharge(){
        totalUsage=cM-pM;
        if(totalUsage>0&&totalUsage<201)
            currentCharge=(totalUsage*0.218)+t;
           
        else if(totalUsage>200&&totalUsage<301)
            currentCharge=((totalUsage-200)*0.334)+43.6+t;
        
        else if(totalUsage>300&&totalUsage<601)
            currentCharge=((totalUsage-300)*0.516)+77+t;
        
        else if(totalUsage>600&&totalUsage<901)
            currentCharge=((totalUsage-600)*0.546)+231.8+t;
        
        else if(totalUsage>900)
            currentCharge=((totalUsage-900)*0.571)+395.6+t;
 
        else
            currentCharge=12345; 
    }
    
    public String getCurrentCharge(){
        cC=String.format("%.2f",currentCharge);
        if(currentCharge==12345)
        cC="Can't Calculate!";
        
        return cC;
        
    }
    
    public String getTotalUsage(){
        totalUsage=cM-pM;
        tU=Integer.toString(totalUsage);
        return tU;
    }
    
    public void setTunggakan(String tunggakan){
        t=Double.parseDouble(tunggakan);
    }
    
    public void setCurrentMeter(String currentMeter){
        cM=Integer.parseInt(currentMeter);
    }
    
    public void setPreviousMeter(String previousMeter){
        pM=Integer.parseInt(previousMeter);
    }
    
    
}

    
   