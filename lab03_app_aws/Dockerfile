# Based on elk image
FROM sebp/elk:660

# Logstash configuration
RUN rm /etc/logstash/conf.d/*.conf
ADD ./logstash.conf /etc/logstash/conf.d/logstash.conf