package com.xkz.day0211;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.apache.commons.lang.StringUtils;

import org.dom4j.Element;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 小珂子
 * @UserName: 3068236782@qq.com
 * @Date: Created in 2022/02/11/16:33
 * @Description: 解析xml文件, 根据bean标签反射来创建对象
 */
public class MyClassPathXmlApplicationContext {

    /**
     *
     * 保存xml的文件路径
     *
     * */
    private String xmlPath;


    public MyClassPathXmlApplicationContext(){
    }

    public MyClassPathXmlApplicationContext(String xmlPath){
        this.xmlPath = xmlPath;
    }



    /**
    *
    * @Param: []
    * @return: java.util.List<org.dom4j.Element>
    * @Author: 小珂子
    * @UserName: 3068236782@qq.com
    * @Date: Created in 2022/2/11  17:27
    * @Description:
    */
    public List<Element> readXml() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        //如果xml文件名为空，则文件路径为空
        if (StringUtils.isEmpty(xmlPath)) {
            new Exception("文件路径为 空");
        }
        //所以这里就不用在传2个参数了

        Document read = saxReader.read(getClassXmlInputStream(xmlPath));
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements();
        if (elements == null || elements.isEmpty()) {
            return null;
        }
        return elements;
    }


    /**
    * @Param: [xmlPath]
    * @return: java.io.InputStream
    * @Author: 小珂子
    * @UserName: 3068236782@qq.com
    * @Date: Created in 2022/2/11  16:52
    * @Description: 根据文件名读取 classpath 下的该文件路径， 将其转为流的形式
    */
    public String getClassXmlInputStream(String xmlPath){
        //这里是直接获取的一个路径
        //你先头这里是一个input stream所以传进去要2个参数
        return this.getClass().getResource(xmlPath).getPath();
    }



    /**
    *
    * @Param: [elementList, beanId]
    * @return: java.lang.String
    * @Author: 小珂子
    * @UserName: 3068236782@qq.com
    * @Date: Created in 2022/2/11  17:08
    * @Description: 根据子节点列表和指定的beanId查询，对应的class路径
    */
    public String findXmlByIdClass(List<Element> elementList, String beanId){

        for (Element element : elementList) {
            String beanIdValue = element.attributeValue("id");
            if (StringUtils.isEmpty(beanIdValue) || !beanIdValue.equals(beanId)){
                continue;
            }
            String classPath = element.attributeValue("class");
            if (!StringUtils.isEmpty(classPath)){
                return classPath;
            }
        }
        return null;
    }




    /**
    *
    * @Param: [beanId]
    * @return: java.lang.Object
    * @Author: 小珂子
    * @UserName: 3068236782@qq.com
    * @Date: Created in 2022/2/11  17:11
    * @Description: 重写getBean方法
    */
    public Object getBean(String beanId) throws Exception {
        List<Element> elements  = readXml();
        String xmlByIdClass = findXmlByIdClass(elements, beanId);
        return Class.forName(xmlByIdClass).newInstance();
    }

}
