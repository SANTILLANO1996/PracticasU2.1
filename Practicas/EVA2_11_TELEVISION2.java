/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Televisor;

/**
 *
 * @author invitado
 */
public class Televisor {
boolean encender, apagar;
    int canal, volumen;
    int CamCan;
    int CanalNum, Programa, CambiarProgra;
   
public int getVolumen(){
    return volumen;
}
public int getCambiarCanal(){
    return CamCan;
}
public int getCanal(){
    return canal;
}
public int getPrograma(){
    return Programa;
}
public int getCambiarPrograma(){
    return CambiarProgra;
}
public int getCanalNumero(){
    return CanalNum;
}
public void setVolumen(int bTele){
    volumen = bTele;
}
public void setCambiarCanal(int bTele){
    CamCan = bTele;
}
public void setCanal(int bTele){
    canal = bTele;
}
public void setPrograma(int bTele){
    Programa = bTele;
}
public void setCambiarPrograma(int bTele){
    CambiarProgra = bTele;
}
}
