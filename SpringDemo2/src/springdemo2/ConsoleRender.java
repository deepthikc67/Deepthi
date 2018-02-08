
package springdemo2;
public class ConsoleRender implements MessageRender{
    MessageProvider messageProvider;
    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider=messageProvider;
    }
    @Override
    public void render() {
        if(messageProvider==null){
            System.out.println("no mp configured...."); 
        
        }
        else{
        
            System.out.println(messageProvider.getmessage());
        }
    }
}