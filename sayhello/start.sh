#!/bin/sh
HOST_IP=`cat /etc/ip`
cp /etc/hosts /tmp/hosts
sed -i '$d' /tmp/hosts
echo "$HOST_IP  $HOSTNAME" >> /tmp/hosts
cat /tmp/hosts > /etc/hosts
java -jar sayhello.jar