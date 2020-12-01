#生成镜像的jdk环境
FROM java:8
#将target下的jar包加入镜像
ADD target/*.jar demo-0.0.1-SNAPSHOT.jar
VOLUME /tem
#docker暴露给外界的端口9999
EXPOSE 9999
#启动app.jar
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]