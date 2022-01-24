package sds.example.producer.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sds.example.kafka.model.Greeting;
import sds.example.producer.producer.MessageProducer;

/**
 * @author Sébastien DE SANTIS, SFEIR Benelux
 * @version 1.0
 * @since 1/21/22
 */
@RestController
public class MainController {

    private final MessageProducer messageProducer;

    public MainController(MessageProducer messageProducer){
        this.messageProducer = messageProducer;
    }

    @GetMapping("send")
    public void sendMessage(){
        this.messageProducer.sendMessage("plop");
    }

    @GetMapping("sendGreetingMessage")
    public void sendGreetingMessage(){
        this.messageProducer.sendGreetingMessage(new Greeting("Greeting Commander", "Sébastien"));
    }

    @GetMapping("sendMessageToFiltered")
    public void sendMessageToFiltered(){
        this.messageProducer.sendMessageToFiltered("plop");
    }

    @GetMapping("sendMessageToPartition")
    public void sendMessageToPartition(){
        this.messageProducer.sendMessageToPartition("plop", 0);
    }
}
