
package Tugas;

/**
 *
 * @author Asus
 */
public class Televisi { //superclass
    String deskripsi;
    int jumlahChannel;
    private String[] channels = null;
    private int channelAktif;
    private int volume;
    
    
    //setting deskripsi dan jumlah channel
    public Televisi(String deskripsi, int jumlahChannel){
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    public String getDeskripsi(){
        return deskripsi;
    }
    
    //setting jumlah channel
    public int getJumlahChannel() {
        return jumlahChannel;
    }
    
    public String[] getChannels(){
        if(channels == null){
            System.out.println("Belum ada channel yang diset!");
        }
        return channels;
    }
    //setting channel yang ada
    public void setChannels(String[] channels){
    
    if(channels.length>jumlahChannel){
        System.out.println("Maaf TV ini hanya dapat menyimpan :"
        +jumlahChannel + " channel");
    }
    
    else{
        this.channels = channels;
        System.out.println("Informasi channel berhasil diupdate!");
    }
   }
    
   //setting channel aktif
    public int getChannelAktif(){
        return channelAktif;
    }
    
    public void setChannelAktif(int channelAktif){
        if(channelAktif > channels.length){
            System.out.println("Channel yang anda inginkan belum diset!");
            return;
        }
        
        this.channelAktif = channelAktif;
        System.out.println("Pindah channel ke : " + channels [channelAktif]);
    }
    
    //setting volume
    public int getVolume(){
        return volume;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Intensitas volume sekarang : " + volume);
    }
        
}
