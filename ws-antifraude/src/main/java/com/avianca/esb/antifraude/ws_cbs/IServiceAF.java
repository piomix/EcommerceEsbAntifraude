package com.avianca.esb.antifraude.ws_cbs;


public interface IServiceAF {

    public java.lang.Boolean ClearCacheItem(
        java.lang.String item);

    public com.avianca.esb.antifraude.ws_cbs.ServiceResponse ValidationAF(
        java.lang.String xmlDocument,
        java.lang.Integer flowId,
        java.lang.String userId);
}
