/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebs;

import java.util.ArrayList;

/**
 *
 * @author Yi Qing Tan
 */
      
public class Sort {
    
    public void BubbleSort(ArrayList<User>uList){
            for(int pass=1;pass<uList.size();pass++){
                for(int compare=1;compare<=uList.size()-pass;compare++){
                    User first=uList.get(compare-1);
                    User second=uList.get(compare);
                    if(first.getAccNum()>second.getAccNum())
                        swop(compare-1,compare,uList);
                }
            }
    
    }
    
    public void BubbleSortName(ArrayList<User>uList){
        for(int pass=1;pass<uList.size();pass++){
            for(int compare=1;compare<=uList.size()-pass;compare++){
                User first=uList.get(compare-1);
                User second=uList.get(compare);
                if(first.getnm().compareTo(second.getnm())>0)
                swop(compare-1,compare,uList);
                        
                    }
        }
    }

    private void swop(int x, int y, ArrayList<User> uList) {
            User temp=uList.get(x);
            uList.set(x, uList.get(y));
            uList.set(y, temp);
            
        }
    
}

