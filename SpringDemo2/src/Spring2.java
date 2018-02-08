import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springdemo2.MessageRender;
import org.springframework.beans.factory.BeanFactory;

public class Spring2{
    public static void main(String[] args) {
       
        
        ApplicationContext cc=new ClassPathXmlApplicationContext("Spring2.xml");
   
      MessageRender bean =cc.getBean(MessageRender.class);
    
    bean.render();
    }
}