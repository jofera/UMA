/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.ClientErrorException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MultivaluedMap;

/**
 * Jersey REST client generated for REST resource:Photo Service
 * [services/rest]<br>
 * USAGE:
 * <pre>
 *        FlickrClient client = new FlickrClient();
 *        Object response = client.XXX(...);
 *        // do whatever with response
 *        client.close();
 * </pre>
 *
 * @author Facundo Jackson Galvan
 */
public class FlickrClient {
    private WebTarget webTarget;
    private Client client;
    private static final String BASE_URI = "http://api.flickr.com/";

    public FlickrClient() {
        client = javax.ws.rs.client.ClientBuilder.newClient();
        webTarget = client.target(BASE_URI).path("services/rest");
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T activity_userComments(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.activity.userComments"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>timeframe [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T activity_userPhotos(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.activity.userPhotos"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T blogs_getList(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.blogs.getList"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param blog_id form parameter
     * @param photo_id form parameter
     * @param title form parameter
     * @param description form parameter
     * @param blog_password form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T blogs_postPhoto(Class<T> responseType, String blog_id, String photo_id, String title, String description, String blog_password) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "blog_id", "photo_id", "title", "description", "blog_password", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), blog_id, photo_id, title, description, blog_password, getAuthToken(), "flickr.blogs.postPhoto"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>filter [OPTIONAL]
     * <LI>page [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T contacts_getList(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.contacts.getList"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param user_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>page [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T contacts_getPublicList(Class<T> responseType, String user_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "user_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), user_id, getAuthToken(), "flickr.contacts.getPublicList"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T favorites_add(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.favorites.add"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>user_id [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T favorites_getList(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.favorites.getList"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param user_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T favorites_getPublicList(Class<T> responseType, String user_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "user_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), user_id, getAuthToken(), "flickr.favorites.getPublicList"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T favorites_remove(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.favorites.remove"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>cat_id [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T groups_browse(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.groups.browse"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param group_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>lang [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T groups_getInfo(Class<T> responseType, String group_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "group_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), group_id, getAuthToken(), "flickr.groups.getInfo"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param text query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T groups_search(Class<T> responseType, String text, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "text", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), text, getAuthToken(), "flickr.groups.search"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param group_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T groups_pools_add(Class<T> responseType, String photo_id, String group_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "group_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, group_id, getAuthToken(), "flickr.groups.pools.add"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @param group_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T groups_pools_getContext(Class<T> responseType, String photo_id, String group_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "group_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, group_id, getAuthToken(), "flickr.groups.pools.getContext"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>page [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T groups_pools_getGroups(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.groups.pools.getGroups"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param group_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>tags [OPTIONAL]
     * <LI>user_id [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T groups_pools_getPhotos(Class<T> responseType, String group_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "group_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), group_id, getAuthToken(), "flickr.groups.pools.getPhotos"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param group_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T groups_pools_remove(Class<T> responseType, String photo_id, String group_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "group_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, group_id, getAuthToken(), "flickr.groups.pools.remove"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>date [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T interestingness_getList(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.interestingness.getList"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param find_email query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T people_findByEmail(Class<T> responseType, String find_email) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "find_email", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), find_email, getAuthToken(), "flickr.people.findByEmail"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param username query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T people_findByUsername(Class<T> responseType, String username) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "username", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), username, getAuthToken(), "flickr.people.findByUsername"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param user_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T people_getInfo(Class<T> responseType, String user_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "user_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), user_id, getAuthToken(), "flickr.people.getInfo"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param user_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T people_getPublicGroups(Class<T> responseType, String user_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "user_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), user_id, getAuthToken(), "flickr.people.getPublicGroups"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param user_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>safe_search [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T people_getPublicPhotos(Class<T> responseType, String user_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "user_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), user_id, getAuthToken(), "flickr.people.getPublicPhotos"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T people_getUploadStatus(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.people.getUploadStatus"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param tags form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_addTags(Class<T> responseType, String photo_id, String tags) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "tags", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, tags, getAuthToken(), "flickr.photos.addTags"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_delete(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.delete"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getAllContexts(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.getAllContexts"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>count [OPTIONAL]
     * <LI>just_friends [OPTIONAL]
     * <LI>single_photo [OPTIONAL]
     * <LI>include_self [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getContactsPhotos(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.photos.getContactsPhotos"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param user_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>count [OPTIONAL]
     * <LI>just_friends [OPTIONAL]
     * <LI>single_photo [OPTIONAL]
     * <LI>include_self [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getContactsPublicPhotos(Class<T> responseType, String user_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "user_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), user_id, getAuthToken(), "flickr.photos.getContactsPublicPhotos"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getContext(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.getContext"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>dates [OPTIONAL]
     * <LI>taken_dates [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getCounts(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.photos.getCounts"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>secret [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getExif(Class<T> responseType, String photo_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.getExif"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>page [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getFavorites(Class<T> responseType, String photo_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.getFavorites"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>secret [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getInfo(Class<T> responseType, String photo_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.getInfo"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>min_upload_date [OPTIONAL]
     * <LI>max_upload_date [OPTIONAL]
     * <LI>min_taken_date [OPTIONAL]
     * <LI>max_taken_date [OPTIONAL]
     * <LI>privacy_filter [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getNotInSet(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.photos.getNotInSet"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getPerms(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.getPerms"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getRecent(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.photos.getRecent"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getSizes(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.getSizes"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>min_upload_date [OPTIONAL]
     * <LI>max_upload_date [OPTIONAL]
     * <LI>min_taken_date [OPTIONAL]
     * <LI>max_taken_date [OPTIONAL]
     * <LI>privacy_filter [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getUntagged(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.photos.getUntagged"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>min_upload_date [OPTIONAL]
     * <LI>max_upload_date [OPTIONAL]
     * <LI>min_taken_date [OPTIONAL]
     * <LI>max_taken_date [OPTIONAL]
     * <LI>privacy_filter [OPTIONAL]
     * <LI>sort [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getWithGeoData(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.photos.getWithGeoData"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>min_upload_date [OPTIONAL]
     * <LI>max_upload_date [OPTIONAL]
     * <LI>min_taken_date [OPTIONAL]
     * <LI>max_taken_date [OPTIONAL]
     * <LI>privacy_filter [OPTIONAL]
     * <LI>sort [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_getWithoutGeoData(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.photos.getWithoutGeoData"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param min_date query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_recentlyUpdated(Class<T> responseType, String min_date, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "min_date", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), min_date, getAuthToken(), "flickr.photos.recentlyUpdated"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param tag_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_removeTag(Class<T> responseType, String tag_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "tag_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), tag_id, getAuthToken(), "flickr.photos.removeTag"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param machine_tag_mode query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>user_id [OPTIONAL]
     * <LI>tags [OPTIONAL]
     * <LI>tag_mode [OPTIONAL]
     * <LI>text [OPTIONAL]
     * <LI>min_upload_date [OPTIONAL]
     * <LI>max_upload_date [OPTIONAL]
     * <LI>min_taken_date [OPTIONAL]
     * <LI>max_taken_date [OPTIONAL]
     * <LI>license [OPTIONAL]
     * <LI>sort [OPTIONAL]
     * <LI>privacy_filter [OPTIONAL]
     * <LI>bbox [OPTIONAL]
     * <LI>accuracy [OPTIONAL]
     * <LI>safe_search [OPTIONAL]
     * <LI>content_type [OPTIONAL]
     * <LI>machine_tags [OPTIONAL]
     * <LI>group_id [OPTIONAL]
     * <LI>place_id [OPTIONAL]
     * <LI>extras [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_search(Class<T> responseType, String machine_tag_mode, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "machine_tag_mode", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), machine_tag_mode, getAuthToken(), "flickr.photos.search"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param content_type form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_setContentType(Class<T> responseType, String photo_id, String content_type) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "content_type", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, content_type, getAuthToken(), "flickr.photos.setContentType"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param date_posted form parameter
     * @param date_taken form parameter
     * @param date_taken_granularity form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_setDates(Class<T> responseType, String photo_id, String date_posted, String date_taken, String date_taken_granularity) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "date_posted", "date_taken", "date_taken_granularity", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, date_posted, date_taken, date_taken_granularity, getAuthToken(), "flickr.photos.setDates"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param title form parameter
     * @param description form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_setMeta(Class<T> responseType, String photo_id, String title, String description) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "title", "description", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, title, description, getAuthToken(), "flickr.photos.setMeta"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param is_public form parameter
     * @param is_friend form parameter
     * @param is_family form parameter
     * @param perm_comment form parameter
     * @param perm_addmeta form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_setPerms(Class<T> responseType, String photo_id, String is_public, String is_friend, String is_family, String perm_comment, String perm_addmeta) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "is_public", "is_friend", "is_family", "perm_comment", "perm_addmeta", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, is_public, is_friend, is_family, perm_comment, perm_addmeta, "flickr.photos.setPerms"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param safety_level form parameter
     * @param hidden form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_setSafetyLevel(Class<T> responseType, String photo_id, String safety_level, String hidden) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "safety_level", "hidden", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, safety_level, hidden, getAuthToken(), "flickr.photos.setSafetyLevel"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param tags form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_setTags(Class<T> responseType, String photo_id, String tags) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "tags", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, tags, getAuthToken(), "flickr.photos.setTags"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param comment_text form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_comments_addComment(Class<T> responseType, String photo_id, String comment_text) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "comment_text", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, comment_text, getAuthToken(), "flickr.photos.comments.addComment"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param comment_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_comments_deleteComment(Class<T> responseType, String comment_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "comment_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), comment_id, getAuthToken(), "flickr.photos.comments.deleteComment"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param comment_id form parameter
     * @param comment_text form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_comments_editComment(Class<T> responseType, String comment_id, String comment_text) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "comment_id", "comment_text", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), comment_id, comment_text, getAuthToken(), "flickr.photos.comments.editComment"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_comments_getList(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.comments.getList"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_geo_getLocation(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.geo.getLocation"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_geo_getPerms(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.geo.getPerms"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_geo_removeLocation(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.photos.geo.removeLocation"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param lat form parameter
     * @param lon form parameter
     * @param accuracy form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_geo_setLocation(Class<T> responseType, String photo_id, String lat, String lon, String accuracy) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "lat", "lon", "accuracy", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, lat, lon, accuracy, getAuthToken(), "flickr.photos.geo.setLocation"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param is_public form parameter
     * @param is_contact form parameter
     * @param is_friend form parameter
     * @param is_family form parameter
     * @param photo_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_geo_setPerms(Class<T> responseType, String is_public, String is_contact, String is_friend, String is_family, String photo_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "is_public", "is_contact", "is_friend", "is_family", "photo_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), is_public, is_contact, is_friend, is_family, photo_id, getAuthToken(), "flickr.photos.geo.setPerms"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T photos_licenses_getInfo(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.photos.licenses.getInfo"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param license_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_licenses_setLicense(Class<T> responseType, String photo_id, String license_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "license_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, license_id, getAuthToken(), "flickr.photos.licenses.setLicense"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param note_x form parameter
     * @param note_y form parameter
     * @param note_w form parameter
     * @param note_h form parameter
     * @param note_text form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_notes_add(Class<T> responseType, String photo_id, String note_x, String note_y, String note_w, String note_h, String note_text) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "note_x", "note_y", "note_w", "note_h", "note_text", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, note_x, note_y, note_w, note_h, note_text, getAuthToken(), "flickr.photos.notes.add"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param note_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_notes_delete(Class<T> responseType, String note_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "note_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), note_id, getAuthToken(), "flickr.photos.notes.delete"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param note_id form parameter
     * @param note_x form parameter
     * @param note_y form parameter
     * @param note_w form parameter
     * @param note_h form parameter
     * @param note_text form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_notes_edit(Class<T> responseType, String note_id, String note_x, String note_y, String note_w, String note_h, String note_text) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "note_id", "note_x", "note_y", "note_w", "note_h", "note_text", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), note_id, note_x, note_y, note_w, note_h, note_text, getAuthToken(), "flickr.photos.notes.edit"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id form parameter
     * @param degrees form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photos_transform_rotate(Class<T> responseType, String photo_id, String degrees) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photo_id", "degrees", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photo_id, degrees, getAuthToken(), "flickr.photos.transform.rotate"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param tickets query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photos_upload_checkTickets(Class<T> responseType, String tickets) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "tickets", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), tickets, getAuthToken(), "flickr.photos.upload.checkTickets"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_id form parameter
     * @param photo_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_addPhoto(Class<T> responseType, String photoset_id, String photo_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photoset_id", "photo_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photoset_id, photo_id, getAuthToken(), "flickr.photosets.addPhoto"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param title form parameter
     * @param description form parameter
     * @param primary_photo_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_create(Class<T> responseType, String title, String description, String primary_photo_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "title", "description", "primary_photo_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), title, description, primary_photo_id, getAuthToken(), "flickr.photosets.create"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_delete(Class<T> responseType, String photoset_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photoset_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photoset_id, getAuthToken(), "flickr.photosets.delete"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_id form parameter
     * @param title form parameter
     * @param description form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_editMeta(Class<T> responseType, String photoset_id, String title, String description) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photoset_id", "title", "description", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photoset_id, title, description, getAuthToken(), "flickr.photosets.editMeta"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_id form parameter
     * @param primary_photo_id form parameter
     * @param photo_ids form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_editPhotos(Class<T> responseType, String photoset_id, String primary_photo_id, String photo_ids) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photoset_id", "primary_photo_id", "photo_ids", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photoset_id, primary_photo_id, photo_ids, getAuthToken(), "flickr.photosets.editPhotos"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @param photoset_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_getContext(Class<T> responseType, String photo_id, String photoset_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "photoset_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, photoset_id, getAuthToken(), "flickr.photosets.getContext"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_getInfo(Class<T> responseType, String photoset_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photoset_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photoset_id, getAuthToken(), "flickr.photosets.getInfo"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>user_id [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_getList(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.photosets.getList"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_id query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>extras [OPTIONAL]
     * <LI>privacy_filter [OPTIONAL]
     * <LI>per_page [OPTIONAL]
     * <LI>page [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_getPhotos(Class<T> responseType, String photoset_id, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photoset_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photoset_id, getAuthToken(), "flickr.photosets.getPhotos"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_ids form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_orderSets(Class<T> responseType, String photoset_ids) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photoset_ids", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photoset_ids, getAuthToken(), "flickr.photosets.orderSets"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_id form parameter
     * @param photo_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_removePhoto(Class<T> responseType, String photoset_id, String photo_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photoset_id", "photo_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photoset_id, photo_id, getAuthToken(), "flickr.photosets.removePhoto"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_id form parameter
     * @param comment_text form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_comments_addComment(Class<T> responseType, String photoset_id, String comment_text) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "photoset_id", "comment_text", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), photoset_id, comment_text, getAuthToken(), "flickr.photosets.comments.addComment"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param comment_id form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_comments_deleteComment(Class<T> responseType, String comment_id) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "comment_id", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), comment_id, getAuthToken(), "flickr.photosets.comments.deleteComment"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param comment_id form parameter
     * @param comment_text form parameter
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_comments_editComment(Class<T> responseType, String comment_id, String comment_text) throws ClientErrorException, IOException {
        String[] formParamNames = new String[]{"api_key", "comment_id", "comment_text", "auth_token", "method"};
        String[] formParamValues = new String[]{getApiKey(), comment_id, comment_text, getAuthToken(), "flickr.photosets.comments.editComment"};
        String signature = signParams(formParamNames, formParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        return webTarget.request(javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED).post(javax.ws.rs.client.Entity.form(getQueryOrFormParams(formParamNames, formParamValues)), responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photoset_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T photosets_comments_getList(Class<T> responseType, String photoset_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photoset_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photoset_id, getAuthToken(), "flickr.photosets.comments.getList"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param query query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T places_find(Class<T> responseType, String query) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "query", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), query, getAuthToken(), "flickr.places.find"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param lat query parameter[REQUIRED]
     * @param lon query parameter[REQUIRED]
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>accuracy [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T places_findByLatLon(Class<T> responseType, String lat, String lon, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "lat", "lon", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), lat, lon, getAuthToken(), "flickr.places.findByLatLon"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param place_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T places_resolvePlaceId(Class<T> responseType, String place_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "place_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), place_id, getAuthToken(), "flickr.places.resolvePlaceId"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param url query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T places_resolvePlaceURL(Class<T> responseType, String url) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "url", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), url, getAuthToken(), "flickr.places.resolvePlaceURL"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T prefs_getContentType(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.prefs.getContentType"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T prefs_getHidden(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.prefs.getHidden"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T prefs_getPrivacy(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.prefs.getPrivacy"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T prefs_getSafetyLevel(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.prefs.getSafetyLevel"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param method_name query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T reflection_getMethodInfo(Class<T> responseType, String method_name) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "method_name", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), method_name, getAuthToken(), "flickr.reflection.getMethodInfo"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T reflection_getMethods(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.reflection.getMethods"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>period [OPTIONAL]
     * <LI>count [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T tags_getHotList(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.tags.getHotList"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param photo_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T tags_getListPhoto(Class<T> responseType, String photo_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "photo_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), photo_id, getAuthToken(), "flickr.tags.getListPhoto"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>user_id [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T tags_getListUser(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.tags.getListUser"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>user_id [OPTIONAL]
     * <LI>count [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T tags_getListUserPopular(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.tags.getListUserPopular"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>tag [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T tags_getListUserRaw(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.tags.getListUserRaw"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request().get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param tag query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T tags_getRelated(Class<T> responseType, String tag) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "tag", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), tag, getAuthToken(), "flickr.tags.getRelated"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T test_echo(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.test.echo"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request().get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T test_login(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.test.login"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request().get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @return response object (instance of responseType class)
     */
    public <T> T test_null(Class<T> responseType) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.test.null"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request().get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param group_id query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T urls_getGroup(Class<T> responseType, String group_id) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "group_id", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), group_id, getAuthToken(), "flickr.urls.getGroup"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>user_id [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T urls_getUserPhotos(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.urls.getUserPhotos"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param optionalQueryParams List of optional query parameters in the form of "param_name=param_value",...<br>
     * List of optional query parameters:
     * <LI>user_id [OPTIONAL]
     * @return response object (instance of responseType class)
     */
    public <T> T urls_getUserProfile(Class<T> responseType, String... optionalQueryParams) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), getAuthToken(), "flickr.urls.getUserProfile"};
        String signature = signParams(queryParamNames, queryParamValues, optionalQueryParams);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        javax.ws.rs.core.MultivaluedMap<String, String> mapOptionalParams = getQParams(optionalQueryParams);
        for (java.util.Map.Entry<String, java.util.List<String>> entry : mapOptionalParams.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param url query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T urls_lookupGroup(Class<T> responseType, String url) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "url", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), url, getAuthToken(), "flickr.urls.lookupGroup"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    /**
     * @param responseType Class representing the response
     * @param url query parameter[REQUIRED]
     * @return response object (instance of responseType class)
     */
    public <T> T urls_lookupUser(Class<T> responseType, String url) throws ClientErrorException, IOException {
        String[] queryParamNames = new String[]{"api_key", "url", "auth_token", "method"};
        String[] queryParamValues = new String[]{getApiKey(), url, getAuthToken(), "flickr.urls.lookupUser"};
        String signature = signParams(queryParamNames, queryParamValues);
        webTarget = webTarget.queryParam("api_sig", signature);
        javax.ws.rs.core.Form form = getQueryOrFormParams(queryParamNames, queryParamValues);
        javax.ws.rs.core.MultivaluedMap<String, String> map = form.asMap();
        for (java.util.Map.Entry<String, java.util.List<String>> entry : map.entrySet()) {
            java.util.List<String> list = entry.getValue();
            String[] values = list.toArray(new String[list.size()]);
            webTarget = webTarget.queryParam(entry.getKey(), (Object[]) values);
        }
        return webTarget.request(javax.ws.rs.core.MediaType.TEXT_XML).get(responseType);
    }

    private Form getQueryOrFormParams(String[] paramNames, String[] paramValues) {
        Form form = new javax.ws.rs.core.Form();
        for (int i = 0; i < paramNames.length; i++) {
            if (paramValues[i] != null) {
                form = form.param(paramNames[i], paramValues[i]);
            }
        }
        return form;
    }

    private MultivaluedMap getQParams(String... optionalParams) {
        MultivaluedMap<String, String> qParams = new javax.ws.rs.core.MultivaluedHashMap<String, String>();
        for (String qParam : optionalParams) {
            String[] qPar = qParam.split("=");
            if (qPar.length > 1) {
                qParams.add(qPar[0], qPar[1]);
            }
        }
        return qParams;
    }

    public void close() {
        client.close();
    }
    private static String api_key;
    private static String application_secret;
    private HttpServletRequest httpServletRequest;

    public void login(HttpServletRequest request, HttpServletResponse response, String apiKey, String applicationSecret) throws IOException {
        api_key = apiKey;
        application_secret = applicationSecret;
        httpServletRequest = request;
        dispatch(request, response);
    }

    public void setHttpServletRequest(HttpServletRequest request) {
        this.httpServletRequest = request;
    }

    public void logout(HttpServletRequest request) {
        javax.servlet.http.HttpSession session = request.getSession(true);
        session.removeAttribute("flickr_frob");
        session.removeAttribute("flickr_auth_token");
    }

    private String getApiKey() {
        return api_key;
    }

    public String getUserNsid() {
        if (httpServletRequest == null) {
            throw new NullPointerException("httpServletRequest is null");
        }
        javax.servlet.http.HttpSession session = httpServletRequest.getSession(false);
        return (String) session.getAttribute("flickr_user_nsid");
    }

    private String getAuthToken() {
        if (httpServletRequest == null) {
            throw new NullPointerException("httpServletRequest is null");
        }
        javax.servlet.http.HttpSession session = httpServletRequest.getSession(false);
        return (String) session.getAttribute("flickr_auth_token");
    }

    private static void createAuthToken(HttpServletRequest request, String frob) throws IOException {
        javax.servlet.http.HttpSession session = request.getSession(false);
        String[] queryParamNames = new String[]{"api_key", "frob", "method"};
        String[] queryParamValues = new String[]{api_key, frob, "flickr.auth.getToken"};
        String sig = signParams(queryParamNames, queryParamValues);
        Client c = javax.ws.rs.client.ClientBuilder.newClient();
        WebTarget wTarget = c.target(BASE_URI).path("services/rest");
        String result = wTarget.queryParam("api_key", api_key).queryParam("frob", frob).queryParam("method", "flickr.auth.getToken").queryParam("api_sig", sig).request().get(String.class);
        c.close();
        try {
            String authToken = result.substring(result.indexOf("<token>") + 7, result.indexOf("</token>"));
            session.setAttribute("flickr_auth_token", authToken);
            String user_nsid = result.substring(result.indexOf("nsid=\"") + 6);
            user_nsid = user_nsid.substring(0, user_nsid.indexOf("\""));
            session.setAttribute("flickr_user_nsid", user_nsid);
        } catch (Exception ex) {
            throw new java.io.IOException("Failed to get authentication token: " + result);
        }
    }

    private static void dispatch(HttpServletRequest request, HttpServletResponse response) throws IOException {
        javax.servlet.http.HttpSession session = request.getSession(true);
        String authToken = (String) session.getAttribute("flickr_auth_token");
        // If there is already a session key, we are already logged in.
        // Simply return.
        if (authToken == null) {
            String frob = (String) session.getAttribute("flickr_frob");
            // If there is an auth token instead of a session key, we need to
            // obtain the session key using the auth token.  If there is no
            // auth token, we redirect to the login page.
            if (frob != null) {
                createAuthToken(request, frob);
                String returnUrl = (String) session.getAttribute("flickr_return_url");
                if (returnUrl != null) {
                    session.removeAttribute("flickr_return_url");
                    response.sendRedirect(returnUrl);
                }
            } else {
                session.setAttribute("flickr_return_url", request.getRequestURI());
                response.sendRedirect(request.getContextPath() + "/FlickrLoginServlet");
            }
        }
    }

    private static String signParams(String[] paramNames, String[] paramValues, String[] optionalParams) throws IOException {
        if (application_secret == null) {
            throw new NullPointerException("secret is null");
        }
        java.util.TreeMap<String, String> map = new java.util.TreeMap<String, String>();
        for (int i = 0; i < paramNames.length; i++) {
            String key = paramNames[i];
            String value = paramValues[i];
            if (value != null) {
                map.put(key, value);
            }
        }
        for (String param : optionalParams) {
            String[] par = param.split("=");
            if (par.length > 1) {
                map.put(par[0], par[1]);
            }
        }
        try {
            String signature = application_secret;
            java.util.Set<java.util.Map.Entry<String, String>> entrySet = map.entrySet();
            for (java.util.Map.Entry<String, String> entry : entrySet) {
                signature += entry.getKey() + entry.getValue();
            }
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] sum = md.digest(signature.getBytes("UTF-8"));
            java.math.BigInteger bigInt = new java.math.BigInteger(1, sum);
            return bigInt.toString(16);
        } catch (java.security.NoSuchAlgorithmException ex) {
        }
        return "";
    }

    private static String signParams(String[] paramNames, String[] paramValues) throws IOException {
        return signParams(paramNames, paramValues, new String[]{});
    }
    
}
