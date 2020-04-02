#学习笔记

##从docker拉取zookeeper镜像和dubbo-admin镜像
* docker 运行dubbo-admin 命令：docker run -d -p 8280:8080 --name dubbo -e dubbo.registry.address=zookeeper://172.16.223.132:2181 -e dubbo.admin.root.password=root chenchuxin/dubbo-admin
* docker启动jenkins命令：docker run -d --name gaoxi-jenkins-one -p 8086:8080 -v /home/jenkins_01:/home/jenkins_01 59f8784e08ee
    * 查看jenkins登录密码----》 执行docker exec -it jenkins容器id /bin/bash 目录下执行 cat /var/jenkins_home/secrets/initialAdminPassword   ac64a54173964ae493a663083db71b61
    