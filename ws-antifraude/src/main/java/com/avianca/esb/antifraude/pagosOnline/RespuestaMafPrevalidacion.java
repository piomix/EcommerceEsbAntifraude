package com.avianca.esb.antifraude.pagosOnline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaMafPrevalidacion", propOrder = {
    "evaluacion",
    "decision"
})
public class RespuestaMafPrevalidacion {
	@XmlElement(name="evaluacion")
	private Evaluacion evaluacion;
	@XmlElement(name="decision")
    private String decision;

    public Evaluacion getEvaluacion ()
    {
        return evaluacion;
    }

    public void setEvaluacion (Evaluacion evaluacion)
    {
        this.evaluacion = evaluacion;
    }

    public String getDecision ()
    {
        return decision;
    }

    public void setDecision (String decision)
    {
        this.decision = decision;
    }
}
