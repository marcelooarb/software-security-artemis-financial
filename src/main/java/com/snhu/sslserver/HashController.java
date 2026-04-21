package com.snhu.sslserver;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HashController {

    @GetMapping("/hash")
    public String getHash() throws NoSuchAlgorithmException {
        String data = "Marcelo Barbosa - Artemis Financial secure checksum verification";
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(data.getBytes(StandardCharsets.UTF_8));

        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));
        }

        return "<html><body>"
                + "<h2>Checksum Verification</h2>"
                + "<p><strong>Developer:</strong> Marcelo Barbosa</p>"
                + "<p><strong>Data:</strong> " + data + "</p>"
                + "<p><strong>Algorithm:</strong> SHA-256</p>"
                + "<p><strong>Checksum:</strong> " + hexString + "</p>"
                + "</body></html>";
    }
}