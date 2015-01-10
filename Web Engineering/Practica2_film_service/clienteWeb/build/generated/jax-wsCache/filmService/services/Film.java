
package services;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para film complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="film">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filmId" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="languageId" type="{http://services/}language" minOccurs="0"/>
 *         &lt;element name="lastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="originalLanguageId" type="{http://services/}language" minOccurs="0"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseYear" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="rentalDuration" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="rentalRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="replacementCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="specialFeatures" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "film", propOrder = {
    "description",
    "filmId",
    "languageId",
    "lastUpdate",
    "length",
    "originalLanguageId",
    "rating",
    "releaseYear",
    "rentalDuration",
    "rentalRate",
    "replacementCost",
    "specialFeatures",
    "title"
})
public class Film {

    protected String description;
    protected Short filmId;
    protected Language languageId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdate;
    protected Short length;
    protected Language originalLanguageId;
    protected String rating;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseYear;
    protected short rentalDuration;
    protected BigDecimal rentalRate;
    protected BigDecimal replacementCost;
    protected String specialFeatures;
    protected String title;

    /**
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtiene el valor de la propiedad filmId.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFilmId() {
        return filmId;
    }

    /**
     * Define el valor de la propiedad filmId.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFilmId(Short value) {
        this.filmId = value;
    }

    /**
     * Obtiene el valor de la propiedad languageId.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getLanguageId() {
        return languageId;
    }

    /**
     * Define el valor de la propiedad languageId.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setLanguageId(Language value) {
        this.languageId = value;
    }

    /**
     * Obtiene el valor de la propiedad lastUpdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Define el valor de la propiedad lastUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdate(XMLGregorianCalendar value) {
        this.lastUpdate = value;
    }

    /**
     * Obtiene el valor de la propiedad length.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getLength() {
        return length;
    }

    /**
     * Define el valor de la propiedad length.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setLength(Short value) {
        this.length = value;
    }

    /**
     * Obtiene el valor de la propiedad originalLanguageId.
     * 
     * @return
     *     possible object is
     *     {@link Language }
     *     
     */
    public Language getOriginalLanguageId() {
        return originalLanguageId;
    }

    /**
     * Define el valor de la propiedad originalLanguageId.
     * 
     * @param value
     *     allowed object is
     *     {@link Language }
     *     
     */
    public void setOriginalLanguageId(Language value) {
        this.originalLanguageId = value;
    }

    /**
     * Obtiene el valor de la propiedad rating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Define el valor de la propiedad rating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Obtiene el valor de la propiedad releaseYear.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseYear() {
        return releaseYear;
    }

    /**
     * Define el valor de la propiedad releaseYear.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseYear(XMLGregorianCalendar value) {
        this.releaseYear = value;
    }

    /**
     * Obtiene el valor de la propiedad rentalDuration.
     * 
     */
    public short getRentalDuration() {
        return rentalDuration;
    }

    /**
     * Define el valor de la propiedad rentalDuration.
     * 
     */
    public void setRentalDuration(short value) {
        this.rentalDuration = value;
    }

    /**
     * Obtiene el valor de la propiedad rentalRate.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    /**
     * Define el valor de la propiedad rentalRate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRentalRate(BigDecimal value) {
        this.rentalRate = value;
    }

    /**
     * Obtiene el valor de la propiedad replacementCost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    /**
     * Define el valor de la propiedad replacementCost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReplacementCost(BigDecimal value) {
        this.replacementCost = value;
    }

    /**
     * Obtiene el valor de la propiedad specialFeatures.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFeatures() {
        return specialFeatures;
    }

    /**
     * Define el valor de la propiedad specialFeatures.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFeatures(String value) {
        this.specialFeatures = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
