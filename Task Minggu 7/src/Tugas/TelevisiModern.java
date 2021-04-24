
package Tugas;

/**
 *
 * @author Asus
 */
public class TelevisiModern extends Televisi {
   public static final int TV = 0;
   //fisilitas teletext
   public static final int TELETEXT = 1;
   int modusTampilan = TV;
   int halamanTeletext = 100;
   String discTray = null;
   public TelevisiModern(String deskripsi, int jumlahChannel) {
   super(deskripsi, jumlahChannel);
   }
   public void setHalamanTeletext(int halamanTeletext){
   this.halamanTeletext = halamanTeletext;
   System.out.println("Berpindah ke halaman teletext " + halamanTeletext);
   }
   public void setModusTampilan(int modusTampilan){
   switch (modusTampilan) {
        case TV:
            System.out.println("Modus Tampilan : Televisi");
            break;
        case TELETEXT:
            System.out.println("Modus Tampilan : Teletext");
            break;
   }
   }
   public String getDiscTray(){
   return discTray;
   }
   public void setDiscTray(String discTray){
   this.discTray = discTray;
   }
   public void playCD(){
   if (discTray == null){
       System.out.println("Tidak ada CD di dalam disc tray!");
       return;
   }
   System.out.println("Memutar file " + discTray);
   }
   
    
}
