//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.12.08 a las 06:04:55 PM CET 
//


package flickr.photoservice.flickrresponse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tagType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="raw" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="clean" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tagType", propOrder = {
    "content"
})
public class TagType {

    @XmlElementRef(name = "raw", type = JAXBElement.class)
    @XmlMixed
    protected List<Serializable> content;
    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "score")
    protected Integer score;
    @XmlAttribute(name = "clean")
    protected String clean;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

    /**
     * Obtiene el valor de la propiedad count.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Define el valor de la propiedad count.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Obtiene el valor de la propiedad score.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getScore() {
        return score;
    }

    /**
     * Define el valor de la propiedad score.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setScore(Integer value) {
        this.score = value;
    }

    /**
     * Obtiene el valor de la propiedad clean.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClean() {
        return clean;
    }

    /**
     * Define el valor de la propiedad clean.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClean(String value) {
        this.clean = value;
    }

}
