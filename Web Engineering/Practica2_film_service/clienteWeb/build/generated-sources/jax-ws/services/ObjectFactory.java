
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Language_QNAME = new QName("http://services/", "language");
    private final static QName _Film_QNAME = new QName("http://services/", "film");
    private final static QName _ListarPeliculas_QNAME = new QName("http://services/", "listarPeliculas");
    private final static QName _BuscarPeliculaByIdResponse_QNAME = new QName("http://services/", "buscarPeliculaByIdResponse");
    private final static QName _ListarPeliculasResponse_QNAME = new QName("http://services/", "listarPeliculasResponse");
    private final static QName _BuscarPeliculaById_QNAME = new QName("http://services/", "buscarPeliculaById");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarPeliculasResponse }
     * 
     */
    public ListarPeliculasResponse createListarPeliculasResponse() {
        return new ListarPeliculasResponse();
    }

    /**
     * Create an instance of {@link BuscarPeliculaById }
     * 
     */
    public BuscarPeliculaById createBuscarPeliculaById() {
        return new BuscarPeliculaById();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link Film }
     * 
     */
    public Film createFilm() {
        return new Film();
    }

    /**
     * Create an instance of {@link ListarPeliculas }
     * 
     */
    public ListarPeliculas createListarPeliculas() {
        return new ListarPeliculas();
    }

    /**
     * Create an instance of {@link BuscarPeliculaByIdResponse }
     * 
     */
    public BuscarPeliculaByIdResponse createBuscarPeliculaByIdResponse() {
        return new BuscarPeliculaByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Language }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "language")
    public JAXBElement<Language> createLanguage(Language value) {
        return new JAXBElement<Language>(_Language_QNAME, Language.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Film }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "film")
    public JAXBElement<Film> createFilm(Film value) {
        return new JAXBElement<Film>(_Film_QNAME, Film.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPeliculas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarPeliculas")
    public JAXBElement<ListarPeliculas> createListarPeliculas(ListarPeliculas value) {
        return new JAXBElement<ListarPeliculas>(_ListarPeliculas_QNAME, ListarPeliculas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPeliculaByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "buscarPeliculaByIdResponse")
    public JAXBElement<BuscarPeliculaByIdResponse> createBuscarPeliculaByIdResponse(BuscarPeliculaByIdResponse value) {
        return new JAXBElement<BuscarPeliculaByIdResponse>(_BuscarPeliculaByIdResponse_QNAME, BuscarPeliculaByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarPeliculasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listarPeliculasResponse")
    public JAXBElement<ListarPeliculasResponse> createListarPeliculasResponse(ListarPeliculasResponse value) {
        return new JAXBElement<ListarPeliculasResponse>(_ListarPeliculasResponse_QNAME, ListarPeliculasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarPeliculaById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "buscarPeliculaById")
    public JAXBElement<BuscarPeliculaById> createBuscarPeliculaById(BuscarPeliculaById value) {
        return new JAXBElement<BuscarPeliculaById>(_BuscarPeliculaById_QNAME, BuscarPeliculaById.class, null, value);
    }

}
