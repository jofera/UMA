//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.12.08 a las 06:04:55 PM CET 
//


package flickr.photoservice.flickrresponse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="items" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="activity">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="views" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="more" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="faves" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="commentsold" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="commentsnew" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="notesold" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="notesnew" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="blogs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="blog" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="needspassword" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contacts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contact" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="category" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subcat" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="members" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="online" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="chatnsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="inchat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="pathids" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="group" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="members" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="throttle" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="groupname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ispoolmoderated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="groups" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="eighteenplus" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="per_page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="prevphoto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="nextphoto" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="user" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="bandwidth" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}double" />
 *                           &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="usedbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="usedkb" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="remainingbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="remainingkb" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="filesize" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="sets" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ispro" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="person" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="realname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mbox_sha1sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="photosurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="profileurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="photos" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="firstdate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="firstdatetaken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="isadmin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ispro" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="iconfarm" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="contact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="revcontact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="revfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="revfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="content_type" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="geoperms" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="safety_level" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="set" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pool" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photocounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="photocount" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="fromdate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="todate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="exif" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="raw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="clean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="tagspace" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="tagspaceid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="person" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="favedate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="owner" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="visibility" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="posted" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="taken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="takengranularity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="permissions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="editability" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="cancomment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="canaddmeta" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="notes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="h" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="tags" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="raw" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="urls" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="url" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="location" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="isfavorite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="license" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="rotation" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="originalsecret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="originalformat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="content_type" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="safety_level" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="perms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="iscontact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sizes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="size" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photoid" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="originalsecret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="comment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="datecreate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="permalink" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="date_create" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="photo_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="photoset_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="note" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="uploader" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ticket" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="complete" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="photoid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="invalid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photoset" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="isprimary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="photosets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="photoset" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="cancreate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="places" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="place" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="locality">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="county">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="region">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="country">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hottags" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tags" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="who" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tags">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="clusters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cluster" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="method" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="arguments">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="argument" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="errors">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="error" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="needslogin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="methods" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="err" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="msg" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="frob" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="auth" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="token">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="perms">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="none"/>
 *                         &lt;enumeration value="read"/>
 *                         &lt;enumeration value="write"/>
 *                         &lt;enumeration value="delete"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="user">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="licenses" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="license" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="stat" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "items",
    "blogs",
    "contacts",
    "photos",
    "category",
    "group",
    "groups",
    "prevphoto",
    "nextphoto",
    "user",
    "person",
    "set",
    "pool",
    "photocounts",
    "photo",
    "perms",
    "sizes",
    "photoid",
    "comment",
    "comments",
    "note",
    "uploader",
    "photoset",
    "photosets",
    "places",
    "location",
    "hottags",
    "tags",
    "who",
    "clusters",
    "method",
    "methods",
    "err",
    "frob",
    "auth",
    "licenses"
})
@XmlRootElement(name = "rsp")
public class Rsp {

    protected Rsp.Items items;
    protected Rsp.Blogs blogs;
    protected Rsp.Contacts contacts;
    protected Rsp.Photos photos;
    protected Rsp.Category category;
    protected Rsp.Group group;
    protected Rsp.Groups groups;
    protected Rsp.Prevphoto prevphoto;
    protected Rsp.Nextphoto nextphoto;
    protected Rsp.User user;
    protected Rsp.Person person;
    protected Rsp.Set set;
    protected Rsp.Pool pool;
    protected Rsp.Photocounts photocounts;
    protected Rsp.Photo photo;
    protected Rsp.Perms perms;
    protected Rsp.Sizes sizes;
    protected Rsp.Photoid photoid;
    protected Rsp.Comment comment;
    protected Rsp.Comments comments;
    protected Rsp.Note note;
    protected Rsp.Uploader uploader;
    protected Rsp.Photoset photoset;
    protected Rsp.Photosets photosets;
    protected Rsp.Places places;
    protected Rsp.Location location;
    protected Rsp.Hottags hottags;
    protected Rsp.Tags tags;
    protected Rsp.Who who;
    protected Rsp.Clusters clusters;
    protected Rsp.Method method;
    protected Rsp.Methods methods;
    protected Rsp.Err err;
    protected String frob;
    protected Rsp.Auth auth;
    protected Rsp.Licenses licenses;
    @XmlAttribute(name = "stat")
    protected String stat;

    /**
     * Obtiene el valor de la propiedad items.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Items }
     *     
     */
    public Rsp.Items getItems() {
        return items;
    }

    /**
     * Define el valor de la propiedad items.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Items }
     *     
     */
    public void setItems(Rsp.Items value) {
        this.items = value;
    }

    /**
     * Obtiene el valor de la propiedad blogs.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Blogs }
     *     
     */
    public Rsp.Blogs getBlogs() {
        return blogs;
    }

    /**
     * Define el valor de la propiedad blogs.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Blogs }
     *     
     */
    public void setBlogs(Rsp.Blogs value) {
        this.blogs = value;
    }

    /**
     * Obtiene el valor de la propiedad contacts.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Contacts }
     *     
     */
    public Rsp.Contacts getContacts() {
        return contacts;
    }

    /**
     * Define el valor de la propiedad contacts.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Contacts }
     *     
     */
    public void setContacts(Rsp.Contacts value) {
        this.contacts = value;
    }

    /**
     * Obtiene el valor de la propiedad photos.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photos }
     *     
     */
    public Rsp.Photos getPhotos() {
        return photos;
    }

