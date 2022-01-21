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
import java.util.ArrayList;
public class Search {
    public int BinarySearch(long accNum,ArrayList<User> userRec){
        int p=0;
        int r=userRec.size()-1;
        
        while(p<=r){
            int q=(p+r)/2;
            if(userRec.get(q).getAccNum()==accNum)
                return q;
            else if(userRec.get(q).getAccNum()>accNum)
                r=q-1;
            else
                p=q+1;
        }
        return -1;
    }
    
    public int BinarySearchName(String name, ArrayList<User> userRec){
        int lo=0;
        int hi=userRec.size()-1;
        
        while(lo<=hi){
            int mid=(lo+hi)/2;
            
            if(userRec.get(mid).getnm().equals(name))
                return mid;
            else if(userRec.get(mid).getnm().compareTo(name)<0)
                lo=mid+1;
            else
                hi=mid-1;
        }
        return -1;
    }
}
