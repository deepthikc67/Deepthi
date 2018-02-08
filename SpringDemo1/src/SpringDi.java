
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class SpringDi {
    private static Object factory;
    public static void main(String[] args){
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("SpringDi.xml"));
        EmpSer es=(EmpSer)factory.getBean("EmpSer");
        es.reg();
    }
}
