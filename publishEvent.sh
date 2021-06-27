#bin/bash
curl -u guest:guest -H "content-type:application/json" -X POST -d'{"properties":{"delivery_mode":2},"routing_key":"testqueue","payload":"{ \"message\": \"test\" }","payload_encoding":"string"}' http://localhost:15672/api/exchanges/%2f/amq.default/publish


