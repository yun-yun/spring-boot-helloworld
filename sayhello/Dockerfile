FROM java:8
MAINTAINER lyunk <704863678@qq.com>
ADD /target/sayhello.jar /sayhello.jar

COPY start.sh /usr/local/bin/

RUN chmod +x /usr/local/bin/start.sh
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone

ENTRYPOINT [ "start.sh" ]