package com.kaki.doctrack.document_service.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;

@RestController
@RequestMapping("${api.path}${api.version}/documents/public")
@RequiredArgsConstructor
public class DocumentPublicRestController {

    private final Logger logger = Logger.getLogger(DocumentPublicRestController.class.getName());

    @GetMapping("/test")
    public ResponseEntity<Mono> test() {
        logger.info("Test");
        return ResponseEntity.ok().build();
    }

}
