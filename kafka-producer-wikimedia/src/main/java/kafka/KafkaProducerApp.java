package kafka;

import kafka.wikimedia.WikimediaChangesProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class KafkaProducerApp implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApp.class);
    }

    private final WikimediaChangesProducer wikimediaChangesProducer;

    @Override
    public void run(String... args) throws Exception {
        wikimediaChangesProducer.sendMessage();
    }
}
