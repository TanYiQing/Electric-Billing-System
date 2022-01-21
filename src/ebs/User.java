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
class User {

    private String dt,iN,nm,ads,mN,cM,pM,tUsage,uBill,cCharge;
    private String aN;
    
    User(){}
    

    User(String date, String aN, String iN, String nm, String ads, String mN, String cM, String pM, String tU, String uB, String cC) {
        this.dt=date;
        this.aN=aN;
        this.iN=iN; 
        this.nm=nm;
        this.ads=ads;
        this.mN=mN;
        this.cM=cM;
        this.pM=pM;
        this.tUsage=tU;
        this.uBill=uB;
        this.cCharge=cC;
        
    }
    
    public long getAccNum(){
        long accountNum=Long.parseLong(aN);
        return accountNum;
    }
    
    //userRec
    public String getaN(){
        return aN;
    }
    
    public String getiN(){
        return iN;
    }
    
    public String getnm(){
        return nm;
    }
    
    public String getads(){
        return ads;
    }
    
    public String getmN(){
        return mN;
    }
    
    public String getpM(){
        return pM;
    }
    
    public String getcM(){
        return cM;
    }
    
    public String gettUsage(){
        return tUsage;
    }
    
    public String getuBill(){
        return uBill;
    }
    
    public String getDate(){
        return dt;
    }
    
    public String getcCharge(){
        return cCharge;
    }
    
    //Edit userRec
    public void setaN(String aN){
        this.aN=aN;
    }
    
    public void setiN(String iN){
        this.iN=iN;
    }
    
    public void setdt(String dt){
        this.dt=dt;
    }
    
    public void setnm(String nm){
        this.nm=nm;
    }
    
    public void setads(String ads){
        this.ads=ads;
    }
    
    public void setmN(String mN){
        this.mN=mN;
    }
    
    public void setcM(String cM){
        this.cM=cM;
    }
    
    public void setpM(String pM){
        this.pM=pM;
    }
    
    public void setuBill(String uBill){
        this.uBill=uBill;
    }
}
