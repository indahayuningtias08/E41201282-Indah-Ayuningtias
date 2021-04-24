
package Tugas;

/**
 *
 * @author Asus
 */
public class mainTVModern {
    public static void main(String[] args){
        
        TelevisiModern tv = new TelevisiModern("TV Modern, 29 inches",100);
        
        String[] semuaChannel ={"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                "METRO TV", "TRANS TV", "TPI", "TV7", 
                                "TVRI", "TV G", "AN TV"};
        
        System.out.println("Pak Lukman, membeli Televisi:"+ tv.getDeskripsi());
        tv.getChannels();
        tv.setChannels(semuaChannel);
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("The Matrix");
        tv.playCD();
        }
    }
    

