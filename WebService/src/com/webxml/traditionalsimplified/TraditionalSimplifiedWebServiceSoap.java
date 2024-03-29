
package com.webxml.traditionalsimplified;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "TraditionalSimplifiedWebServiceSoap", targetNamespace = "http://webxml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TraditionalSimplifiedWebServiceSoap {


    /**
     * <br /><h3>������ת��Ϊ������</h3><p>���������sText = �ַ����� �������ݣ��ַ�����</p><br />
     * 
     * @param sText
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://webxml.com.cn/toSimplifiedChinese")
    @WebResult(name = "toSimplifiedChineseResult", targetNamespace = "http://webxml.com.cn/")
    @RequestWrapper(localName = "toSimplifiedChinese", targetNamespace = "http://webxml.com.cn/", className = "com.webxml.traditionalsimplified.ToSimplifiedChinese")
    @ResponseWrapper(localName = "toSimplifiedChineseResponse", targetNamespace = "http://webxml.com.cn/", className = "com.webxml.traditionalsimplified.ToSimplifiedChineseResponse")
    public String toSimplifiedChinese(
        @WebParam(name = "sText", targetNamespace = "http://webxml.com.cn/")
        String sText);

    /**
     * <br /><h3>������ת��Ϊ������</h3><p>���������sText = �ַ����� �������ݣ��ַ�����</p><br />
     * 
     * @param sText
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://webxml.com.cn/toTraditionalChinese")
    @WebResult(name = "toTraditionalChineseResult", targetNamespace = "http://webxml.com.cn/")
    @RequestWrapper(localName = "toTraditionalChinese", targetNamespace = "http://webxml.com.cn/", className = "com.webxml.traditionalsimplified.ToTraditionalChinese")
    @ResponseWrapper(localName = "toTraditionalChineseResponse", targetNamespace = "http://webxml.com.cn/", className = "com.webxml.traditionalsimplified.ToTraditionalChineseResponse")
    public String toTraditionalChinese(
        @WebParam(name = "sText", targetNamespace = "http://webxml.com.cn/")
        String sText);

}