    /**
     * Define el valor de la propiedad photos.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photos }
     *     
     */
    public void setPhotos(Rsp.Photos value) {
        this.photos = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Category }
     *     
     */
    public Rsp.Category getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Category }
     *     
     */
    public void setCategory(Rsp.Category value) {
        this.category = value;
    }

    /**
     * Obtiene el valor de la propiedad group.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Group }
     *     
     */
    public Rsp.Group getGroup() {
        return group;
    }

    /**
     * Define el valor de la propiedad group.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Group }
     *     
     */
    public void setGroup(Rsp.Group value) {
        this.group = value;
    }

    /**
     * Obtiene el valor de la propiedad groups.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Groups }
     *     
     */
    public Rsp.Groups getGroups() {
        return groups;
    }

    /**
     * Define el valor de la propiedad groups.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Groups }
     *     
     */
    public void setGroups(Rsp.Groups value) {
        this.groups = value;
    }

    /**
     * Obtiene el valor de la propiedad prevphoto.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Prevphoto }
     *     
     */
    public Rsp.Prevphoto getPrevphoto() {
        return prevphoto;
    }

    /**
     * Define el valor de la propiedad prevphoto.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Prevphoto }
     *     
     */
    public void setPrevphoto(Rsp.Prevphoto value) {
        this.prevphoto = value;
    }

    /**
     * Obtiene el valor de la propiedad nextphoto.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Nextphoto }
     *     
     */
    public Rsp.Nextphoto getNextphoto() {
        return nextphoto;
    }

    /**
     * Define el valor de la propiedad nextphoto.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Nextphoto }
     *     
     */
    public void setNextphoto(Rsp.Nextphoto value) {
        this.nextphoto = value;
    }

    /**
     * Obtiene el valor de la propiedad user.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.User }
     *     
     */
    public Rsp.User getUser() {
        return user;
    }

    /**
     * Define el valor de la propiedad user.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.User }
     *     
     */
    public void setUser(Rsp.User value) {
        this.user = value;
    }

    /**
     * Obtiene el valor de la propiedad person.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Person }
     *     
     */
    public Rsp.Person getPerson() {
        return person;
    }

    /**
     * Define el valor de la propiedad person.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Person }
     *     
     */
    public void setPerson(Rsp.Person value) {
        this.person = value;
    }

    /**
     * Obtiene el valor de la propiedad set.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Set }
     *     
     */
    public Rsp.Set getSet() {
        return set;
    }

    /**
     * Define el valor de la propiedad set.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Set }
     *     
     */
    public void setSet(Rsp.Set value) {
        this.set = value;
    }

    /**
     * Obtiene el valor de la propiedad pool.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Pool }
     *     
     */
    public Rsp.Pool getPool() {
        return pool;
    }

    /**
     * Define el valor de la propiedad pool.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Pool }
     *     
     */
    public void setPool(Rsp.Pool value) {
        this.pool = value;
    }

    /**
     * Obtiene el valor de la propiedad photocounts.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photocounts }
     *     
     */
    public Rsp.Photocounts getPhotocounts() {
        return photocounts;
    }

    /**
     * Define el valor de la propiedad photocounts.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photocounts }
     *     
     */
    public void setPhotocounts(Rsp.Photocounts value) {
        this.photocounts = value;
    }

    /**
     * Obtiene el valor de la propiedad photo.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photo }
     *     
     */
    public Rsp.Photo getPhoto() {
        return photo;
    }

    /**
     * Define el valor de la propiedad photo.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photo }
     *     
     */
    public void setPhoto(Rsp.Photo value) {
        this.photo = value;
    }

    /**
     * Obtiene el valor de la propiedad perms.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Perms }
     *     
     */
    public Rsp.Perms getPerms() {
        return perms;
    }

    /**
     * Define el valor de la propiedad perms.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Perms }
     *     
     */
    public void setPerms(Rsp.Perms value) {
        this.perms = value;
    }

    /**
     * Obtiene el valor de la propiedad sizes.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Sizes }
     *     
     */
    public Rsp.Sizes getSizes() {
        return sizes;
    }

    /**
     * Define el valor de la propiedad sizes.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Sizes }
     *     
     */
    public void setSizes(Rsp.Sizes value) {
        this.sizes = value;
    }

    /**
     * Obtiene el valor de la propiedad photoid.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photoid }
     *     
     */
    public Rsp.Photoid getPhotoid() {
        return photoid;
    }

    /**
     * Define el valor de la propiedad photoid.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photoid }
     *     
     */
    public void setPhotoid(Rsp.Photoid value) {
        this.photoid = value;
    }

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Comment }
     *     
     */
    public Rsp.Comment getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Comment }
     *     
     */
    public void setComment(Rsp.Comment value) {
        this.comment = value;
    }

    /**
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Comments }
     *     
     */
    public Rsp.Comments getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Comments }
     *     
     */
    public void setComments(Rsp.Comments value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad note.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Note }
     *     
     */
    public Rsp.Note getNote() {
        return note;
    }

    /**
     * Define el valor de la propiedad note.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Note }
     *     
     */
    public void setNote(Rsp.Note value) {
        this.note = value;
    }

    /**
     * Obtiene el valor de la propiedad uploader.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Uploader }
     *     
     */
    public Rsp.Uploader getUploader() {
        return uploader;
    }

    /**
     * Define el valor de la propiedad uploader.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Uploader }
     *     
     */
    public void setUploader(Rsp.Uploader value) {
        this.uploader = value;
    }

    /**
     * Obtiene el valor de la propiedad photoset.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photoset }
     *     
     */
    public Rsp.Photoset getPhotoset() {
        return photoset;
    }

    /**
     * Define el valor de la propiedad photoset.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photoset }
     *     
     */
    public void setPhotoset(Rsp.Photoset value) {
        this.photoset = value;
    }

    /**
     * Obtiene el valor de la propiedad photosets.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Photosets }
     *     
     */
    public Rsp.Photosets getPhotosets() {
        return photosets;
    }

    /**
     * Define el valor de la propiedad photosets.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Photosets }
     *     
     */
    public void setPhotosets(Rsp.Photosets value) {
        this.photosets = value;
    }

    /**
     * Obtiene el valor de la propiedad places.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Places }
     *     
     */
    public Rsp.Places getPlaces() {
        return places;
    }

    /**
     * Define el valor de la propiedad places.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Places }
     *     
     */
    public void setPlaces(Rsp.Places value) {
        this.places = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Location }
     *     
     */
    public Rsp.Location getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Location }
     *     
     */
    public void setLocation(Rsp.Location value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad hottags.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Hottags }
     *     
     */
    public Rsp.Hottags getHottags() {
        return hottags;
    }

    /**
     * Define el valor de la propiedad hottags.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Hottags }
     *     
     */
    public void setHottags(Rsp.Hottags value) {
        this.hottags = value;
    }

    /**
     * Obtiene el valor de la propiedad tags.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Tags }
     *     
     */
    public Rsp.Tags getTags() {
        return tags;
    }

    /**
     * Define el valor de la propiedad tags.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Tags }
     *     
     */
    public void setTags(Rsp.Tags value) {
        this.tags = value;
    }

    /**
     * Obtiene el valor de la propiedad who.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Who }
     *     
     */
    public Rsp.Who getWho() {
        return who;
    }

    /**
     * Define el valor de la propiedad who.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Who }
     *     
     */
    public void setWho(Rsp.Who value) {
        this.who = value;
    }

    /**
     * Obtiene el valor de la propiedad clusters.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Clusters }
     *     
     */
    public Rsp.Clusters getClusters() {
        return clusters;
    }

    /**
     * Define el valor de la propiedad clusters.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Clusters }
     *     
     */
    public void setClusters(Rsp.Clusters value) {
        this.clusters = value;
    }

    /**
     * Obtiene el valor de la propiedad method.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Method }
     *     
     */
    public Rsp.Method getMethod() {
        return method;
    }

    /**
     * Define el valor de la propiedad method.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Method }
     *     
     */
    public void setMethod(Rsp.Method value) {
        this.method = value;
    }

    /**
     * Obtiene el valor de la propiedad methods.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Methods }
     *     
     */
    public Rsp.Methods getMethods() {
        return methods;
    }

    /**
     * Define el valor de la propiedad methods.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Methods }
     *     
     */
    public void setMethods(Rsp.Methods value) {
        this.methods = value;
    }

    /**
     * Obtiene el valor de la propiedad err.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Err }
     *     
     */
    public Rsp.Err getErr() {
        return err;
    }

    /**
     * Define el valor de la propiedad err.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Err }
     *     
     */
    public void setErr(Rsp.Err value) {
        this.err = value;
    }

    /**
     * Obtiene el valor de la propiedad frob.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrob() {
        return frob;
    }

    /**
     * Define el valor de la propiedad frob.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrob(String value) {
        this.frob = value;
    }

    /**
     * Obtiene el valor de la propiedad auth.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Auth }
     *     
     */
    public Rsp.Auth getAuth() {
        return auth;
    }

    /**
     * Define el valor de la propiedad auth.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Auth }
     *     
     */
    public void setAuth(Rsp.Auth value) {
        this.auth = value;
    }

    /**
     * Obtiene el valor de la propiedad licenses.
     * 
     * @return
     *     possible object is
     *     {@link Rsp.Licenses }
     *     
     */
    public Rsp.Licenses getLicenses() {
        return licenses;
    }

    /**
     * Define el valor de la propiedad licenses.
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp.Licenses }
     *     
     */
    public void setLicenses(Rsp.Licenses value) {
        this.licenses = value;
    }

    /**
     * Obtiene el valor de la propiedad stat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Define el valor de la propiedad stat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="token">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="perms">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;enumeration value="none"/>
     *               &lt;enumeration value="read"/>
     *               &lt;enumeration value="write"/>
     *               &lt;enumeration value="delete"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="user">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "token",
        "perms",
        "user"
    })
    public static class Auth {

        @XmlElement(required = true)
        protected String token;
        @XmlElement(required = true)
        protected String perms;
        @XmlElement(required = true)
        protected Rsp.Auth.User user;

        /**
         * Obtiene el valor de la propiedad token.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToken() {
            return token;
        }

        /**
         * Define el valor de la propiedad token.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToken(String value) {
            this.token = value;
        }

        /**
         * Obtiene el valor de la propiedad perms.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPerms() {
            return perms;
        }

        /**
         * Define el valor de la propiedad perms.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPerms(String value) {
            this.perms = value;
        }

        /**
         * Obtiene el valor de la propiedad user.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Auth.User }
         *     
         */
        public Rsp.Auth.User getUser() {
            return user;
        }

        /**
         * Define el valor de la propiedad user.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Auth.User }
         *     
         */
        public void setUser(Rsp.Auth.User value) {
            this.user = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class User {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "username")
            protected String username;
            @XmlAttribute(name = "fullname")
            protected String fullname;

            /**
             * Obtiene el valor de la propiedad nsid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * Define el valor de la propiedad nsid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * Obtiene el valor de la propiedad username.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * Define el valor de la propiedad username.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * Obtiene el valor de la propiedad fullname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullname() {
                return fullname;
            }

            /**
             * Define el valor de la propiedad fullname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullname(String value) {
                this.fullname = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="blog" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="needspassword" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "blog"
    })
    public static class Blogs {

        protected List<Rsp.Blogs.Blog> blog;

        /**
         * Gets the value of the blog property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the blog property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBlog().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Blogs.Blog }
         * 
         * 
         */
        public List<Rsp.Blogs.Blog> getBlog() {
            if (blog == null) {
                blog = new ArrayList<Rsp.Blogs.Blog>();
            }
            return this.blog;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="needspassword" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Blog {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "needspassword")
            protected Boolean needspassword;
            @XmlAttribute(name = "url")
            protected String url;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad needspassword.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNeedspassword() {
                return needspassword;
            }

            /**
             * Define el valor de la propiedad needspassword.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNeedspassword(Boolean value) {
                this.needspassword = value;
            }

            /**
             * Obtiene el valor de la propiedad url.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * Define el valor de la propiedad url.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="subcat" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="members" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="online" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="chatnsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="inchat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="pathids" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subcat",
        "group"
    })
    public static class Category {

        protected List<Rsp.Category.Subcat> subcat;
        protected List<Rsp.Category.Group> group;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "path")
        protected String path;
        @XmlAttribute(name = "pathids")
        protected String pathids;

        /**
         * Gets the value of the subcat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subcat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubcat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Category.Subcat }
         * 
         * 
         */
        public List<Rsp.Category.Subcat> getSubcat() {
            if (subcat == null) {
                subcat = new ArrayList<Rsp.Category.Subcat>();
            }
            return this.subcat;
        }

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Category.Group }
         * 
         * 
         */
        public List<Rsp.Category.Group> getGroup() {
            if (group == null) {
                group = new ArrayList<Rsp.Category.Group>();
            }
            return this.group;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad path.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPath() {
            return path;
        }

        /**
         * Define el valor de la propiedad path.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPath(String value) {
            this.path = value;
        }

        /**
         * Obtiene el valor de la propiedad pathids.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPathids() {
            return pathids;
        }

        /**
         * Define el valor de la propiedad pathids.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPathids(String value) {
            this.pathids = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="members" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="online" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="chatnsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="inchat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Group {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "members")
            protected Integer members;
            @XmlAttribute(name = "online")
            protected Boolean online;
            @XmlAttribute(name = "chatnsid")
            protected String chatnsid;
            @XmlAttribute(name = "inchat")
            protected Boolean inchat;

            /**
             * Obtiene el valor de la propiedad nsid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * Define el valor de la propiedad nsid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad members.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMembers() {
                return members;
            }

            /**
             * Define el valor de la propiedad members.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMembers(Integer value) {
                this.members = value;
            }

            /**
             * Obtiene el valor de la propiedad online.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isOnline() {
                return online;
            }

            /**
             * Define el valor de la propiedad online.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setOnline(Boolean value) {
                this.online = value;
            }

            /**
             * Obtiene el valor de la propiedad chatnsid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChatnsid() {
                return chatnsid;
            }

            /**
             * Define el valor de la propiedad chatnsid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChatnsid(String value) {
                this.chatnsid = value;
            }

            /**
             * Obtiene el valor de la propiedad inchat.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInchat() {
                return inchat;
            }

            /**
             * Define el valor de la propiedad inchat.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInchat(Boolean value) {
                this.inchat = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Subcat {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "count")
            protected Integer count;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
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

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cluster" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cluster"
    })
    public static class Clusters {

        protected List<Rsp.Clusters.Cluster> cluster;
        @XmlAttribute(name = "source")
        protected String source;
        @XmlAttribute(name = "total")
        protected Integer total;

        /**
         * Gets the value of the cluster property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cluster property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCluster().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Clusters.Cluster }
         * 
         * 
         */
        public List<Rsp.Clusters.Cluster> getCluster() {
            if (cluster == null) {
                cluster = new ArrayList<Rsp.Clusters.Cluster>();
            }
            return this.cluster;
        }

        /**
         * Obtiene el valor de la propiedad source.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Define el valor de la propiedad source.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Obtiene el valor de la propiedad total.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * Define el valor de la propiedad total.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tag"
        })
        public static class Cluster {

            protected List<TagType> tag;
            @XmlAttribute(name = "total")
            protected Integer total;

            /**
             * Gets the value of the tag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TagType }
             * 
             * 
             */
            public List<TagType> getTag() {
                if (tag == null) {
                    tag = new ArrayList<TagType>();
                }
                return this.tag;
            }

            /**
             * Obtiene el valor de la propiedad total.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTotal() {
                return total;
            }

            /**
             * Define el valor de la propiedad total.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTotal(Integer value) {
                this.total = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Comment {

        @XmlAttribute(name = "id")
        protected String id;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="comment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="datecreate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="permalink" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="date_create" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="photo_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="photoset_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "comment"
    })
    public static class Comments {

        protected List<Rsp.Comments.Comment> comment;
        @XmlAttribute(name = "photo_id")
        protected String photoId;
        @XmlAttribute(name = "photoset_id")
        protected String photosetId;

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Comments.Comment }
         * 
         * 
         */
        public List<Rsp.Comments.Comment> getComment() {
            if (comment == null) {
                comment = new ArrayList<Rsp.Comments.Comment>();
            }
            return this.comment;
        }

        /**
         * Obtiene el valor de la propiedad photoId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhotoId() {
            return photoId;
        }

        /**
         * Define el valor de la propiedad photoId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhotoId(String value) {
            this.photoId = value;
        }

        /**
         * Obtiene el valor de la propiedad photosetId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhotosetId() {
            return photosetId;
        }

        /**
         * Define el valor de la propiedad photosetId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhotosetId(String value) {
            this.photosetId = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="datecreate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="permalink" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="date_create" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Comment {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "author")
            protected String author;
            @XmlAttribute(name = "authorname")
            protected String authorname;
            @XmlAttribute(name = "datecreate")
            protected Integer datecreate;
            @XmlAttribute(name = "permalink")
            protected String permalink;
            @XmlAttribute(name = "date_create")
            protected Integer dateCreate;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad author.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthor() {
                return author;
            }

            /**
             * Define el valor de la propiedad author.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthor(String value) {
                this.author = value;
            }

            /**
             * Obtiene el valor de la propiedad authorname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAuthorname() {
                return authorname;
            }

            /**
             * Define el valor de la propiedad authorname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAuthorname(String value) {
                this.authorname = value;
            }

            /**
             * Obtiene el valor de la propiedad datecreate.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDatecreate() {
                return datecreate;
            }

            /**
             * Define el valor de la propiedad datecreate.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDatecreate(Integer value) {
                this.datecreate = value;
            }

            /**
             * Obtiene el valor de la propiedad permalink.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPermalink() {
                return permalink;
            }

            /**
             * Define el valor de la propiedad permalink.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPermalink(String value) {
                this.permalink = value;
            }

            /**
             * Obtiene el valor de la propiedad dateCreate.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDateCreate() {
                return dateCreate;
            }

            /**
             * Define el valor de la propiedad dateCreate.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDateCreate(Integer value) {
                this.dateCreate = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="contact" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "contact"
    })
    public static class Contacts {

        protected List<Rsp.Contacts.Contact> contact;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Contacts.Contact }
         * 
         * 
         */
        public List<Rsp.Contacts.Contact> getContact() {
            if (contact == null) {
                contact = new ArrayList<Rsp.Contacts.Contact>();
            }
            return this.contact;
        }

        /**
         * Obtiene el valor de la propiedad page.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * Define el valor de la propiedad page.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * Obtiene el valor de la propiedad pages.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * Define el valor de la propiedad pages.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * Obtiene el valor de la propiedad perpage.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * Define el valor de la propiedad perpage.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * Obtiene el valor de la propiedad total.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * Define el valor de la propiedad total.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ignored" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Contact {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "username")
            protected String username;
            @XmlAttribute(name = "iconserver")
            protected Integer iconserver;
            @XmlAttribute(name = "realname")
            protected String realname;
            @XmlAttribute(name = "friend")
            protected Boolean friend;
            @XmlAttribute(name = "family")
            protected Boolean family;
            @XmlAttribute(name = "ignored")
            protected Boolean ignored;

            /**
             * Obtiene el valor de la propiedad nsid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * Define el valor de la propiedad nsid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * Obtiene el valor de la propiedad username.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * Define el valor de la propiedad username.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * Obtiene el valor de la propiedad iconserver.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getIconserver() {
                return iconserver;
            }

            /**
             * Define el valor de la propiedad iconserver.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setIconserver(Integer value) {
                this.iconserver = value;
            }

            /**
             * Obtiene el valor de la propiedad realname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRealname() {
                return realname;
            }

            /**
             * Define el valor de la propiedad realname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRealname(String value) {
                this.realname = value;
            }

            /**
             * Obtiene el valor de la propiedad friend.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFriend() {
                return friend;
            }

            /**
             * Define el valor de la propiedad friend.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFriend(Boolean value) {
                this.friend = value;
            }

            /**
             * Obtiene el valor de la propiedad family.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFamily() {
                return family;
            }

            /**
             * Define el valor de la propiedad family.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFamily(Boolean value) {
                this.family = value;
            }

            /**
             * Obtiene el valor de la propiedad ignored.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIgnored() {
                return ignored;
            }

            /**
             * Define el valor de la propiedad ignored.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIgnored(Boolean value) {
                this.ignored = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="msg" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Err {

        @XmlAttribute(name = "code")
        protected Integer code;
        @XmlAttribute(name = "msg")
        protected String msg;

        /**
         * Obtiene el valor de la propiedad code.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCode() {
            return code;
        }

        /**
         * Define el valor de la propiedad code.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCode(Integer value) {
            this.code = value;
        }

        /**
         * Obtiene el valor de la propiedad msg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMsg() {
            return msg;
        }

        /**
         * Define el valor de la propiedad msg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMsg(String value) {
            this.msg = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="members" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="throttle" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="groupname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="lang" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ispoolmoderated" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "description",
        "members",
        "privacy",
        "throttle",
        "groupname"
    })
    public static class Group {

        protected String name;
        protected String description;
        protected Integer members;
        protected Integer privacy;
        protected Rsp.Group.Throttle throttle;
        protected String groupname;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "iconserver")
        protected Integer iconserver;
        @XmlAttribute(name = "lang")
        protected String lang;
        @XmlAttribute(name = "ispoolmoderated")
        protected Boolean ispoolmoderated;
        @XmlAttribute(name = "nsid")
        protected String nsid;
        @XmlAttribute(name = "url")
        protected String url;

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

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
         * Obtiene el valor de la propiedad members.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMembers() {
            return members;
        }

        /**
         * Define el valor de la propiedad members.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMembers(Integer value) {
            this.members = value;
        }

        /**
         * Obtiene el valor de la propiedad privacy.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPrivacy() {
            return privacy;
        }

        /**
         * Define el valor de la propiedad privacy.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPrivacy(Integer value) {
            this.privacy = value;
        }

        /**
         * Obtiene el valor de la propiedad throttle.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Group.Throttle }
         *     
         */
        public Rsp.Group.Throttle getThrottle() {
            return throttle;
        }

        /**
         * Define el valor de la propiedad throttle.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Group.Throttle }
         *     
         */
        public void setThrottle(Rsp.Group.Throttle value) {
            this.throttle = value;
        }

        /**
         * Obtiene el valor de la propiedad groupname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupname() {
            return groupname;
        }

        /**
         * Define el valor de la propiedad groupname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupname(String value) {
            this.groupname = value;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad iconserver.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIconserver() {
            return iconserver;
        }

        /**
         * Define el valor de la propiedad iconserver.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIconserver(Integer value) {
            this.iconserver = value;
        }

        /**
         * Obtiene el valor de la propiedad lang.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * Define el valor de la propiedad lang.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

        /**
         * Obtiene el valor de la propiedad ispoolmoderated.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIspoolmoderated() {
            return ispoolmoderated;
        }

        /**
         * Define el valor de la propiedad ispoolmoderated.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIspoolmoderated(Boolean value) {
            this.ispoolmoderated = value;
        }

        /**
         * Obtiene el valor de la propiedad nsid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNsid() {
            return nsid;
        }

        /**
         * Define el valor de la propiedad nsid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNsid(String value) {
            this.nsid = value;
        }

        /**
         * Obtiene el valor de la propiedad url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Define el valor de la propiedad url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="mode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Throttle {

            @XmlAttribute(name = "count")
            protected Integer count;
            @XmlAttribute(name = "mode")
            protected String mode;
            @XmlAttribute(name = "remaining")
            protected Integer remaining;

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
             * Obtiene el valor de la propiedad mode.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMode() {
                return mode;
            }

            /**
             * Define el valor de la propiedad mode.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMode(String value) {
                this.mode = value;
            }

            /**
             * Obtiene el valor de la propiedad remaining.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRemaining() {
                return remaining;
            }

            /**
             * Define el valor de la propiedad remaining.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRemaining(Integer value) {
                this.remaining = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="group" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="eighteenplus" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="per_page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "group"
    })
    public static class Groups {

        protected List<Rsp.Groups.Group> group;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;
        @XmlAttribute(name = "per_page")
        protected Integer perPage;

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Groups.Group }
         * 
         * 
         */
        public List<Rsp.Groups.Group> getGroup() {
            if (group == null) {
                group = new ArrayList<Rsp.Groups.Group>();
            }
            return this.group;
        }

        /**
         * Obtiene el valor de la propiedad page.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * Define el valor de la propiedad page.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * Obtiene el valor de la propiedad pages.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * Define el valor de la propiedad pages.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * Obtiene el valor de la propiedad perpage.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * Define el valor de la propiedad perpage.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * Obtiene el valor de la propiedad total.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * Define el valor de la propiedad total.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }

        /**
         * Obtiene el valor de la propiedad perPage.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerPage() {
            return perPage;
        }

        /**
         * Define el valor de la propiedad perPage.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerPage(Integer value) {
            this.perPage = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="eighteenplus" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Group {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "eighteenplus")
            protected Boolean eighteenplus;
            @XmlAttribute(name = "admin")
            protected Boolean admin;
            @XmlAttribute(name = "photos")
            protected Integer photos;
            @XmlAttribute(name = "iconserver")
            protected Integer iconserver;
            @XmlAttribute(name = "privacy")
            protected Integer privacy;

            /**
             * Obtiene el valor de la propiedad nsid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * Define el valor de la propiedad nsid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad eighteenplus.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isEighteenplus() {
                return eighteenplus;
            }

            /**
             * Define el valor de la propiedad eighteenplus.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setEighteenplus(Boolean value) {
                this.eighteenplus = value;
            }

            /**
             * Obtiene el valor de la propiedad admin.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAdmin() {
                return admin;
            }

            /**
             * Define el valor de la propiedad admin.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAdmin(Boolean value) {
                this.admin = value;
            }

            /**
             * Obtiene el valor de la propiedad photos.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPhotos() {
                return photos;
            }

            /**
             * Define el valor de la propiedad photos.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPhotos(Integer value) {
                this.photos = value;
            }

            /**
             * Obtiene el valor de la propiedad iconserver.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getIconserver() {
                return iconserver;
            }

            /**
             * Define el valor de la propiedad iconserver.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setIconserver(Integer value) {
                this.iconserver = value;
            }

            /**
             * Obtiene el valor de la propiedad privacy.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPrivacy() {
                return privacy;
            }

            /**
             * Define el valor de la propiedad privacy.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPrivacy(Integer value) {
                this.privacy = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="period" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tag"
    })
    public static class Hottags {

        protected List<TagType> tag;
        @XmlAttribute(name = "period")
        protected String period;
        @XmlAttribute(name = "count")
        protected Integer count;

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TagType }
         * 
         * 
         */
        public List<TagType> getTag() {
            if (tag == null) {
                tag = new ArrayList<TagType>();
            }
            return this.tag;
        }

        /**
         * Obtiene el valor de la propiedad period.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriod() {
            return period;
        }

        /**
         * Define el valor de la propiedad period.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriod(String value) {
            this.period = value;
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

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="activity">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="views" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="more" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="faves" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="commentsold" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="commentsnew" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="notesold" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="notesnew" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Items {

        protected List<Rsp.Items.Item> item;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Items.Item }
         * 
         * 
         */
        public List<Rsp.Items.Item> getItem() {
            if (item == null) {
                item = new ArrayList<Rsp.Items.Item>();
            }
            return this.item;
        }

        /**
         * Obtiene el valor de la propiedad page.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * Define el valor de la propiedad page.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * Obtiene el valor de la propiedad pages.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * Define el valor de la propiedad pages.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * Obtiene el valor de la propiedad perpage.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * Define el valor de la propiedad perpage.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * Obtiene el valor de la propiedad total.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * Define el valor de la propiedad total.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="activity">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="comments" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="views" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="more" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="notes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="faves" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="commentsold" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="commentsnew" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="notesold" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="notesnew" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "title",
            "activity"
        })
        public static class Item {

            @XmlElement(required = true)
            protected String title;
            @XmlElement(required = true)
            protected Rsp.Items.Item.Activity activity;
            @XmlAttribute(name = "type")
            protected String type;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "owner")
            protected String owner;
            @XmlAttribute(name = "primary")
            protected String primary;
            @XmlAttribute(name = "secret")
            protected String secret;
            @XmlAttribute(name = "server")
            protected Integer server;
            @XmlAttribute(name = "comments")
            protected Integer comments;
            @XmlAttribute(name = "views")
            protected Integer views;
            @XmlAttribute(name = "photos")
            protected Integer photos;
            @XmlAttribute(name = "more")
            protected Boolean more;
            @XmlAttribute(name = "notes")
            protected Integer notes;
            @XmlAttribute(name = "faves")
            protected Integer faves;
            @XmlAttribute(name = "commentsold")
            protected Integer commentsold;
            @XmlAttribute(name = "commentsnew")
            protected Integer commentsnew;
            @XmlAttribute(name = "notesold")
            protected Integer notesold;
            @XmlAttribute(name = "notesnew")
            protected Integer notesnew;

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

            /**
             * Obtiene el valor de la propiedad activity.
             * 
             * @return
             *     possible object is
             *     {@link Rsp.Items.Item.Activity }
             *     
             */
            public Rsp.Items.Item.Activity getActivity() {
                return activity;
            }

            /**
             * Define el valor de la propiedad activity.
             * 
             * @param value
             *     allowed object is
             *     {@link Rsp.Items.Item.Activity }
             *     
             */
            public void setActivity(Rsp.Items.Item.Activity value) {
                this.activity = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad owner.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Define el valor de la propiedad owner.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Obtiene el valor de la propiedad primary.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimary() {
                return primary;
            }

            /**
             * Define el valor de la propiedad primary.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimary(String value) {
                this.primary = value;
            }

            /**
             * Obtiene el valor de la propiedad secret.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecret() {
                return secret;
            }

            /**
             * Define el valor de la propiedad secret.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecret(String value) {
                this.secret = value;
            }

            /**
             * Obtiene el valor de la propiedad server.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getServer() {
                return server;
            }

            /**
             * Define el valor de la propiedad server.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setServer(Integer value) {
                this.server = value;
            }

            /**
             * Obtiene el valor de la propiedad comments.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getComments() {
                return comments;
            }

            /**
             * Define el valor de la propiedad comments.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setComments(Integer value) {
                this.comments = value;
            }

            /**
             * Obtiene el valor de la propiedad views.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getViews() {
                return views;
            }

            /**
             * Define el valor de la propiedad views.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setViews(Integer value) {
                this.views = value;
            }

            /**
             * Obtiene el valor de la propiedad photos.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPhotos() {
                return photos;
            }

            /**
             * Define el valor de la propiedad photos.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPhotos(Integer value) {
                this.photos = value;
            }

            /**
             * Obtiene el valor de la propiedad more.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMore() {
                return more;
            }

            /**
             * Define el valor de la propiedad more.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMore(Boolean value) {
                this.more = value;
            }

            /**
             * Obtiene el valor de la propiedad notes.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNotes() {
                return notes;
            }

            /**
             * Define el valor de la propiedad notes.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNotes(Integer value) {
                this.notes = value;
            }

            /**
             * Obtiene el valor de la propiedad faves.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFaves() {
                return faves;
            }

            /**
             * Define el valor de la propiedad faves.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFaves(Integer value) {
                this.faves = value;
            }

            /**
             * Obtiene el valor de la propiedad commentsold.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCommentsold() {
                return commentsold;
            }

            /**
             * Define el valor de la propiedad commentsold.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCommentsold(Integer value) {
                this.commentsold = value;
            }

            /**
             * Obtiene el valor de la propiedad commentsnew.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCommentsnew() {
                return commentsnew;
            }

            /**
             * Define el valor de la propiedad commentsnew.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCommentsnew(Integer value) {
                this.commentsnew = value;
            }

            /**
             * Obtiene el valor de la propiedad notesold.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNotesold() {
                return notesold;
            }

            /**
             * Define el valor de la propiedad notesold.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNotesold(Integer value) {
                this.notesold = value;
            }

            /**
             * Obtiene el valor de la propiedad notesnew.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getNotesnew() {
                return notesnew;
            }

            /**
             * Define el valor de la propiedad notesnew.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setNotesnew(Integer value) {
                this.notesnew = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "event"
            })
            public static class Activity {

                protected List<Rsp.Items.Item.Activity.Event> event;

                /**
                 * Gets the value of the event property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the event property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEvent().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Rsp.Items.Item.Activity.Event }
                 * 
                 * 
                 */
                public List<Rsp.Items.Item.Activity.Event> getEvent() {
                    if (event == null) {
                        event = new ArrayList<Rsp.Items.Item.Activity.Event>();
                    }
                    return this.event;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="user" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Event {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "type")
                    protected String type;
                    @XmlAttribute(name = "user")
                    protected String user;
                    @XmlAttribute(name = "dateadded")
                    protected String dateadded;
                    @XmlAttribute(name = "username")
                    protected String username;

                    /**
                     * Obtiene el valor de la propiedad value.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * Define el valor de la propiedad value.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad type.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * Define el valor de la propiedad type.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad user.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUser() {
                        return user;
                    }

                    /**
                     * Define el valor de la propiedad user.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUser(String value) {
                        this.user = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad dateadded.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDateadded() {
                        return dateadded;
                    }

                    /**
                     * Define el valor de la propiedad dateadded.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDateadded(String value) {
                        this.dateadded = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad username.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getUsername() {
                        return username;
                    }

                    /**
                     * Define el valor de la propiedad username.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setUsername(String value) {
                        this.username = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="license" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "license"
    })
    public static class Licenses {

        protected List<Rsp.Licenses.License> license;

        /**
         * Gets the value of the license property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the license property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLicense().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Licenses.License }
         * 
         * 
         */
        public List<Rsp.Licenses.License> getLicense() {
            if (license == null) {
                license = new ArrayList<Rsp.Licenses.License>();
            }
            return this.license;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class License {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "url")
            protected String url;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad url.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * Define el valor de la propiedad url.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="locality">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="county">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="region">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="country">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locality",
        "county",
        "region",
        "country"
    })
    public static class Location {

        @XmlElement(required = true)
        protected Rsp.Location.Locality locality;
        @XmlElement(required = true)
        protected Rsp.Location.County county;
        @XmlElement(required = true)
        protected Rsp.Location.Region region;
        @XmlElement(required = true)
        protected Rsp.Location.Country country;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "place_id")
        protected String placeId;
        @XmlAttribute(name = "place_url")
        protected String placeUrl;
        @XmlAttribute(name = "woeid")
        protected String woeid;
        @XmlAttribute(name = "latitude")
        protected Float latitude;
        @XmlAttribute(name = "longitude")
        protected Float longitude;
        @XmlAttribute(name = "place_type")
        protected String placeType;

        /**
         * Obtiene el valor de la propiedad locality.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Location.Locality }
         *     
         */
        public Rsp.Location.Locality getLocality() {
            return locality;
        }

        /**
         * Define el valor de la propiedad locality.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Location.Locality }
         *     
         */
        public void setLocality(Rsp.Location.Locality value) {
            this.locality = value;
        }

        /**
         * Obtiene el valor de la propiedad county.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Location.County }
         *     
         */
        public Rsp.Location.County getCounty() {
            return county;
        }

        /**
         * Define el valor de la propiedad county.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Location.County }
         *     
         */
        public void setCounty(Rsp.Location.County value) {
            this.county = value;
        }

        /**
         * Obtiene el valor de la propiedad region.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Location.Region }
         *     
         */
        public Rsp.Location.Region getRegion() {
            return region;
        }

        /**
         * Define el valor de la propiedad region.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Location.Region }
         *     
         */
        public void setRegion(Rsp.Location.Region value) {
            this.region = value;
        }

        /**
         * Obtiene el valor de la propiedad country.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Location.Country }
         *     
         */
        public Rsp.Location.Country getCountry() {
            return country;
        }

        /**
         * Define el valor de la propiedad country.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Location.Country }
         *     
         */
        public void setCountry(Rsp.Location.Country value) {
            this.country = value;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad placeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceId() {
            return placeId;
        }

        /**
         * Define el valor de la propiedad placeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceId(String value) {
            this.placeId = value;
        }

        /**
         * Obtiene el valor de la propiedad placeUrl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceUrl() {
            return placeUrl;
        }

        /**
         * Define el valor de la propiedad placeUrl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceUrl(String value) {
            this.placeUrl = value;
        }

        /**
         * Obtiene el valor de la propiedad woeid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWoeid() {
            return woeid;
        }

        /**
         * Define el valor de la propiedad woeid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWoeid(String value) {
            this.woeid = value;
        }

        /**
         * Obtiene el valor de la propiedad latitude.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getLatitude() {
            return latitude;
        }

        /**
         * Define el valor de la propiedad latitude.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setLatitude(Float value) {
            this.latitude = value;
        }

        /**
         * Obtiene el valor de la propiedad longitude.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getLongitude() {
            return longitude;
        }

        /**
         * Define el valor de la propiedad longitude.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setLongitude(Float value) {
            this.longitude = value;
        }

        /**
         * Obtiene el valor de la propiedad placeType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceType() {
            return placeType;
        }

        /**
         * Define el valor de la propiedad placeType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceType(String value) {
            this.placeType = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Country {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "woeid")
            protected String woeid;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad placeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * Define el valor de la propiedad placeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * Obtiene el valor de la propiedad woeid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * Define el valor de la propiedad woeid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

            /**
             * Obtiene el valor de la propiedad latitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * Define el valor de la propiedad latitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * Obtiene el valor de la propiedad longitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * Define el valor de la propiedad longitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * Obtiene el valor de la propiedad placeUrl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * Define el valor de la propiedad placeUrl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class County {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "woeid")
            protected String woeid;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad placeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * Define el valor de la propiedad placeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * Obtiene el valor de la propiedad woeid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * Define el valor de la propiedad woeid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

            /**
             * Obtiene el valor de la propiedad latitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * Define el valor de la propiedad latitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * Obtiene el valor de la propiedad longitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * Define el valor de la propiedad longitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * Obtiene el valor de la propiedad placeUrl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * Define el valor de la propiedad placeUrl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Locality {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "woeid")
            protected String woeid;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad placeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * Define el valor de la propiedad placeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * Obtiene el valor de la propiedad woeid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * Define el valor de la propiedad woeid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

            /**
             * Obtiene el valor de la propiedad latitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * Define el valor de la propiedad latitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * Obtiene el valor de la propiedad longitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * Define el valor de la propiedad longitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * Obtiene el valor de la propiedad placeUrl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * Define el valor de la propiedad placeUrl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Region {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "woeid")
            protected String woeid;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad placeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * Define el valor de la propiedad placeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * Obtiene el valor de la propiedad woeid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * Define el valor de la propiedad woeid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

            /**
             * Obtiene el valor de la propiedad latitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * Define el valor de la propiedad latitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * Obtiene el valor de la propiedad longitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * Define el valor de la propiedad longitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * Obtiene el valor de la propiedad placeUrl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * Define el valor de la propiedad placeUrl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="response" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="arguments">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="argument" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="errors">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="error" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="needslogin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "response",
        "explanation",
        "arguments",
        "errors"
    })
    public static class Method {

        @XmlElement(required = true)
        protected String description;
        @XmlElement(required = true)
        protected String response;
        @XmlElement(required = true)
        protected String explanation;
        @XmlElement(required = true)
        protected Rsp.Method.Arguments arguments;
        @XmlElement(required = true)
        protected Rsp.Method.Errors errors;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "needslogin")
        protected Boolean needslogin;

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
         * Obtiene el valor de la propiedad response.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponse() {
            return response;
        }

        /**
         * Define el valor de la propiedad response.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponse(String value) {
            this.response = value;
        }

        /**
         * Obtiene el valor de la propiedad explanation.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExplanation() {
            return explanation;
        }

        /**
         * Define el valor de la propiedad explanation.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExplanation(String value) {
            this.explanation = value;
        }

        /**
         * Obtiene el valor de la propiedad arguments.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Method.Arguments }
         *     
         */
        public Rsp.Method.Arguments getArguments() {
            return arguments;
        }

        /**
         * Define el valor de la propiedad arguments.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Method.Arguments }
         *     
         */
        public void setArguments(Rsp.Method.Arguments value) {
            this.arguments = value;
        }

        /**
         * Obtiene el valor de la propiedad errors.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Method.Errors }
         *     
         */
        public Rsp.Method.Errors getErrors() {
            return errors;
        }

        /**
         * Define el valor de la propiedad errors.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Method.Errors }
         *     
         */
        public void setErrors(Rsp.Method.Errors value) {
            this.errors = value;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad needslogin.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isNeedslogin() {
            return needslogin;
        }

        /**
         * Define el valor de la propiedad needslogin.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setNeedslogin(Boolean value) {
            this.needslogin = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="argument" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "argument"
        })
        public static class Arguments {

            protected List<Rsp.Method.Arguments.Argument> argument;

            /**
             * Gets the value of the argument property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the argument property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getArgument().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Method.Arguments.Argument }
             * 
             * 
             */
            public List<Rsp.Method.Arguments.Argument> getArgument() {
                if (argument == null) {
                    argument = new ArrayList<Rsp.Method.Arguments.Argument>();
                }
                return this.argument;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Argument {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "name")
                protected String name;
                @XmlAttribute(name = "optional")
                protected Boolean optional;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad name.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Define el valor de la propiedad name.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * Obtiene el valor de la propiedad optional.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isOptional() {
                    return optional;
                }

                /**
                 * Define el valor de la propiedad optional.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setOptional(Boolean value) {
                    this.optional = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="error" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "error"
        })
        public static class Errors {

            protected List<Rsp.Method.Errors.Error> error;

            /**
             * Gets the value of the error property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the error property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getError().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Method.Errors.Error }
             * 
             * 
             */
            public List<Rsp.Method.Errors.Error> getError() {
                if (error == null) {
                    error = new ArrayList<Rsp.Method.Errors.Error>();
                }
                return this.error;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="message" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Error {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "code")
                protected Integer code;
                @XmlAttribute(name = "message")
                protected String message;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad code.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getCode() {
                    return code;
                }

                /**
                 * Define el valor de la propiedad code.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setCode(Integer value) {
                    this.code = value;
                }

                /**
                 * Obtiene el valor de la propiedad message.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMessage() {
                    return message;
                }

                /**
                 * Define el valor de la propiedad message.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMessage(String value) {
                    this.message = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="method" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "method"
    })
    public static class Methods {

        protected List<String> method;

        /**
         * Gets the value of the method property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the method property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMethod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMethod() {
            if (method == null) {
                method = new ArrayList<String>();
            }
            return this.method;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Nextphoto {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "title")
        protected String title;
        @XmlAttribute(name = "url")
        protected String url;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad secret.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * Define el valor de la propiedad secret.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
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

        /**
         * Obtiene el valor de la propiedad url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Define el valor de la propiedad url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Note {

        @XmlAttribute(name = "id")
        protected String id;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="iscontact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Perms {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "ispublic")
        protected Boolean ispublic;
        @XmlAttribute(name = "isfriend")
        protected Boolean isfriend;
        @XmlAttribute(name = "isfamily")
        protected Boolean isfamily;
        @XmlAttribute(name = "permcomment")
        protected Integer permcomment;
        @XmlAttribute(name = "permaddmeta")
        protected Integer permaddmeta;
        @XmlAttribute(name = "iscontact")
        protected Boolean iscontact;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad ispublic.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIspublic() {
            return ispublic;
        }

        /**
         * Define el valor de la propiedad ispublic.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIspublic(Boolean value) {
            this.ispublic = value;
        }

        /**
         * Obtiene el valor de la propiedad isfriend.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsfriend() {
            return isfriend;
        }

        /**
         * Define el valor de la propiedad isfriend.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsfriend(Boolean value) {
            this.isfriend = value;
        }

        /**
         * Obtiene el valor de la propiedad isfamily.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsfamily() {
            return isfamily;
        }

        /**
         * Define el valor de la propiedad isfamily.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsfamily(Boolean value) {
            this.isfamily = value;
        }

        /**
         * Obtiene el valor de la propiedad permcomment.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPermcomment() {
            return permcomment;
        }

        /**
         * Define el valor de la propiedad permcomment.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPermcomment(Integer value) {
            this.permcomment = value;
        }

        /**
         * Obtiene el valor de la propiedad permaddmeta.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPermaddmeta() {
            return permaddmeta;
        }

        /**
         * Define el valor de la propiedad permaddmeta.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPermaddmeta(Integer value) {
            this.permaddmeta = value;
        }

        /**
         * Obtiene el valor de la propiedad iscontact.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIscontact() {
            return iscontact;
        }

        /**
         * Define el valor de la propiedad iscontact.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIscontact(Boolean value) {
            this.iscontact = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="realname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mbox_sha1sum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="photosurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="profileurl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="photos" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="firstdate" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="firstdatetaken" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="isadmin" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ispro" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="iconserver" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="iconfarm" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="contact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="friend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="family" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="revcontact" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="revfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="revfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="content_type" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="geoperms" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="privacy" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="safety_level" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "username",
        "realname",
        "mboxSha1Sum",
        "location",
        "photosurl",
        "profileurl",
        "photos"
    })
    public static class Person {

        protected String username;
        protected String realname;
        @XmlElement(name = "mbox_sha1sum")
        protected String mboxSha1Sum;
        protected String location;
        protected String photosurl;
        protected String profileurl;
        protected Rsp.Person.Photos photos;
        @XmlAttribute(name = "nsid")
        protected String nsid;
        @XmlAttribute(name = "isadmin")
        protected Boolean isadmin;
        @XmlAttribute(name = "ispro")
        protected Boolean ispro;
        @XmlAttribute(name = "iconserver")
        protected Integer iconserver;
        @XmlAttribute(name = "iconfarm")
        protected Integer iconfarm;
        @XmlAttribute(name = "contact")
        protected Boolean contact;
        @XmlAttribute(name = "friend")
        protected Boolean friend;
        @XmlAttribute(name = "family")
        protected Boolean family;
        @XmlAttribute(name = "revcontact")
        protected Boolean revcontact;
        @XmlAttribute(name = "revfriend")
        protected Boolean revfriend;
        @XmlAttribute(name = "revfamily")
        protected Boolean revfamily;
        @XmlAttribute(name = "content_type")
        protected Integer contentType;
        @XmlAttribute(name = "geoperms")
        protected Integer geoperms;
        @XmlAttribute(name = "hidden")
        protected Boolean hidden;
        @XmlAttribute(name = "privacy")
        protected Integer privacy;
        @XmlAttribute(name = "safety_level")
        protected Integer safetyLevel;

        /**
         * Obtiene el valor de la propiedad username.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Define el valor de la propiedad username.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Obtiene el valor de la propiedad realname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRealname() {
            return realname;
        }

        /**
         * Define el valor de la propiedad realname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRealname(String value) {
            this.realname = value;
        }

        /**
         * Obtiene el valor de la propiedad mboxSha1Sum.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMboxSha1Sum() {
            return mboxSha1Sum;
        }

        /**
         * Define el valor de la propiedad mboxSha1Sum.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMboxSha1Sum(String value) {
            this.mboxSha1Sum = value;
        }

        /**
         * Obtiene el valor de la propiedad location.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * Define el valor de la propiedad location.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * Obtiene el valor de la propiedad photosurl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhotosurl() {
            return photosurl;
        }

        /**
         * Define el valor de la propiedad photosurl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhotosurl(String value) {
            this.photosurl = value;
        }

        /**
         * Obtiene el valor de la propiedad profileurl.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfileurl() {
            return profileurl;
        }

        /**
         * Define el valor de la propiedad profileurl.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfileurl(String value) {
            this.profileurl = value;
        }

        /**
         * Obtiene el valor de la propiedad photos.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Person.Photos }
         *     
         */
        public Rsp.Person.Photos getPhotos() {
            return photos;
        }

        /**
         * Define el valor de la propiedad photos.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Person.Photos }
         *     
         */
        public void setPhotos(Rsp.Person.Photos value) {
            this.photos = value;
        }

        /**
         * Obtiene el valor de la propiedad nsid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNsid() {
            return nsid;
        }

        /**
         * Define el valor de la propiedad nsid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNsid(String value) {
            this.nsid = value;
        }

        /**
         * Obtiene el valor de la propiedad isadmin.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsadmin() {
            return isadmin;
        }

        /**
         * Define el valor de la propiedad isadmin.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsadmin(Boolean value) {
            this.isadmin = value;
        }

        /**
         * Obtiene el valor de la propiedad ispro.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIspro() {
            return ispro;
        }

        /**
         * Define el valor de la propiedad ispro.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIspro(Boolean value) {
            this.ispro = value;
        }

        /**
         * Obtiene el valor de la propiedad iconserver.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIconserver() {
            return iconserver;
        }

        /**
         * Define el valor de la propiedad iconserver.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIconserver(Integer value) {
            this.iconserver = value;
        }

        /**
         * Obtiene el valor de la propiedad iconfarm.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIconfarm() {
            return iconfarm;
        }

        /**
         * Define el valor de la propiedad iconfarm.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIconfarm(Integer value) {
            this.iconfarm = value;
        }

        /**
         * Obtiene el valor de la propiedad contact.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isContact() {
            return contact;
        }

        /**
         * Define el valor de la propiedad contact.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setContact(Boolean value) {
            this.contact = value;
        }

        /**
         * Obtiene el valor de la propiedad friend.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFriend() {
            return friend;
        }

        /**
         * Define el valor de la propiedad friend.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFriend(Boolean value) {
            this.friend = value;
        }

        /**
         * Obtiene el valor de la propiedad family.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFamily() {
            return family;
        }

        /**
         * Define el valor de la propiedad family.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFamily(Boolean value) {
            this.family = value;
        }

        /**
         * Obtiene el valor de la propiedad revcontact.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRevcontact() {
            return revcontact;
        }

        /**
         * Define el valor de la propiedad revcontact.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRevcontact(Boolean value) {
            this.revcontact = value;
        }

        /**
         * Obtiene el valor de la propiedad revfriend.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRevfriend() {
            return revfriend;
        }

        /**
         * Define el valor de la propiedad revfriend.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRevfriend(Boolean value) {
            this.revfriend = value;
        }

        /**
         * Obtiene el valor de la propiedad revfamily.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRevfamily() {
            return revfamily;
        }

        /**
         * Define el valor de la propiedad revfamily.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRevfamily(Boolean value) {
            this.revfamily = value;
        }

        /**
         * Obtiene el valor de la propiedad contentType.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getContentType() {
            return contentType;
        }

        /**
         * Define el valor de la propiedad contentType.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setContentType(Integer value) {
            this.contentType = value;
        }

        /**
         * Obtiene el valor de la propiedad geoperms.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getGeoperms() {
            return geoperms;
        }

        /**
         * Define el valor de la propiedad geoperms.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGeoperms(Integer value) {
            this.geoperms = value;
        }

        /**
         * Obtiene el valor de la propiedad hidden.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHidden() {
            return hidden;
        }

        /**
         * Define el valor de la propiedad hidden.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHidden(Boolean value) {
            this.hidden = value;
        }

        /**
         * Obtiene el valor de la propiedad privacy.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPrivacy() {
            return privacy;
        }

        /**
         * Define el valor de la propiedad privacy.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPrivacy(Integer value) {
            this.privacy = value;
        }

        /**
         * Obtiene el valor de la propiedad safetyLevel.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSafetyLevel() {
            return safetyLevel;
        }

        /**
         * Define el valor de la propiedad safetyLevel.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSafetyLevel(Integer value) {
            this.safetyLevel = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="firstdate" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="firstdatetaken" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firstdate",
            "firstdatetaken",
            "count"
        })
        public static class Photos {

            protected int firstdate;
            @XmlElement(required = true)
            protected String firstdatetaken;
            protected int count;

            /**
             * Obtiene el valor de la propiedad firstdate.
             * 
             */
            public int getFirstdate() {
                return firstdate;
            }

            /**
             * Define el valor de la propiedad firstdate.
             * 
             */
            public void setFirstdate(int value) {
                this.firstdate = value;
            }

            /**
             * Obtiene el valor de la propiedad firstdatetaken.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstdatetaken() {
                return firstdatetaken;
            }

            /**
             * Define el valor de la propiedad firstdatetaken.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstdatetaken(String value) {
                this.firstdatetaken = value;
            }

            /**
             * Obtiene el valor de la propiedad count.
             * 
             */
            public int getCount() {
                return count;
            }

            /**
             * Define el valor de la propiedad count.
             * 
             */
            public void setCount(int value) {
                this.count = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="exif" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="raw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="clean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="tagspace" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tagspaceid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="person" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="favedate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="owner" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="visibility" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="posted" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="taken" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="takengranularity" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="permissions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="editability" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="cancomment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="canaddmeta" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="notes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="h" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="tags" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="raw" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="urls" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="url" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="location" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="isfavorite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="license" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="rotation" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="originalsecret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="originalformat" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="content_type" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="safety_level" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exif",
        "person",
        "owner",
        "title",
        "description",
        "visibility",
        "dates",
        "permissions",
        "editability",
        "comments",
        "notes",
        "tags",
        "urls",
        "location"
    })
    public static class Photo {

        protected List<Rsp.Photo.Exif> exif;
        protected List<Rsp.Photo.Person> person;
        protected Rsp.Photo.Owner owner;
        protected String title;
        protected String description;
        protected Rsp.Photo.Visibility visibility;
        protected Rsp.Photo.Dates dates;
        protected Rsp.Photo.Permissions permissions;
        protected Rsp.Photo.Editability editability;
        protected Integer comments;
        protected Rsp.Photo.Notes notes;
        protected Rsp.Photo.Tags tags;
        protected Rsp.Photo.Urls urls;
        protected Rsp.Photo.Location location;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "server")
        protected Integer server;
        @XmlAttribute(name = "farm")
        protected Integer farm;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;
        @XmlAttribute(name = "isfavorite")
        protected Boolean isfavorite;
        @XmlAttribute(name = "license")
        protected String license;
        @XmlAttribute(name = "rotation")
        protected Integer rotation;
        @XmlAttribute(name = "originalsecret")
        protected String originalsecret;
        @XmlAttribute(name = "originalformat")
        protected String originalformat;
        @XmlAttribute(name = "content_type")
        protected Integer contentType;
        @XmlAttribute(name = "safety_level")
        protected Integer safetyLevel;
        @XmlAttribute(name = "hidden")
        protected Boolean hidden;
        @XmlAttribute(name = "username")
        protected String username;

        /**
         * Gets the value of the exif property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exif property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExif().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photo.Exif }
         * 
         * 
         */
        public List<Rsp.Photo.Exif> getExif() {
            if (exif == null) {
                exif = new ArrayList<Rsp.Photo.Exif>();
            }
            return this.exif;
        }

        /**
         * Gets the value of the person property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the person property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPerson().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photo.Person }
         * 
         * 
         */
        public List<Rsp.Photo.Person> getPerson() {
            if (person == null) {
                person = new ArrayList<Rsp.Photo.Person>();
            }
            return this.person;
        }

        /**
         * Obtiene el valor de la propiedad owner.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Owner }
         *     
         */
        public Rsp.Photo.Owner getOwner() {
            return owner;
        }

        /**
         * Define el valor de la propiedad owner.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Owner }
         *     
         */
        public void setOwner(Rsp.Photo.Owner value) {
            this.owner = value;
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
         * Obtiene el valor de la propiedad visibility.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Visibility }
         *     
         */
        public Rsp.Photo.Visibility getVisibility() {
            return visibility;
        }

        /**
         * Define el valor de la propiedad visibility.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Visibility }
         *     
         */
        public void setVisibility(Rsp.Photo.Visibility value) {
            this.visibility = value;
        }

        /**
         * Obtiene el valor de la propiedad dates.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Dates }
         *     
         */
        public Rsp.Photo.Dates getDates() {
            return dates;
        }

        /**
         * Define el valor de la propiedad dates.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Dates }
         *     
         */
        public void setDates(Rsp.Photo.Dates value) {
            this.dates = value;
        }

        /**
         * Obtiene el valor de la propiedad permissions.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Permissions }
         *     
         */
        public Rsp.Photo.Permissions getPermissions() {
            return permissions;
        }

        /**
         * Define el valor de la propiedad permissions.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Permissions }
         *     
         */
        public void setPermissions(Rsp.Photo.Permissions value) {
            this.permissions = value;
        }

        /**
         * Obtiene el valor de la propiedad editability.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Editability }
         *     
         */
        public Rsp.Photo.Editability getEditability() {
            return editability;
        }

        /**
         * Define el valor de la propiedad editability.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Editability }
         *     
         */
        public void setEditability(Rsp.Photo.Editability value) {
            this.editability = value;
        }

        /**
         * Obtiene el valor de la propiedad comments.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getComments() {
            return comments;
        }

        /**
         * Define el valor de la propiedad comments.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setComments(Integer value) {
            this.comments = value;
        }

        /**
         * Obtiene el valor de la propiedad notes.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Notes }
         *     
         */
        public Rsp.Photo.Notes getNotes() {
            return notes;
        }

        /**
         * Define el valor de la propiedad notes.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Notes }
         *     
         */
        public void setNotes(Rsp.Photo.Notes value) {
            this.notes = value;
        }

        /**
         * Obtiene el valor de la propiedad tags.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Tags }
         *     
         */
        public Rsp.Photo.Tags getTags() {
            return tags;
        }

        /**
         * Define el valor de la propiedad tags.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Tags }
         *     
         */
        public void setTags(Rsp.Photo.Tags value) {
            this.tags = value;
        }

        /**
         * Obtiene el valor de la propiedad urls.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Urls }
         *     
         */
        public Rsp.Photo.Urls getUrls() {
            return urls;
        }

        /**
         * Define el valor de la propiedad urls.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Urls }
         *     
         */
        public void setUrls(Rsp.Photo.Urls value) {
            this.urls = value;
        }

        /**
         * Obtiene el valor de la propiedad location.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Photo.Location }
         *     
         */
        public Rsp.Photo.Location getLocation() {
            return location;
        }

        /**
         * Define el valor de la propiedad location.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Photo.Location }
         *     
         */
        public void setLocation(Rsp.Photo.Location value) {
            this.location = value;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad secret.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * Define el valor de la propiedad secret.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
        }

        /**
         * Obtiene el valor de la propiedad server.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getServer() {
            return server;
        }

        /**
         * Define el valor de la propiedad server.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setServer(Integer value) {
            this.server = value;
        }

        /**
         * Obtiene el valor de la propiedad farm.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getFarm() {
            return farm;
        }

        /**
         * Define el valor de la propiedad farm.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setFarm(Integer value) {
            this.farm = value;
        }

        /**
         * Obtiene el valor de la propiedad page.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * Define el valor de la propiedad page.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * Obtiene el valor de la propiedad pages.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * Define el valor de la propiedad pages.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * Obtiene el valor de la propiedad perpage.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * Define el valor de la propiedad perpage.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * Obtiene el valor de la propiedad total.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * Define el valor de la propiedad total.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }

        /**
         * Obtiene el valor de la propiedad isfavorite.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsfavorite() {
            return isfavorite;
        }

        /**
         * Define el valor de la propiedad isfavorite.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsfavorite(Boolean value) {
            this.isfavorite = value;
        }

        /**
         * Obtiene el valor de la propiedad license.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicense() {
            return license;
        }

        /**
         * Define el valor de la propiedad license.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicense(String value) {
            this.license = value;
        }

        /**
         * Obtiene el valor de la propiedad rotation.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRotation() {
            return rotation;
        }

        /**
         * Define el valor de la propiedad rotation.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRotation(Integer value) {
            this.rotation = value;
        }

        /**
         * Obtiene el valor de la propiedad originalsecret.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalsecret() {
            return originalsecret;
        }

        /**
         * Define el valor de la propiedad originalsecret.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalsecret(String value) {
            this.originalsecret = value;
        }

        /**
         * Obtiene el valor de la propiedad originalformat.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalformat() {
            return originalformat;
        }

        /**
         * Define el valor de la propiedad originalformat.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalformat(String value) {
            this.originalformat = value;
        }

        /**
         * Obtiene el valor de la propiedad contentType.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getContentType() {
            return contentType;
        }

        /**
         * Define el valor de la propiedad contentType.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setContentType(Integer value) {
            this.contentType = value;
        }

        /**
         * Obtiene el valor de la propiedad safetyLevel.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSafetyLevel() {
            return safetyLevel;
        }

        /**
         * Define el valor de la propiedad safetyLevel.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSafetyLevel(Integer value) {
            this.safetyLevel = value;
        }

        /**
         * Obtiene el valor de la propiedad hidden.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isHidden() {
            return hidden;
        }

        /**
         * Define el valor de la propiedad hidden.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setHidden(Boolean value) {
            this.hidden = value;
        }

        /**
         * Obtiene el valor de la propiedad username.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Define el valor de la propiedad username.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="posted" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="taken" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="takengranularity" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Dates {

            @XmlAttribute(name = "posted")
            protected Integer posted;
            @XmlAttribute(name = "taken")
            protected String taken;
            @XmlAttribute(name = "takengranularity")
            protected Integer takengranularity;
            @XmlAttribute(name = "lastupdate")
            protected Integer lastupdate;

            /**
             * Obtiene el valor de la propiedad posted.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPosted() {
                return posted;
            }

            /**
             * Define el valor de la propiedad posted.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPosted(Integer value) {
                this.posted = value;
            }

            /**
             * Obtiene el valor de la propiedad taken.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaken() {
                return taken;
            }

            /**
             * Define el valor de la propiedad taken.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaken(String value) {
                this.taken = value;
            }

            /**
             * Obtiene el valor de la propiedad takengranularity.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTakengranularity() {
                return takengranularity;
            }

            /**
             * Define el valor de la propiedad takengranularity.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTakengranularity(Integer value) {
                this.takengranularity = value;
            }

            /**
             * Obtiene el valor de la propiedad lastupdate.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLastupdate() {
                return lastupdate;
            }

            /**
             * Define el valor de la propiedad lastupdate.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLastupdate(Integer value) {
                this.lastupdate = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="cancomment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="canaddmeta" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Editability {

            @XmlAttribute(name = "cancomment")
            protected Boolean cancomment;
            @XmlAttribute(name = "canaddmeta")
            protected Boolean canaddmeta;

            /**
             * Obtiene el valor de la propiedad cancomment.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCancomment() {
                return cancomment;
            }

            /**
             * Define el valor de la propiedad cancomment.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCancomment(Boolean value) {
                this.cancomment = value;
            }

            /**
             * Obtiene el valor de la propiedad canaddmeta.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCanaddmeta() {
                return canaddmeta;
            }

            /**
             * Define el valor de la propiedad canaddmeta.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCanaddmeta(Boolean value) {
                this.canaddmeta = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="raw" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="clean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="tagspace" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tagspaceid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="tag" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "raw",
            "clean"
        })
        public static class Exif {

            protected String raw;
            protected String clean;
            @XmlAttribute(name = "tagspace")
            protected String tagspace;
            @XmlAttribute(name = "tagspaceid")
            protected String tagspaceid;
            @XmlAttribute(name = "tag")
            protected String tag;
            @XmlAttribute(name = "label")
            protected String label;

            /**
             * Obtiene el valor de la propiedad raw.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRaw() {
                return raw;
            }

            /**
             * Define el valor de la propiedad raw.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRaw(String value) {
                this.raw = value;
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

            /**
             * Obtiene el valor de la propiedad tagspace.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTagspace() {
                return tagspace;
            }

            /**
             * Define el valor de la propiedad tagspace.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTagspace(String value) {
                this.tagspace = value;
            }

            /**
             * Obtiene el valor de la propiedad tagspaceid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTagspaceid() {
                return tagspaceid;
            }

            /**
             * Define el valor de la propiedad tagspaceid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTagspaceid(String value) {
                this.tagspaceid = value;
            }

            /**
             * Obtiene el valor de la propiedad tag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTag() {
                return tag;
            }

            /**
             * Define el valor de la propiedad tag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTag(String value) {
                this.tag = value;
            }

            /**
             * Obtiene el valor de la propiedad label.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLabel() {
                return label;
            }

            /**
             * Define el valor de la propiedad label.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLabel(String value) {
                this.label = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Location {

            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "accuracy")
            protected Integer accuracy;

            /**
             * Obtiene el valor de la propiedad latitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * Define el valor de la propiedad latitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * Obtiene el valor de la propiedad longitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * Define el valor de la propiedad longitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * Obtiene el valor de la propiedad accuracy.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAccuracy() {
                return accuracy;
            }

            /**
             * Define el valor de la propiedad accuracy.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAccuracy(Integer value) {
                this.accuracy = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="note" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="h" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "note"
        })
        public static class Notes {

            protected List<Rsp.Photo.Notes.Note> note;

            /**
             * Gets the value of the note property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the note property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNote().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Photo.Notes.Note }
             * 
             * 
             */
            public List<Rsp.Photo.Notes.Note> getNote() {
                if (note == null) {
                    note = new ArrayList<Rsp.Photo.Notes.Note>();
                }
                return this.note;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="x" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="y" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="w" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="h" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Note {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "author")
                protected String author;
                @XmlAttribute(name = "authorname")
                protected String authorname;
                @XmlAttribute(name = "x")
                protected Integer x;
                @XmlAttribute(name = "y")
                protected Integer y;
                @XmlAttribute(name = "w")
                protected Integer w;
                @XmlAttribute(name = "h")
                protected Integer h;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Obtiene el valor de la propiedad author.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthor() {
                    return author;
                }

                /**
                 * Define el valor de la propiedad author.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthor(String value) {
                    this.author = value;
                }

                /**
                 * Obtiene el valor de la propiedad authorname.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorname() {
                    return authorname;
                }

                /**
                 * Define el valor de la propiedad authorname.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorname(String value) {
                    this.authorname = value;
                }

                /**
                 * Obtiene el valor de la propiedad x.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getX() {
                    return x;
                }

                /**
                 * Define el valor de la propiedad x.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setX(Integer value) {
                    this.x = value;
                }

                /**
                 * Obtiene el valor de la propiedad y.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getY() {
                    return y;
                }

                /**
                 * Define el valor de la propiedad y.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setY(Integer value) {
                    this.y = value;
                }

                /**
                 * Obtiene el valor de la propiedad w.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getW() {
                    return w;
                }

                /**
                 * Define el valor de la propiedad w.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setW(Integer value) {
                    this.w = value;
                }

                /**
                 * Obtiene el valor de la propiedad h.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getH() {
                    return h;
                }

                /**
                 * Define el valor de la propiedad h.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setH(Integer value) {
                    this.h = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="realname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Owner {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "username")
            protected String username;
            @XmlAttribute(name = "realname")
            protected String realname;
            @XmlAttribute(name = "location")
            protected String location;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad nsid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * Define el valor de la propiedad nsid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * Obtiene el valor de la propiedad username.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * Define el valor de la propiedad username.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * Obtiene el valor de la propiedad realname.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRealname() {
                return realname;
            }

            /**
             * Define el valor de la propiedad realname.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRealname(String value) {
                this.realname = value;
            }

            /**
             * Obtiene el valor de la propiedad location.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocation() {
                return location;
            }

            /**
             * Define el valor de la propiedad location.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocation(String value) {
                this.location = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="permcomment" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="permaddmeta" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Permissions {

            @XmlAttribute(name = "permcomment")
            protected Integer permcomment;
            @XmlAttribute(name = "permaddmeta")
            protected Integer permaddmeta;

            /**
             * Obtiene el valor de la propiedad permcomment.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPermcomment() {
                return permcomment;
            }

            /**
             * Define el valor de la propiedad permcomment.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPermcomment(Integer value) {
                this.permcomment = value;
            }

            /**
             * Obtiene el valor de la propiedad permaddmeta.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPermaddmeta() {
                return permaddmeta;
            }

            /**
             * Define el valor de la propiedad permaddmeta.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPermaddmeta(Integer value) {
                this.permaddmeta = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="favedate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Person {

            @XmlAttribute(name = "nsid")
            protected String nsid;
            @XmlAttribute(name = "username")
            protected String username;
            @XmlAttribute(name = "favedate")
            protected Integer favedate;

            /**
             * Obtiene el valor de la propiedad nsid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNsid() {
                return nsid;
            }

            /**
             * Define el valor de la propiedad nsid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNsid(String value) {
                this.nsid = value;
            }

            /**
             * Obtiene el valor de la propiedad username.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * Define el valor de la propiedad username.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

            /**
             * Obtiene el valor de la propiedad favedate.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFavedate() {
                return favedate;
            }

            /**
             * Define el valor de la propiedad favedate.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFavedate(Integer value) {
                this.favedate = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="raw" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tag"
        })
        public static class Tags {

            protected List<Rsp.Photo.Tags.Tag> tag;

            /**
             * Gets the value of the tag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Photo.Tags.Tag }
             * 
             * 
             */
            public List<Rsp.Photo.Tags.Tag> getTag() {
                if (tag == null) {
                    tag = new ArrayList<Rsp.Photo.Tags.Tag>();
                }
                return this.tag;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="author" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="raw" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="authorname" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Tag {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "id")
                protected String id;
                @XmlAttribute(name = "author")
                protected String author;
                @XmlAttribute(name = "raw")
                protected String raw;
                @XmlAttribute(name = "authorname")
                protected String authorname;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad id.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getId() {
                    return id;
                }

                /**
                 * Define el valor de la propiedad id.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * Obtiene el valor de la propiedad author.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthor() {
                    return author;
                }

                /**
                 * Define el valor de la propiedad author.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthor(String value) {
                    this.author = value;
                }

                /**
                 * Obtiene el valor de la propiedad raw.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRaw() {
                    return raw;
                }

                /**
                 * Define el valor de la propiedad raw.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRaw(String value) {
                    this.raw = value;
                }

                /**
                 * Obtiene el valor de la propiedad authorname.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAuthorname() {
                    return authorname;
                }

                /**
                 * Define el valor de la propiedad authorname.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAuthorname(String value) {
                    this.authorname = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="url" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "url"
        })
        public static class Urls {

            protected List<Rsp.Photo.Urls.Url> url;

            /**
             * Gets the value of the url property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the url property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUrl().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Rsp.Photo.Urls.Url }
             * 
             * 
             */
            public List<Rsp.Photo.Urls.Url> getUrl() {
                if (url == null) {
                    url = new ArrayList<Rsp.Photo.Urls.Url>();
                }
                return this.url;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Url {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "type")
                protected String type;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad type.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Define el valor de la propiedad type.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Visibility {

            @XmlAttribute(name = "ispublic")
            protected Boolean ispublic;
            @XmlAttribute(name = "isfriend")
            protected Boolean isfriend;
            @XmlAttribute(name = "isfamily")
            protected Boolean isfamily;

            /**
             * Obtiene el valor de la propiedad ispublic.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIspublic() {
                return ispublic;
            }

            /**
             * Define el valor de la propiedad ispublic.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIspublic(Boolean value) {
                this.ispublic = value;
            }

            /**
             * Obtiene el valor de la propiedad isfriend.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsfriend() {
                return isfriend;
            }

            /**
             * Define el valor de la propiedad isfriend.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsfriend(Boolean value) {
                this.isfriend = value;
            }

            /**
             * Obtiene el valor de la propiedad isfamily.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsfamily() {
                return isfamily;
            }

            /**
             * Define el valor de la propiedad isfamily.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsfamily(Boolean value) {
                this.isfamily = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="photocount" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="fromdate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="todate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "photocount"
    })
    public static class Photocounts {

        protected List<Rsp.Photocounts.Photocount> photocount;

        /**
         * Gets the value of the photocount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the photocount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhotocount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photocounts.Photocount }
         * 
         * 
         */
        public List<Rsp.Photocounts.Photocount> getPhotocount() {
            if (photocount == null) {
                photocount = new ArrayList<Rsp.Photocounts.Photocount>();
            }
            return this.photocount;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="fromdate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="todate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Photocount {

            @XmlAttribute(name = "count")
            protected Integer count;
            @XmlAttribute(name = "fromdate")
            protected Integer fromdate;
            @XmlAttribute(name = "todate")
            protected Integer todate;

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
             * Obtiene el valor de la propiedad fromdate.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFromdate() {
                return fromdate;
            }

            /**
             * Define el valor de la propiedad fromdate.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFromdate(Integer value) {
                this.fromdate = value;
            }

            /**
             * Obtiene el valor de la propiedad todate.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTodate() {
                return todate;
            }

            /**
             * Define el valor de la propiedad todate.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTodate(Integer value) {
                this.todate = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="originalsecret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Photoid {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "originalsecret")
        protected String originalsecret;

        /**
         * Obtiene el valor de la propiedad value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Define el valor de la propiedad value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Obtiene el valor de la propiedad secret.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * Define el valor de la propiedad secret.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
        }

        /**
         * Obtiene el valor de la propiedad originalsecret.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalsecret() {
            return originalsecret;
        }

        /**
         * Define el valor de la propiedad originalsecret.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalsecret(String value) {
            this.originalsecret = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "photo"
    })
    public static class Photos {

        protected List<Rsp.Photos.Photo> photo;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;

        /**
         * Gets the value of the photo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the photo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photos.Photo }
         * 
         * 
         */
        public List<Rsp.Photos.Photo> getPhoto() {
            if (photo == null) {
                photo = new ArrayList<Rsp.Photos.Photo>();
            }
            return this.photo;
        }

        /**
         * Obtiene el valor de la propiedad page.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * Define el valor de la propiedad page.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * Obtiene el valor de la propiedad pages.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * Define el valor de la propiedad pages.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * Obtiene el valor de la propiedad perpage.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * Define el valor de la propiedad perpage.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * Obtiene el valor de la propiedad total.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * Define el valor de la propiedad total.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ispublic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isfriend" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="isfamily" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ownername" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="dateadded" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="lastupdate" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="username" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Photo {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "owner")
            protected String owner;
            @XmlAttribute(name = "secret")
            protected String secret;
            @XmlAttribute(name = "server")
            protected Integer server;
            @XmlAttribute(name = "title")
            protected String title;
            @XmlAttribute(name = "ispublic")
            protected Boolean ispublic;
            @XmlAttribute(name = "isfriend")
            protected Boolean isfriend;
            @XmlAttribute(name = "isfamily")
            protected Boolean isfamily;
            @XmlAttribute(name = "ownername")
            protected String ownername;
            @XmlAttribute(name = "dateadded")
            protected Integer dateadded;
            @XmlAttribute(name = "lastupdate")
            protected Integer lastupdate;
            @XmlAttribute(name = "username")
            protected String username;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad owner.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Define el valor de la propiedad owner.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Obtiene el valor de la propiedad secret.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecret() {
                return secret;
            }

            /**
             * Define el valor de la propiedad secret.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecret(String value) {
                this.secret = value;
            }

            /**
             * Obtiene el valor de la propiedad server.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getServer() {
                return server;
            }

            /**
             * Define el valor de la propiedad server.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setServer(Integer value) {
                this.server = value;
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

            /**
             * Obtiene el valor de la propiedad ispublic.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIspublic() {
                return ispublic;
            }

            /**
             * Define el valor de la propiedad ispublic.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIspublic(Boolean value) {
                this.ispublic = value;
            }

            /**
             * Obtiene el valor de la propiedad isfriend.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsfriend() {
                return isfriend;
            }

            /**
             * Define el valor de la propiedad isfriend.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsfriend(Boolean value) {
                this.isfriend = value;
            }

            /**
             * Obtiene el valor de la propiedad isfamily.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsfamily() {
                return isfamily;
            }

            /**
             * Define el valor de la propiedad isfamily.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsfamily(Boolean value) {
                this.isfamily = value;
            }

            /**
             * Obtiene el valor de la propiedad ownername.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnername() {
                return ownername;
            }

            /**
             * Define el valor de la propiedad ownername.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnername(String value) {
                this.ownername = value;
            }

            /**
             * Obtiene el valor de la propiedad dateadded.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getDateadded() {
                return dateadded;
            }

            /**
             * Define el valor de la propiedad dateadded.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setDateadded(Integer value) {
                this.dateadded = value;
            }

            /**
             * Obtiene el valor de la propiedad lastupdate.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getLastupdate() {
                return lastupdate;
            }

            /**
             * Define el valor de la propiedad lastupdate.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setLastupdate(Integer value) {
                this.lastupdate = value;
            }

            /**
             * Obtiene el valor de la propiedad username.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUsername() {
                return username;
            }

            /**
             * Define el valor de la propiedad username.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUsername(String value) {
                this.username = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="photo" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="isprimary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="pages" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="perpage" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "title",
        "description",
        "photo"
    })
    public static class Photoset {

        protected String title;
        protected String description;
        protected List<Rsp.Photoset.Photo> photo;
        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "url")
        protected String url;
        @XmlAttribute(name = "owner")
        protected String owner;
        @XmlAttribute(name = "primary")
        protected String primary;
        @XmlAttribute(name = "photos")
        protected Integer photos;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "page")
        protected Integer page;
        @XmlAttribute(name = "pages")
        protected Integer pages;
        @XmlAttribute(name = "perpage")
        protected Integer perpage;
        @XmlAttribute(name = "total")
        protected Integer total;

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
         * Gets the value of the photo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the photo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photoset.Photo }
         * 
         * 
         */
        public List<Rsp.Photoset.Photo> getPhoto() {
            if (photo == null) {
                photo = new ArrayList<Rsp.Photoset.Photo>();
            }
            return this.photo;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Define el valor de la propiedad url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Obtiene el valor de la propiedad owner.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * Define el valor de la propiedad owner.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
        }

        /**
         * Obtiene el valor de la propiedad primary.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimary() {
            return primary;
        }

        /**
         * Define el valor de la propiedad primary.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimary(String value) {
            this.primary = value;
        }

        /**
         * Obtiene el valor de la propiedad photos.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPhotos() {
            return photos;
        }

        /**
         * Define el valor de la propiedad photos.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPhotos(Integer value) {
            this.photos = value;
        }

        /**
         * Obtiene el valor de la propiedad secret.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * Define el valor de la propiedad secret.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
        }

        /**
         * Obtiene el valor de la propiedad page.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPage() {
            return page;
        }

        /**
         * Define el valor de la propiedad page.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPage(Integer value) {
            this.page = value;
        }

        /**
         * Obtiene el valor de la propiedad pages.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPages() {
            return pages;
        }

        /**
         * Define el valor de la propiedad pages.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPages(Integer value) {
            this.pages = value;
        }

        /**
         * Obtiene el valor de la propiedad perpage.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getPerpage() {
            return perpage;
        }

        /**
         * Define el valor de la propiedad perpage.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setPerpage(Integer value) {
            this.perpage = value;
        }

        /**
         * Obtiene el valor de la propiedad total.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * Define el valor de la propiedad total.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="isprimary" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Photo {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "secret")
            protected String secret;
            @XmlAttribute(name = "server")
            protected String server;
            @XmlAttribute(name = "title")
            protected String title;
            @XmlAttribute(name = "isprimary")
            protected Boolean isprimary;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad secret.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecret() {
                return secret;
            }

            /**
             * Define el valor de la propiedad secret.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecret(String value) {
                this.secret = value;
            }

            /**
             * Obtiene el valor de la propiedad server.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServer() {
                return server;
            }

            /**
             * Define el valor de la propiedad server.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServer(String value) {
                this.server = value;
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

            /**
             * Obtiene el valor de la propiedad isprimary.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsprimary() {
                return isprimary;
            }

            /**
             * Define el valor de la propiedad isprimary.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsprimary(Boolean value) {
                this.isprimary = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="photoset" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="cancreate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "photoset"
    })
    public static class Photosets {

        protected List<Rsp.Photosets.Photoset> photoset;
        @XmlAttribute(name = "cancreate")
        protected Boolean cancreate;

        /**
         * Gets the value of the photoset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the photoset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhotoset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Photosets.Photoset }
         * 
         * 
         */
        public List<Rsp.Photosets.Photoset> getPhotoset() {
            if (photoset == null) {
                photoset = new ArrayList<Rsp.Photosets.Photoset>();
            }
            return this.photoset;
        }

        /**
         * Obtiene el valor de la propiedad cancreate.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancreate() {
            return cancreate;
        }

        /**
         * Define el valor de la propiedad cancreate.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCancreate(Boolean value) {
            this.cancreate = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="primary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="photos" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="server" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="farm" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "title",
            "description"
        })
        public static class Photoset {

            protected String title;
            protected String description;
            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "url")
            protected String url;
            @XmlAttribute(name = "owner")
            protected String owner;
            @XmlAttribute(name = "primary")
            protected String primary;
            @XmlAttribute(name = "photos")
            protected Integer photos;
            @XmlAttribute(name = "server")
            protected Integer server;
            @XmlAttribute(name = "farm")
            protected Integer farm;
            @XmlAttribute(name = "secret")
            protected String secret;

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
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad url.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * Define el valor de la propiedad url.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

            /**
             * Obtiene el valor de la propiedad owner.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Define el valor de la propiedad owner.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Obtiene el valor de la propiedad primary.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimary() {
                return primary;
            }

            /**
             * Define el valor de la propiedad primary.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimary(String value) {
                this.primary = value;
            }

            /**
             * Obtiene el valor de la propiedad photos.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPhotos() {
                return photos;
            }

            /**
             * Define el valor de la propiedad photos.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPhotos(Integer value) {
                this.photos = value;
            }

            /**
             * Obtiene el valor de la propiedad server.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getServer() {
                return server;
            }

            /**
             * Define el valor de la propiedad server.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setServer(Integer value) {
                this.server = value;
            }

            /**
             * Obtiene el valor de la propiedad farm.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getFarm() {
                return farm;
            }

            /**
             * Define el valor de la propiedad farm.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setFarm(Integer value) {
                this.farm = value;
            }

            /**
             * Obtiene el valor de la propiedad secret.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecret() {
                return secret;
            }

            /**
             * Define el valor de la propiedad secret.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecret(String value) {
                this.secret = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="place" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="query" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="total" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="accuracy" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "place"
    })
    public static class Places {

        protected List<Rsp.Places.Place> place;
        @XmlAttribute(name = "query")
        protected String query;
        @XmlAttribute(name = "total")
        protected Integer total;
        @XmlAttribute(name = "latitude")
        protected Float latitude;
        @XmlAttribute(name = "longitude")
        protected Float longitude;
        @XmlAttribute(name = "accuracy")
        protected Integer accuracy;

        /**
         * Gets the value of the place property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the place property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlace().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Places.Place }
         * 
         * 
         */
        public List<Rsp.Places.Place> getPlace() {
            if (place == null) {
                place = new ArrayList<Rsp.Places.Place>();
            }
            return this.place;
        }

        /**
         * Obtiene el valor de la propiedad query.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuery() {
            return query;
        }

        /**
         * Define el valor de la propiedad query.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuery(String value) {
            this.query = value;
        }

        /**
         * Obtiene el valor de la propiedad total.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getTotal() {
            return total;
        }

        /**
         * Define el valor de la propiedad total.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setTotal(Integer value) {
            this.total = value;
        }

        /**
         * Obtiene el valor de la propiedad latitude.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getLatitude() {
            return latitude;
        }

        /**
         * Define el valor de la propiedad latitude.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setLatitude(Float value) {
            this.latitude = value;
        }

        /**
         * Obtiene el valor de la propiedad longitude.
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getLongitude() {
            return longitude;
        }

        /**
         * Define el valor de la propiedad longitude.
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setLongitude(Float value) {
            this.longitude = value;
        }

        /**
         * Obtiene el valor de la propiedad accuracy.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAccuracy() {
            return accuracy;
        }

        /**
         * Define el valor de la propiedad accuracy.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAccuracy(Integer value) {
            this.accuracy = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="place_id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="place_url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="place_type" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="woeid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Place {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "place_id")
            protected String placeId;
            @XmlAttribute(name = "place_url")
            protected String placeUrl;
            @XmlAttribute(name = "place_type")
            protected String placeType;
            @XmlAttribute(name = "latitude")
            protected Float latitude;
            @XmlAttribute(name = "longitude")
            protected Float longitude;
            @XmlAttribute(name = "woeid")
            protected String woeid;

            /**
             * Obtiene el valor de la propiedad value.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad placeId.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceId() {
                return placeId;
            }

            /**
             * Define el valor de la propiedad placeId.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceId(String value) {
                this.placeId = value;
            }

            /**
             * Obtiene el valor de la propiedad placeUrl.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceUrl() {
                return placeUrl;
            }

            /**
             * Define el valor de la propiedad placeUrl.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceUrl(String value) {
                this.placeUrl = value;
            }

            /**
             * Obtiene el valor de la propiedad placeType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlaceType() {
                return placeType;
            }

            /**
             * Define el valor de la propiedad placeType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlaceType(String value) {
                this.placeType = value;
            }

            /**
             * Obtiene el valor de la propiedad latitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLatitude() {
                return latitude;
            }

            /**
             * Define el valor de la propiedad latitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLatitude(Float value) {
                this.latitude = value;
            }

            /**
             * Obtiene el valor de la propiedad longitude.
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getLongitude() {
                return longitude;
            }

            /**
             * Define el valor de la propiedad longitude.
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setLongitude(Float value) {
                this.longitude = value;
            }

            /**
             * Obtiene el valor de la propiedad woeid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWoeid() {
                return woeid;
            }

            /**
             * Define el valor de la propiedad woeid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWoeid(String value) {
                this.woeid = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Pool {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "title")
        protected String title;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="secret" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Prevphoto {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "secret")
        protected String secret;
        @XmlAttribute(name = "title")
        protected String title;
        @XmlAttribute(name = "url")
        protected String url;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Obtiene el valor de la propiedad secret.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecret() {
            return secret;
        }

        /**
         * Define el valor de la propiedad secret.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecret(String value) {
            this.secret = value;
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

        /**
         * Obtiene el valor de la propiedad url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Define el valor de la propiedad url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Set {

        @XmlAttribute(name = "id")
        protected String id;
        @XmlAttribute(name = "title")
        protected String title;

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="size" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "size"
    })
    public static class Sizes {

        protected List<Rsp.Sizes.Size> size;

        /**
         * Gets the value of the size property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the size property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSize().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Sizes.Size }
         * 
         * 
         */
        public List<Rsp.Sizes.Size> getSize() {
            if (size == null) {
                size = new ArrayList<Rsp.Sizes.Size>();
            }
            return this.size;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Size {

            @XmlAttribute(name = "label")
            protected String label;
            @XmlAttribute(name = "width")
            protected Integer width;
            @XmlAttribute(name = "height")
            protected Integer height;
            @XmlAttribute(name = "source")
            protected String source;
            @XmlAttribute(name = "url")
            protected String url;

            /**
             * Obtiene el valor de la propiedad label.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLabel() {
                return label;
            }

            /**
             * Define el valor de la propiedad label.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLabel(String value) {
                this.label = value;
            }

            /**
             * Obtiene el valor de la propiedad width.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getWidth() {
                return width;
            }

            /**
             * Define el valor de la propiedad width.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setWidth(Integer value) {
                this.width = value;
            }

            /**
             * Obtiene el valor de la propiedad height.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getHeight() {
                return height;
            }

            /**
             * Define el valor de la propiedad height.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setHeight(Integer value) {
                this.height = value;
            }

            /**
             * Obtiene el valor de la propiedad source.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Define el valor de la propiedad source.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

            /**
             * Obtiene el valor de la propiedad url.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUrl() {
                return url;
            }

            /**
             * Define el valor de la propiedad url.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUrl(String value) {
                this.url = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tag"
    })
    public static class Tags {

        protected List<TagType> tag;
        @XmlAttribute(name = "source")
        protected String source;

        /**
         * Gets the value of the tag property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tag property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTag().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TagType }
         * 
         * 
         */
        public List<TagType> getTag() {
            if (tag == null) {
                tag = new ArrayList<TagType>();
            }
            return this.tag;
        }

        /**
         * Obtiene el valor de la propiedad source.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Define el valor de la propiedad source.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ticket" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="complete" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="photoid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="invalid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ticket"
    })
    public static class Uploader {

        protected List<Rsp.Uploader.Ticket> ticket;

        /**
         * Gets the value of the ticket property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticket property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicket().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rsp.Uploader.Ticket }
         * 
         * 
         */
        public List<Rsp.Uploader.Ticket> getTicket() {
            if (ticket == null) {
                ticket = new ArrayList<Rsp.Uploader.Ticket>();
            }
            return this.ticket;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="complete" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="photoid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="invalid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Ticket {

            @XmlAttribute(name = "id")
            protected String id;
            @XmlAttribute(name = "complete")
            protected Integer complete;
            @XmlAttribute(name = "photoid")
            protected String photoid;
            @XmlAttribute(name = "invalid")
            protected Boolean invalid;

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad complete.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getComplete() {
                return complete;
            }

            /**
             * Define el valor de la propiedad complete.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setComplete(Integer value) {
                this.complete = value;
            }

            /**
             * Obtiene el valor de la propiedad photoid.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhotoid() {
                return photoid;
            }

            /**
             * Define el valor de la propiedad photoid.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhotoid(String value) {
                this.photoid = value;
            }

            /**
             * Obtiene el valor de la propiedad invalid.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInvalid() {
                return invalid;
            }

            /**
             * Define el valor de la propiedad invalid.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInvalid(Boolean value) {
                this.invalid = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="bandwidth" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}double" />
     *                 &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="usedbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="usedkb" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="remainingbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="remainingkb" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="filesize" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="sets" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="nsid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ispro" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="url" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "username",
        "bandwidth",
        "filesize",
        "sets"
    })
    public static class User {

        protected String username;
        protected Rsp.User.Bandwidth bandwidth;
        protected Rsp.User.Filesize filesize;
        protected Rsp.User.Sets sets;
        @XmlAttribute(name = "nsid")
        protected String nsid;
        @XmlAttribute(name = "ispro")
        protected String ispro;
        @XmlAttribute(name = "url")
        protected String url;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * Obtiene el valor de la propiedad username.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Define el valor de la propiedad username.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
        }

        /**
         * Obtiene el valor de la propiedad bandwidth.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.User.Bandwidth }
         *     
         */
        public Rsp.User.Bandwidth getBandwidth() {
            return bandwidth;
        }

        /**
         * Define el valor de la propiedad bandwidth.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.User.Bandwidth }
         *     
         */
        public void setBandwidth(Rsp.User.Bandwidth value) {
            this.bandwidth = value;
        }

        /**
         * Obtiene el valor de la propiedad filesize.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.User.Filesize }
         *     
         */
        public Rsp.User.Filesize getFilesize() {
            return filesize;
        }

        /**
         * Define el valor de la propiedad filesize.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.User.Filesize }
         *     
         */
        public void setFilesize(Rsp.User.Filesize value) {
            this.filesize = value;
        }

        /**
         * Obtiene el valor de la propiedad sets.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.User.Sets }
         *     
         */
        public Rsp.User.Sets getSets() {
            return sets;
        }

        /**
         * Define el valor de la propiedad sets.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.User.Sets }
         *     
         */
        public void setSets(Rsp.User.Sets value) {
            this.sets = value;
        }

        /**
         * Obtiene el valor de la propiedad nsid.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNsid() {
            return nsid;
        }

        /**
         * Define el valor de la propiedad nsid.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNsid(String value) {
            this.nsid = value;
        }

        /**
         * Obtiene el valor de la propiedad ispro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIspro() {
            return ispro;
        }

        /**
         * Define el valor de la propiedad ispro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIspro(String value) {
            this.ispro = value;
        }

        /**
         * Obtiene el valor de la propiedad url.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Define el valor de la propiedad url.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}double" />
         *       &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="usedbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="usedkb" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="remainingbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="remainingkb" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Bandwidth {

            @XmlAttribute(name = "maxbytes")
            protected Double maxbytes;
            @XmlAttribute(name = "maxkb")
            protected Integer maxkb;
            @XmlAttribute(name = "usedbytes")
            protected Integer usedbytes;
            @XmlAttribute(name = "usedkb")
            protected Integer usedkb;
            @XmlAttribute(name = "remainingbytes")
            protected Integer remainingbytes;
            @XmlAttribute(name = "remainingkb")
            protected Integer remainingkb;

            /**
             * Obtiene el valor de la propiedad maxbytes.
             * 
             * @return
             *     possible object is
             *     {@link Double }
             *     
             */
            public Double getMaxbytes() {
                return maxbytes;
            }

            /**
             * Define el valor de la propiedad maxbytes.
             * 
             * @param value
             *     allowed object is
             *     {@link Double }
             *     
             */
            public void setMaxbytes(Double value) {
                this.maxbytes = value;
            }

            /**
             * Obtiene el valor de la propiedad maxkb.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxkb() {
                return maxkb;
            }

            /**
             * Define el valor de la propiedad maxkb.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxkb(Integer value) {
                this.maxkb = value;
            }

            /**
             * Obtiene el valor de la propiedad usedbytes.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getUsedbytes() {
                return usedbytes;
            }

            /**
             * Define el valor de la propiedad usedbytes.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setUsedbytes(Integer value) {
                this.usedbytes = value;
            }

            /**
             * Obtiene el valor de la propiedad usedkb.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getUsedkb() {
                return usedkb;
            }

            /**
             * Define el valor de la propiedad usedkb.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setUsedkb(Integer value) {
                this.usedkb = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingbytes.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRemainingbytes() {
                return remainingbytes;
            }

            /**
             * Define el valor de la propiedad remainingbytes.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRemainingbytes(Integer value) {
                this.remainingbytes = value;
            }

            /**
             * Obtiene el valor de la propiedad remainingkb.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRemainingkb() {
                return remainingkb;
            }

            /**
             * Define el valor de la propiedad remainingkb.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRemainingkb(Integer value) {
                this.remainingkb = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="maxbytes" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="maxkb" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Filesize {

            @XmlAttribute(name = "maxbytes")
            protected Integer maxbytes;
            @XmlAttribute(name = "maxkb")
            protected Integer maxkb;

            /**
             * Obtiene el valor de la propiedad maxbytes.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxbytes() {
                return maxbytes;
            }

            /**
             * Define el valor de la propiedad maxbytes.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxbytes(Integer value) {
                this.maxbytes = value;
            }

            /**
             * Obtiene el valor de la propiedad maxkb.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getMaxkb() {
                return maxkb;
            }

            /**
             * Define el valor de la propiedad maxkb.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setMaxkb(Integer value) {
                this.maxkb = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="created" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="remaining" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Sets {

            @XmlAttribute(name = "created")
            protected Integer created;
            @XmlAttribute(name = "remaining")
            protected String remaining;

            /**
             * Obtiene el valor de la propiedad created.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCreated() {
                return created;
            }

            /**
             * Define el valor de la propiedad created.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCreated(Integer value) {
                this.created = value;
            }

            /**
             * Obtiene el valor de la propiedad remaining.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemaining() {
                return remaining;
            }

            /**
             * Define el valor de la propiedad remaining.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemaining(String value) {
                this.remaining = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="tags">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tags"
    })
    public static class Who {

        @XmlElement(required = true)
        protected Rsp.Who.Tags tags;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * Obtiene el valor de la propiedad tags.
         * 
         * @return
         *     possible object is
         *     {@link Rsp.Who.Tags }
         *     
         */
        public Rsp.Who.Tags getTags() {
            return tags;
        }

        /**
         * Define el valor de la propiedad tags.
         * 
         * @param value
         *     allowed object is
         *     {@link Rsp.Who.Tags }
         *     
         */
        public void setTags(Rsp.Who.Tags value) {
            this.tags = value;
        }

        /**
         * Obtiene el valor de la propiedad id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define el valor de la propiedad id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="tag" type="{}tagType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tag"
        })
        public static class Tags {

            protected List<TagType> tag;
            @XmlAttribute(name = "source")
            protected String source;

            /**
             * Gets the value of the tag property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tag property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTag().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TagType }
             * 
             * 
             */
            public List<TagType> getTag() {
                if (tag == null) {
                    tag = new ArrayList<TagType>();
                }
                return this.tag;
            }

            /**
             * Obtiene el valor de la propiedad source.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSource() {
                return source;
            }

            /**
             * Define el valor de la propiedad source.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSource(String value) {
                this.source = value;
            }

        }

    }

}
