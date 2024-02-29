package kafka;

import kafka.entity.WikimediaEntity;
import kafka.repository.WikimediaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaConsumerDB {

    private final WikimediaRepository dataRepository;

    @KafkaListener(
            topics = "${spring.kafka.topic.name}",
            groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(String eventMessage) {
        log.info(String.format("Event message received -> %s", eventMessage));

        WikimediaEntity wikimediaEntity = new WikimediaEntity();
        wikimediaEntity.setWikiEventData(eventMessage);

        dataRepository.save(wikimediaEntity);
    }
}
