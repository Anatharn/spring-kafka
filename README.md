# spring-kafka
Kafka environment, consumer and provider


## Environnement Kafka
L'environnement se créer grace au docker-compose
Pour créer des topic il faut aller dans le container  sous /usr et faire la commande:
bin/kafka-topics --create --partitions 1 --replication-factor 1 --topic sds-tuto-kafka --bootstrap-server localhost:9092

## Consumer
Le consumer consomme les messages envoyés dans le topic sds-tuto-kafka
on peut tester le consumer en utilisant le console producer de kafka
bin/kafka-console-producer --topic sds-tuto-kafka --bootstrap-server localhost:9092

## Producer
Le producer créer des messages qu'il envoie dans les topic de Kafka.
On peut intervenir dans le producer via une API REST