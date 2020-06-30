FROM flink:1.10.1-scala_2.11

RUN apt-get update && \
    wget https://repo1.maven.org/maven2/com/github/oshi/oshi-core/3.4.0/oshi-core-3.4.0.jar -O /opt/flink/lib/oshi-core-3.4.0.jar && \
    wget https://repo1.maven.org/maven2/net/java/dev/jna/jna/5.4.0/jna-5.4.0.jar -O /opt/flink/lib/jna-5.4.0.jar && \
    wget https://repo1.maven.org/maven2/net/java/dev/jna/jna-platform/5.4.0/jna-platform-5.4.0.jar -O /opt/flink/lib/jna-platform-5.4.0.jar && \
    wget https://repo1.maven.org/maven2/org/apache/hadoop/hadoop-aws/3.1.0/hadoop-aws-3.1.0.jar -O /opt/flink/lib/hadoop-aws-3.1.0.jar && \
    wget https://repo1.maven.org/maven2/com/amazonaws/aws-java-sdk/1.11.799/aws-java-sdk-1.11.799.jar -O /opt/flink/lib/aws-java-sdk-1.11.799.jar && \
    wget https://repo1.maven.org/maven2/org/apache/httpcomponents/httpcore/4.2.5/httpcore-4.2.5.jar -O /opt/flink/lib/httpcore-4.2.5.jar && \
    wget https://repo1.maven.org/maven2/org/apache/httpcomponents/httpclient/4.2.5/httpclient-4.2.5.jar -O /opt/flink/lib/httpclient-4.2.5.jar && \
    wget https://repo1.maven.org/maven2/org/apache/flink/flink-metrics-prometheus_2.11/1.10.1/flink-metrics-prometheus_2.11-1.10.1.jar -O /opt/flink/lib/flink-metrics-prometheus_2.11-1.10.1.jar && \
    wget https://repo1.maven.org/maven2/org/apache/flink/statefun-flink-core/2.1.0/statefun-flink-core-2.1.0.jar -O /opt/flink/lib/statefun-flink-core-2.1.0.jar && \
    wget https://repo1.maven.org/maven2/org/apache/flink/statefun-flink-distribution/2.1.0/statefun-flink-distribution-2.1.0.jar -O /opt/flink/lib/statefun-flink-distribution-2.1.0.jar && \
    mv /opt/flink/opt/flink-metrics-prometheus-*.jar /opt/flink/opt/flink-s3-fs-hadoop-*.jar /opt/flink/lib/

COPY core-site.xml /etc/hadoop/conf/core-site.xml