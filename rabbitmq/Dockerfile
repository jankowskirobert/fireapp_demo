FROM rabbitmq:3-management-alpine
ADD rabbitmq.config /etc/rabbitmq/
ADD definitions.json /etc/rabbitmq/
RUN chown rabbitmq:rabbitmq /etc/rabbitmq/rabbitmq.config /etc/rabbitmq/definitions.json
EXPOSE 27017
CMD ["rabbitmq-server"]
