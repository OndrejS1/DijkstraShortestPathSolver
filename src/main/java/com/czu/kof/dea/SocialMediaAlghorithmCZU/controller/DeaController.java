package com.czu.kof.dea.SocialMediaAlghorithmCZU.controller;

import com.czu.kof.dea.SocialMediaAlghorithmCZU.alghorithm.DataEnvelopmentAnalysis;
import com.czu.kof.dea.SocialMediaAlghorithmCZU.alghorithm.DeaRecord;
import com.czu.kof.dea.SocialMediaAlghorithmCZU.resources.DeaResource;
import com.czu.kof.dea.SocialMediaAlghorithmCZU.resources.DeaTranslator;
import lpsolve.LpSolveException;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

@RestController
@RequestMapping("/api")
public class DeaController {

    @GetMapping("/solve")
    @ResponseBody
    public void solveDea() throws LpSolveException {

        //DeaRecord deaRecord = DeaTranslator.translate(deaResource);
        Map<String, DeaRecord> records = new LinkedHashMap<>();

        //records.put("depot",deaRecord);


        records.put("Depot1", new DeaRecord(new double[]{40.0,55.0,30.0}, new double[]{3.0,5.0}));
//...adding more records here...


        DataEnvelopmentAnalysis dea = new DataEnvelopmentAnalysis();
        Map<String, Double> results = dea.estimateEfficiency(records);
        System.out.println((new TreeMap<>(results)).toString());


    }
}
