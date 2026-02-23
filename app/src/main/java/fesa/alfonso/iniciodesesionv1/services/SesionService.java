package fesa.alfonso.iniciodesesionv1.services;

import java.util.Date;

import fesa.alfonso.iniciodesesionv1.models.InicioDeSesionModel;
import fesa.alfonso.iniciodesesionv1.models.TokenModel;

public class SesionService {
    public TokenModel iniciarSesion(InicioDeSesionModel inicioDeSesionModel){
        if (inicioDeSesionModel.getUsuario().equals("alfonso@gmail")&&inicioDeSesionModel.getContrasena().equals("123456")){
            TokenModel tokenModel=new TokenModel("Token",new Date());
            return tokenModel;
        } else {
            return null;

        }
    }
}