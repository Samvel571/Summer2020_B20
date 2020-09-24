package practice;

public class TV {
 
 int channel = 1;
 int volumeLevel= 1;
 boolean on = false;
 String brand = "undefined";
 
 
 public TV(){
   System.out.println("Creating TV object using 1 arg - constructor");
 }
 public TV(String brand){
   this.brand = brand;
   System.out.println("Creating TV object using 1 arg - constructor");
 }
 
 public void setVolumeLevel(int volumeLevel){
   this.volumeLevel = volumeLevel;
 }
 public void setChannel(int channel){
   this.channel = channel;
 }
 public void setBrand(String brand){
   this.brand = brand;
 }
 
 public int getVolumeLevel(){
   return volumeLevel;
 }
 
 public int getChannel(){
   return channel;
 }
 public String getBrand(){
   return brand;
 }
 
 public void channelUp(){
   channel ++;
 }
 
 public void channelDown(){
   channel--;
 }
 
 public void volumeUp(){
   volumeLevel ++;
 }
 
 public void volumeDown(){
   volumeLevel --;
 }
 
 public boolean isOn(boolean on){
   this.on = on;
   return on;
 }
 
 public void turnOn(){
   if(on == false){

   }
 }
 
 
 
  
}