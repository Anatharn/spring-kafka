package sds.example.kafka.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Sébastien DE SANTIS, SFEIR Benelux
 * @version 1.0
 * @since 1/21/22
 */
@Data
@AllArgsConstructor
public class Greeting {

    private String msg;
    private String name;
}
