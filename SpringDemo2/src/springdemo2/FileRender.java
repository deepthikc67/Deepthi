
package springdemo2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileRender implements MessageRender{
    MessageProvider messageProvider;

   
    @Override
    public void setMessageProvider(MessageProvider messageProvider) {

    this.messageProvider=messageProvider;}

    
    @Override
    public void render() {
        try {
            try (FileWriter f = new FileWriter("msg.txt")) {
                f.write(messageProvider.getmessage());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(FileRender.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}