FROM jboss/wildfly:12.0.0.Final
USER root
RUN rm -f /etc/localtime
RUN ln -s /usr/share/zoneinfo/America/Lima /etc/localtime
RUN echo "America/Lima" > /etc/timezone
ENV JAVA_OPTS="-Xms512m -Xmx1g -XX:MetaspaceSize=256M -XX:MaxMetaspaceSize=512m -Djava.net.preferIPv4Stack=true"
RUN mkdir -p /opt/jboss/wildfly/modules/system/layers/base/com/oracle/main
COPY oracle_driver/ojdbc5.jar /opt/jboss/wildfly/modules/system/layers/base/com/oracle/main/ojdbc5.jar
COPY configuration/module.xml /opt/jboss/wildfly/modules/system/layers/base/com/oracle/main/module.xml
RUN mv /opt/jboss/wildfly/standalone/configuration/standalone.xml /opt/jboss/wildfly/standalone/configuration/standalone.xml.0
COPY configuration/standalone.xml /opt/jboss/wildfly/standalone/configuration/standalone.xml
COPY deployments/ep-backend.war /opt/jboss/wildfly/standalone/deployments/ep-backend.war
RUN /opt/jboss/wildfly/bin/add-user.sh ep-admin @dmin2019ep --silent
CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]