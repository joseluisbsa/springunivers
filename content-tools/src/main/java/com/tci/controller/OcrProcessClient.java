package com.tci.controller;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component

public class OcrProcessClient {
	private static final Logger LOGGER = LogManager.getLogger(OcrProcessClient.class);
	@Autowired
	private RestTemplate client;
	
	public void gerarOcr(String diretorio) {
		List<String>tifs = Arrays.asList(new File(diretorio).list());
		for(String tif: tifs) {
			LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
	        File img = new File(diretorio,tif);
			map.add("path", img.getAbsolutePath());
			map.add("buscaTextual", "true"); 
			map.add("pDFPesquisavel", "true");
			HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<>(map);

	        ResponseEntity<String> result = client.exchange("http://localhost:8080/gera-arquivos", HttpMethod.POST, requestEntity, String.class);
	        if(result.getStatusCode().equals(HttpStatus.OK)) {
	        	LOGGER.info(String.format("Arquivos da imagem %s gerados com sucesso", img.getAbsolutePath()));
	        } else if(result.getStatusCode().equals(HttpStatus.REQUEST_TIMEOUT)) {
	        	LOGGER.info(String.format("Erro de Timeout ao gerar arquivos %s", result.toString()));
			} else {
				LOGGER.info(String.format("Erro ao gerar arquivos %s", result.toString()));
			}

		}
	}
}
