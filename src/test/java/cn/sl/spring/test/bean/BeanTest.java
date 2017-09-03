package cn.sl.spring.test.bean;

import cn.sl.spring.framework.read.bean.FirstBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by braveup on 2017.08.26.
 */
@SuppressWarnings("depercation")
public class BeanTest {

    @Test
    public void testSimpleLoad() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring/applicationContext.xml"));
        FirstBean firstBean = (FirstBean) bf.getBean("firstBean");
        System.out.printf("firstBean" + firstBean.getFristBean());
    }
}
