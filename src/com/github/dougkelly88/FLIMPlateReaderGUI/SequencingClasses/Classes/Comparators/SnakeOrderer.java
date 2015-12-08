/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.dougkelly88.FLIMPlateReaderGUI.SequencingClasses.Classes.Comparators;

import com.github.dougkelly88.FLIMPlateReaderGUI.SequencingClasses.Classes.SeqAcqSetup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static sun.security.jca.ProviderList.newList;

/**
 *
 * @author Frederik
 */
public class SnakeOrderer {
    
    public static SnakeOrderer getInstance() {
        return fINSTANCE;
    }
    //MMStudio gui_;
    //CMMCore core_;
    private static final SnakeOrderer fINSTANCE =  new SnakeOrderer();
    
    public List<SeqAcqSetup> snakeOrdererHorizontalFast(List<SeqAcqSetup> listIn){
        /*List<SeqAcqSetup> listOutA=new ArrayList<SeqAcqSetup>();
        List<SeqAcqSetup> listOutB=new ArrayList<SeqAcqSetup>();
        List<SeqAcqSetup> listOutC=new ArrayList<SeqAcqSetup>();
        List<SeqAcqSetup> listOutD=new ArrayList<SeqAcqSetup>();
        List<SeqAcqSetup> listOutE=new ArrayList<SeqAcqSetup>();
        List<SeqAcqSetup> listOutF=new ArrayList<SeqAcqSetup>();
        List<SeqAcqSetup> listOutG=new ArrayList<SeqAcqSetup>();
        List<SeqAcqSetup> listOutH=new ArrayList<SeqAcqSetup>();
        for (SeqAcqSetup curFOV : listIn){
          if (curFOV.getFOV().getWell().contains("A")){
            listOutA.add(curFOV);
          } else if (curFOV.getFOV().getWell().contains("B")){
            listOutB.add(curFOV);
          } else if (curFOV.getFOV().getWell().contains("C")){
            listOutC.add(curFOV);
          }  else if (curFOV.getFOV().getWell().contains("D")){
            listOutD.add(curFOV);
          } else if (curFOV.getFOV().getWell().contains("E")){
            listOutE.add(curFOV);
          } else if (curFOV.getFOV().getWell().contains("F")){
            listOutF.add(curFOV);
          } else if (curFOV.getFOV().getWell().contains("G")){
            listOutG.add(curFOV);
          } else if (curFOV.getFOV().getWell().contains("H")){
            listOutH.add(curFOV);
          } else if (!curFOV.getFOV().getWell().contains("A")){
            listOutA=null;
          } else if (!curFOV.getFOV().getWell().contains("B")){
            listOutB=null;
          } else if (!curFOV.getFOV().getWell().contains("C")){
            listOutC=null;
          } else if (!curFOV.getFOV().getWell().contains("D")){
            listOutD=null;
          } else if (!curFOV.getFOV().getWell().contains("E")){
            listOutE=null;
          } else if (!curFOV.getFOV().getWell().contains("F")){
            listOutF=null;
          } else if (!curFOV.getFOV().getWell().contains("G")){
            listOutG=null;
          } else if (!curFOV.getFOV().getWell().contains("H")){
            listOutH=null;
          }
        }*/
        List<SeqAcqSetup> listOut1=new ArrayList<SeqAcqSetup>();
        int i=0;
        double ii=0;
        for(String wellLetter : new String[] {"A","B","C","D","E","F","G","H"}){
            
            List<SeqAcqSetup> listOut2=new ArrayList<SeqAcqSetup>();
            for (SeqAcqSetup curFOV : listIn){
                if (curFOV.getFOV().getWell().contains(wellLetter)){
                    listOut2.add(curFOV);
                    i++;
                    ii++;
                }  
            }
            if ( (2&1)==0 ){
                Collections.reverse(listOut2); 
            }
            listOut1.addAll(listOut2);    
        }
        return listOut1;
    
    }
    
}
