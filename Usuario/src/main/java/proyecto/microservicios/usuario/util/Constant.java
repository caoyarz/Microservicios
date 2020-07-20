package proyecto.microservicios.usuario.util;

public class Constant {
	public static final String AUTHORIZATION= "authorization";
	public static final String BEARER="Bearer ";
	public static final String ERROR_JWT_AUTORIZE= "No tienes permisos para consultar estos microservicios.";
    public static final String ERROR_JWT_VISUALIZE= "Sin permisos para entrar.";
    public static final String RESOURCE_NOT_FOUND= "Recurso no encontrado";
    
    public static final String ERROR_GET_ALL = "Recurso no identificado ";
    public static final String ERROR_GET_ENT_ALL = "Recurso no identificado por entidad en getAll ";
    public static final String ERROR_GET_DTO_ALL = "Recurso no identificado en getAll ";
    public static final String ERROR_REST_CLIENT_GET_ALL = "RestClientException al identificar recurso en getAll ";
    public static final String ERROR_GET_ALL_LIST = "Recurso sin informacion";
    public static final String ERROR_EXCEPTION_GET_ALL = "Exception al identificar recurso getAll: ";
    
    public static final String ERROR_ADD_EMPTY_OBJECT = "Objeto vacio";
    public static final String ERROR_ADD_ENT = "Respuesta nula desde servicio destino al agregar";
    public static final String ERROR = "Data nula desde servicio destino al agregar";
    public static final String ERROR_REST_CLIENT_ADD = "RestClientException al agregar en addNew ";
    public static final String ERROR_ADD = "Informacion invalida al agregar registro";
    public static final String ERROR_EXCEPTION_ADD = "Exception al agregar registro addNew: ";
    
    public static final String ERROR_UPDATE_ENT = "Respuesta nula desde servicio destino al actualizar";
    public static final String ERROR_UPDATE = "Registro no actualizado";
    public static final String ERROR_UPDATE_DTO = "Registro no actualizado con nombre == ";
    public static final String ERROR_UPDATE_DATA = "Registro no actualizado por datos invalidos";
    public static final String ERROR_REST_CLIENT_UPDATE = "RestClientException al actualizar registro en update ";
    public static final String ERROR_EXCEPTION_UPDATE = "Exception al actualizar registro update: ";
    
    
    public static final String SYSTEM_ERROR = "Error de sistema";
    public static final String RES_NOT_FOUND = "404";
    public static final String RES_BAD_REQUEST = "400";

}
