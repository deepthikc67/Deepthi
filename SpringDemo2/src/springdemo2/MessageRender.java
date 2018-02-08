
package springdemo2;

public interface MessageRender {
    void setMessageProvider(MessageProvider messageProvider);
    void render();
}