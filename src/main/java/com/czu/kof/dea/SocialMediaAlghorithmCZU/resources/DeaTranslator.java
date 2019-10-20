package com.czu.kof.dea.SocialMediaAlghorithmCZU.resources;


import com.czu.kof.dea.SocialMediaAlghorithmCZU.alghorithm.DeaRecord;

public class DeaTranslator {

    public static DeaRecord translate(DeaResource deaResource) {

        DeaRecord deaRecord = new DeaRecord(deaResource.getOutput(), deaResource.getInput());
        return deaRecord;
    }
}
